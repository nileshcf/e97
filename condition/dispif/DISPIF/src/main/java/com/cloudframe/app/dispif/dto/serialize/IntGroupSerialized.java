package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class IntGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IntGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IntGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INT_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIntWs;
	
	/**
	* Constructor for IntGroupSerialized
	**/
    public IntGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IntGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIntWs = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIntWsCounter = -1;
     public boolean isIntWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntWsCounter != sharedCounter;
         localIntWsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of intWs
	 *	@return intWs
	 */
	public char[]  getIntWsString() {
	     return getCharArray(beginIntWs,INT_WS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean intWsIsNumeric() {
	    return isNumeric(beginIntWs
	                    ,beginIntWs + INT_WS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INT_WS_LEN = 8;
  	/**
	 * serializeIntWs
	 */
	protected void serializeIntWs(long intWs) {
		 putNumber(beginIntWs,intWs,INT_WS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIntWsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIntWs
	 */
   	protected  long serializeIntWs(char[] value) {
	    long  intWs;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    intWs = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIntWs
		       ,8
		      );
		 localIntWsCounter = shareString.getSerializedField().getModifiedCounter();
		return  intWs;
    }

   protected long checkIntWsMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIntWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIntWs() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIntWs
			                 ,INT_WS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("intWs", beginIntWs,INT_WS_LEN);
    }
   	}




}
  
