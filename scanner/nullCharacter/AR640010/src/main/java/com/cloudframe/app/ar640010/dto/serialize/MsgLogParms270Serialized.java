package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MsgLogParms270Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgLogParms270Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgLogParms270Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_LOG_PARMS_270_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOpConsMsgLogInd270;
            protected  int beginJobSysoutMsgLogInd270;
	
	/**
	* Constructor for MsgLogParms270Serialized
	**/
    public MsgLogParms270Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgLogParms270Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_LOG_PARMS_270_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOpConsMsgLogInd270 = getStartOffset() + 0;	// set offset for serialization
  
             beginJobSysoutMsgLogInd270 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOpConsMsgLogInd270Counter = -1;
     public boolean isOpConsMsgLogInd270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpConsMsgLogInd270Counter != sharedCounter;
         localOpConsMsgLogInd270Counter = sharedCounter; return hasModified;
     }
	protected static final int OP_CONS_MSG_LOG_IND_270_LEN = 1;
	/**
	 * 	serialize this OpConsMsgLogInd270
	 */
   protected void serializeOpConsMsgLogInd270(char[] opConsMsgLogInd270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opConsMsgLogInd270,0,getStringValue(),beginOpConsMsgLogInd270,OP_CONS_MSG_LOG_IND_270_LEN);
       localOpConsMsgLogInd270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpConsMsgLogInd270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOpConsMsgLogInd270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpConsMsgLogInd270() {	 
   		return (substring(getStringValue(),beginOpConsMsgLogInd270,beginOpConsMsgLogInd270 + OP_CONS_MSG_LOG_IND_270_LEN));
   	}
     int localJobSysoutMsgLogInd270Counter = -1;
     public boolean isJobSysoutMsgLogInd270Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobSysoutMsgLogInd270Counter != sharedCounter;
         localJobSysoutMsgLogInd270Counter = sharedCounter; return hasModified;
     }
	protected static final int JOB_SYSOUT_MSG_LOG_IND_270_LEN = 1;
	/**
	 * 	serialize this JobSysoutMsgLogInd270
	 */
   protected void serializeJobSysoutMsgLogInd270(char[] jobSysoutMsgLogInd270) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(jobSysoutMsgLogInd270,0,getStringValue(),beginJobSysoutMsgLogInd270,JOB_SYSOUT_MSG_LOG_IND_270_LEN);
       localJobSysoutMsgLogInd270Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkJobSysoutMsgLogInd270Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshJobSysoutMsgLogInd270 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshJobSysoutMsgLogInd270() {	 
   		return (substring(getStringValue(),beginJobSysoutMsgLogInd270,beginJobSysoutMsgLogInd270 + JOB_SYSOUT_MSG_LOG_IND_270_LEN));
   	}




}
  
