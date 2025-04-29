package com.cloudframe.app.ip282210.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 0;
   /*  offset of each of Child Fields when serialized as a String */
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localIp02014wEntriesCounter = -1;
         public boolean isIp02014wEntriesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp02014wEntriesCounter != sharedCounter;
            localIp02014wEntriesCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp02014wEntriesMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
     int localAreLpaRecOver100Counter = -1;
     public boolean isAreLpaRecOver100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAreLpaRecOver100Counter != sharedCounter;
         localAreLpaRecOver100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAreLpaRecOver100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localKeyEntryFound100Counter = -1;
     public boolean isKeyEntryFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localKeyEntryFound100Counter != sharedCounter;
         localKeyEntryFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkKeyEntryFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localValueOne300Counter = -1;
         public boolean isValueOne300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValueOne300Counter != sharedCounter;
            localValueOne300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkValueOne300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localLpaLoader300Counter = -1;
     public boolean isLpaLoader300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLpaLoader300Counter != sharedCounter;
         localLpaLoader300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLpaLoader300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableId300Counter = -1;
     public boolean isTableId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId300Counter != sharedCounter;
         localTableId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableId300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableName300Counter = -1;
     public boolean isTableName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableName300Counter != sharedCounter;
         localTableName300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableName300Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
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
     int localPgmIp299010300Counter = -1;
     public boolean isPgmIp299010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp299010300Counter != sharedCounter;
         localPgmIp299010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp299010300Constraints(char[] value) {
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
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
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
     int localTblOverflowAbendCode300Counter = -1;
     public boolean isTblOverflowAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblOverflowAbendCode300Counter != sharedCounter;
         localTblOverflowAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblOverflowAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localRecLengthAbendCode300Counter = -1;
     public boolean isRecLengthAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecLengthAbendCode300Counter != sharedCounter;
         localRecLengthAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecLengthAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localNoTable201InOdf300Counter = -1;
     public boolean isNoTable201InOdf300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoTable201InOdf300Counter != sharedCounter;
         localNoTable201InOdf300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNoTable201InOdf300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPara1311300Counter = -1;
     public boolean isPara1311300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1311300Counter != sharedCounter;
         localPara1311300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1311300Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localPara131112300Counter = -1;
     public boolean isPara131112300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara131112300Counter != sharedCounter;
         localPara131112300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara131112300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localPara131111300Counter = -1;
     public boolean isPara131111300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara131111300Counter != sharedCounter;
         localPara131111300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara131111300Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
         int localCheckCount400Counter = -1;
         public boolean isCheckCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCheckCount400Counter != sharedCounter;
            localCheckCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCheckCount400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowsLoaded400Counter = -1;
         public boolean isRowsLoaded400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowsLoaded400Counter != sharedCounter;
            localRowsLoaded400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowsLoaded400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowCount400Counter = -1;
         public boolean isRowCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount400Counter != sharedCounter;
            localRowCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localIp02014TblOverflowErr600Counter = -1;
     public boolean isIp02014TblOverflowErr600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014TblOverflowErr600Counter != sharedCounter;
         localIp02014TblOverflowErr600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp02014TblOverflowErr600Constraints(char[] value) {
   			return super.checkConstraints(value , 63 ,false, false);
   }
     int localTable201AbsentInOdf610Counter = -1;
     public boolean isTable201AbsentInOdf610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable201AbsentInOdf610Counter != sharedCounter;
         localTable201AbsentInOdf610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTable201AbsentInOdf610Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
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
     int localPtrIp650010800Counter = -1;
     public boolean isPtrIp650010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp650010800Counter != sharedCounter;
         localPtrIp650010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp650010800Constraints(char[] value) {
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
     int localAbendPtr800Counter = -1;
     public boolean isAbendPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPtr800Counter != sharedCounter;
         localAbendPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
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
     int localLastKeyDtTm800Counter = -1;
     public boolean isLastKeyDtTm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastKeyDtTm800Counter != sharedCounter;
         localLastKeyDtTm800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLastKeyDtTm800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localRecordLength800Counter = -1;
         public boolean isRecordLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordLength800Counter != sharedCounter;
            localRecordLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordLength800MaxLimit(long number) {
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
         int localRowCount800Counter = -1;
         public boolean isRowCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount800Counter != sharedCounter;
            localRowCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount800MaxLimit(long number) {
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
     int localAstriskLine900Counter = -1;
     public boolean isAstriskLine900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAstriskLine900Counter != sharedCounter;
         localAstriskLine900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAstriskLine900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbend900Counter = -1;
     public boolean isAbendAbend900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbend900Counter != sharedCounter;
         localAbendAbend900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbend900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbendPgm900Counter = -1;
     public boolean isAbendAbendPgm900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbendPgm900Counter != sharedCounter;
         localAbendAbendPgm900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbendPgm900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }




}
  
