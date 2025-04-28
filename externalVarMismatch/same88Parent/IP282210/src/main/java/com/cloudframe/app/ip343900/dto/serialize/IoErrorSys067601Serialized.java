package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class IoErrorSys067601Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IoErrorSys067601Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IoErrorSys067601Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IO_ERROR_SYS_067601_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoErrTxt601;
            protected  int beginSys067FileStat600;
	
	/**
	* Constructor for IoErrorSys067601Serialized
	**/
    public IoErrorSys067601Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IoErrorSys067601Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IO_ERROR_SYS_067601_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoErrTxt601 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSys067FileStat600 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIoErrTxt601Counter = -1;
     public boolean isIoErrTxt601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoErrTxt601Counter != sharedCounter;
         localIoErrTxt601Counter = sharedCounter; return hasModified;
     }
	protected static final int IO_ERR_TXT_601_LEN = 40;
	/**
	 * 	serialize this IoErrTxt601
	 */
   protected void serializeIoErrTxt601(char[] ioErrTxt601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ioErrTxt601,0,getStringValue(),beginIoErrTxt601,IO_ERR_TXT_601_LEN);
       localIoErrTxt601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIoErrTxt601Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIoErrTxt601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIoErrTxt601() {	 
   		return (substring(getStringValue(),beginIoErrTxt601,beginIoErrTxt601 + IO_ERR_TXT_601_LEN));
   	}
     int localSys067FileStat600Counter = -1;
     public boolean isSys067FileStat600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys067FileStat600Counter != sharedCounter;
         localSys067FileStat600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys067FileStat600
	 *	@return sys067FileStat600
	 */
	public char[]  getSys067FileStat600String() {
	     return getCharArray(beginSys067FileStat600,SYS_067_FILE_STAT_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys067FileStat600IsNumeric() {
	    return isNumeric(beginSys067FileStat600
	                    ,beginSys067FileStat600 + SYS_067_FILE_STAT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_067_FILE_STAT_600_LEN = 2;
  	/**
	 * serializeSys067FileStat600
	 */
	protected void serializeSys067FileStat600(int sys067FileStat600) {
		 putNumber(beginSys067FileStat600,sys067FileStat600,SYS_067_FILE_STAT_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys067FileStat600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys067FileStat600
	 */
   	protected  int serializeSys067FileStat600(char[] value) {
	    int  sys067FileStat600;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys067FileStat600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSys067FileStat600
		       ,2
		      );
		 localSys067FileStat600Counter = shareString.getSerializedField().getModifiedCounter();
		return  sys067FileStat600;
    }

   protected int checkSys067FileStat600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys067FileStat600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys067FileStat600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSys067FileStat600
			                 ,SYS_067_FILE_STAT_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys067FileStat600", beginSys067FileStat600,SYS_067_FILE_STAT_600_LEN);
    }
   	}




}
  
