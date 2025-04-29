package com.cloudframe.app.ip699930.dto.serialize;

/**
*  The class SystemApplNotFoundMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SystemApplNotFoundMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SystemApplNotFoundMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYSTEM_APPL_NOT_FOUND_MSG_600_LENGTH = 72;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNoSystemApplIdsApplId600;
            protected  int beginNoSystemApplIdsPa600;
	
	/**
	* Constructor for SystemApplNotFoundMsg600Serialized
	**/
    public SystemApplNotFoundMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SystemApplNotFoundMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYSTEM_APPL_NOT_FOUND_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginNoSystemApplIdsApplId600 = getStartOffset() + 22;	// set offset for serialization
  
  
             beginNoSystemApplIdsPa600 = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNoSystemApplIdsApplId600Counter = -1;
     public boolean isNoSystemApplIdsApplId600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoSystemApplIdsApplId600Counter != sharedCounter;
         localNoSystemApplIdsApplId600Counter = sharedCounter; return hasModified;
     }
	protected static final int NO_SYSTEM_APPL_IDS_APPL_ID_600_LEN = 3;
	/**
	 * 	serialize this NoSystemApplIdsApplId600
	 */
   protected void serializeNoSystemApplIdsApplId600(char[] noSystemApplIdsApplId600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(noSystemApplIdsApplId600,0,getStringValue(),beginNoSystemApplIdsApplId600,NO_SYSTEM_APPL_IDS_APPL_ID_600_LEN);
       localNoSystemApplIdsApplId600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNoSystemApplIdsApplId600Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshNoSystemApplIdsApplId600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNoSystemApplIdsApplId600() {	 
   		return (substring(getStringValue(),beginNoSystemApplIdsApplId600,beginNoSystemApplIdsApplId600 + NO_SYSTEM_APPL_IDS_APPL_ID_600_LEN));
   	}
     int localNoSystemApplIdsPa600Counter = -1;
     public boolean isNoSystemApplIdsPa600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoSystemApplIdsPa600Counter != sharedCounter;
         localNoSystemApplIdsPa600Counter = sharedCounter; return hasModified;
     }
	protected static final int NO_SYSTEM_APPL_IDS_PA_600_LEN = 11;
	/**
	 * 	serialize this NoSystemApplIdsPa600
	 */
   protected void serializeNoSystemApplIdsPa600(char[] noSystemApplIdsPa600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(noSystemApplIdsPa600,0,getStringValue(),beginNoSystemApplIdsPa600,NO_SYSTEM_APPL_IDS_PA_600_LEN);
       localNoSystemApplIdsPa600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNoSystemApplIdsPa600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshNoSystemApplIdsPa600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNoSystemApplIdsPa600() {	 
   		return (substring(getStringValue(),beginNoSystemApplIdsPa600,beginNoSystemApplIdsPa600 + NO_SYSTEM_APPL_IDS_PA_600_LEN));
   	}




}
  
