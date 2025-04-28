package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
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
         int localSLenCounter = -1;
         public boolean isSLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSLenCounter != sharedCounter;
            localSLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTLenCounter = -1;
         public boolean isTLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTLenCounter != sharedCounter;
            localTLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAS2Counter = -1;
     public boolean isAS2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS2Counter != sharedCounter;
         localAS2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS2Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS2Counter = -1;
     public boolean isBS2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS2Counter != sharedCounter;
         localBS2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS2Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS4Counter = -1;
     public boolean isAS4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS4Counter != sharedCounter;
         localAS4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS4Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS4Counter = -1;
     public boolean isBS4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS4Counter != sharedCounter;
         localBS4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS4Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS8Counter = -1;
     public boolean isAS8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS8Counter != sharedCounter;
         localAS8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS8Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS8Counter = -1;
     public boolean isBS8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS8Counter != sharedCounter;
         localBS8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS8Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS12Counter = -1;
     public boolean isAS12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS12Counter != sharedCounter;
         localAS12Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS12Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS12Counter = -1;
     public boolean isBS12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS12Counter != sharedCounter;
         localBS12Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS12Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS18Counter = -1;
     public boolean isAS18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS18Counter != sharedCounter;
         localAS18Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS18Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS18Counter = -1;
     public boolean isBS18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS18Counter != sharedCounter;
         localBS18Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS18Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS20Counter = -1;
     public boolean isAS20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS20Counter != sharedCounter;
         localAS20Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS20Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS20Counter = -1;
     public boolean isBS20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS20Counter != sharedCounter;
         localBS20Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS20Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localWse2aSCounter = -1;
     public boolean isWse2aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2aSCounter != sharedCounter;
         localWse2aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse2aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse2bSCounter = -1;
     public boolean isWse2bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2bSCounter != sharedCounter;
         localWse2bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse2bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse4aSCounter = -1;
     public boolean isWse4aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4aSCounter != sharedCounter;
         localWse4aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse4aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse4bSCounter = -1;
     public boolean isWse4bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4bSCounter != sharedCounter;
         localWse4bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse4bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse8aSCounter = -1;
     public boolean isWse8aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8aSCounter != sharedCounter;
         localWse8aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse8aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse8bSCounter = -1;
     public boolean isWse8bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8bSCounter != sharedCounter;
         localWse8bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse8bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse12aSCounter = -1;
     public boolean isWse12aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse12aSCounter != sharedCounter;
         localWse12aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse12aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse12bSCounter = -1;
     public boolean isWse12bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse12bSCounter != sharedCounter;
         localWse12bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse12bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse18aSCounter = -1;
     public boolean isWse18aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18aSCounter != sharedCounter;
         localWse18aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse18aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse18bSCounter = -1;
     public boolean isWse18bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18bSCounter != sharedCounter;
         localWse18bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse18bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse20aSCounter = -1;
     public boolean isWse20aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20aSCounter != sharedCounter;
         localWse20aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse20aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse20bSCounter = -1;
     public boolean isWse20bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20bSCounter != sharedCounter;
         localWse20bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse20bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }




}
  
