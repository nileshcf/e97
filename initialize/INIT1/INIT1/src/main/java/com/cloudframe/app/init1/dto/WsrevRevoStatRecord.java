package com.cloudframe.app.init1.dto;

/**
*  The class WsrevRevoStatRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class WsrevRevoStatRecord extends WsrevRevoStatRecordSerialized {
   

						private char[] wsrevVisionInstanceCd = Field.fillLowValue(1);

						private char[] wsrevUbOrigInstance = Field.fillLowValue(20);

						private char[] wsrevUbOrigFileName = Field.fillLowValue(40);

						private char[] wsrevBillCycleDt = Field.fillLowValue(10);

						private char[] wsrevSwitchId = Field.fillLowValue(3);

						private char[] wsrevDataType = Field.fillLowValue(4);

						private char[] wsrevReceivedTmstamp = Field.fillLowValue(26);

						private char[] wsrevCreateTmstamp = Field.fillLowValue(26);

						private char[] wsrevFileStatus = Field.fillLowValue(10);

						private char[] wsrevReason = Field.fillLowValue(40);

								private long wsrevInputCount;

								private long wsrevFilteredCount;

								private long wsrevRejectedCount;

								private long wsrevBilledCount;

						private char[] wsrevStreamCd = Field.fillLowValue(1);

								private int wsrevIterNo;

								private int wsrevCycleNo;

								private BigDecimal wsrevDataChgAmt = BigDecimal.ZERO;

								private BigDecimal wsrevRejDataChgAmt = BigDecimal.ZERO;

								private BigDecimal wsrevBilledDataChgAmt = BigDecimal.ZERO;

						private char[] wsrevVersionNum = Field.fillLowValue(4);

	
	/**
	* Constructor for WsrevRevoStatRecord
	**/
    public WsrevRevoStatRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wsrevVisionInstanceCd
	 *	@return wsrevVisionInstanceCd
	 */
   public char[] getWsrevVisionInstanceCd() throws CFException{
     if (isWsrevVisionInstanceCdModified()) { 
        wsrevVisionInstanceCd = refreshWsrevVisionInstanceCd();
     }
   		return wsrevVisionInstanceCd;
   }

  
	/**
	*  set variable wsrevVisionInstanceCd
	*  Corresponding COBOL Variable is WSREV-VISION-INSTANCE-CD
	*  @param value
	**/
   public void setWsrevVisionInstanceCd(char[] value) {
      wsrevVisionInstanceCd = checkWsrevVisionInstanceCdConstraints(value);
      serializeWsrevVisionInstanceCd(wsrevVisionInstanceCd);
   } 

     /**
	 * 	Update WsrevVisionInstanceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevVisionInstanceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevVisionInstanceCd,wsrevVisionInstanceCd.length);
   	
   }
   
   public void setWsrevVisionInstanceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVisionInstanceCd,wsrevVisionInstanceCd.length);
   	
   }
   
     /**
	 * 	Update WsrevVisionInstanceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevVisionInstanceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVisionInstanceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevVisionInstanceCd with another Field
	 *	@param value
	 */
   public void setWsrevVisionInstanceCd(Field source) {
       replace(source,0,source.length(),beginWsrevVisionInstanceCd,WSREV_VISION_INSTANCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevVisionInstanceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevVisionInstanceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevVisionInstanceCd,WSREV_VISION_INSTANCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update WsrevVisionInstanceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevVisionInstanceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVisionInstanceCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevUbOrigInstance
	 *	@return wsrevUbOrigInstance
	 */
   public char[] getWsrevUbOrigInstance() throws CFException{
     if (isWsrevUbOrigInstanceModified()) { 
        wsrevUbOrigInstance = refreshWsrevUbOrigInstance();
     }
   		return wsrevUbOrigInstance;
   }

  
	/**
	*  set variable wsrevUbOrigInstance
	*  Corresponding COBOL Variable is WSREV-UB-ORIG-INSTANCE
	*  @param value
	**/
   public void setWsrevUbOrigInstance(char[] value) {
      wsrevUbOrigInstance = checkWsrevUbOrigInstanceConstraints(value);
      serializeWsrevUbOrigInstance(wsrevUbOrigInstance);
   } 

     /**
	 * 	Update WsrevUbOrigInstance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevUbOrigInstance(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevUbOrigInstance,wsrevUbOrigInstance.length);
   	
   }
   
   public void setWsrevUbOrigInstance(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigInstance,wsrevUbOrigInstance.length);
   	
   }
   
     /**
	 * 	Update WsrevUbOrigInstance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevUbOrigInstance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigInstance+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevUbOrigInstance with another Field
	 *	@param value
	 */
   public void setWsrevUbOrigInstance(Field source) {
       replace(source,0,source.length(),beginWsrevUbOrigInstance,WSREV_UB_ORIG_INSTANCE_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevUbOrigInstance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevUbOrigInstance(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevUbOrigInstance,WSREV_UB_ORIG_INSTANCE_LEN);
   	
   }
   
     /**
	 * 	Update WsrevUbOrigInstance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevUbOrigInstance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigInstance+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevUbOrigFileName
	 *	@return wsrevUbOrigFileName
	 */
   public char[] getWsrevUbOrigFileName() throws CFException{
     if (isWsrevUbOrigFileNameModified()) { 
        wsrevUbOrigFileName = refreshWsrevUbOrigFileName();
     }
   		return wsrevUbOrigFileName;
   }

  
	/**
	*  set variable wsrevUbOrigFileName
	*  Corresponding COBOL Variable is WSREV-UB-ORIG-FILE-NAME
	*  @param value
	**/
   public void setWsrevUbOrigFileName(char[] value) {
      wsrevUbOrigFileName = checkWsrevUbOrigFileNameConstraints(value);
      serializeWsrevUbOrigFileName(wsrevUbOrigFileName);
   } 

     /**
	 * 	Update WsrevUbOrigFileName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevUbOrigFileName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevUbOrigFileName,wsrevUbOrigFileName.length);
   	
   }
   
   public void setWsrevUbOrigFileName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigFileName,wsrevUbOrigFileName.length);
   	
   }
   
     /**
	 * 	Update WsrevUbOrigFileName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevUbOrigFileName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigFileName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevUbOrigFileName with another Field
	 *	@param value
	 */
   public void setWsrevUbOrigFileName(Field source) {
       replace(source,0,source.length(),beginWsrevUbOrigFileName,WSREV_UB_ORIG_FILE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevUbOrigFileName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevUbOrigFileName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevUbOrigFileName,WSREV_UB_ORIG_FILE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update WsrevUbOrigFileName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevUbOrigFileName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevUbOrigFileName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevBillCycleDt
	 *	@return wsrevBillCycleDt
	 */
   public char[] getWsrevBillCycleDt() throws CFException{
     if (isWsrevBillCycleDtModified()) { 
        wsrevBillCycleDt = refreshWsrevBillCycleDt();
     }
   		return wsrevBillCycleDt;
   }

  
	/**
	*  set variable wsrevBillCycleDt
	*  Corresponding COBOL Variable is WSREV-BILL-CYCLE-DT
	*  @param value
	**/
   public void setWsrevBillCycleDt(char[] value) {
      wsrevBillCycleDt = checkWsrevBillCycleDtConstraints(value);
      serializeWsrevBillCycleDt(wsrevBillCycleDt);
   } 

     /**
	 * 	Update WsrevBillCycleDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevBillCycleDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevBillCycleDt,wsrevBillCycleDt.length);
   	
   }
   
   public void setWsrevBillCycleDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevBillCycleDt,wsrevBillCycleDt.length);
   	
   }
   
     /**
	 * 	Update WsrevBillCycleDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevBillCycleDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevBillCycleDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevBillCycleDt with another Field
	 *	@param value
	 */
   public void setWsrevBillCycleDt(Field source) {
       replace(source,0,source.length(),beginWsrevBillCycleDt,WSREV_BILL_CYCLE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevBillCycleDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevBillCycleDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevBillCycleDt,WSREV_BILL_CYCLE_DT_LEN);
   	
   }
   
     /**
	 * 	Update WsrevBillCycleDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevBillCycleDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevBillCycleDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevSwitchId
	 *	@return wsrevSwitchId
	 */
   public char[] getWsrevSwitchId() throws CFException{
     if (isWsrevSwitchIdModified()) { 
        wsrevSwitchId = refreshWsrevSwitchId();
     }
   		return wsrevSwitchId;
   }

  
	/**
	*  set variable wsrevSwitchId
	*  Corresponding COBOL Variable is WSREV-SWITCH-ID
	*  @param value
	**/
   public void setWsrevSwitchId(char[] value) {
      wsrevSwitchId = checkWsrevSwitchIdConstraints(value);
      serializeWsrevSwitchId(wsrevSwitchId);
   } 

     /**
	 * 	Update WsrevSwitchId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevSwitchId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevSwitchId,wsrevSwitchId.length);
   	
   }
   
   public void setWsrevSwitchId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevSwitchId,wsrevSwitchId.length);
   	
   }
   
     /**
	 * 	Update WsrevSwitchId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevSwitchId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevSwitchId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevSwitchId with another Field
	 *	@param value
	 */
   public void setWsrevSwitchId(Field source) {
       replace(source,0,source.length(),beginWsrevSwitchId,WSREV_SWITCH_ID_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevSwitchId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevSwitchId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevSwitchId,WSREV_SWITCH_ID_LEN);
   	
   }
   
     /**
	 * 	Update WsrevSwitchId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevSwitchId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevSwitchId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevDataType
	 *	@return wsrevDataType
	 */
   public char[] getWsrevDataType() throws CFException{
     if (isWsrevDataTypeModified()) { 
        wsrevDataType = refreshWsrevDataType();
     }
   		return wsrevDataType;
   }

  
	/**
	*  set variable wsrevDataType
	*  Corresponding COBOL Variable is WSREV-DATA-TYPE
	*  @param value
	**/
   public void setWsrevDataType(char[] value) {
      wsrevDataType = checkWsrevDataTypeConstraints(value);
      serializeWsrevDataType(wsrevDataType);
   } 

     /**
	 * 	Update WsrevDataType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevDataType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevDataType,wsrevDataType.length);
   	
   }
   
   public void setWsrevDataType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevDataType,wsrevDataType.length);
   	
   }
   
     /**
	 * 	Update WsrevDataType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevDataType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevDataType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevDataType with another Field
	 *	@param value
	 */
   public void setWsrevDataType(Field source) {
       replace(source,0,source.length(),beginWsrevDataType,WSREV_DATA_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevDataType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevDataType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevDataType,WSREV_DATA_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update WsrevDataType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevDataType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevDataType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevReceivedTmstamp
	 *	@return wsrevReceivedTmstamp
	 */
   public char[] getWsrevReceivedTmstamp() throws CFException{
     if (isWsrevReceivedTmstampModified()) { 
        wsrevReceivedTmstamp = refreshWsrevReceivedTmstamp();
     }
   		return wsrevReceivedTmstamp;
   }

  
	/**
	*  set variable wsrevReceivedTmstamp
	*  Corresponding COBOL Variable is WSREV-RECEIVED-TMSTAMP
	*  @param value
	**/
   public void setWsrevReceivedTmstamp(char[] value) {
      wsrevReceivedTmstamp = checkWsrevReceivedTmstampConstraints(value);
      serializeWsrevReceivedTmstamp(wsrevReceivedTmstamp);
   } 

     /**
	 * 	Update WsrevReceivedTmstamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevReceivedTmstamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevReceivedTmstamp,wsrevReceivedTmstamp.length);
   	
   }
   
   public void setWsrevReceivedTmstamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReceivedTmstamp,wsrevReceivedTmstamp.length);
   	
   }
   
     /**
	 * 	Update WsrevReceivedTmstamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevReceivedTmstamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReceivedTmstamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevReceivedTmstamp with another Field
	 *	@param value
	 */
   public void setWsrevReceivedTmstamp(Field source) {
       replace(source,0,source.length(),beginWsrevReceivedTmstamp,WSREV_RECEIVED_TMSTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevReceivedTmstamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevReceivedTmstamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevReceivedTmstamp,WSREV_RECEIVED_TMSTAMP_LEN);
   	
   }
   
     /**
	 * 	Update WsrevReceivedTmstamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevReceivedTmstamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReceivedTmstamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevCreateTmstamp
	 *	@return wsrevCreateTmstamp
	 */
   public char[] getWsrevCreateTmstamp() throws CFException{
     if (isWsrevCreateTmstampModified()) { 
        wsrevCreateTmstamp = refreshWsrevCreateTmstamp();
     }
   		return wsrevCreateTmstamp;
   }

  
	/**
	*  set variable wsrevCreateTmstamp
	*  Corresponding COBOL Variable is WSREV-CREATE-TMSTAMP
	*  @param value
	**/
   public void setWsrevCreateTmstamp(char[] value) {
      wsrevCreateTmstamp = checkWsrevCreateTmstampConstraints(value);
      serializeWsrevCreateTmstamp(wsrevCreateTmstamp);
   } 

     /**
	 * 	Update WsrevCreateTmstamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevCreateTmstamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevCreateTmstamp,wsrevCreateTmstamp.length);
   	
   }
   
   public void setWsrevCreateTmstamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevCreateTmstamp,wsrevCreateTmstamp.length);
   	
   }
   
     /**
	 * 	Update WsrevCreateTmstamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevCreateTmstamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevCreateTmstamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevCreateTmstamp with another Field
	 *	@param value
	 */
   public void setWsrevCreateTmstamp(Field source) {
       replace(source,0,source.length(),beginWsrevCreateTmstamp,WSREV_CREATE_TMSTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevCreateTmstamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevCreateTmstamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevCreateTmstamp,WSREV_CREATE_TMSTAMP_LEN);
   	
   }
   
     /**
	 * 	Update WsrevCreateTmstamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevCreateTmstamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevCreateTmstamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevFileStatus
	 *	@return wsrevFileStatus
	 */
   public char[] getWsrevFileStatus() throws CFException{
     if (isWsrevFileStatusModified()) { 
        wsrevFileStatus = refreshWsrevFileStatus();
     }
   		return wsrevFileStatus;
   }

  
	/**
	*  set variable wsrevFileStatus
	*  Corresponding COBOL Variable is WSREV-FILE-STATUS
	*  @param value
	**/
   public void setWsrevFileStatus(char[] value) {
      wsrevFileStatus = checkWsrevFileStatusConstraints(value);
      serializeWsrevFileStatus(wsrevFileStatus);
   } 

     /**
	 * 	Update WsrevFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevFileStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevFileStatus,wsrevFileStatus.length);
   	
   }
   
   public void setWsrevFileStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevFileStatus,wsrevFileStatus.length);
   	
   }
   
     /**
	 * 	Update WsrevFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevFileStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevFileStatus with another Field
	 *	@param value
	 */
   public void setWsrevFileStatus(Field source) {
       replace(source,0,source.length(),beginWsrevFileStatus,WSREV_FILE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevFileStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevFileStatus,WSREV_FILE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update WsrevFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevFileStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevReason
	 *	@return wsrevReason
	 */
   public char[] getWsrevReason() throws CFException{
     if (isWsrevReasonModified()) { 
        wsrevReason = refreshWsrevReason();
     }
   		return wsrevReason;
   }

  
	/**
	*  set variable wsrevReason
	*  Corresponding COBOL Variable is WSREV-REASON
	*  @param value
	**/
   public void setWsrevReason(char[] value) {
      wsrevReason = checkWsrevReasonConstraints(value);
      serializeWsrevReason(wsrevReason);
   } 

     /**
	 * 	Update WsrevReason 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevReason(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevReason,wsrevReason.length);
   	
   }
   
   public void setWsrevReason(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReason,wsrevReason.length);
   	
   }
   
     /**
	 * 	Update WsrevReason 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevReason(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReason+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevReason with another Field
	 *	@param value
	 */
   public void setWsrevReason(Field source) {
       replace(source,0,source.length(),beginWsrevReason,WSREV_REASON_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevReason 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevReason(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevReason,WSREV_REASON_LEN);
   	
   }
   
     /**
	 * 	Update WsrevReason 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevReason(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevReason+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevInputCount
	 *	@return wsrevInputCount
	 */
	public long getWsrevInputCount() throws CFException {
       if (isWsrevInputCountModified()) { 
           wsrevInputCount = refreshWsrevInputCount();
        }
   		return wsrevInputCount;
	}
	

	
	   
	/**
	 * 	Update WsrevInputCount with the passed value
	 *  Corresponding COBOL Variable is WSREV-INPUT-COUNT
	 *	@param number
	 */
	public void setWsrevInputCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevInputCount = checkWsrevInputCountMaxLimit(number); 
		serializeWsrevInputCount(wsrevInputCount);
	}
	

	/**
	 * 	Update WsrevInputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevInputCount(char[] value) throws CFException {
		 wsrevInputCount = serializeWsrevInputCount(value);
	}
	/**
	 * 	Update WsrevInputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevInputCountString(char[] value) throws CFException {
		 setWsrevInputCount(value);
	}
	/**
	 *	Returns the value of wsrevFilteredCount
	 *	@return wsrevFilteredCount
	 */
	public long getWsrevFilteredCount() throws CFException {
       if (isWsrevFilteredCountModified()) { 
           wsrevFilteredCount = refreshWsrevFilteredCount();
        }
   		return wsrevFilteredCount;
	}
	

	
	   
	/**
	 * 	Update WsrevFilteredCount with the passed value
	 *  Corresponding COBOL Variable is WSREV-FILTERED-COUNT
	 *	@param number
	 */
	public void setWsrevFilteredCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevFilteredCount = checkWsrevFilteredCountMaxLimit(number); 
		serializeWsrevFilteredCount(wsrevFilteredCount);
	}
	

	/**
	 * 	Update WsrevFilteredCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevFilteredCount(char[] value) throws CFException {
		 wsrevFilteredCount = serializeWsrevFilteredCount(value);
	}
	/**
	 * 	Update WsrevFilteredCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevFilteredCountString(char[] value) throws CFException {
		 setWsrevFilteredCount(value);
	}
	/**
	 *	Returns the value of wsrevRejectedCount
	 *	@return wsrevRejectedCount
	 */
	public long getWsrevRejectedCount() throws CFException {
       if (isWsrevRejectedCountModified()) { 
           wsrevRejectedCount = refreshWsrevRejectedCount();
        }
   		return wsrevRejectedCount;
	}
	

	
	   
	/**
	 * 	Update WsrevRejectedCount with the passed value
	 *  Corresponding COBOL Variable is WSREV-REJECTED-COUNT
	 *	@param number
	 */
	public void setWsrevRejectedCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevRejectedCount = checkWsrevRejectedCountMaxLimit(number); 
		serializeWsrevRejectedCount(wsrevRejectedCount);
	}
	

	/**
	 * 	Update WsrevRejectedCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevRejectedCount(char[] value) throws CFException {
		 wsrevRejectedCount = serializeWsrevRejectedCount(value);
	}
	/**
	 * 	Update WsrevRejectedCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevRejectedCountString(char[] value) throws CFException {
		 setWsrevRejectedCount(value);
	}
	/**
	 *	Returns the value of wsrevBilledCount
	 *	@return wsrevBilledCount
	 */
	public long getWsrevBilledCount() throws CFException {
       if (isWsrevBilledCountModified()) { 
           wsrevBilledCount = refreshWsrevBilledCount();
        }
   		return wsrevBilledCount;
	}
	

	
	   
	/**
	 * 	Update WsrevBilledCount with the passed value
	 *  Corresponding COBOL Variable is WSREV-BILLED-COUNT
	 *	@param number
	 */
	public void setWsrevBilledCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevBilledCount = checkWsrevBilledCountMaxLimit(number); 
		serializeWsrevBilledCount(wsrevBilledCount);
	}
	

	/**
	 * 	Update WsrevBilledCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevBilledCount(char[] value) throws CFException {
		 wsrevBilledCount = serializeWsrevBilledCount(value);
	}
	/**
	 * 	Update WsrevBilledCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevBilledCountString(char[] value) throws CFException {
		 setWsrevBilledCount(value);
	}
	/**
	 *	Returns the value of wsrevStreamCd
	 *	@return wsrevStreamCd
	 */
   public char[] getWsrevStreamCd() throws CFException{
     if (isWsrevStreamCdModified()) { 
        wsrevStreamCd = refreshWsrevStreamCd();
     }
   		return wsrevStreamCd;
   }

  
	/**
	*  set variable wsrevStreamCd
	*  Corresponding COBOL Variable is WSREV-STREAM-CD
	*  @param value
	**/
   public void setWsrevStreamCd(char[] value) {
      wsrevStreamCd = checkWsrevStreamCdConstraints(value);
      serializeWsrevStreamCd(wsrevStreamCd);
   } 

     /**
	 * 	Update WsrevStreamCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevStreamCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevStreamCd,wsrevStreamCd.length);
   	
   }
   
   public void setWsrevStreamCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevStreamCd,wsrevStreamCd.length);
   	
   }
   
     /**
	 * 	Update WsrevStreamCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevStreamCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevStreamCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevStreamCd with another Field
	 *	@param value
	 */
   public void setWsrevStreamCd(Field source) {
       replace(source,0,source.length(),beginWsrevStreamCd,WSREV_STREAM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevStreamCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevStreamCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevStreamCd,WSREV_STREAM_CD_LEN);
   	
   }
   
     /**
	 * 	Update WsrevStreamCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevStreamCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevStreamCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsrevIterNo
	 *	@return wsrevIterNo
	 */
	public int getWsrevIterNo() throws CFException {
       if (isWsrevIterNoModified()) { 
           wsrevIterNo = refreshWsrevIterNo();
        }
   		return wsrevIterNo;
	}
	

	
	   
	/**
	 * 	Update WsrevIterNo with the passed value
	 *  Corresponding COBOL Variable is WSREV-ITER-NO
	 *	@param number
	 */
	public void setWsrevIterNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevIterNo = checkWsrevIterNoMaxLimit(number); 
		serializeWsrevIterNo(wsrevIterNo);
	}
	

	public void setWsrevIterNo(long number) {
	    number = checkWsrevIterNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsrevIterNo((int)number);
	}
	
	/**
	 * 	Update WsrevIterNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevIterNo(char[] value) throws CFException {
		 wsrevIterNo = serializeWsrevIterNo(value);
	}
	/**
	 * 	Update WsrevIterNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevIterNoString(char[] value) throws CFException {
		 setWsrevIterNo(value);
	}
	/**
	 *	Returns the value of wsrevCycleNo
	 *	@return wsrevCycleNo
	 */
	public int getWsrevCycleNo() throws CFException {
       if (isWsrevCycleNoModified()) { 
           wsrevCycleNo = refreshWsrevCycleNo();
        }
   		return wsrevCycleNo;
	}
	

	
	   
	/**
	 * 	Update WsrevCycleNo with the passed value
	 *  Corresponding COBOL Variable is WSREV-CYCLE-NO
	 *	@param number
	 */
	public void setWsrevCycleNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsrevCycleNo = checkWsrevCycleNoMaxLimit(number); 
		serializeWsrevCycleNo(wsrevCycleNo);
	}
	

	public void setWsrevCycleNo(long number) {
	    number = checkWsrevCycleNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsrevCycleNo((int)number);
	}
	
	/**
	 * 	Update WsrevCycleNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevCycleNo(char[] value) throws CFException {
		 wsrevCycleNo = serializeWsrevCycleNo(value);
	}
	/**
	 * 	Update WsrevCycleNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsrevCycleNoString(char[] value) throws CFException {
		 setWsrevCycleNo(value);
	}
	/**
	 *	Returns the value of wsrevDataChgAmt
	 *	@return wsrevDataChgAmt
	 */
	public BigDecimal getWsrevDataChgAmt() throws CFException {
       if (isWsrevDataChgAmtModified()) { 
           wsrevDataChgAmt = refreshWsrevDataChgAmt();
        }
   		return wsrevDataChgAmt;
	}
	

	
	   
	/**
	 * 	Update WsrevDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WSREV-DATA-CHG-AMT
	 *	@param number
	 */
	public void setWsrevDataChgAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wsrevDataChgAmt = checkWsrevDataChgAmtMaxLimit(number);
	    serializeWsrevDataChgAmt(wsrevDataChgAmt);
   }
	/**
	 * 	Update WsrevDataChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevDataChgAmt(char[] value) throws CFException {
		 wsrevDataChgAmt = serializeWsrevDataChgAmt(value);
	}   
	/**
	 *	Returns the value of wsrevRejDataChgAmt
	 *	@return wsrevRejDataChgAmt
	 */
	public BigDecimal getWsrevRejDataChgAmt() throws CFException {
       if (isWsrevRejDataChgAmtModified()) { 
           wsrevRejDataChgAmt = refreshWsrevRejDataChgAmt();
        }
   		return wsrevRejDataChgAmt;
	}
	

	
	   
	/**
	 * 	Update WsrevRejDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WSREV-REJ-DATA-CHG-AMT
	 *	@param number
	 */
	public void setWsrevRejDataChgAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wsrevRejDataChgAmt = checkWsrevRejDataChgAmtMaxLimit(number);
	    serializeWsrevRejDataChgAmt(wsrevRejDataChgAmt);
   }
	/**
	 * 	Update WsrevRejDataChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevRejDataChgAmt(char[] value) throws CFException {
		 wsrevRejDataChgAmt = serializeWsrevRejDataChgAmt(value);
	}   
	/**
	 *	Returns the value of wsrevBilledDataChgAmt
	 *	@return wsrevBilledDataChgAmt
	 */
	public BigDecimal getWsrevBilledDataChgAmt() throws CFException {
       if (isWsrevBilledDataChgAmtModified()) { 
           wsrevBilledDataChgAmt = refreshWsrevBilledDataChgAmt();
        }
   		return wsrevBilledDataChgAmt;
	}
	

	
	   
	/**
	 * 	Update WsrevBilledDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WSREV-BILLED-DATA-CHG-AMT
	 *	@param number
	 */
	public void setWsrevBilledDataChgAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wsrevBilledDataChgAmt = checkWsrevBilledDataChgAmtMaxLimit(number);
	    serializeWsrevBilledDataChgAmt(wsrevBilledDataChgAmt);
   }
	/**
	 * 	Update WsrevBilledDataChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsrevBilledDataChgAmt(char[] value) throws CFException {
		 wsrevBilledDataChgAmt = serializeWsrevBilledDataChgAmt(value);
	}   
	/**
	 *	Returns the value of wsrevVersionNum
	 *	@return wsrevVersionNum
	 */
   public char[] getWsrevVersionNum() throws CFException{
     if (isWsrevVersionNumModified()) { 
        wsrevVersionNum = refreshWsrevVersionNum();
     }
   		return wsrevVersionNum;
   }

  
	/**
	*  set variable wsrevVersionNum
	*  Corresponding COBOL Variable is WSREV-VERSION-NUM
	*  @param value
	**/
   public void setWsrevVersionNum(char[] value) {
      wsrevVersionNum = checkWsrevVersionNumConstraints(value);
      serializeWsrevVersionNum(wsrevVersionNum);
   } 

     /**
	 * 	Update WsrevVersionNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsrevVersionNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsrevVersionNum,wsrevVersionNum.length);
   	
   }
   
   public void setWsrevVersionNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVersionNum,wsrevVersionNum.length);
   	
   }
   
     /**
	 * 	Update WsrevVersionNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsrevVersionNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVersionNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsrevVersionNum with another Field
	 *	@param value
	 */
   public void setWsrevVersionNum(Field source) {
       replace(source,0,source.length(),beginWsrevVersionNum,WSREV_VERSION_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update WsrevVersionNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsrevVersionNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsrevVersionNum,WSREV_VERSION_NUM_LEN);
   	
   }
   
     /**
	 * 	Update WsrevVersionNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsrevVersionNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsrevVersionNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WsrevRevoStatRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsrevVisionInstanceCd(CONSTANTS.SPACE);
         setWsrevUbOrigInstance(CONSTANTS.SPACE_20);
         setWsrevUbOrigFileName(CONSTANTS.SPACE_40);
         setWsrevBillCycleDt(CONSTANTS.SPACE_10);
         setWsrevSwitchId(CONSTANTS.SPACE_3);
         setWsrevDataType(CONSTANTS.SPACE_4);
         setWsrevReceivedTmstamp(CONSTANTS.SPACE_26);
         setWsrevCreateTmstamp(CONSTANTS.SPACE_26);
         setWsrevFileStatus(CONSTANTS.SPACE_10);
         setWsrevReason(CONSTANTS.SPACE_40);
                     setWsrevInputCount(0);
                     setWsrevFilteredCount(0);
                     setWsrevRejectedCount(0);
                     setWsrevBilledCount(0);
         setWsrevStreamCd(CONSTANTS.SPACE);
                     setWsrevIterNo(0);
                     setWsrevCycleNo(0);
			setWsrevDataChgAmt(BigDecimal.ZERO);
			setWsrevRejDataChgAmt(BigDecimal.ZERO);
			setWsrevBilledDataChgAmt(BigDecimal.ZERO);
         setWsrevVersionNum(CONSTANTS.SPACE_4);
   }

		public static int getWsrevRevoStatRecordFieldLength() {
			return WSREV_REVO_STAT_RECORD_LENGTH;
		}

}
  
