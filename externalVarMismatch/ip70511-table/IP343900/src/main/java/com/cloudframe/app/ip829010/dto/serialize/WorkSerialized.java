package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginValue7300;
            protected  int beginValue99300;
            protected  int beginClrCyclId800;
            protected  int beginPrevClrCyclId800;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginValue7300 = getStartOffset() + 0;	// set offset for serialization
  
             beginValue99300 = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginClrCyclId800 = getStartOffset() + 4;	// set offset for serialization
  
             beginPrevClrCyclId800 = getStartOffset() + 6;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localMqRespStatusSw100Counter = -1;
     public boolean isMqRespStatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqRespStatusSw100Counter != sharedCounter;
         localMqRespStatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqRespStatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
         int localQueryNoSeven300Counter = -1;
         public boolean isQueryNoSeven300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localQueryNoSeven300Counter != sharedCounter;
            localQueryNoSeven300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkQueryNoSeven300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localJobnameErrorAbendCode300Counter = -1;
     public boolean isJobnameErrorAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobnameErrorAbendCode300Counter != sharedCounter;
         localJobnameErrorAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobnameErrorAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localJobnumErrorAbendCode300Counter = -1;
     public boolean isJobnumErrorAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobnumErrorAbendCode300Counter != sharedCounter;
         localJobnumErrorAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobnumErrorAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localRetryErrorAbendCode300Counter = -1;
     public boolean isRetryErrorAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetryErrorAbendCode300Counter != sharedCounter;
         localRetryErrorAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRetryErrorAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localGetMqRspCdAbendCode300Counter = -1;
     public boolean isGetMqRspCdAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGetMqRspCdAbendCode300Counter != sharedCounter;
         localGetMqRspCdAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGetMqRspCdAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localGetQAbendCode300Counter = -1;
     public boolean isGetQAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGetQAbendCode300Counter != sharedCounter;
         localGetQAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGetQAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localInsertMrsAbendCode300Counter = -1;
     public boolean isInsertMrsAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInsertMrsAbendCode300Counter != sharedCounter;
         localInsertMrsAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInsertMrsAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPutQAbendCode300Counter = -1;
     public boolean isPutQAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPutQAbendCode300Counter != sharedCounter;
         localPutQAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPutQAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localInvalidRcLrm300Counter = -1;
     public boolean isInvalidRcLrm300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidRcLrm300Counter != sharedCounter;
         localInvalidRcLrm300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidRcLrm300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localAbendCode3003010Counter = -1;
     public boolean isAbendCode3003010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003010Counter != sharedCounter;
         localAbendCode3003010Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCode3003010Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localAbendCode3003011Counter = -1;
     public boolean isAbendCode3003011Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003011Counter != sharedCounter;
         localAbendCode3003011Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCode3003011Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localAbendCode3003012Counter = -1;
     public boolean isAbendCode3003012Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003012Counter != sharedCounter;
         localAbendCode3003012Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCode3003012Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPgmIp081110300Counter = -1;
     public boolean isPgmIp081110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081110300Counter != sharedCounter;
         localPgmIp081110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp282210300Counter = -1;
     public boolean isPgmIp282210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp282210300Counter != sharedCounter;
         localPgmIp282210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp282210300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp521010300Counter = -1;
     public boolean isPgmIp521010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp521010300Counter != sharedCounter;
         localPgmIp521010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp521010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp586010300Counter = -1;
     public boolean isPgmIp586010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp586010300Counter != sharedCounter;
         localPgmIp586010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp586010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp599810300Counter = -1;
     public boolean isPgmIp599810300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp599810300Counter != sharedCounter;
         localPgmIp599810300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp599810300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp595210300Counter = -1;
     public boolean isPgmIp595210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp595210300Counter != sharedCounter;
         localPgmIp595210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp595210300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAbendPgm300Counter = -1;
     public boolean isAbendPgm300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPgm300Counter != sharedCounter;
         localAbendPgm300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPgm300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp648010300Counter = -1;
     public boolean isPgmIp648010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp648010300Counter != sharedCounter;
         localPgmIp648010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp648010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp703020300Counter = -1;
     public boolean isPgmIp703020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp703020300Counter != sharedCounter;
         localPgmIp703020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp703020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp829010300Counter = -1;
     public boolean isPgmIp829010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp829010300Counter != sharedCounter;
         localPgmIp829010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp829010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localPgmIp708020300Counter = -1;
     public boolean isPgmIp708020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp708020300Counter != sharedCounter;
         localPgmIp708020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp708020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp890110300Counter = -1;
     public boolean isPgmIp890110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp890110300Counter != sharedCounter;
         localPgmIp890110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp890110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996020300Counter = -1;
     public boolean isPgmIp996020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996020300Counter != sharedCounter;
         localPgmIp996020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp708010300Counter = -1;
     public boolean isPgmIp708010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp708010300Counter != sharedCounter;
         localPgmIp708010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp708010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localValue1300Counter = -1;
         public boolean isValue1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue1300Counter != sharedCounter;
            localValue1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localValue7300Counter = -1;
     public boolean isValue7300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue7300Counter != sharedCounter;
         localValue7300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() {
	     return getCharArray(beginValue7300,VALUE_7300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric() {
	    return isNumeric(beginValue7300
	                    ,beginValue7300 + VALUE_7300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_7300_LEN = 2;
  	/**
	 * serializeValue7300
	 */
	protected void serializeValue7300(int value7300) {
		 putNumber(beginValue7300,value7300,VALUE_7300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue7300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue7300
	 */
   	protected  int serializeValue7300(char[] value) {
	    int  value7300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value7300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue7300
		       ,2
		      );
		 localValue7300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value7300;
    }

   protected int checkValue7300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue7300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue7300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue7300
			                 ,VALUE_7300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value7300", beginValue7300,VALUE_7300_LEN);
    }
   	}
     int localValue99300Counter = -1;
     public boolean isValue99300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue99300Counter != sharedCounter;
         localValue99300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() {
	     return getCharArray(beginValue99300,VALUE_99300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric() {
	    return isNumeric(beginValue99300
	                    ,beginValue99300 + VALUE_99300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_99300_LEN = 2;
  	/**
	 * serializeValue99300
	 */
	protected void serializeValue99300(int value99300) {
		 putNumber(beginValue99300,value99300,VALUE_99300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue99300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue99300
	 */
   	protected  int serializeValue99300(char[] value) {
	    int  value99300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value99300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue99300
		       ,2
		      );
		 localValue99300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value99300;
    }

   protected int checkValue99300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue99300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue99300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue99300
			                 ,VALUE_99300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value99300", beginValue99300,VALUE_99300_LEN);
    }
   	}
     int localValueFacreq300Counter = -1;
     public boolean isValueFacreq300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueFacreq300Counter != sharedCounter;
         localValueFacreq300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueFacreq300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
         int localMqFailCode300Counter = -1;
         public boolean isMqFailCode300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqFailCode300Counter != sharedCounter;
            localMqFailCode300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqFailCode300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqFailCodeOne300Counter = -1;
         public boolean isMqFailCodeOne300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqFailCodeOne300Counter != sharedCounter;
            localMqFailCodeOne300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqFailCodeOne300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localValuePipe300Counter = -1;
     public boolean isValuePipe300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValuePipe300Counter != sharedCounter;
         localValuePipe300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValuePipe300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueClosed300Counter = -1;
     public boolean isValueClosed300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueClosed300Counter != sharedCounter;
         localValueClosed300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueClosed300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueTest300Counter = -1;
     public boolean isValueTest300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueTest300Counter != sharedCounter;
         localValueTest300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueTest300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueN300Counter = -1;
     public boolean isValueN300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueN300Counter != sharedCounter;
         localValueN300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueN300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueC300Counter = -1;
     public boolean isValueC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueC300Counter != sharedCounter;
         localValueC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys201300Counter = -1;
     public boolean isSys201300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201300Counter != sharedCounter;
         localSys201300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localPanInvalidMsg300Counter = -1;
     public boolean isPanInvalidMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanInvalidMsg300Counter != sharedCounter;
         localPanInvalidMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPanInvalidMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localExpInvalidMsg300Counter = -1;
     public boolean isExpInvalidMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExpInvalidMsg300Counter != sharedCounter;
         localExpInvalidMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkExpInvalidMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVanInvalidMsg300Counter = -1;
     public boolean isVanInvalidMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVanInvalidMsg300Counter != sharedCounter;
         localVanInvalidMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVanInvalidMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localGftInvalidMsg300Counter = -1;
     public boolean isGftInvalidMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftInvalidMsg300Counter != sharedCounter;
         localGftInvalidMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGftInvalidMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localTxnInvalidMsg300Counter = -1;
     public boolean isTxnInvalidMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnInvalidMsg300Counter != sharedCounter;
         localTxnInvalidMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTxnInvalidMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localFacNotFoundMsg300Counter = -1;
     public boolean isFacNotFoundMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFacNotFoundMsg300Counter != sharedCounter;
         localFacNotFoundMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFacNotFoundMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localTipmrsFailMsg300Counter = -1;
     public boolean isTipmrsFailMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipmrsFailMsg300Counter != sharedCounter;
         localTipmrsFailMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTipmrsFailMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localTipmrsDuplMsg300Counter = -1;
     public boolean isTipmrsDuplMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipmrsDuplMsg300Counter != sharedCounter;
         localTipmrsDuplMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTipmrsDuplMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localMqputFailMsg300Counter = -1;
     public boolean isMqputFailMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqputFailMsg300Counter != sharedCounter;
         localMqputFailMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqputFailMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localMqgetFailMsg300Counter = -1;
     public boolean isMqgetFailMsg300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqgetFailMsg300Counter != sharedCounter;
         localMqgetFailMsg300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqgetFailMsg300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localAsterisks300Counter = -1;
     public boolean isAsterisks300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsterisks300Counter != sharedCounter;
         localAsterisks300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAsterisks300Constraints(char[] value) {
   			return super.checkConstraints(value , 34 ,false, false);
   }
     int localAbendTxt300Counter = -1;
     public boolean isAbendTxt300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendTxt300Counter != sharedCounter;
         localAbendTxt300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendTxt300Constraints(char[] value) {
   			return super.checkConstraints(value , 31 ,false, false);
   }
     int localAbendPgmTxt300Counter = -1;
     public boolean isAbendPgmTxt300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPgmTxt300Counter != sharedCounter;
         localAbendPgmTxt300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPgmTxt300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localParaName1400300Counter = -1;
     public boolean isParaName1400300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName1400300Counter != sharedCounter;
         localParaName1400300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName1400300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName2426300Counter = -1;
     public boolean isParaName2426300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName2426300Counter != sharedCounter;
         localParaName2426300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName2426300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName2410300Counter = -1;
     public boolean isParaName2410300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName2410300Counter != sharedCounter;
         localParaName2410300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName2410300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName2610300Counter = -1;
     public boolean isParaName2610300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName2610300Counter != sharedCounter;
         localParaName2610300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName2610300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName24301300Counter = -1;
     public boolean isParaName24301300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName24301300Counter != sharedCounter;
         localParaName24301300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName24301300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName8500300Counter = -1;
     public boolean isParaName8500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName8500300Counter != sharedCounter;
         localParaName8500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName8500300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName1900300Counter = -1;
     public boolean isParaName1900300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName1900300Counter != sharedCounter;
         localParaName1900300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName1900300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName2800300Counter = -1;
     public boolean isParaName2800300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName2800300Counter != sharedCounter;
         localParaName2800300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName2800300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParaName3100300Counter = -1;
     public boolean isParaName3100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName3100300Counter != sharedCounter;
         localParaName3100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName3100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localFraudMqDebugDispStr600Counter = -1;
     public boolean isFraudMqDebugDispStr600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFraudMqDebugDispStr600Counter != sharedCounter;
         localFraudMqDebugDispStr600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFraudMqDebugDispStr600Constraints(char[] value) {
   			return super.checkConstraints(value , 400 ,false, false);
   }
     int localJobNameError600Counter = -1;
     public boolean isJobNameError600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobNameError600Counter != sharedCounter;
         localJobNameError600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobNameError600Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localJobNumError601Counter = -1;
     public boolean isJobNumError601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobNumError601Counter != sharedCounter;
         localJobNumError601Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobNumError601Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRetryCountError602Counter = -1;
     public boolean isRetryCountError602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetryCountError602Counter != sharedCounter;
         localRetryCountError602Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRetryCountError602Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRowsNotFoundErrMsgTxt604Counter = -1;
     public boolean isRowsNotFoundErrMsgTxt604Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRowsNotFoundErrMsgTxt604Counter != sharedCounter;
         localRowsNotFoundErrMsgTxt604Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRowsNotFoundErrMsgTxt604Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localTipamrsInsertFailure605Counter = -1;
     public boolean isTipamrsInsertFailure605Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipamrsInsertFailure605Counter != sharedCounter;
         localTipamrsInsertFailure605Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTipamrsInsertFailure605Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localLrmIoAbendMsg609Counter = -1;
     public boolean isLrmIoAbendMsg609Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLrmIoAbendMsg609Counter != sharedCounter;
         localLrmIoAbendMsg609Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLrmIoAbendMsg609Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localAbendPtr800Counter = -1;
     public boolean isAbendPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPtr800Counter != sharedCounter;
         localAbendPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp081110800Counter = -1;
     public boolean isPtrIp081110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081110800Counter != sharedCounter;
         localPtrIp081110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp282210800Counter = -1;
     public boolean isPtrIp282210800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp282210800Counter != sharedCounter;
         localPtrIp282210800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp282210800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp586010800Counter = -1;
     public boolean isPtrIp586010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp586010800Counter != sharedCounter;
         localPtrIp586010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp586010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp599810800Counter = -1;
     public boolean isPtrIp599810800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp599810800Counter != sharedCounter;
         localPtrIp599810800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp599810800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp595210800Counter = -1;
     public boolean isPtrIp595210800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp595210800Counter != sharedCounter;
         localPtrIp595210800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp595210800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp648010800Counter = -1;
     public boolean isPtrIp648010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp648010800Counter != sharedCounter;
         localPtrIp648010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp648010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp708020800Counter = -1;
     public boolean isPtrIp708020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp708020800Counter != sharedCounter;
         localPtrIp708020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp708020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp703020800Counter = -1;
     public boolean isPtrIp703020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp703020800Counter != sharedCounter;
         localPtrIp703020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp703020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp890110800Counter = -1;
     public boolean isPtrIp890110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp890110800Counter != sharedCounter;
         localPtrIp890110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp890110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp996010800Counter = -1;
     public boolean isPtrIp996010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996010800Counter != sharedCounter;
         localPtrIp996010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp996020800Counter = -1;
     public boolean isPtrIp996020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996020800Counter != sharedCounter;
         localPtrIp996020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp521010800Counter = -1;
     public boolean isPtrIp521010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp521010800Counter != sharedCounter;
         localPtrIp521010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp521010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp708010800Counter = -1;
     public boolean isPtrIp708010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp708010800Counter != sharedCounter;
         localPtrIp708010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp708010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localStart800Counter = -1;
         public boolean isStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStart800Counter != sharedCounter;
            localStart800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkStart800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localEnd800Counter = -1;
         public boolean isEnd800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEnd800Counter != sharedCounter;
            localEnd800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEnd800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localClrCyclId800Counter = -1;
     public boolean isClrCyclId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClrCyclId800Counter != sharedCounter;
         localClrCyclId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public char[]  getClrCyclId800String() {
	     return getCharArray(beginClrCyclId800,CLR_CYCL_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clrCyclId800IsNumeric() {
	    return isNumeric(beginClrCyclId800
	                    ,beginClrCyclId800 + CLR_CYCL_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLR_CYCL_ID_800_LEN = 2;
  	/**
	 * serializeClrCyclId800
	 */
	protected void serializeClrCyclId800(int clrCyclId800) {
		 putNumber(beginClrCyclId800,clrCyclId800,CLR_CYCL_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClrCyclId800
	 */
   	protected  int serializeClrCyclId800(char[] value) {
	    int  clrCyclId800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clrCyclId800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginClrCyclId800
		       ,2
		      );
		 localClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  clrCyclId800;
    }

   protected int checkClrCyclId800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClrCyclId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshClrCyclId800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginClrCyclId800
			                 ,CLR_CYCL_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clrCyclId800", beginClrCyclId800,CLR_CYCL_ID_800_LEN);
    }
   	}
     int localPrevClrCyclId800Counter = -1;
     public boolean isPrevClrCyclId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevClrCyclId800Counter != sharedCounter;
         localPrevClrCyclId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public char[]  getPrevClrCyclId800String() {
	     return getCharArray(beginPrevClrCyclId800,PREV_CLR_CYCL_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prevClrCyclId800IsNumeric() {
	    return isNumeric(beginPrevClrCyclId800
	                    ,beginPrevClrCyclId800 + PREV_CLR_CYCL_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PREV_CLR_CYCL_ID_800_LEN = 2;
  	/**
	 * serializePrevClrCyclId800
	 */
	protected void serializePrevClrCyclId800(int prevClrCyclId800) {
		 putNumber(beginPrevClrCyclId800,prevClrCyclId800,PREV_CLR_CYCL_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPrevClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePrevClrCyclId800
	 */
   	protected  int serializePrevClrCyclId800(char[] value) {
	    int  prevClrCyclId800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    prevClrCyclId800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPrevClrCyclId800
		       ,2
		      );
		 localPrevClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  prevClrCyclId800;
    }

   protected int checkPrevClrCyclId800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPrevClrCyclId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrevClrCyclId800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPrevClrCyclId800
			                 ,PREV_CLR_CYCL_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("prevClrCyclId800", beginPrevClrCyclId800,PREV_CLR_CYCL_ID_800_LEN);
    }
   	}
     int localMqRespCd800Counter = -1;
     public boolean isMqRespCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqRespCd800Counter != sharedCounter;
         localMqRespCd800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqRespCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFacreqJobgrpName800Counter = -1;
     public boolean isFacreqJobgrpName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFacreqJobgrpName800Counter != sharedCounter;
         localFacreqJobgrpName800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFacreqJobgrpName800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localJobname800Counter = -1;
     public boolean isJobname800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobname800Counter != sharedCounter;
         localJobname800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobname800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localMrsIsrtCount800Counter = -1;
         public boolean isMrsIsrtCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMrsIsrtCount800Counter != sharedCounter;
            localMrsIsrtCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMrsIsrtCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqputSkipCount800Counter = -1;
         public boolean isMqputSkipCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqputSkipCount800Counter != sharedCounter;
            localMqputSkipCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqputSkipCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTipamrsSkipCount800Counter = -1;
         public boolean isTipamrsSkipCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTipamrsSkipCount800Counter != sharedCounter;
            localTipamrsSkipCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTipamrsSkipCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqgetFailCount800Counter = -1;
         public boolean isMqgetFailCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqgetFailCount800Counter != sharedCounter;
            localMqgetFailCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqgetFailCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqputFailCount800Counter = -1;
         public boolean isMqputFailCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqputFailCount800Counter != sharedCounter;
            localMqputFailCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqputFailCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFaaFacNotFndCnt800Counter = -1;
         public boolean isFaaFacNotFndCnt800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFaaFacNotFndCnt800Counter != sharedCounter;
            localFaaFacNotFndCnt800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFaaFacNotFndCnt800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localLnRespDebugInd800Counter = -1;
     public boolean isLnRespDebugInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLnRespDebugInd800Counter != sharedCounter;
         localLnRespDebugInd800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLnRespDebugInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys201Status800Counter = -1;
     public boolean isSys201Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201Status800Counter != sharedCounter;
         localSys201Status800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSkipFlag800Counter = -1;
     public boolean isSkipFlag800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkipFlag800Counter != sharedCounter;
         localSkipFlag800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSkipFlag800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
