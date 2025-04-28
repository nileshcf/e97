package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class ShortGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ShortGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ShortGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SHORT_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginShortWs;
	
	/**
	* Constructor for ShortGroupSerialized
	**/
    public ShortGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ShortGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SHORT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginShortWs = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localShortWsCounter = -1;
     public boolean isShortWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localShortWsCounter != sharedCounter;
         localShortWsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of shortWs
	 *	@return shortWs
	 */
	public char[]  getShortWsString() {
	     return getCharArray(beginShortWs,SHORT_WS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean shortWsIsNumeric() {
	    return isNumeric(beginShortWs
	                    ,beginShortWs + SHORT_WS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SHORT_WS_LEN = 4;
  	/**
	 * serializeShortWs
	 */
	protected void serializeShortWs(int shortWs) {
		 putNumber(beginShortWs,shortWs,SHORT_WS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localShortWsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeShortWs
	 */
   	protected  int serializeShortWs(char[] value) {
	    int  shortWs;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    shortWs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginShortWs
		       ,4
		      );
		 localShortWsCounter = shareString.getSerializedField().getModifiedCounter();
		return  shortWs;
    }

   protected int checkShortWsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshShortWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshShortWs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginShortWs
			                 ,SHORT_WS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("shortWs", beginShortWs,SHORT_WS_LEN);
    }
   	}




}
  
