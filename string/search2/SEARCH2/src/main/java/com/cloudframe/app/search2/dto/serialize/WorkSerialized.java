package com.cloudframe.app.search2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
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
         int localInitialCounter = -1;
         public boolean isInitialModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInitialCounter != sharedCounter;
            localInitialCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInitialMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIncrementCounter = -1;
         public boolean isIncrementModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIncrementCounter != sharedCounter;
            localIncrementCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIncrementMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSubCounter = -1;
         public boolean isSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubCounter != sharedCounter;
            localSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSub2Counter = -1;
         public boolean isSub2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub2Counter != sharedCounter;
            localSub2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSub2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSub3Counter = -1;
         public boolean isSub3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub3Counter != sharedCounter;
            localSub3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSub3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localToggle123Counter = -1;
         public boolean isToggle123Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localToggle123Counter != sharedCounter;
            localToggle123Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkToggle123MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localToggleMaxCounter = -1;
         public boolean isToggleMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localToggleMaxCounter != sharedCounter;
            localToggleMaxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkToggleMaxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localCounterCounter = -1;
         public boolean isCounterModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCounterCounter != sharedCounter;
            localCounterCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCounterMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSearchItemCounter = -1;
         public boolean isSearchItemModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSearchItemCounter != sharedCounter;
            localSearchItemCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSearchItemMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSbidCountCounter = -1;
         public boolean isSbidCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSbidCountCounter != sharedCounter;
            localSbidCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSbidCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
