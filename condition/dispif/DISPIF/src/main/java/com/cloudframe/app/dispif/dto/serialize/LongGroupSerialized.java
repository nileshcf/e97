package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class LongGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LongGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LongGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LONG_GROUP_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLongWs;
	
	/**
	* Constructor for LongGroupSerialized
	**/
    public LongGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LongGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LONG_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLongWs = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLongWsCounter = -1;
     public boolean isLongWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLongWsCounter != sharedCounter;
         localLongWsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of longWs
	 *	@return longWs
	 */
	public char[]  getLongWsString() {
	     return getCharArray(beginLongWs,LONG_WS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean longWsIsNumeric() {
	    return isNumeric(beginLongWs
	                    ,beginLongWs + LONG_WS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LONG_WS_LEN = 12;
  	/**
	 * serializeLongWs
	 */
	protected void serializeLongWs(long longWs) {
		 putNumber(beginLongWs,longWs,LONG_WS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLongWsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLongWs
	 */
   	protected  long serializeLongWs(char[] value) {
	    long  longWs;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    longWs = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginLongWs
		       ,12
		      );
		 localLongWsCounter = shareString.getSerializedField().getModifiedCounter();
		return  longWs;
    }

   protected long checkLongWsMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLongWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLongWs() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLongWs
			                 ,LONG_WS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("longWs", beginLongWs,LONG_WS_LEN);
    }
   	}




}
  
