package com.cloudframe.app.mcsort02.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
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
     int localSys002StatusCounter = -1;
     public boolean isSys002StatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002StatusCounter != sharedCounter;
         localSys002StatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSys002StatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys004StatusCounter = -1;
     public boolean isSys004StatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004StatusCounter != sharedCounter;
         localSys004StatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSys004StatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys005StatusCounter = -1;
     public boolean isSys005StatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys005StatusCounter != sharedCounter;
         localSys005StatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSys005StatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSortOutStatusCounter = -1;
     public boolean isSortOutStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortOutStatusCounter != sharedCounter;
         localSortOutStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSortOutStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localIpmRdw410Counter = -1;
         public boolean isIpmRdw410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRdw410Counter != sharedCounter;
            localIpmRdw410Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkIpmRdw410MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSortOutRecLenCounter = -1;
         public boolean isSortOutRecLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortOutRecLenCounter != sharedCounter;
            localSortOutRecLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSortOutRecLenMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSortRdwCounter = -1;
         public boolean isSortRdwModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortRdwCounter != sharedCounter;
            localSortRdwCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSortRdwMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localEofFlagCounter = -1;
     public boolean isEofFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofFlagCounter != sharedCounter;
         localEofFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNoRecordsCounter = -1;
     public boolean isNoRecordsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoRecordsCounter != sharedCounter;
         localNoRecordsCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNoRecordsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
