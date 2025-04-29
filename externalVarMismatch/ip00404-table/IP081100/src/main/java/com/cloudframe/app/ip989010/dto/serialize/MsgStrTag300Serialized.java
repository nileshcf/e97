package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class MsgStrTag300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgStrTag300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgStrTag300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_STR_TAG_300_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsgStrMti300;
	
	/**
	* Constructor for MsgStrTag300Serialized
	**/
    public MsgStrTag300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgStrTag300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_STR_TAG_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMsgStrMti300 = getStartOffset() + 10;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMsgStrMti300Counter = -1;
     public boolean isMsgStrMti300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgStrMti300Counter != sharedCounter;
         localMsgStrMti300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msgStrMti300
	 *	@return msgStrMti300
	 */
	public char[]  getMsgStrMti300String() {
	     return getCharArray(beginMsgStrMti300,MSG_STR_MTI_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msgStrMti300IsNumeric() {
	    return isNumeric(beginMsgStrMti300
	                    ,beginMsgStrMti300 + MSG_STR_MTI_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSG_STR_MTI_300_LEN = 4;
  	/**
	 * serializeMsgStrMti300
	 */
	protected void serializeMsgStrMti300(int msgStrMti300) {
		 putNumber(beginMsgStrMti300,msgStrMti300,MSG_STR_MTI_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsgStrMti300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsgStrMti300
	 */
   	protected  int serializeMsgStrMti300(char[] value) {
	    int  msgStrMti300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msgStrMti300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMsgStrMti300
		       ,4
		      );
		 localMsgStrMti300Counter = shareString.getSerializedField().getModifiedCounter();
		return  msgStrMti300;
    }

   protected int checkMsgStrMti300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsgStrMti300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsgStrMti300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsgStrMti300
			                 ,MSG_STR_MTI_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msgStrMti300", beginMsgStrMti300,MSG_STR_MTI_300_LEN);
    }
   	}




}
  
