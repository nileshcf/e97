package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class IoErrorType600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IoErrorType600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IoErrorType600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IO_ERROR_TYPE_600_LENGTH = 109;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoErrTxt600;
            protected  int beginSys001FileStat600;
            protected  int beginNoOfRecords600;
	
	/**
	* Constructor for IoErrorType600Serialized
	**/
    public IoErrorType600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IoErrorType600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IO_ERROR_TYPE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoErrTxt600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSys001FileStat600 = getStartOffset() + 52;	// set offset for serialization
  
             beginNoOfRecords600 = getStartOffset() + 54;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIoErrTxt600Counter = -1;
     public boolean isIoErrTxt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoErrTxt600Counter != sharedCounter;
         localIoErrTxt600Counter = sharedCounter; return hasModified;
     }
	protected static final int IO_ERR_TXT_600_LEN = 40;
	/**
	 * 	serialize this IoErrTxt600
	 */
   protected void serializeIoErrTxt600(char[] ioErrTxt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ioErrTxt600,0,getStringValue(),beginIoErrTxt600,IO_ERR_TXT_600_LEN);
       localIoErrTxt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIoErrTxt600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshIoErrTxt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIoErrTxt600() {	 
   		return (substring(getStringValue(),beginIoErrTxt600,beginIoErrTxt600 + IO_ERR_TXT_600_LEN));
   	}
     int localSys001FileStat600Counter = -1;
     public boolean isSys001FileStat600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FileStat600Counter != sharedCounter;
         localSys001FileStat600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() {
	     return getCharArray(beginSys001FileStat600,SYS_001_FILE_STAT_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric() {
	    return isNumeric(beginSys001FileStat600
	                    ,beginSys001FileStat600 + SYS_001_FILE_STAT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_001_FILE_STAT_600_LEN = 2;
  	/**
	 * serializeSys001FileStat600
	 */
	protected void serializeSys001FileStat600(int sys001FileStat600) {
		 putNumber(beginSys001FileStat600,sys001FileStat600,SYS_001_FILE_STAT_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys001FileStat600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys001FileStat600
	 */
   	protected  int serializeSys001FileStat600(char[] value) {
	    int  sys001FileStat600;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys001FileStat600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSys001FileStat600
		       ,2
		      );
		 localSys001FileStat600Counter = shareString.getSerializedField().getModifiedCounter();
		return  sys001FileStat600;
    }

   protected int checkSys001FileStat600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys001FileStat600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys001FileStat600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSys001FileStat600
			                 ,SYS_001_FILE_STAT_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys001FileStat600", beginSys001FileStat600,SYS_001_FILE_STAT_600_LEN);
    }
   	}
     int localNoOfRecords600Counter = -1;
     public boolean isNoOfRecords600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoOfRecords600Counter != sharedCounter;
         localNoOfRecords600Counter = sharedCounter; return hasModified;
     }
	protected static final int NO_OF_RECORDS_600_LEN = 55;
	/**
	 * 	serialize this NoOfRecords600
	 */
   protected void serializeNoOfRecords600(char[] noOfRecords600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(noOfRecords600,0,getStringValue(),beginNoOfRecords600,NO_OF_RECORDS_600_LEN);
       localNoOfRecords600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNoOfRecords600Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
    /**
	 *	refreshNoOfRecords600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNoOfRecords600() {	 
   		return (substring(getStringValue(),beginNoOfRecords600,beginNoOfRecords600 + NO_OF_RECORDS_600_LEN));
   	}




}
  
