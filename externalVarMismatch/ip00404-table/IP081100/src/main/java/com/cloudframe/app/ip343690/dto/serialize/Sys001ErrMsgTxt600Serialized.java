package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class Sys001ErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001ErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001ErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_ERR_MSG_TXT_600_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPmmWorkFileMsgDetail600;
            protected  int beginSys001Status600;
	
	/**
	* Constructor for Sys001ErrMsgTxt600Serialized
	**/
    public Sys001ErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001ErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPmmWorkFileMsgDetail600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSys001Status600 = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPmmWorkFileMsgDetail600Counter = -1;
     public boolean isPmmWorkFileMsgDetail600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPmmWorkFileMsgDetail600Counter != sharedCounter;
         localPmmWorkFileMsgDetail600Counter = sharedCounter; return hasModified;
     }
	protected static final int PMM_WORK_FILE_MSG_DETAIL_600_LEN = 28;
	/**
	 * 	serialize this PmmWorkFileMsgDetail600
	 */
   protected void serializePmmWorkFileMsgDetail600(char[] pmmWorkFileMsgDetail600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pmmWorkFileMsgDetail600,0,getStringValue(),beginPmmWorkFileMsgDetail600,PMM_WORK_FILE_MSG_DETAIL_600_LEN);
       localPmmWorkFileMsgDetail600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPmmWorkFileMsgDetail600Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshPmmWorkFileMsgDetail600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPmmWorkFileMsgDetail600() {	 
   		return (substring(getStringValue(),beginPmmWorkFileMsgDetail600,beginPmmWorkFileMsgDetail600 + PMM_WORK_FILE_MSG_DETAIL_600_LEN));
   	}
     int localSys001Status600Counter = -1;
     public boolean isSys001Status600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001Status600Counter != sharedCounter;
         localSys001Status600Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_STATUS_600_LEN = 2;
	/**
	 * 	serialize this Sys001Status600
	 */
   protected void serializeSys001Status600(char[] sys001Status600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Status600,0,getStringValue(),beginSys001Status600,SYS_001_STATUS_600_LEN);
       localSys001Status600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001Status600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys001Status600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Status600() {	 
   		return (substring(getStringValue(),beginSys001Status600,beginSys001Status600 + SYS_001_STATUS_600_LEN));
   	}




}
  
