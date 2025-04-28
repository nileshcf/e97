package com.cloudframe.app.callip.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
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
     int localIp66201001Counter = -1;
     public boolean isIp66201001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66201001Counter != sharedCounter;
         localIp66201001Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp66201001Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localIp65001001Counter = -1;
     public boolean isIp65001001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp65001001Counter != sharedCounter;
         localIp65001001Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp65001001Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
