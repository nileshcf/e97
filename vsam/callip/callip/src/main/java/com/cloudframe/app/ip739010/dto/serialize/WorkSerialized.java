package com.cloudframe.app.ip739010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
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
            protected  int beginIp000704DeSubMax;
	
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
             beginIp000704DeSubMax = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localIp000704DeSubMaxCounter = -1;
     public boolean isIp000704DeSubMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000704DeSubMaxCounter != sharedCounter;
         localIp000704DeSubMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public char[]  getIp000704DeSubMaxString() {
	     return getCharArray(beginIp000704DeSubMax,IP_000704_DE_SUB_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip000704DeSubMaxIsNumeric() {
	    return isNumeric(beginIp000704DeSubMax
	                    ,beginIp000704DeSubMax + IP_000704_DE_SUB_MAX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_000704_DE_SUB_MAX_LEN = 4;
  	/**
	 * serializeIp000704DeSubMax
	 */
	protected void serializeIp000704DeSubMax(short ip000704DeSubMax) {
		 putNumber(beginIp000704DeSubMax,ip000704DeSubMax,IP_000704_DE_SUB_MAX_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp000704DeSubMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp000704DeSubMax
	 */
   	protected  short serializeIp000704DeSubMax(char[] value) {
	    short  ip000704DeSubMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip000704DeSubMax = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp000704DeSubMax
		       ,4
		      );
		 localIp000704DeSubMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip000704DeSubMax;
    }

   protected short checkIp000704DeSubMaxMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp000704DeSubMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000704DeSubMax() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp000704DeSubMax
			                 ,IP_000704_DE_SUB_MAX_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip000704DeSubMax", beginIp000704DeSubMax,IP_000704_DE_SUB_MAX_LEN);
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
     int localWasT6Loaded100Counter = -1;
     public boolean isWasT6Loaded100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWasT6Loaded100Counter != sharedCounter;
         localWasT6Loaded100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWasT6Loaded100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWasT7Loaded100Counter = -1;
     public boolean isWasT7Loaded100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWasT7Loaded100Counter != sharedCounter;
         localWasT7Loaded100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWasT7Loaded100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTable6Id300Counter = -1;
     public boolean isTable6Id300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable6Id300Counter != sharedCounter;
         localTable6Id300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable6Id300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTable6aId300Counter = -1;
     public boolean isTable6aId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable6aId300Counter != sharedCounter;
         localTable6aId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable6aId300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTable7Id300Counter = -1;
     public boolean isTable7Id300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable7Id300Counter != sharedCounter;
         localTable7Id300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable7Id300Constraints(char[] value) {
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
         int localTableMaxLength800Counter = -1;
         public boolean isTableMaxLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTableMaxLength800Counter != sharedCounter;
            localTableMaxLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTableMaxLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMaxT6RowNo800Counter = -1;
         public boolean isMaxT6RowNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxT6RowNo800Counter != sharedCounter;
            localMaxT6RowNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxT6RowNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMaxT6aRowNo800Counter = -1;
         public boolean isMaxT6aRowNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxT6aRowNo800Counter != sharedCounter;
            localMaxT6aRowNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxT6aRowNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMaxT7RowNo800Counter = -1;
         public boolean isMaxT7RowNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxT7RowNo800Counter != sharedCounter;
            localMaxT7RowNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxT7RowNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCurrentDeNo800Counter = -1;
         public boolean isCurrentDeNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrentDeNo800Counter != sharedCounter;
            localCurrentDeNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCurrentDeNo800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localLastKeyDtTmT6800Counter = -1;
     public boolean isLastKeyDtTmT6800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTmT6800Counter != sharedCounter;
         localLastKeyDtTmT6800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTmT6800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localLastKeyDtTmT6a800Counter = -1;
     public boolean isLastKeyDtTmT6a800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTmT6a800Counter != sharedCounter;
         localLastKeyDtTmT6a800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTmT6a800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localLastKeyDtTmT7800Counter = -1;
     public boolean isLastKeyDtTmT7800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTmT7800Counter != sharedCounter;
         localLastKeyDtTmT7800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTmT7800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }




}
  
