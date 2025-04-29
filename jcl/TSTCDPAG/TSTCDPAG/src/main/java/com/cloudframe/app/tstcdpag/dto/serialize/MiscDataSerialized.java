package com.cloudframe.app.tstcdpag.dto.serialize;

/**
*  The class MiscDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MiscDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MiscDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MISC_DATA_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputStatus;
            protected  int beginOutputStatus;
            protected  int beginRecLenIn;
            protected  int beginEofFlag;
	
	/**
	* Constructor for MiscDataSerialized
	**/
    public MiscDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MiscDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MISC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputStatus = getStartOffset() + 0;	// set offset for serialization
  
             beginOutputStatus = getStartOffset() + 2;	// set offset for serialization
  
             beginRecLenIn = getStartOffset() + 4;	// set offset for serialization
  
             beginEofFlag = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputStatusCounter = -1;
     public boolean isInputStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputStatusCounter != sharedCounter;
         localInputStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() {
	     return getCharArray(beginInputStatus,INPUT_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric() {
	    return isNumeric(beginInputStatus
	                    ,beginInputStatus + INPUT_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INPUT_STATUS_LEN = 2;
  	/**
	 * serializeInputStatus
	 */
	protected void serializeInputStatus(int inputStatus) {
		 putNumber(beginInputStatus,inputStatus,INPUT_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInputStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInputStatus
	 */
   	protected  int serializeInputStatus(char[] value) {
	    int  inputStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inputStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginInputStatus
		       ,2
		      );
		 localInputStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  inputStatus;
    }

   protected int checkInputStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInputStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInputStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInputStatus
			                 ,INPUT_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inputStatus", beginInputStatus,INPUT_STATUS_LEN);
    }
   	}
     int localOutputStatusCounter = -1;
     public boolean isOutputStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputStatusCounter != sharedCounter;
         localOutputStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() {
	     return getCharArray(beginOutputStatus,OUTPUT_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric() {
	    return isNumeric(beginOutputStatus
	                    ,beginOutputStatus + OUTPUT_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUTPUT_STATUS_LEN = 2;
  	/**
	 * serializeOutputStatus
	 */
	protected void serializeOutputStatus(int outputStatus) {
		 putNumber(beginOutputStatus,outputStatus,OUTPUT_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutputStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutputStatus
	 */
   	protected  int serializeOutputStatus(char[] value) {
	    int  outputStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outputStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOutputStatus
		       ,2
		      );
		 localOutputStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  outputStatus;
    }

   protected int checkOutputStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutputStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutputStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOutputStatus
			                 ,OUTPUT_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outputStatus", beginOutputStatus,OUTPUT_STATUS_LEN);
    }
   	}
         int localRecLenInCounter = -1;
         public boolean isRecLenInModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecLenInCounter != sharedCounter;
            localRecLenInCounter = sharedCounter; return hasModified; 
         }
   protected static final int REC_LEN_IN_LEN = 4;
  	/**
	 * serializeRecLenIn
	 */
	protected void serializeRecLenIn(long recLenIn) {
           replaceValue( //  save the value as string
                   getBinaryString( recLenIn,REC_LEN_IN_LEN)
                  ,beginRecLenIn
                  ,REC_LEN_IN_LEN
                 );
            localRecLenInCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkRecLenInMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRecLenIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRecLenIn() {	 
			return (getUnsignedInt(beginRecLenIn));
   	}
         int localEofFlagCounter = -1;
         public boolean isEofFlagModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEofFlagCounter != sharedCounter;
            localEofFlagCounter = sharedCounter; return hasModified; 
         }
   protected static final int EOF_FLAG_LEN = 2;
  	/**
	 * serializeEofFlag
	 */
	protected void serializeEofFlag(short eofFlag) {
           replaceValue( //  save the value as string
                   getBinaryString( eofFlag,EOF_FLAG_LEN)
                  ,beginEofFlag
                  ,EOF_FLAG_LEN
                 );
            localEofFlagCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEofFlagMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEofFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEofFlag() {	 
			return (getShort(beginEofFlag));
   	}




}
  
