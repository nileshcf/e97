package com.cloudframe.app.mcrecur.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
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
         int localIdxCounter = -1;
         public boolean isIdxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdxCounter != sharedCounter;
            localIdxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIdxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localPtrIp666030800Counter = -1;
     public boolean isPtrIp666030800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp666030800Counter != sharedCounter;
         localPtrIp666030800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp666030800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localQuicksort300Counter = -1;
     public boolean isQuicksort300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQuicksort300Counter != sharedCounter;
         localQuicksort300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkQuicksort300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
