package com.cloudframe.app.ip650010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginValueOne300;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginValueOne300 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localIsItTheFirstTime100Counter = -1;
     public boolean isIsItTheFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItTheFirstTime100Counter != sharedCounter;
         localIsItTheFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItTheFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsOptParmFileClosed100Counter = -1;
     public boolean isIsOptParmFileClosed100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsOptParmFileClosed100Counter != sharedCounter;
         localIsOptParmFileClosed100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsOptParmFileClosed100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localOptParmFileStatus200Counter = -1;
     public boolean isOptParmFileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOptParmFileStatus200Counter != sharedCounter;
         localOptParmFileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOptParmFileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localValueOne300Counter = -1;
     public boolean isValueOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueOne300Counter != sharedCounter;
         localValueOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() {
	     return getCharArray(beginValueOne300,VALUE_ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric() {
	    return isNumeric(beginValueOne300
	                    ,beginValueOne300 + VALUE_ONE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_ONE_300_LEN = 1;
  	/**
	 * serializeValueOne300
	 */
	protected void serializeValueOne300(int valueOne300) {
		 putNumber(beginValueOne300,valueOne300,VALUE_ONE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValueOne300
	 */
   	protected  int serializeValueOne300(char[] value) {
	    int  valueOne300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    valueOne300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValueOne300
		       ,1
		      );
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  valueOne300;
    }

   protected int checkValueOne300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValueOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValueOne300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValueOne300
			                 ,VALUE_ONE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("valueOne300", beginValueOne300,VALUE_ONE_300_LEN);
    }
   	}
     int localFileOpenAbendCode300Counter = -1;
     public boolean isFileOpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileOpenAbendCode300Counter != sharedCounter;
         localFileOpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFileOpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localFileStartAbendCode300Counter = -1;
     public boolean isFileStartAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStartAbendCode300Counter != sharedCounter;
         localFileStartAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFileStartAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localFileReadAbendCode300Counter = -1;
     public boolean isFileReadAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileReadAbendCode300Counter != sharedCounter;
         localFileReadAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFileReadAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localFileCloseAbendCode300Counter = -1;
     public boolean isFileCloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileCloseAbendCode300Counter != sharedCounter;
         localFileCloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFileCloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localOptParmRecLngth400Counter = -1;
         public boolean isOptParmRecLngth400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOptParmRecLngth400Counter != sharedCounter;
            localOptParmRecLngth400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkOptParmRecLngth400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localRecordsRead400Counter = -1;
         public boolean isRecordsRead400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordsRead400Counter != sharedCounter;
            localRecordsRead400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordsRead400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
