package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
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
     int localCallprm101Counter = -1;
     public boolean isCallprm101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallprm101Counter != sharedCounter;
         localCallprm101Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCallprm101Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCallprm201Counter = -1;
     public boolean isCallprm201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallprm201Counter != sharedCounter;
         localCallprm201Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCallprm201Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCallprm401Counter = -1;
     public boolean isCallprm401Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallprm401Counter != sharedCounter;
         localCallprm401Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCallprm401Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
