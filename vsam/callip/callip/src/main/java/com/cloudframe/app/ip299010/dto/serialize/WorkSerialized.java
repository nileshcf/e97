package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
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
         int localIp00054wEntriesCounter = -1;
         public boolean isIp00054wEntriesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00054wEntriesCounter != sharedCounter;
            localIp00054wEntriesCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp00054wEntriesMaxLimit(long number) {
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
     int localAreTableRecordsOver100Counter = -1;
     public boolean isAreTableRecordsOver100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAreTableRecordsOver100Counter != sharedCounter;
         localAreTableRecordsOver100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAreTableRecordsOver100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsTblidFndIntable5100Counter = -1;
     public boolean isIsTblidFndIntable5100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsTblidFndIntable5100Counter != sharedCounter;
         localIsTblidFndIntable5100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsTblidFndIntable5100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsTableKeyFound100Counter = -1;
     public boolean isIsTableKeyFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsTableKeyFound100Counter != sharedCounter;
         localIsTableKeyFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsTableKeyFound100Constraints(char[] value) {
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
     int localTableId300Counter = -1;
     public boolean isTableId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId300Counter != sharedCounter;
         localTableId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableId300Constraints(char[] value) {
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
     int localRecLengthAbendCode300Counter = -1;
     public boolean isRecLengthAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecLengthAbendCode300Counter != sharedCounter;
         localRecLengthAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecLengthAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTblEntryAbendCode300Counter = -1;
     public boolean isTblEntryAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblEntryAbendCode300Counter != sharedCounter;
         localTblEntryAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblEntryAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPara1220300Counter = -1;
     public boolean isPara1220300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1220300Counter != sharedCounter;
         localPara1220300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1220300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localPara122110300Counter = -1;
     public boolean isPara122110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara122110300Counter != sharedCounter;
         localPara122110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara122110300Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localPara122111300Counter = -1;
     public boolean isPara122111300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara122111300Counter != sharedCounter;
         localPara122111300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara122111300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localPara2210300Counter = -1;
     public boolean isPara2210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2210300Counter != sharedCounter;
         localPara2210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2210300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
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
         int localRecordsLoaded400Counter = -1;
         public boolean isRecordsLoaded400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordsLoaded400Counter != sharedCounter;
            localRecordsLoaded400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordsLoaded400MaxLimit(long number) {
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
     int localTableOverflowError600Counter = -1;
     public boolean isTableOverflowError600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableOverflowError600Counter != sharedCounter;
         localTableOverflowError600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableOverflowError600Constraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
     int localRecNotFoundMsg610Counter = -1;
     public boolean isRecNotFoundMsg610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecNotFoundMsg610Counter != sharedCounter;
         localRecNotFoundMsg610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecNotFoundMsg610Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
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
         int localRecordLength800Counter = -1;
         public boolean isRecordLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordLength800Counter != sharedCounter;
            localRecordLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRecordCount800Counter = -1;
         public boolean isRecordCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordCount800Counter != sharedCounter;
            localRecordCount800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordCount800MaxLimit(long number) {
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
         int localRemainder800Counter = -1;
         public boolean isRemainder800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRemainder800Counter != sharedCounter;
            localRemainder800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRemainder800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
