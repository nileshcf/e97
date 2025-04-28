package com.cloudframe.app.mc158.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:53. using version 5.0.0.256
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
     int localNormalIpmMsgCounter = -1;
     public boolean isNormalIpmMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNormalIpmMsgCounter != sharedCounter;
         localNormalIpmMsgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNormalIpmMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
         int localPosSCounter = -1;
         public boolean isPosSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPosSCounter != sharedCounter;
            localPosSCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPosSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPosLCounter = -1;
         public boolean isPosLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPosLCounter != sharedCounter;
            localPosLCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPosLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localVal1Counter = -1;
     public boolean isVal1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal1Counter != sharedCounter;
         localVal1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
