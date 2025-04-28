package com.cloudframe.app.ip224621.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
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
     int localIsCombinationFound100Counter = -1;
     public boolean isIsCombinationFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsCombinationFound100Counter != sharedCounter;
         localIsCombinationFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsCombinationFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsOccurrenceValid100Counter = -1;
     public boolean isIsOccurrenceValid100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsOccurrenceValid100Counter != sharedCounter;
         localIsOccurrenceValid100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsOccurrenceValid100Constraints(char[] value) {
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
         int localValueFifty300Counter = -1;
         public boolean isValueFifty300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValueFifty300Counter != sharedCounter;
            localValueFifty300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkValueFifty300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localPara2111300Counter = -1;
     public boolean isPara2111300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2111300Counter != sharedCounter;
         localPara2111300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2111300Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localTableOverflowError600Counter = -1;
     public boolean isTableOverflowError600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableOverflowError600Counter != sharedCounter;
         localTableOverflowError600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableOverflowError600Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }




}
  
