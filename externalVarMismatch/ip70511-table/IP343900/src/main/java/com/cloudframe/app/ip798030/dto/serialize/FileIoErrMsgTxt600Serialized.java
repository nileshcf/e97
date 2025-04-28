package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class FileIoErrMsgTxt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileIoErrMsgTxt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileIoErrMsgTxt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_IO_ERR_MSG_TXT_600_LENGTH = 59;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginFileIoErrMsgTxt600ConditionGroup1;
            protected  int beginFileName600;
            protected  int beginFileStatus600;
	
	/**
	* Constructor for FileIoErrMsgTxt600Serialized
	**/
    public FileIoErrMsgTxt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileIoErrMsgTxt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_IO_ERR_MSG_TXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
                beginFileIoErrMsgTxt600ConditionGroup1 = getStartOffset() + 0;	// filler with 88
  
             beginFileName600 = getStartOffset() + 14;	// set offset for serialization
  
  
             beginFileStatus600 = getStartOffset() + 57;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileIoErrMsgTxt600ConditionGroup1Counter = -1;
     public boolean isFileIoErrMsgTxt600ConditionGroup1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileIoErrMsgTxt600ConditionGroup1Counter != sharedCounter;
         localFileIoErrMsgTxt600ConditionGroup1Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_IO_ERR_MSG_TXT_600_CONDITION_GROUP_1_LEN = 14;
	/**
	 * 	serialize this FileIoErrMsgTxt600ConditionGroup1
	 */
   protected void serializeFileIoErrMsgTxt600ConditionGroup1(char[] fileIoErrMsgTxt600ConditionGroup1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileIoErrMsgTxt600ConditionGroup1,0,getStringValue(),beginFileIoErrMsgTxt600ConditionGroup1,FILE_IO_ERR_MSG_TXT_600_CONDITION_GROUP_1_LEN);
       localFileIoErrMsgTxt600ConditionGroup1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileIoErrMsgTxt600ConditionGroup1Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshFileIoErrMsgTxt600ConditionGroup1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileIoErrMsgTxt600ConditionGroup1() {	 
   		return (substring(getStringValue(),beginFileIoErrMsgTxt600ConditionGroup1,beginFileIoErrMsgTxt600ConditionGroup1 + FILE_IO_ERR_MSG_TXT_600_CONDITION_GROUP_1_LEN));
   	}
     int localFileName600Counter = -1;
     public boolean isFileName600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileName600Counter != sharedCounter;
         localFileName600Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_NAME_600_LEN = 30;
	/**
	 * 	serialize this FileName600
	 */
   protected void serializeFileName600(char[] fileName600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileName600,0,getStringValue(),beginFileName600,FILE_NAME_600_LEN);
       localFileName600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileName600Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshFileName600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileName600() {	 
   		return (substring(getStringValue(),beginFileName600,beginFileName600 + FILE_NAME_600_LEN));
   	}
     int localFileStatus600Counter = -1;
     public boolean isFileStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStatus600Counter != sharedCounter;
         localFileStatus600Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STATUS_600_LEN = 2;
	/**
	 * 	serialize this FileStatus600
	 */
   protected void serializeFileStatus600(char[] fileStatus600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStatus600,0,getStringValue(),beginFileStatus600,FILE_STATUS_600_LEN);
       localFileStatus600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStatus600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStatus600() {	 
   		return (substring(getStringValue(),beginFileStatus600,beginFileStatus600 + FILE_STATUS_600_LEN));
   	}




}
  
