package com.cloudframe.app.mcextend.dto.serialize;

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
     int localMcfile101Counter = -1;
     public boolean isMcfile101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcfile101Counter != sharedCounter;
         localMcfile101Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMcfile101Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localMcfile201Counter = -1;
     public boolean isMcfile201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcfile201Counter != sharedCounter;
         localMcfile201Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMcfile201Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
