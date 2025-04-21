package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003006Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003006Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003006Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003006_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileDd6003006;
            protected  int beginRecNum6003006;
	
	/**
	* Constructor for ErrorMsg6003006Serialized
	**/
    public ErrorMsg6003006Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003006Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003006_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileDd6003006 = getStartOffset() + 22;	// set offset for serialization
  
  
             beginRecNum6003006 = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileDd6003006Counter = -1;
     public boolean isFileDd6003006Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDd6003006Counter != sharedCounter;
         localFileDd6003006Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DD_6003006_LEN = 6;
	/**
	 * 	serialize this FileDd6003006
	 */
   protected void serializeFileDd6003006(char[] fileDd6003006) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDd6003006,0,getStringValue(),beginFileDd6003006,FILE_DD_6003006_LEN);
       localFileDd6003006Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDd6003006Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFileDd6003006 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDd6003006() {	 
   		return (substring(getStringValue(),beginFileDd6003006,beginFileDd6003006 + FILE_DD_6003006_LEN));
   	}
     int localRecNum6003006Counter = -1;
     public boolean isRecNum6003006Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecNum6003006Counter != sharedCounter;
         localRecNum6003006Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of recNum6003006
	 *	@return recNum6003006
	 */
	public char[]  getRecNum6003006String() {
	     return getCharArray(beginRecNum6003006,REC_NUM_6003006_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean recNum6003006IsNumeric() {
	    return isNumeric(beginRecNum6003006
	                    ,beginRecNum6003006 + REC_NUM_6003006_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REC_NUM_6003006_LEN = 10;
  	/**
	 * serializeRecNum6003006
	 */
	protected void serializeRecNum6003006(long recNum6003006) {
		 putNumber(beginRecNum6003006,recNum6003006,REC_NUM_6003006_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRecNum6003006Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRecNum6003006
	 */
   	protected  long serializeRecNum6003006(char[] value) {
	    long  recNum6003006;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    recNum6003006 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginRecNum6003006
		       ,10
		      );
		 localRecNum6003006Counter = shareString.getSerializedField().getModifiedCounter();
		return  recNum6003006;
    }

   protected long checkRecNum6003006MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRecNum6003006 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRecNum6003006() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRecNum6003006
			                 ,REC_NUM_6003006_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("recNum6003006", beginRecNum6003006,REC_NUM_6003006_LEN);
    }
   	}




}
  
