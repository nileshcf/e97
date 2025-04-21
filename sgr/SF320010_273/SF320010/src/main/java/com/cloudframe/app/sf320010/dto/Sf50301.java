package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf50301 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf50301 extends Sf50301Serialized {
   
				private Sf503SortFields sf503SortFields = new Sf503SortFields();

						private char[] sf503LogRecord = Field.fillLowValue(32737);
				private Sf503SeStatAndErrorLog sf503SeStatAndErrorLog = new Sf503SeStatAndErrorLog();
				private Sf503BdBulkDataTranLog sf503BdBulkDataTranLog = new Sf503BdBulkDataTranLog();
				private Sf503Bd32BulkDataTranLog sf503Bd32BulkDataTranLog = new Sf503Bd32BulkDataTranLog();
				private Sf503ImImageLogRecord sf503ImImageLogRecord = new Sf503ImImageLogRecord();
				private Sf503OpOperatorTranLog sf503OpOperatorTranLog = new Sf503OpOperatorTranLog();
				private Sf503BanknetReconTranLog sf503BanknetReconTranLog = new Sf503BanknetReconTranLog();
				private Sf503MpMipProfileLog sf503MpMipProfileLog = new Sf503MpMipProfileLog();
				private Sf503PsPosTranLog sf503PsPosTranLog = new Sf503PsPosTranLog();
				private Sf503TypeIiTranLog sf503TypeIiTranLog = new Sf503TypeIiTranLog();
				private Sf503RemoteConsoleLog sf503RemoteConsoleLog = new Sf503RemoteConsoleLog();
				private Sf503X92ActivityLog sf503X92ActivityLog = new Sf503X92ActivityLog();
				private Sf503EdcLogArea sf503EdcLogArea = new Sf503EdcLogArea();
				private Sf503ChkLogArea sf503ChkLogArea = new Sf503ChkLogArea();
				private Sf503AvsLogArea sf503AvsLogArea = new Sf503AvsLogArea();
				private Sf503IsoRecord sf503IsoRecord = new Sf503IsoRecord();
				private Sf503IsoJRecord sf503IsoJRecord = new Sf503IsoJRecord();
	
	/**
	* Constructor for Sf50301
	**/
    public Sf50301() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sf503SortFields.setParent(this,getStartOffset() + 0);
	       			sf503SeStatAndErrorLog.setParent(this,getStartOffset() + 15);
	       			sf503BdBulkDataTranLog.setParent(this,getStartOffset() + 15);
	       			sf503Bd32BulkDataTranLog.setParent(this,getStartOffset() + 15);
	       			sf503ImImageLogRecord.setParent(this,getStartOffset() + 15);
	       			sf503OpOperatorTranLog.setParent(this,getStartOffset() + 15);
	       			sf503BanknetReconTranLog.setParent(this,getStartOffset() + 15);
	       			sf503MpMipProfileLog.setParent(this,getStartOffset() + 15);
	       			sf503PsPosTranLog.setParent(this,getStartOffset() + 15);
	       			sf503TypeIiTranLog.setParent(this,getStartOffset() + 15);
	       			sf503RemoteConsoleLog.setParent(this,getStartOffset() + 15);
	       			sf503X92ActivityLog.setParent(this,getStartOffset() + 15);
	       			sf503EdcLogArea.setParent(this,getStartOffset() + 15);
	       			sf503ChkLogArea.setParent(this,getStartOffset() + 15);
	       			sf503AvsLogArea.setParent(this,getStartOffset() + 15);
	       			sf503IsoRecord.setParent(this,getStartOffset() + 15);
	       			sf503IsoJRecord.setParent(this,getStartOffset() + 15);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sf503SortFields
	 *	@return sf503SortFields
	 */   
	 public Sf503SortFields getSf503SortFields() {
   	return sf503SortFields;
   }
   /**
	* 	Update Sf503SortFields with the passed value
	*   Corresponding COBOL Variable is SF503-SORT-FIELDS
	*	@param value
	*/
   public void setSf503SortFields(char[] value) {
      sf503SortFields.setString(value); 
   }   
    
     /**
	 * 	Update Sf503SortFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503SortFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503SortFields.begin,sf503SortFields.length());
   }
   
     /**
	 * 	Update Sf503SortFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503SortFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503SortFields with another Field
	 *	@param value
	 */
   public void setSf503SortFields(Field source) {
   	replace(source,0,source.length(),sf503SortFields.begin,sf503SortFields.length());
   }  
   
     /**
	 * 	Update Sf503SortFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503SortFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503SortFields.begin,sf503SortFields.length());
   }
   
     /**
	 * 	Update Sf503SortFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503SortFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503LogRecord
	 *	@return sf503LogRecord
	 */
   public char[] getSf503LogRecord() throws CFException{
     if (isSf503LogRecordModified()) { 
        sf503LogRecord = refreshSf503LogRecord();
     }
   		return sf503LogRecord;
   }

  
	/**
	*  set variable sf503LogRecord
	*  Corresponding COBOL Variable is SF503-LOG-RECORD
	*  @param value
	**/
   public void setSf503LogRecord(char[] value) {
      sf503LogRecord = checkSf503LogRecordConstraints(value);
      serializeSf503LogRecord(sf503LogRecord);
   } 

     /**
	 * 	Update Sf503LogRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503LogRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503LogRecord,sf503LogRecord.length);
   	
   }
   
   public void setSf503LogRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503LogRecord,sf503LogRecord.length);
   	
   }
   
     /**
	 * 	Update Sf503LogRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503LogRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503LogRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503LogRecord with another Field
	 *	@param value
	 */
   public void setSf503LogRecord(Field source) {
       replace(source,0,source.length(),beginSf503LogRecord,SF_503_LOG_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503LogRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503LogRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503LogRecord,SF_503_LOG_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update Sf503LogRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503LogRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503LogRecord+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503SeStatAndErrorLog
	 *	@return sf503SeStatAndErrorLog
	 */   
	 public Sf503SeStatAndErrorLog getSf503SeStatAndErrorLog() {
   	return sf503SeStatAndErrorLog;
   }
   /**
	* 	Update Sf503SeStatAndErrorLog with the passed value
	*   Corresponding COBOL Variable is SF503-SE-STAT-AND-ERROR-LOG
	*	@param value
	*/
   public void setSf503SeStatAndErrorLog(char[] value) {
      sf503SeStatAndErrorLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503SeStatAndErrorLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503SeStatAndErrorLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503SeStatAndErrorLog.begin,sf503SeStatAndErrorLog.length());
   }
   
     /**
	 * 	Update Sf503SeStatAndErrorLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503SeStatAndErrorLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503SeStatAndErrorLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503SeStatAndErrorLog with another Field
	 *	@param value
	 */
   public void setSf503SeStatAndErrorLog(Field source) {
   	replace(source,0,source.length(),sf503SeStatAndErrorLog.begin,sf503SeStatAndErrorLog.length());
   }  
   
     /**
	 * 	Update Sf503SeStatAndErrorLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503SeStatAndErrorLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503SeStatAndErrorLog.begin,sf503SeStatAndErrorLog.length());
   }
   
     /**
	 * 	Update Sf503SeStatAndErrorLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503SeStatAndErrorLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503SeStatAndErrorLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503BdBulkDataTranLog
	 *	@return sf503BdBulkDataTranLog
	 */   
	 public Sf503BdBulkDataTranLog getSf503BdBulkDataTranLog() {
   	return sf503BdBulkDataTranLog;
   }
   /**
	* 	Update Sf503BdBulkDataTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-BD-BULK-DATA-TRAN-LOG
	*	@param value
	*/
   public void setSf503BdBulkDataTranLog(char[] value) {
      sf503BdBulkDataTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503BdBulkDataTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503BdBulkDataTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503BdBulkDataTranLog.begin,sf503BdBulkDataTranLog.length());
   }
   
     /**
	 * 	Update Sf503BdBulkDataTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdBulkDataTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503BdBulkDataTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503BdBulkDataTranLog with another Field
	 *	@param value
	 */
   public void setSf503BdBulkDataTranLog(Field source) {
   	replace(source,0,source.length(),sf503BdBulkDataTranLog.begin,sf503BdBulkDataTranLog.length());
   }  
   
     /**
	 * 	Update Sf503BdBulkDataTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503BdBulkDataTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503BdBulkDataTranLog.begin,sf503BdBulkDataTranLog.length());
   }
   
     /**
	 * 	Update Sf503BdBulkDataTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BdBulkDataTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503BdBulkDataTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503Bd32BulkDataTranLog
	 *	@return sf503Bd32BulkDataTranLog
	 */   
	 public Sf503Bd32BulkDataTranLog getSf503Bd32BulkDataTranLog() {
   	return sf503Bd32BulkDataTranLog;
   }
   /**
	* 	Update Sf503Bd32BulkDataTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-BD32-BULK-DATA-TRAN-LOG
	*	@param value
	*/
   public void setSf503Bd32BulkDataTranLog(char[] value) {
      sf503Bd32BulkDataTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503Bd32BulkDataTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503Bd32BulkDataTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkDataTranLog.begin,sf503Bd32BulkDataTranLog.length());
   }
   
     /**
	 * 	Update Sf503Bd32BulkDataTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32BulkDataTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkDataTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503Bd32BulkDataTranLog with another Field
	 *	@param value
	 */
   public void setSf503Bd32BulkDataTranLog(Field source) {
   	replace(source,0,source.length(),sf503Bd32BulkDataTranLog.begin,sf503Bd32BulkDataTranLog.length());
   }  
   
     /**
	 * 	Update Sf503Bd32BulkDataTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503Bd32BulkDataTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkDataTranLog.begin,sf503Bd32BulkDataTranLog.length());
   }
   
     /**
	 * 	Update Sf503Bd32BulkDataTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32BulkDataTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkDataTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503ImImageLogRecord
	 *	@return sf503ImImageLogRecord
	 */   
	 public Sf503ImImageLogRecord getSf503ImImageLogRecord() {
   	return sf503ImImageLogRecord;
   }
   /**
	* 	Update Sf503ImImageLogRecord with the passed value
	*   Corresponding COBOL Variable is SF503-IM-IMAGE-LOG-RECORD
	*	@param value
	*/
   public void setSf503ImImageLogRecord(char[] value) {
      sf503ImImageLogRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf503ImImageLogRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503ImImageLogRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503ImImageLogRecord.begin,sf503ImImageLogRecord.length());
   }
   
     /**
	 * 	Update Sf503ImImageLogRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503ImImageLogRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503ImImageLogRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503ImImageLogRecord with another Field
	 *	@param value
	 */
   public void setSf503ImImageLogRecord(Field source) {
   	replace(source,0,source.length(),sf503ImImageLogRecord.begin,sf503ImImageLogRecord.length());
   }  
   
     /**
	 * 	Update Sf503ImImageLogRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503ImImageLogRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503ImImageLogRecord.begin,sf503ImImageLogRecord.length());
   }
   
     /**
	 * 	Update Sf503ImImageLogRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503ImImageLogRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503ImImageLogRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503OpOperatorTranLog
	 *	@return sf503OpOperatorTranLog
	 */   
	 public Sf503OpOperatorTranLog getSf503OpOperatorTranLog() {
   	return sf503OpOperatorTranLog;
   }
   /**
	* 	Update Sf503OpOperatorTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-OP-OPERATOR-TRAN-LOG
	*	@param value
	*/
   public void setSf503OpOperatorTranLog(char[] value) {
      sf503OpOperatorTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503OpOperatorTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503OpOperatorTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503OpOperatorTranLog.begin,sf503OpOperatorTranLog.length());
   }
   
     /**
	 * 	Update Sf503OpOperatorTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpOperatorTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503OpOperatorTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503OpOperatorTranLog with another Field
	 *	@param value
	 */
   public void setSf503OpOperatorTranLog(Field source) {
   	replace(source,0,source.length(),sf503OpOperatorTranLog.begin,sf503OpOperatorTranLog.length());
   }  
   
     /**
	 * 	Update Sf503OpOperatorTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503OpOperatorTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503OpOperatorTranLog.begin,sf503OpOperatorTranLog.length());
   }
   
     /**
	 * 	Update Sf503OpOperatorTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503OpOperatorTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503OpOperatorTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503BanknetReconTranLog
	 *	@return sf503BanknetReconTranLog
	 */   
	 public Sf503BanknetReconTranLog getSf503BanknetReconTranLog() {
   	return sf503BanknetReconTranLog;
   }
   /**
	* 	Update Sf503BanknetReconTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-BANKNET-RECON-TRAN-LOG
	*	@param value
	*/
   public void setSf503BanknetReconTranLog(char[] value) {
      sf503BanknetReconTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503BanknetReconTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503BanknetReconTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503BanknetReconTranLog.begin,sf503BanknetReconTranLog.length());
   }
   
     /**
	 * 	Update Sf503BanknetReconTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503BanknetReconTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503BanknetReconTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503BanknetReconTranLog with another Field
	 *	@param value
	 */
   public void setSf503BanknetReconTranLog(Field source) {
   	replace(source,0,source.length(),sf503BanknetReconTranLog.begin,sf503BanknetReconTranLog.length());
   }  
   
     /**
	 * 	Update Sf503BanknetReconTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503BanknetReconTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503BanknetReconTranLog.begin,sf503BanknetReconTranLog.length());
   }
   
     /**
	 * 	Update Sf503BanknetReconTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503BanknetReconTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503BanknetReconTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503MpMipProfileLog
	 *	@return sf503MpMipProfileLog
	 */   
	 public Sf503MpMipProfileLog getSf503MpMipProfileLog() {
   	return sf503MpMipProfileLog;
   }
   /**
	* 	Update Sf503MpMipProfileLog with the passed value
	*   Corresponding COBOL Variable is SF503-MP-MIP-PROFILE-LOG
	*	@param value
	*/
   public void setSf503MpMipProfileLog(char[] value) {
      sf503MpMipProfileLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503MpMipProfileLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMipProfileLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipProfileLog.begin,sf503MpMipProfileLog.length());
   }
   
     /**
	 * 	Update Sf503MpMipProfileLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMipProfileLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipProfileLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503MpMipProfileLog with another Field
	 *	@param value
	 */
   public void setSf503MpMipProfileLog(Field source) {
   	replace(source,0,source.length(),sf503MpMipProfileLog.begin,sf503MpMipProfileLog.length());
   }  
   
     /**
	 * 	Update Sf503MpMipProfileLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMipProfileLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipProfileLog.begin,sf503MpMipProfileLog.length());
   }
   
     /**
	 * 	Update Sf503MpMipProfileLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMipProfileLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipProfileLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503PsPosTranLog
	 *	@return sf503PsPosTranLog
	 */   
	 public Sf503PsPosTranLog getSf503PsPosTranLog() {
   	return sf503PsPosTranLog;
   }
   /**
	* 	Update Sf503PsPosTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-PS-POS-TRAN-LOG
	*	@param value
	*/
   public void setSf503PsPosTranLog(char[] value) {
      sf503PsPosTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503PsPosTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503PsPosTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsPosTranLog.begin,sf503PsPosTranLog.length());
   }
   
     /**
	 * 	Update Sf503PsPosTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsPosTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsPosTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503PsPosTranLog with another Field
	 *	@param value
	 */
   public void setSf503PsPosTranLog(Field source) {
   	replace(source,0,source.length(),sf503PsPosTranLog.begin,sf503PsPosTranLog.length());
   }  
   
     /**
	 * 	Update Sf503PsPosTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503PsPosTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsPosTranLog.begin,sf503PsPosTranLog.length());
   }
   
     /**
	 * 	Update Sf503PsPosTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsPosTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsPosTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503TypeIiTranLog
	 *	@return sf503TypeIiTranLog
	 */   
	 public Sf503TypeIiTranLog getSf503TypeIiTranLog() {
   	return sf503TypeIiTranLog;
   }
   /**
	* 	Update Sf503TypeIiTranLog with the passed value
	*   Corresponding COBOL Variable is SF503-TYPE-II-TRAN-LOG
	*	@param value
	*/
   public void setSf503TypeIiTranLog(char[] value) {
      sf503TypeIiTranLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503TypeIiTranLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503TypeIiTranLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503TypeIiTranLog.begin,sf503TypeIiTranLog.length());
   }
   
     /**
	 * 	Update Sf503TypeIiTranLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503TypeIiTranLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503TypeIiTranLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503TypeIiTranLog with another Field
	 *	@param value
	 */
   public void setSf503TypeIiTranLog(Field source) {
   	replace(source,0,source.length(),sf503TypeIiTranLog.begin,sf503TypeIiTranLog.length());
   }  
   
     /**
	 * 	Update Sf503TypeIiTranLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503TypeIiTranLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503TypeIiTranLog.begin,sf503TypeIiTranLog.length());
   }
   
     /**
	 * 	Update Sf503TypeIiTranLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503TypeIiTranLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503TypeIiTranLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503RemoteConsoleLog
	 *	@return sf503RemoteConsoleLog
	 */   
	 public Sf503RemoteConsoleLog getSf503RemoteConsoleLog() {
   	return sf503RemoteConsoleLog;
   }
   /**
	* 	Update Sf503RemoteConsoleLog with the passed value
	*   Corresponding COBOL Variable is SF503-REMOTE-CONSOLE-LOG
	*	@param value
	*/
   public void setSf503RemoteConsoleLog(char[] value) {
      sf503RemoteConsoleLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503RemoteConsoleLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503RemoteConsoleLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RemoteConsoleLog.begin,sf503RemoteConsoleLog.length());
   }
   
     /**
	 * 	Update Sf503RemoteConsoleLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RemoteConsoleLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RemoteConsoleLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503RemoteConsoleLog with another Field
	 *	@param value
	 */
   public void setSf503RemoteConsoleLog(Field source) {
   	replace(source,0,source.length(),sf503RemoteConsoleLog.begin,sf503RemoteConsoleLog.length());
   }  
   
     /**
	 * 	Update Sf503RemoteConsoleLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503RemoteConsoleLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RemoteConsoleLog.begin,sf503RemoteConsoleLog.length());
   }
   
     /**
	 * 	Update Sf503RemoteConsoleLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RemoteConsoleLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RemoteConsoleLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503X92ActivityLog
	 *	@return sf503X92ActivityLog
	 */   
	 public Sf503X92ActivityLog getSf503X92ActivityLog() {
   	return sf503X92ActivityLog;
   }
   /**
	* 	Update Sf503X92ActivityLog with the passed value
	*   Corresponding COBOL Variable is SF503-X92-ACTIVITY-LOG
	*	@param value
	*/
   public void setSf503X92ActivityLog(char[] value) {
      sf503X92ActivityLog.setString(value); 
   }   
    
     /**
	 * 	Update Sf503X92ActivityLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503X92ActivityLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503X92ActivityLog.begin,sf503X92ActivityLog.length());
   }
   
     /**
	 * 	Update Sf503X92ActivityLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503X92ActivityLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503X92ActivityLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503X92ActivityLog with another Field
	 *	@param value
	 */
   public void setSf503X92ActivityLog(Field source) {
   	replace(source,0,source.length(),sf503X92ActivityLog.begin,sf503X92ActivityLog.length());
   }  
   
     /**
	 * 	Update Sf503X92ActivityLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503X92ActivityLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503X92ActivityLog.begin,sf503X92ActivityLog.length());
   }
   
     /**
	 * 	Update Sf503X92ActivityLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503X92ActivityLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503X92ActivityLog.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503EdcLogArea
	 *	@return sf503EdcLogArea
	 */   
	 public Sf503EdcLogArea getSf503EdcLogArea() {
   	return sf503EdcLogArea;
   }
   /**
	* 	Update Sf503EdcLogArea with the passed value
	*   Corresponding COBOL Variable is SF503-EDC-LOG-AREA
	*	@param value
	*/
   public void setSf503EdcLogArea(char[] value) {
      sf503EdcLogArea.setString(value); 
   }   
    
     /**
	 * 	Update Sf503EdcLogArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503EdcLogArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503EdcLogArea.begin,sf503EdcLogArea.length());
   }
   
     /**
	 * 	Update Sf503EdcLogArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503EdcLogArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503EdcLogArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503EdcLogArea with another Field
	 *	@param value
	 */
   public void setSf503EdcLogArea(Field source) {
   	replace(source,0,source.length(),sf503EdcLogArea.begin,sf503EdcLogArea.length());
   }  
   
     /**
	 * 	Update Sf503EdcLogArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503EdcLogArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503EdcLogArea.begin,sf503EdcLogArea.length());
   }
   
     /**
	 * 	Update Sf503EdcLogArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503EdcLogArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503EdcLogArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503ChkLogArea
	 *	@return sf503ChkLogArea
	 */   
	 public Sf503ChkLogArea getSf503ChkLogArea() {
   	return sf503ChkLogArea;
   }
   /**
	* 	Update Sf503ChkLogArea with the passed value
	*   Corresponding COBOL Variable is SF503-CHK-LOG-AREA
	*	@param value
	*/
   public void setSf503ChkLogArea(char[] value) {
      sf503ChkLogArea.setString(value); 
   }   
    
     /**
	 * 	Update Sf503ChkLogArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503ChkLogArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503ChkLogArea.begin,sf503ChkLogArea.length());
   }
   
     /**
	 * 	Update Sf503ChkLogArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503ChkLogArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503ChkLogArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503ChkLogArea with another Field
	 *	@param value
	 */
   public void setSf503ChkLogArea(Field source) {
   	replace(source,0,source.length(),sf503ChkLogArea.begin,sf503ChkLogArea.length());
   }  
   
     /**
	 * 	Update Sf503ChkLogArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503ChkLogArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503ChkLogArea.begin,sf503ChkLogArea.length());
   }
   
     /**
	 * 	Update Sf503ChkLogArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503ChkLogArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503ChkLogArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503AvsLogArea
	 *	@return sf503AvsLogArea
	 */   
	 public Sf503AvsLogArea getSf503AvsLogArea() {
   	return sf503AvsLogArea;
   }
   /**
	* 	Update Sf503AvsLogArea with the passed value
	*   Corresponding COBOL Variable is SF503-AVS-LOG-AREA
	*	@param value
	*/
   public void setSf503AvsLogArea(char[] value) {
      sf503AvsLogArea.setString(value); 
   }   
    
     /**
	 * 	Update Sf503AvsLogArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503AvsLogArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503AvsLogArea.begin,sf503AvsLogArea.length());
   }
   
     /**
	 * 	Update Sf503AvsLogArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503AvsLogArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503AvsLogArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503AvsLogArea with another Field
	 *	@param value
	 */
   public void setSf503AvsLogArea(Field source) {
   	replace(source,0,source.length(),sf503AvsLogArea.begin,sf503AvsLogArea.length());
   }  
   
     /**
	 * 	Update Sf503AvsLogArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503AvsLogArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503AvsLogArea.begin,sf503AvsLogArea.length());
   }
   
     /**
	 * 	Update Sf503AvsLogArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503AvsLogArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503AvsLogArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503IsoRecord
	 *	@return sf503IsoRecord
	 */   
	 public Sf503IsoRecord getSf503IsoRecord() {
   	return sf503IsoRecord;
   }
   /**
	* 	Update Sf503IsoRecord with the passed value
	*   Corresponding COBOL Variable is SF503-ISO-RECORD
	*	@param value
	*/
   public void setSf503IsoRecord(char[] value) {
      sf503IsoRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf503IsoRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoRecord.begin,sf503IsoRecord.length());
   }
   
     /**
	 * 	Update Sf503IsoRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503IsoRecord with another Field
	 *	@param value
	 */
   public void setSf503IsoRecord(Field source) {
   	replace(source,0,source.length(),sf503IsoRecord.begin,sf503IsoRecord.length());
   }  
   
     /**
	 * 	Update Sf503IsoRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoRecord.begin,sf503IsoRecord.length());
   }
   
     /**
	 * 	Update Sf503IsoRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503IsoJRecord
	 *	@return sf503IsoJRecord
	 */   
	 public Sf503IsoJRecord getSf503IsoJRecord() {
   	return sf503IsoJRecord;
   }
   /**
	* 	Update Sf503IsoJRecord with the passed value
	*   Corresponding COBOL Variable is SF503-ISO-J-RECORD
	*	@param value
	*/
   public void setSf503IsoJRecord(char[] value) {
      sf503IsoJRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf503IsoJRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoJRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJRecord.begin,sf503IsoJRecord.length());
   }
   
     /**
	 * 	Update Sf503IsoJRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503IsoJRecord with another Field
	 *	@param value
	 */
   public void setSf503IsoJRecord(Field source) {
   	replace(source,0,source.length(),sf503IsoJRecord.begin,sf503IsoJRecord.length());
   }  
   
     /**
	 * 	Update Sf503IsoJRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoJRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJRecord.begin,sf503IsoJRecord.length());
   }
   
     /**
	 * 	Update Sf503IsoJRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf50301FieldLength() {
			return SF_50301_LENGTH;
		}

}
  
