package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class IpmErrorMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IpmErrorMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IpmErrorMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IPM_ERROR_MSG_600_LENGTH = 103;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorCode600;
            protected  int beginIpmErrorRecordNo600;
            protected  int beginIpmErrorText600;
	
	/**
	* Constructor for IpmErrorMsg600Serialized
	**/
    public IpmErrorMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IpmErrorMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IPM_ERROR_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorCode600 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginIpmErrorRecordNo600 = getStartOffset() + 19;	// set offset for serialization
  
  
  
  
             beginIpmErrorText600 = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrorCode600Counter = -1;
     public boolean isErrorCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorCode600Counter != sharedCounter;
         localErrorCode600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() {
	     return getCharArray(beginErrorCode600,ERROR_CODE_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric() {
	    return isNumeric(beginErrorCode600
	                    ,beginErrorCode600 + ERROR_CODE_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERROR_CODE_600_LEN = 5;
  	/**
	 * serializeErrorCode600
	 */
	protected void serializeErrorCode600(long errorCode600) {
		 putNumber(beginErrorCode600,errorCode600,ERROR_CODE_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorCode600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrorCode600
	 */
   	protected  long serializeErrorCode600(char[] value) {
	    long  errorCode600;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errorCode600 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginErrorCode600
		       ,5
		      );
		 localErrorCode600Counter = shareString.getSerializedField().getModifiedCounter();
		return  errorCode600;
    }

   protected long checkErrorCode600MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrorCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrorCode600() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginErrorCode600
			                 ,ERROR_CODE_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errorCode600", beginErrorCode600,ERROR_CODE_600_LEN);
    }
   	}
     int localIpmErrorRecordNo600Counter = -1;
     public boolean isIpmErrorRecordNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorRecordNo600Counter != sharedCounter;
         localIpmErrorRecordNo600Counter = sharedCounter; return hasModified;
     }
	protected static final int IPM_ERROR_RECORD_NO_600_LEN = 11;
	/**
	 * 	serialize this IpmErrorRecordNo600
	 */
   protected void serializeIpmErrorRecordNo600(char[] ipmErrorRecordNo600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ipmErrorRecordNo600,0,getStringValue(),beginIpmErrorRecordNo600,IPM_ERROR_RECORD_NO_600_LEN);
       localIpmErrorRecordNo600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIpmErrorRecordNo600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIpmErrorRecordNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIpmErrorRecordNo600() {	 
   		return (substring(getStringValue(),beginIpmErrorRecordNo600,beginIpmErrorRecordNo600 + IPM_ERROR_RECORD_NO_600_LEN));
   	}
     int localIpmErrorText600Counter = -1;
     public boolean isIpmErrorText600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorText600Counter != sharedCounter;
         localIpmErrorText600Counter = sharedCounter; return hasModified;
     }
	protected static final int IPM_ERROR_TEXT_600_LEN = 64;
	/**
	 * 	serialize this IpmErrorText600
	 */
   protected void serializeIpmErrorText600(char[] ipmErrorText600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ipmErrorText600,0,getStringValue(),beginIpmErrorText600,IPM_ERROR_TEXT_600_LEN);
       localIpmErrorText600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIpmErrorText600Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshIpmErrorText600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIpmErrorText600() {	 
   		return (substring(getStringValue(),beginIpmErrorText600,beginIpmErrorText600 + IPM_ERROR_TEXT_600_LEN));
   	}




}
  
