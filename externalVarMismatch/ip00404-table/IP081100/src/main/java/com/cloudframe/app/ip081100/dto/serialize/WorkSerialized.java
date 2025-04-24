package com.cloudframe.app.ip081100.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
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
     int localPgmIp081050300Counter = -1;
     public boolean isPgmIp081050300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081050300Counter != sharedCounter;
         localPgmIp081050300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081050300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp081100300Counter = -1;
     public boolean isPgmIp081100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081100300Counter != sharedCounter;
         localPgmIp081100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081100300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp280010300Counter = -1;
     public boolean isPgmIp280010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280010300Counter != sharedCounter;
         localPgmIp280010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp280010300Constraints(char[] value) {
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
     int localPtrIp081050800Counter = -1;
     public boolean isPtrIp081050800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081050800Counter != sharedCounter;
         localPtrIp081050800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081050800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280010800Counter = -1;
     public boolean isPtrIp280010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280010800Counter != sharedCounter;
         localPtrIp280010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
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




}
  
