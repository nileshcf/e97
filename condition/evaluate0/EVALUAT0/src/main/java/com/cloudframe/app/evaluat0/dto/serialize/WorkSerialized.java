package com.cloudframe.app.evaluat0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
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
         int localNum1Counter = -1;
         public boolean isNum1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNum1Counter != sharedCounter;
            localNum1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkNum1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localNum2Counter = -1;
         public boolean isNum2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNum2Counter != sharedCounter;
            localNum2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkNum2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localAgeCounter = -1;
         public boolean isAgeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAgeCounter != sharedCounter;
            localAgeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAgeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localIncomeCounter = -1;
         public boolean isIncomeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIncomeCounter != sharedCounter;
            localIncomeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIncomeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localGenderCounter = -1;
     public boolean isGenderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGenderCounter != sharedCounter;
         localGenderCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGenderConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCrossReferenceCdCounter = -1;
     public boolean isCrossReferenceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrossReferenceCdCounter != sharedCounter;
         localCrossReferenceCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCrossReferenceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
     int localRgstrCdCounter = -1;
     public boolean isRgstrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRgstrCdCounter != sharedCounter;
         localRgstrCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRgstrCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localMsdExchangeCodeCounter = -1;
     public boolean isMsdExchangeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdExchangeCodeCounter != sharedCounter;
         localMsdExchangeCodeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMsdExchangeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localExchangeCdCounter = -1;
     public boolean isExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExchangeCdCounter != sharedCounter;
         localExchangeCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }




}
  
