package com.cloudframe.app.vsamdb2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCode300;
	
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
  
  
  
             beginAbendCode300 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIsItFirstTime100Counter = -1;
     public boolean isIsItFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItFirstTime100Counter != sharedCounter;
         localIsItFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001FileStatus200Counter = -1;
     public boolean isSys001FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FileStatus200Counter != sharedCounter;
         localSys001FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localAbendParaName300Counter = -1;
     public boolean isAbendParaName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendParaName300Counter != sharedCounter;
         localAbendParaName300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendParaName300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localAbendCode300Counter = -1;
     public boolean isAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode300Counter != sharedCounter;
         localAbendCode300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() {
	     return getCharArray(beginAbendCode300,ABEND_CODE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric() {
	    return isNumeric(beginAbendCode300
	                    ,beginAbendCode300 + ABEND_CODE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_300_LEN = 4;
  	/**
	 * serializeAbendCode300
	 */
	protected void serializeAbendCode300(int abendCode300) {
		 putNumber(beginAbendCode300,abendCode300,ABEND_CODE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode300
	 */
   	protected  int serializeAbendCode300(char[] value) {
	    int  abendCode300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode300
		       ,4
		      );
		 localAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode300;
    }

   protected int checkAbendCode300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode300
			                 ,ABEND_CODE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode300", beginAbendCode300,ABEND_CODE_300_LEN);
    }
   	}
     int localAbendPara900Counter = -1;
     public boolean isAbendPara900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPara900Counter != sharedCounter;
         localAbendPara900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPara900Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }




}
  
