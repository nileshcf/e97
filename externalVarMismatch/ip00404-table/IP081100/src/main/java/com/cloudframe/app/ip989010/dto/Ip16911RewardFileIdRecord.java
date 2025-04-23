package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip16911RewardFileIdRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip16911RewardFileIdRecord extends Ip16911RewardFileIdRecordSerialized {
   

						private char[] ip16911FileCreateDate = Field.fillLowValue(8);

						private char[] ip16911RewardFileId = Field.fillLowValue(25);

						private char[] ip16911FileMsgCnt = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip16911RewardFileIdRecord
	**/
    public Ip16911RewardFileIdRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip16911FileCreateDate
	 *	@return ip16911FileCreateDate
	 */
   public char[] getIp16911FileCreateDate() throws CFException{
     if (isIp16911FileCreateDateModified()) { 
        ip16911FileCreateDate = refreshIp16911FileCreateDate();
     }
   		return ip16911FileCreateDate;
   }

  
	/**
	*  set variable ip16911FileCreateDate
	*  Corresponding COBOL Variable is IP16911-FILE-CREATE-DATE
	*  @param value
	**/
   public void setIp16911FileCreateDate(char[] value) {
      ip16911FileCreateDate = checkIp16911FileCreateDateConstraints(value);
      serializeIp16911FileCreateDate(ip16911FileCreateDate);
   } 

     /**
	 * 	Update Ip16911FileCreateDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16911FileCreateDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16911FileCreateDate,ip16911FileCreateDate.length);
   	
   }
   
   public void setIp16911FileCreateDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileCreateDate,ip16911FileCreateDate.length);
   	
   }
   
     /**
	 * 	Update Ip16911FileCreateDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16911FileCreateDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileCreateDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16911FileCreateDate with another Field
	 *	@param value
	 */
   public void setIp16911FileCreateDate(Field source) {
       replace(source,0,source.length(),beginIp16911FileCreateDate,IP_16911_FILE_CREATE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16911FileCreateDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16911FileCreateDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16911FileCreateDate,IP_16911_FILE_CREATE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip16911FileCreateDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16911FileCreateDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileCreateDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16911RewardFileId
	 *	@return ip16911RewardFileId
	 */
   public char[] getIp16911RewardFileId() throws CFException{
     if (isIp16911RewardFileIdModified()) { 
        ip16911RewardFileId = refreshIp16911RewardFileId();
     }
   		return ip16911RewardFileId;
   }

  
	/**
	*  set variable ip16911RewardFileId
	*  Corresponding COBOL Variable is IP16911-REWARD-FILE-ID
	*  @param value
	**/
   public void setIp16911RewardFileId(char[] value) {
      ip16911RewardFileId = checkIp16911RewardFileIdConstraints(value);
      serializeIp16911RewardFileId(ip16911RewardFileId);
   } 

     /**
	 * 	Update Ip16911RewardFileId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16911RewardFileId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16911RewardFileId,ip16911RewardFileId.length);
   	
   }
   
   public void setIp16911RewardFileId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911RewardFileId,ip16911RewardFileId.length);
   	
   }
   
     /**
	 * 	Update Ip16911RewardFileId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16911RewardFileId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911RewardFileId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16911RewardFileId with another Field
	 *	@param value
	 */
   public void setIp16911RewardFileId(Field source) {
       replace(source,0,source.length(),beginIp16911RewardFileId,IP_16911_REWARD_FILE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16911RewardFileId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16911RewardFileId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16911RewardFileId,IP_16911_REWARD_FILE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip16911RewardFileId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16911RewardFileId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911RewardFileId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16911FileMsgCnt
	 *	@return ip16911FileMsgCnt
	 */
   public char[] getIp16911FileMsgCnt() throws CFException{
     if (isIp16911FileMsgCntModified()) { 
        ip16911FileMsgCnt = refreshIp16911FileMsgCnt();
     }
   		return ip16911FileMsgCnt;
   }

  
	/**
	*  set variable ip16911FileMsgCnt
	*  Corresponding COBOL Variable is IP16911-FILE-MSG-CNT
	*  @param value
	**/
   public void setIp16911FileMsgCnt(char[] value) {
      ip16911FileMsgCnt = checkIp16911FileMsgCntConstraints(value);
      serializeIp16911FileMsgCnt(ip16911FileMsgCnt);
   } 

     /**
	 * 	Update Ip16911FileMsgCnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16911FileMsgCnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16911FileMsgCnt,ip16911FileMsgCnt.length);
   	
   }
   
   public void setIp16911FileMsgCnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileMsgCnt,ip16911FileMsgCnt.length);
   	
   }
   
     /**
	 * 	Update Ip16911FileMsgCnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16911FileMsgCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileMsgCnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16911FileMsgCnt with another Field
	 *	@param value
	 */
   public void setIp16911FileMsgCnt(Field source) {
       replace(source,0,source.length(),beginIp16911FileMsgCnt,IP_16911_FILE_MSG_CNT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16911FileMsgCnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16911FileMsgCnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16911FileMsgCnt,IP_16911_FILE_MSG_CNT_LEN);
   	
   }
   
     /**
	 * 	Update Ip16911FileMsgCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16911FileMsgCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16911FileMsgCnt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp16911RewardFileIdRecordFieldLength() {
			return IP_16911_REWARD_FILE_ID_RECORD_LENGTH;
		}

}
  
