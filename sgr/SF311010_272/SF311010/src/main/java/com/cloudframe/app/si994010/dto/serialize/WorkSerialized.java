package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
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
         int localBinaryZeros300Counter = -1;
         public boolean isBinaryZeros300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryZeros300Counter != sharedCounter;
            localBinaryZeros300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryZeros300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary1300Counter = -1;
         public boolean isBinary1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary1300Counter != sharedCounter;
            localBinary1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary2300Counter = -1;
         public boolean isBinary2300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary2300Counter != sharedCounter;
            localBinary2300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary2300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary4300Counter = -1;
         public boolean isBinary4300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary4300Counter != sharedCounter;
            localBinary4300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary4300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary8300Counter = -1;
         public boolean isBinary8300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary8300Counter != sharedCounter;
            localBinary8300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary8300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary13300Counter = -1;
         public boolean isBinary13300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary13300Counter != sharedCounter;
            localBinary13300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary13300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary64300Counter = -1;
         public boolean isBinary64300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary64300Counter != sharedCounter;
            localBinary64300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary64300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary128300Counter = -1;
         public boolean isBinary128300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary128300Counter != sharedCounter;
            localBinary128300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary128300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDeMax300Counter = -1;
         public boolean isDeMax300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDeMax300Counter != sharedCounter;
            localDeMax300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDeMax300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localMaxMessage300Counter = -1;
         public boolean isMaxMessage300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxMessage300Counter != sharedCounter;
            localMaxMessage300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxMessage300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localCharX300Counter = -1;
     public boolean isCharX300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharX300Counter != sharedCounter;
         localCharX300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharX300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAsterisks300Counter = -1;
     public boolean isAsterisks300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsterisks300Counter != sharedCounter;
         localAsterisks300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAsterisks300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localErrMsg1600Counter = -1;
     public boolean isErrMsg1600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg1600Counter != sharedCounter;
         localErrMsg1600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg1600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg2600Counter = -1;
     public boolean isErrMsg2600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg2600Counter != sharedCounter;
         localErrMsg2600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg2600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg3600Counter = -1;
     public boolean isErrMsg3600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg3600Counter != sharedCounter;
         localErrMsg3600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg3600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg4600Counter = -1;
     public boolean isErrMsg4600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg4600Counter != sharedCounter;
         localErrMsg4600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg4600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg5600Counter = -1;
     public boolean isErrMsg5600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg5600Counter != sharedCounter;
         localErrMsg5600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg5600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg6600Counter = -1;
     public boolean isErrMsg6600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg6600Counter != sharedCounter;
         localErrMsg6600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg6600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg7600Counter = -1;
     public boolean isErrMsg7600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg7600Counter != sharedCounter;
         localErrMsg7600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg7600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrMsg8600Counter = -1;
     public boolean isErrMsg8600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg8600Counter != sharedCounter;
         localErrMsg8600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg8600Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
         int localSub800Counter = -1;
         public boolean isSub800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub800Counter != sharedCounter;
            localSub800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSub800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
