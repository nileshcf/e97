package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip16911RewardFileIdRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip16911RewardFileIdRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip16911RewardFileIdRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_16911_REWARD_FILE_ID_RECORD_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp16911FileCreateDate;
            protected  int beginIp16911RewardFileId;
            protected  int beginIp16911FileMsgCnt;
	
	/**
	* Constructor for Ip16911RewardFileIdRecordSerialized
	**/
    public Ip16911RewardFileIdRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip16911RewardFileIdRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_16911_REWARD_FILE_ID_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp16911FileCreateDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp16911RewardFileId = getStartOffset() + 8;	// set offset for serialization
  
             beginIp16911FileMsgCnt = getStartOffset() + 33;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp16911FileCreateDateCounter = -1;
     public boolean isIp16911FileCreateDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16911FileCreateDateCounter != sharedCounter;
         localIp16911FileCreateDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16911_FILE_CREATE_DATE_LEN = 8;
	/**
	 * 	serialize this Ip16911FileCreateDate
	 */
   protected void serializeIp16911FileCreateDate(char[] ip16911FileCreateDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16911FileCreateDate,0,getStringValue(),beginIp16911FileCreateDate,IP_16911_FILE_CREATE_DATE_LEN);
       localIp16911FileCreateDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16911FileCreateDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp16911FileCreateDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16911FileCreateDate() {	 
   		return (substring(getStringValue(),beginIp16911FileCreateDate,beginIp16911FileCreateDate + IP_16911_FILE_CREATE_DATE_LEN));
   	}
     int localIp16911RewardFileIdCounter = -1;
     public boolean isIp16911RewardFileIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16911RewardFileIdCounter != sharedCounter;
         localIp16911RewardFileIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16911_REWARD_FILE_ID_LEN = 25;
	/**
	 * 	serialize this Ip16911RewardFileId
	 */
   protected void serializeIp16911RewardFileId(char[] ip16911RewardFileId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16911RewardFileId,0,getStringValue(),beginIp16911RewardFileId,IP_16911_REWARD_FILE_ID_LEN);
       localIp16911RewardFileIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16911RewardFileIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp16911RewardFileId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16911RewardFileId() {	 
   		return (substring(getStringValue(),beginIp16911RewardFileId,beginIp16911RewardFileId + IP_16911_REWARD_FILE_ID_LEN));
   	}
     int localIp16911FileMsgCntCounter = -1;
     public boolean isIp16911FileMsgCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16911FileMsgCntCounter != sharedCounter;
         localIp16911FileMsgCntCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16911_FILE_MSG_CNT_LEN = 8;
	/**
	 * 	serialize this Ip16911FileMsgCnt
	 */
   protected void serializeIp16911FileMsgCnt(char[] ip16911FileMsgCnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16911FileMsgCnt,0,getStringValue(),beginIp16911FileMsgCnt,IP_16911_FILE_MSG_CNT_LEN);
       localIp16911FileMsgCntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16911FileMsgCntConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp16911FileMsgCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16911FileMsgCnt() {	 
   		return (substring(getStringValue(),beginIp16911FileMsgCnt,beginIp16911FileMsgCnt + IP_16911_FILE_MSG_CNT_LEN));
   	}




}
  
