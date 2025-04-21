package com.cloudframe.app.sf910020.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
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
     int localCharX300Counter = -1;
     public boolean isCharX300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharX300Counter != sharedCounter;
         localCharX300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharX300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localChar1300Counter = -1;
     public boolean isChar1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar1300Counter != sharedCounter;
         localChar1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkChar1300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
     int localByteTable800Counter = -1;
     public boolean isByteTable800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByteTable800Counter != sharedCounter;
         localByteTable800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkByteTable800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
