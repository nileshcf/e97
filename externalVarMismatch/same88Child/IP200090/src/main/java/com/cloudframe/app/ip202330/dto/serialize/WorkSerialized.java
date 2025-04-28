package com.cloudframe.app.ip202330.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
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
     int localIsItTheFirstTime100Counter = -1;
     public boolean isIsItTheFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItTheFirstTime100Counter != sharedCounter;
         localIsItTheFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItTheFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEdit0233300Counter = -1;
     public boolean isEdit0233300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEdit0233300Counter != sharedCounter;
         localEdit0233300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEdit0233300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp200110300Counter = -1;
     public boolean isPgmIp200110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp200110300Counter != sharedCounter;
         localPgmIp200110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp200110300Constraints(char[] value) {
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
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
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
     int localNumericSyntax300Counter = -1;
     public boolean isNumericSyntax300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumericSyntax300Counter != sharedCounter;
         localNumericSyntax300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNumericSyntax300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localFormatAbendCode300Counter = -1;
     public boolean isFormatAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFormatAbendCode300Counter != sharedCounter;
         localFormatAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFormatAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localValueOne300Counter = -1;
         public boolean isValueOne300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValueOne300Counter != sharedCounter;
            localValueOne300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValueOne300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localValue9300Counter = -1;
     public boolean isValue9300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue9300Counter != sharedCounter;
         localValue9300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValue9300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPara2200300Counter = -1;
     public boolean isPara2200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2200300Counter != sharedCounter;
         localPara2200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2200300Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
         int localStartIndex800Counter = -1;
         public boolean isStartIndex800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartIndex800Counter != sharedCounter;
            localStartIndex800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkStartIndex800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localElementStart800Counter = -1;
         public boolean isElementStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localElementStart800Counter != sharedCounter;
            localElementStart800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkElementStart800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localCandidateStart800Counter = -1;
         public boolean isCandidateStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCandidateStart800Counter != sharedCounter;
            localCandidateStart800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCandidateStart800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localCandidateLngth800Counter = -1;
         public boolean isCandidateLngth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCandidateLngth800Counter != sharedCounter;
            localCandidateLngth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCandidateLngth800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localCandidateSyntax800Counter = -1;
     public boolean isCandidateSyntax800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCandidateSyntax800Counter != sharedCounter;
         localCandidateSyntax800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCandidateSyntax800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
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
     int localPtrIp200110800Counter = -1;
     public boolean isPtrIp200110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp200110800Counter != sharedCounter;
         localPtrIp200110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp200110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
