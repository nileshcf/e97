package com.cloudframe.app.ip699930.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
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
     int localStartOfLoopSw100Counter = -1;
     public boolean isStartOfLoopSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartOfLoopSw100Counter != sharedCounter;
         localStartOfLoopSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStartOfLoopSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localProcessAgreementFoundSw100Counter = -1;
     public boolean isProcessAgreementFoundSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcessAgreementFoundSw100Counter != sharedCounter;
         localProcessAgreementFoundSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkProcessAgreementFoundSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSystemApplFoundSw100Counter = -1;
     public boolean isSystemApplFoundSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSystemApplFoundSw100Counter != sharedCounter;
         localSystemApplFoundSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSystemApplFoundSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
         int localValue1300Counter = -1;
         public boolean isValue1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue1300Counter != sharedCounter;
            localValue1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkValue1300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localPgmIp699930300Counter = -1;
     public boolean isPgmIp699930300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp699930300Counter != sharedCounter;
         localPgmIp699930300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp699930300Constraints(char[] value) {
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
     int localMissingProcessAgrmtMsg600Counter = -1;
     public boolean isMissingProcessAgrmtMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMissingProcessAgrmtMsg600Counter != sharedCounter;
         localMissingProcessAgrmtMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMissingProcessAgrmtMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localMissingApplSystemIdMsg600Counter = -1;
     public boolean isMissingApplSystemIdMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMissingApplSystemIdMsg600Counter != sharedCounter;
         localMissingApplSystemIdMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMissingApplSystemIdMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
     int localNoProcessingAgrmntsMsg600Counter = -1;
     public boolean isNoProcessingAgrmntsMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoProcessingAgrmntsMsg600Counter != sharedCounter;
         localNoProcessingAgrmntsMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNoProcessingAgrmntsMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
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
     int localPtrIp996010800Counter = -1;
     public boolean isPtrIp996010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996010800Counter != sharedCounter;
         localPtrIp996010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
