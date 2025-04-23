package com.cloudframe.app.mcsearch.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
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
     int localIp22462001Counter = -1;
     public boolean isIp22462001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp22462001Counter != sharedCounter;
         localIp22462001Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp22462001Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localIp22462101Counter = -1;
     public boolean isIp22462101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp22462101Counter != sharedCounter;
         localIp22462101Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp22462101Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
