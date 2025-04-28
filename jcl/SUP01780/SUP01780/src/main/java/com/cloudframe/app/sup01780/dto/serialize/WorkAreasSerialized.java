package com.cloudframe.app.sup01780.dto.serialize;

/**
*  The class WorkAreasSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkAreasSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkAreasSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_AREAS_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanStatus1;
            protected  int beginPanStatus10;
	
	/**
	* Constructor for WorkAreasSerialized
	**/
    public WorkAreasSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkAreasSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_AREAS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanStatus1 = getStartOffset() + 0;	// set offset for serialization
  
             beginPanStatus10 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanStatus1Counter = -1;
     public boolean isPanStatus1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanStatus1Counter != sharedCounter;
         localPanStatus1Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_STATUS_1_LEN = 2;
	/**
	 * 	serialize this PanStatus1
	 */
   protected void serializePanStatus1(char[] panStatus1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panStatus1,0,getStringValue(),beginPanStatus1,PAN_STATUS_1_LEN);
       localPanStatus1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanStatus1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPanStatus1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanStatus1() {	 
   		return (substring(getStringValue(),beginPanStatus1,beginPanStatus1 + PAN_STATUS_1_LEN));
   	}
     int localPanStatus10Counter = -1;
     public boolean isPanStatus10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanStatus10Counter != sharedCounter;
         localPanStatus10Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_STATUS_10_LEN = 2;
	/**
	 * 	serialize this PanStatus10
	 */
   protected void serializePanStatus10(char[] panStatus10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panStatus10,0,getStringValue(),beginPanStatus10,PAN_STATUS_10_LEN);
       localPanStatus10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanStatus10Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPanStatus10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanStatus10() {	 
   		return (substring(getStringValue(),beginPanStatus10,beginPanStatus10 + PAN_STATUS_10_LEN));
   	}




}
  
