package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class RunControlErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RunControlErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RunControlErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RUN_CONTROL_ERR_MSG_TXT_600_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRunControlMsgDtl600;
            protected  int beginRunCtrlFileStatus600;
	
	/**
	* Constructor for RunControlErrMsgTxt600Serialized
	**/
    public RunControlErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RunControlErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RUN_CONTROL_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRunControlMsgDtl600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRunCtrlFileStatus600 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRunControlMsgDtl600Counter = -1;
     public boolean isRunControlMsgDtl600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunControlMsgDtl600Counter != sharedCounter;
         localRunControlMsgDtl600Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_CONTROL_MSG_DTL_600_LEN = 35;
	/**
	 * 	serialize this RunControlMsgDtl600
	 */
   protected void serializeRunControlMsgDtl600(char[] runControlMsgDtl600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runControlMsgDtl600,0,getStringValue(),beginRunControlMsgDtl600,RUN_CONTROL_MSG_DTL_600_LEN);
       localRunControlMsgDtl600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunControlMsgDtl600Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshRunControlMsgDtl600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunControlMsgDtl600() {	 
   		return (substring(getStringValue(),beginRunControlMsgDtl600,beginRunControlMsgDtl600 + RUN_CONTROL_MSG_DTL_600_LEN));
   	}
     int localRunCtrlFileStatus600Counter = -1;
     public boolean isRunCtrlFileStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunCtrlFileStatus600Counter != sharedCounter;
         localRunCtrlFileStatus600Counter = sharedCounter; return hasModified;
     }
	protected static final int RUN_CTRL_FILE_STATUS_600_LEN = 2;
	/**
	 * 	serialize this RunCtrlFileStatus600
	 */
   protected void serializeRunCtrlFileStatus600(char[] runCtrlFileStatus600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(runCtrlFileStatus600,0,getStringValue(),beginRunCtrlFileStatus600,RUN_CTRL_FILE_STATUS_600_LEN);
       localRunCtrlFileStatus600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRunCtrlFileStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRunCtrlFileStatus600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRunCtrlFileStatus600() {	 
   		return (substring(getStringValue(),beginRunCtrlFileStatus600,beginRunCtrlFileStatus600 + RUN_CTRL_FILE_STATUS_600_LEN));
   	}




}
  
