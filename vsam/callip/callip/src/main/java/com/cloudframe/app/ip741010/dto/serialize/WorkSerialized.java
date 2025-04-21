package com.cloudframe.app.ip741010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
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
            protected  int beginIp000904PdsSubMax;
	
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
             beginIp000904PdsSubMax = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localIp000904PdsSubMaxCounter = -1;
     public boolean isIp000904PdsSubMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000904PdsSubMaxCounter != sharedCounter;
         localIp000904PdsSubMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public char[]  getIp000904PdsSubMaxString() {
	     return getCharArray(beginIp000904PdsSubMax,IP_000904_PDS_SUB_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip000904PdsSubMaxIsNumeric() {
	    return isNumeric(beginIp000904PdsSubMax
	                    ,beginIp000904PdsSubMax + IP_000904_PDS_SUB_MAX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_000904_PDS_SUB_MAX_LEN = 4;
  	/**
	 * serializeIp000904PdsSubMax
	 */
	protected void serializeIp000904PdsSubMax(short ip000904PdsSubMax) {
		 putNumber(beginIp000904PdsSubMax,ip000904PdsSubMax,IP_000904_PDS_SUB_MAX_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp000904PdsSubMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp000904PdsSubMax
	 */
   	protected  short serializeIp000904PdsSubMax(char[] value) {
	    short  ip000904PdsSubMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip000904PdsSubMax = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp000904PdsSubMax
		       ,4
		      );
		 localIp000904PdsSubMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip000904PdsSubMax;
    }

   protected short checkIp000904PdsSubMaxMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp000904PdsSubMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000904PdsSubMax() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp000904PdsSubMax
			                 ,IP_000904_PDS_SUB_MAX_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip000904PdsSubMax", beginIp000904PdsSubMax,IP_000904_PDS_SUB_MAX_LEN);
    }
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
     int localHaveWeLoadedATable100Counter = -1;
     public boolean isHaveWeLoadedATable100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHaveWeLoadedATable100Counter != sharedCounter;
         localHaveWeLoadedATable100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHaveWeLoadedATable100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTable8Id300Counter = -1;
     public boolean isTable8Id300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable8Id300Counter != sharedCounter;
         localTable8Id300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable8Id300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTable9Id300Counter = -1;
     public boolean isTable9Id300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable9Id300Counter != sharedCounter;
         localTable9Id300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable9Id300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp650010300Counter = -1;
     public boolean isPgmIp650010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp650010300Counter != sharedCounter;
         localPgmIp650010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp650010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp299010300Counter = -1;
     public boolean isPgmIp299010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp299010300Counter != sharedCounter;
         localPgmIp299010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp299010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTblOverflowAbendCode300Counter = -1;
     public boolean isTblOverflowAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblOverflowAbendCode300Counter != sharedCounter;
         localTblOverflowAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblOverflowAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localRecAbsentAbendCode300Counter = -1;
     public boolean isRecAbsentAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecAbsentAbendCode300Counter != sharedCounter;
         localRecAbsentAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecAbsentAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTblIntegrityAbendCode300Counter = -1;
     public boolean isTblIntegrityAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblIntegrityAbendCode300Counter != sharedCounter;
         localTblIntegrityAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblIntegrityAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPara8100300Counter = -1;
     public boolean isPara8100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8100300Counter != sharedCounter;
         localPara8100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8100300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localPara8200300Counter = -1;
     public boolean isPara8200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8200300Counter != sharedCounter;
         localPara8200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8200300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
         int localStartPoint400Counter = -1;
         public boolean isStartPoint400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartPoint400Counter != sharedCounter;
            localStartPoint400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkStartPoint400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localPtrIp650010800Counter = -1;
     public boolean isPtrIp650010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp650010800Counter != sharedCounter;
         localPtrIp650010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp650010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp299010800Counter = -1;
     public boolean isPtrIp299010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp299010800Counter != sharedCounter;
         localPtrIp299010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp299010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCurrentDateTime800Counter = -1;
     public boolean isCurrentDateTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentDateTime800Counter != sharedCounter;
         localCurrentDateTime800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrentDateTime800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localTableMaxLength800Counter = -1;
         public boolean isTableMaxLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTableMaxLength800Counter != sharedCounter;
            localTableMaxLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTableMaxLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMaxT9RowNo800Counter = -1;
         public boolean isMaxT9RowNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxT9RowNo800Counter != sharedCounter;
            localMaxT9RowNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxT9RowNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCurrentPdsNo800Counter = -1;
         public boolean isCurrentPdsNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrentPdsNo800Counter != sharedCounter;
            localCurrentPdsNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCurrentPdsNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCheckLength800Counter = -1;
         public boolean isCheckLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCheckLength800Counter != sharedCounter;
            localCheckLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCheckLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowLength800Counter = -1;
         public boolean isRowLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowLength800Counter != sharedCounter;
            localRowLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowCount800Counter = -1;
         public boolean isRowCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount800Counter != sharedCounter;
            localRowCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRemainder800Counter = -1;
         public boolean isRemainder800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRemainder800Counter != sharedCounter;
            localRemainder800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRemainder800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localClearingDtTm800Counter = -1;
     public boolean isClearingDtTm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm800Counter != sharedCounter;
         localClearingDtTm800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkClearingDtTm800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localLastKeyDtTmT8800Counter = -1;
     public boolean isLastKeyDtTmT8800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTmT8800Counter != sharedCounter;
         localLastKeyDtTmT8800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTmT8800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localLastKeyDtTmT9800Counter = -1;
     public boolean isLastKeyDtTmT9800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTmT9800Counter != sharedCounter;
         localLastKeyDtTmT9800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTmT9800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }




}
  
