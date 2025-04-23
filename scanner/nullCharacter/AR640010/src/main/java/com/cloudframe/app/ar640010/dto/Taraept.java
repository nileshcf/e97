package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraept is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Taraept extends TaraeptSerialized {
   

						private char[] taraeptEndptId = Field.fillLowValue(7);

						private char[] taraeptXferMthdCd = Field.fillLowValue(1);

						private char[] taraeptBusPrtnrId = Field.fillLowValue(6);

						private char[] taraeptXferLocNam = Field.fillLowValue(20);
				private TaraeptXferUserId taraeptXferUserId = new TaraeptXferUserId();
				private TaraeptXferPswdId taraeptXferPswdId = new TaraeptXferPswdId();

						private char[] taraeptUserSrvrId = Field.fillLowValue(20);

						private char[] taraeptHostTypeCd = Field.fillLowValue(1);

						private char[] taraeptUserNam = Field.fillLowValue(30);

						private char[] taraeptUserPhnNum = Field.fillLowValue(10);

						private char[] taraeptUserFaxNum = Field.fillLowValue(10);

						private char[] taraeptUserEmailAddr = Field.fillLowValue(70);

						private char[] taraeptBkupEndptId = Field.fillLowValue(7);

						private char[] taraeptBkupActvSw = Field.fillLowValue(1);

						private char[] taraeptEffFromTs = Field.fillLowValue(26);

						private char[] taraeptEffToTs = Field.fillLowValue(26);

						private char[] taraeptLstUpdtUserId = Field.fillLowValue(9);

						private char[] taraeptLstUpdtTs = Field.fillLowValue(26);

						private char[] taraeptGftSrvrNam = Field.fillLowValue(10);

						private char[] taraeptCsMipId = Field.fillLowValue(3);

						private char[] taraeptRmMipId = Field.fillLowValue(3);

						private char[] taraeptBusPrtnrNam = Field.fillLowValue(70);

						private char[] taraeptTapeMediaCd = Field.fillLowValue(1);

								private short taraeptTapeTrckNum;

						private char[] taraeptTapeLblFrmtCd = Field.fillLowValue(1);

								private short taraeptTapeAddrIndxNum;

						private char[] taraeptXferModeCd = Field.fillLowValue(4);

						private char[] taraeptAltUserSrvrId = Field.fillLowValue(20);
				private TaraeptAltXferUserId taraeptAltXferUserId = new TaraeptAltXferUserId();
				private TaraeptAltXferPswdId taraeptAltXferPswdId = new TaraeptAltXferPswdId();

						private char[] taraeptRteToHubSw = Field.fillLowValue(1);

						private char[] taraeptEndptTypCd = Field.fillLowValue(2);

						private char[] taraeptHubId = Field.fillLowValue(8);
	
	/**
	* Constructor for Taraept
	**/
    public Taraept() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			taraeptXferUserId.setParent(this,getStartOffset() + 34);
	       			taraeptXferPswdId.setParent(this,getStartOffset() + 100);
	       			taraeptAltXferUserId.setParent(this,getStartOffset() + 518);
	       			taraeptAltXferPswdId.setParent(this,getStartOffset() + 584);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraeptEndptId
	 *	@return taraeptEndptId
	 */
   public char[] getTaraeptEndptId() throws CFException{
     if (isTaraeptEndptIdModified()) { 
        taraeptEndptId = refreshTaraeptEndptId();
     }
   		return taraeptEndptId;
   }

  
	/**
	*  set variable taraeptEndptId
	*  Corresponding COBOL Variable is TARAEPT-ENDPT-ID
	*  @param value
	**/
   public void setTaraeptEndptId(char[] value) {
      taraeptEndptId = checkTaraeptEndptIdConstraints(value);
      serializeTaraeptEndptId(taraeptEndptId);
   } 

     /**
	 * 	Update TaraeptEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptEndptId,taraeptEndptId.length);
   	
   }
   
   public void setTaraeptEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptId,taraeptEndptId.length);
   	
   }
   
     /**
	 * 	Update TaraeptEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptEndptId with another Field
	 *	@param value
	 */
   public void setTaraeptEndptId(Field source) {
       replace(source,0,source.length(),beginTaraeptEndptId,TARAEPT_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptEndptId,TARAEPT_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptXferMthdCd
	 *	@return taraeptXferMthdCd
	 */
   public char[] getTaraeptXferMthdCd() throws CFException{
     if (isTaraeptXferMthdCdModified()) { 
        taraeptXferMthdCd = refreshTaraeptXferMthdCd();
     }
   		return taraeptXferMthdCd;
   }

  
	/**
	*  set variable taraeptXferMthdCd
	*  Corresponding COBOL Variable is TARAEPT-XFER-MTHD-CD
	*  @param value
	**/
   public void setTaraeptXferMthdCd(char[] value) {
      taraeptXferMthdCd = checkTaraeptXferMthdCdConstraints(value);
      serializeTaraeptXferMthdCd(taraeptXferMthdCd);
   } 

     /**
	 * 	Update TaraeptXferMthdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferMthdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptXferMthdCd,taraeptXferMthdCd.length);
   	
   }
   
   public void setTaraeptXferMthdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferMthdCd,taraeptXferMthdCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptXferMthdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferMthdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferMthdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptXferMthdCd with another Field
	 *	@param value
	 */
   public void setTaraeptXferMthdCd(Field source) {
       replace(source,0,source.length(),beginTaraeptXferMthdCd,TARAEPT_XFER_MTHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptXferMthdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptXferMthdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptXferMthdCd,TARAEPT_XFER_MTHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptXferMthdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferMthdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferMthdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptBusPrtnrId
	 *	@return taraeptBusPrtnrId
	 */
   public char[] getTaraeptBusPrtnrId() throws CFException{
     if (isTaraeptBusPrtnrIdModified()) { 
        taraeptBusPrtnrId = refreshTaraeptBusPrtnrId();
     }
   		return taraeptBusPrtnrId;
   }

  
	/**
	*  set variable taraeptBusPrtnrId
	*  Corresponding COBOL Variable is TARAEPT-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTaraeptBusPrtnrId(char[] value) {
      taraeptBusPrtnrId = checkTaraeptBusPrtnrIdConstraints(value);
      serializeTaraeptBusPrtnrId(taraeptBusPrtnrId);
   } 

     /**
	 * 	Update TaraeptBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptBusPrtnrId,taraeptBusPrtnrId.length);
   	
   }
   
   public void setTaraeptBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrId,taraeptBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TaraeptBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTaraeptBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTaraeptBusPrtnrId,TARAEPT_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrId,TARAEPT_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptXferLocNam
	 *	@return taraeptXferLocNam
	 */
   public char[] getTaraeptXferLocNam() throws CFException{
     if (isTaraeptXferLocNamModified()) { 
        taraeptXferLocNam = refreshTaraeptXferLocNam();
     }
   		return taraeptXferLocNam;
   }

  
	/**
	*  set variable taraeptXferLocNam
	*  Corresponding COBOL Variable is TARAEPT-XFER-LOC-NAM
	*  @param value
	**/
   public void setTaraeptXferLocNam(char[] value) {
      taraeptXferLocNam = checkTaraeptXferLocNamConstraints(value);
      serializeTaraeptXferLocNam(taraeptXferLocNam);
   } 

     /**
	 * 	Update TaraeptXferLocNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferLocNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptXferLocNam,taraeptXferLocNam.length);
   	
   }
   
   public void setTaraeptXferLocNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferLocNam,taraeptXferLocNam.length);
   	
   }
   
     /**
	 * 	Update TaraeptXferLocNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferLocNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferLocNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptXferLocNam with another Field
	 *	@param value
	 */
   public void setTaraeptXferLocNam(Field source) {
       replace(source,0,source.length(),beginTaraeptXferLocNam,TARAEPT_XFER_LOC_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptXferLocNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptXferLocNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptXferLocNam,TARAEPT_XFER_LOC_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptXferLocNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferLocNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferLocNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptXferUserId
	 *	@return taraeptXferUserId
	 */   
	 public TaraeptXferUserId getTaraeptXferUserId() {
   	return taraeptXferUserId;
   }
   /**
	* 	Update TaraeptXferUserId with the passed value
	*   Corresponding COBOL Variable is TARAEPT-XFER-USER-ID
	*	@param value
	*/
   public void setTaraeptXferUserId(char[] value) {
      taraeptXferUserId.setString(value); 
   }   
    
     /**
	 * 	Update TaraeptXferUserId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferUserId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferUserId.begin,taraeptXferUserId.length());
   }
   
     /**
	 * 	Update TaraeptXferUserId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferUserId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraeptXferUserId with another Field
	 *	@param value
	 */
   public void setTaraeptXferUserId(Field source) {
   	replace(source,0,source.length(),taraeptXferUserId.begin,taraeptXferUserId.length());
   }  
   
     /**
	 * 	Update TaraeptXferUserId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferUserId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferUserId.begin,taraeptXferUserId.length());
   }
   
     /**
	 * 	Update TaraeptXferUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferUserId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of taraeptXferPswdId
	 *	@return taraeptXferPswdId
	 */   
	 public TaraeptXferPswdId getTaraeptXferPswdId() {
   	return taraeptXferPswdId;
   }
   /**
	* 	Update TaraeptXferPswdId with the passed value
	*   Corresponding COBOL Variable is TARAEPT-XFER-PSWD-ID
	*	@param value
	*/
   public void setTaraeptXferPswdId(char[] value) {
      taraeptXferPswdId.setString(value); 
   }   
    
     /**
	 * 	Update TaraeptXferPswdId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferPswdId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferPswdId.begin,taraeptXferPswdId.length());
   }
   
     /**
	 * 	Update TaraeptXferPswdId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferPswdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferPswdId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraeptXferPswdId with another Field
	 *	@param value
	 */
   public void setTaraeptXferPswdId(Field source) {
   	replace(source,0,source.length(),taraeptXferPswdId.begin,taraeptXferPswdId.length());
   }  
   
     /**
	 * 	Update TaraeptXferPswdId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferPswdId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferPswdId.begin,taraeptXferPswdId.length());
   }
   
     /**
	 * 	Update TaraeptXferPswdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferPswdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptXferPswdId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of taraeptUserSrvrId
	 *	@return taraeptUserSrvrId
	 */
   public char[] getTaraeptUserSrvrId() throws CFException{
     if (isTaraeptUserSrvrIdModified()) { 
        taraeptUserSrvrId = refreshTaraeptUserSrvrId();
     }
   		return taraeptUserSrvrId;
   }

  
	/**
	*  set variable taraeptUserSrvrId
	*  Corresponding COBOL Variable is TARAEPT-USER-SRVR-ID
	*  @param value
	**/
   public void setTaraeptUserSrvrId(char[] value) {
      taraeptUserSrvrId = checkTaraeptUserSrvrIdConstraints(value);
      serializeTaraeptUserSrvrId(taraeptUserSrvrId);
   } 

     /**
	 * 	Update TaraeptUserSrvrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptUserSrvrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptUserSrvrId,taraeptUserSrvrId.length);
   	
   }
   
   public void setTaraeptUserSrvrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserSrvrId,taraeptUserSrvrId.length);
   	
   }
   
     /**
	 * 	Update TaraeptUserSrvrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserSrvrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserSrvrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptUserSrvrId with another Field
	 *	@param value
	 */
   public void setTaraeptUserSrvrId(Field source) {
       replace(source,0,source.length(),beginTaraeptUserSrvrId,TARAEPT_USER_SRVR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptUserSrvrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptUserSrvrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptUserSrvrId,TARAEPT_USER_SRVR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptUserSrvrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserSrvrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserSrvrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptHostTypeCd
	 *	@return taraeptHostTypeCd
	 */
   public char[] getTaraeptHostTypeCd() throws CFException{
     if (isTaraeptHostTypeCdModified()) { 
        taraeptHostTypeCd = refreshTaraeptHostTypeCd();
     }
   		return taraeptHostTypeCd;
   }

  
	/**
	*  set variable taraeptHostTypeCd
	*  Corresponding COBOL Variable is TARAEPT-HOST-TYPE-CD
	*  @param value
	**/
   public void setTaraeptHostTypeCd(char[] value) {
      taraeptHostTypeCd = checkTaraeptHostTypeCdConstraints(value);
      serializeTaraeptHostTypeCd(taraeptHostTypeCd);
   } 

     /**
	 * 	Update TaraeptHostTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptHostTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptHostTypeCd,taraeptHostTypeCd.length);
   	
   }
   
   public void setTaraeptHostTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHostTypeCd,taraeptHostTypeCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptHostTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptHostTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHostTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptHostTypeCd with another Field
	 *	@param value
	 */
   public void setTaraeptHostTypeCd(Field source) {
       replace(source,0,source.length(),beginTaraeptHostTypeCd,TARAEPT_HOST_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptHostTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptHostTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptHostTypeCd,TARAEPT_HOST_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptHostTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptHostTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHostTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptUserNam
	 *	@return taraeptUserNam
	 */
   public char[] getTaraeptUserNam() throws CFException{
     if (isTaraeptUserNamModified()) { 
        taraeptUserNam = refreshTaraeptUserNam();
     }
   		return taraeptUserNam;
   }

  
	/**
	*  set variable taraeptUserNam
	*  Corresponding COBOL Variable is TARAEPT-USER-NAM
	*  @param value
	**/
   public void setTaraeptUserNam(char[] value) {
      taraeptUserNam = checkTaraeptUserNamConstraints(value);
      serializeTaraeptUserNam(taraeptUserNam);
   } 

     /**
	 * 	Update TaraeptUserNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptUserNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptUserNam,taraeptUserNam.length);
   	
   }
   
   public void setTaraeptUserNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserNam,taraeptUserNam.length);
   	
   }
   
     /**
	 * 	Update TaraeptUserNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptUserNam with another Field
	 *	@param value
	 */
   public void setTaraeptUserNam(Field source) {
       replace(source,0,source.length(),beginTaraeptUserNam,TARAEPT_USER_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptUserNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptUserNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptUserNam,TARAEPT_USER_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptUserNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptUserPhnNum
	 *	@return taraeptUserPhnNum
	 */
   public char[] getTaraeptUserPhnNum() throws CFException{
     if (isTaraeptUserPhnNumModified()) { 
        taraeptUserPhnNum = refreshTaraeptUserPhnNum();
     }
   		return taraeptUserPhnNum;
   }

  
	/**
	*  set variable taraeptUserPhnNum
	*  Corresponding COBOL Variable is TARAEPT-USER-PHN-NUM
	*  @param value
	**/
   public void setTaraeptUserPhnNum(char[] value) {
      taraeptUserPhnNum = checkTaraeptUserPhnNumConstraints(value);
      serializeTaraeptUserPhnNum(taraeptUserPhnNum);
   } 

     /**
	 * 	Update TaraeptUserPhnNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptUserPhnNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptUserPhnNum,taraeptUserPhnNum.length);
   	
   }
   
   public void setTaraeptUserPhnNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserPhnNum,taraeptUserPhnNum.length);
   	
   }
   
     /**
	 * 	Update TaraeptUserPhnNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserPhnNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserPhnNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptUserPhnNum with another Field
	 *	@param value
	 */
   public void setTaraeptUserPhnNum(Field source) {
       replace(source,0,source.length(),beginTaraeptUserPhnNum,TARAEPT_USER_PHN_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptUserPhnNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptUserPhnNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptUserPhnNum,TARAEPT_USER_PHN_NUM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptUserPhnNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserPhnNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserPhnNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptUserFaxNum
	 *	@return taraeptUserFaxNum
	 */
   public char[] getTaraeptUserFaxNum() throws CFException{
     if (isTaraeptUserFaxNumModified()) { 
        taraeptUserFaxNum = refreshTaraeptUserFaxNum();
     }
   		return taraeptUserFaxNum;
   }

  
	/**
	*  set variable taraeptUserFaxNum
	*  Corresponding COBOL Variable is TARAEPT-USER-FAX-NUM
	*  @param value
	**/
   public void setTaraeptUserFaxNum(char[] value) {
      taraeptUserFaxNum = checkTaraeptUserFaxNumConstraints(value);
      serializeTaraeptUserFaxNum(taraeptUserFaxNum);
   } 

     /**
	 * 	Update TaraeptUserFaxNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptUserFaxNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptUserFaxNum,taraeptUserFaxNum.length);
   	
   }
   
   public void setTaraeptUserFaxNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserFaxNum,taraeptUserFaxNum.length);
   	
   }
   
     /**
	 * 	Update TaraeptUserFaxNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserFaxNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserFaxNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptUserFaxNum with another Field
	 *	@param value
	 */
   public void setTaraeptUserFaxNum(Field source) {
       replace(source,0,source.length(),beginTaraeptUserFaxNum,TARAEPT_USER_FAX_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptUserFaxNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptUserFaxNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptUserFaxNum,TARAEPT_USER_FAX_NUM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptUserFaxNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserFaxNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserFaxNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptUserEmailAddr
	 *	@return taraeptUserEmailAddr
	 */
   public char[] getTaraeptUserEmailAddr() throws CFException{
     if (isTaraeptUserEmailAddrModified()) { 
        taraeptUserEmailAddr = refreshTaraeptUserEmailAddr();
     }
   		return taraeptUserEmailAddr;
   }

  
	/**
	*  set variable taraeptUserEmailAddr
	*  Corresponding COBOL Variable is TARAEPT-USER-EMAIL-ADDR
	*  @param value
	**/
   public void setTaraeptUserEmailAddr(char[] value) {
      taraeptUserEmailAddr = checkTaraeptUserEmailAddrConstraints(value);
      serializeTaraeptUserEmailAddr(taraeptUserEmailAddr);
   } 

     /**
	 * 	Update TaraeptUserEmailAddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptUserEmailAddr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptUserEmailAddr,taraeptUserEmailAddr.length);
   	
   }
   
   public void setTaraeptUserEmailAddr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserEmailAddr,taraeptUserEmailAddr.length);
   	
   }
   
     /**
	 * 	Update TaraeptUserEmailAddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserEmailAddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserEmailAddr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptUserEmailAddr with another Field
	 *	@param value
	 */
   public void setTaraeptUserEmailAddr(Field source) {
       replace(source,0,source.length(),beginTaraeptUserEmailAddr,TARAEPT_USER_EMAIL_ADDR_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptUserEmailAddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptUserEmailAddr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptUserEmailAddr,TARAEPT_USER_EMAIL_ADDR_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptUserEmailAddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptUserEmailAddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptUserEmailAddr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptBkupEndptId
	 *	@return taraeptBkupEndptId
	 */
   public char[] getTaraeptBkupEndptId() throws CFException{
     if (isTaraeptBkupEndptIdModified()) { 
        taraeptBkupEndptId = refreshTaraeptBkupEndptId();
     }
   		return taraeptBkupEndptId;
   }

  
	/**
	*  set variable taraeptBkupEndptId
	*  Corresponding COBOL Variable is TARAEPT-BKUP-ENDPT-ID
	*  @param value
	**/
   public void setTaraeptBkupEndptId(char[] value) {
      taraeptBkupEndptId = checkTaraeptBkupEndptIdConstraints(value);
      serializeTaraeptBkupEndptId(taraeptBkupEndptId);
   } 

     /**
	 * 	Update TaraeptBkupEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptBkupEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptBkupEndptId,taraeptBkupEndptId.length);
   	
   }
   
   public void setTaraeptBkupEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupEndptId,taraeptBkupEndptId.length);
   	
   }
   
     /**
	 * 	Update TaraeptBkupEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBkupEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptBkupEndptId with another Field
	 *	@param value
	 */
   public void setTaraeptBkupEndptId(Field source) {
       replace(source,0,source.length(),beginTaraeptBkupEndptId,TARAEPT_BKUP_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptBkupEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptBkupEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptBkupEndptId,TARAEPT_BKUP_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptBkupEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBkupEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptBkupActvSw
	 *	@return taraeptBkupActvSw
	 */
   public char[] getTaraeptBkupActvSw() throws CFException{
     if (isTaraeptBkupActvSwModified()) { 
        taraeptBkupActvSw = refreshTaraeptBkupActvSw();
     }
   		return taraeptBkupActvSw;
   }

  
	/**
	*  set variable taraeptBkupActvSw
	*  Corresponding COBOL Variable is TARAEPT-BKUP-ACTV-SW
	*  @param value
	**/
   public void setTaraeptBkupActvSw(char[] value) {
      taraeptBkupActvSw = checkTaraeptBkupActvSwConstraints(value);
      serializeTaraeptBkupActvSw(taraeptBkupActvSw);
   } 

     /**
	 * 	Update TaraeptBkupActvSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptBkupActvSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptBkupActvSw,taraeptBkupActvSw.length);
   	
   }
   
   public void setTaraeptBkupActvSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupActvSw,taraeptBkupActvSw.length);
   	
   }
   
     /**
	 * 	Update TaraeptBkupActvSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBkupActvSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupActvSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptBkupActvSw with another Field
	 *	@param value
	 */
   public void setTaraeptBkupActvSw(Field source) {
       replace(source,0,source.length(),beginTaraeptBkupActvSw,TARAEPT_BKUP_ACTV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptBkupActvSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptBkupActvSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptBkupActvSw,TARAEPT_BKUP_ACTV_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptBkupActvSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBkupActvSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBkupActvSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptEffFromTs
	 *	@return taraeptEffFromTs
	 */
   public char[] getTaraeptEffFromTs() throws CFException{
     if (isTaraeptEffFromTsModified()) { 
        taraeptEffFromTs = refreshTaraeptEffFromTs();
     }
   		return taraeptEffFromTs;
   }

  
	/**
	*  set variable taraeptEffFromTs
	*  Corresponding COBOL Variable is TARAEPT-EFF-FROM-TS
	*  @param value
	**/
   public void setTaraeptEffFromTs(char[] value) {
      taraeptEffFromTs = checkTaraeptEffFromTsConstraints(value);
      serializeTaraeptEffFromTs(taraeptEffFromTs);
   } 

     /**
	 * 	Update TaraeptEffFromTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptEffFromTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptEffFromTs,taraeptEffFromTs.length);
   	
   }
   
   public void setTaraeptEffFromTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffFromTs,taraeptEffFromTs.length);
   	
   }
   
     /**
	 * 	Update TaraeptEffFromTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEffFromTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffFromTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptEffFromTs with another Field
	 *	@param value
	 */
   public void setTaraeptEffFromTs(Field source) {
       replace(source,0,source.length(),beginTaraeptEffFromTs,TARAEPT_EFF_FROM_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptEffFromTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptEffFromTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptEffFromTs,TARAEPT_EFF_FROM_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptEffFromTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEffFromTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffFromTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptEffToTs
	 *	@return taraeptEffToTs
	 */
   public char[] getTaraeptEffToTs() throws CFException{
     if (isTaraeptEffToTsModified()) { 
        taraeptEffToTs = refreshTaraeptEffToTs();
     }
   		return taraeptEffToTs;
   }

  
	/**
	*  set variable taraeptEffToTs
	*  Corresponding COBOL Variable is TARAEPT-EFF-TO-TS
	*  @param value
	**/
   public void setTaraeptEffToTs(char[] value) {
      taraeptEffToTs = checkTaraeptEffToTsConstraints(value);
      serializeTaraeptEffToTs(taraeptEffToTs);
   } 

     /**
	 * 	Update TaraeptEffToTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptEffToTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptEffToTs,taraeptEffToTs.length);
   	
   }
   
   public void setTaraeptEffToTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffToTs,taraeptEffToTs.length);
   	
   }
   
     /**
	 * 	Update TaraeptEffToTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEffToTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffToTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptEffToTs with another Field
	 *	@param value
	 */
   public void setTaraeptEffToTs(Field source) {
       replace(source,0,source.length(),beginTaraeptEffToTs,TARAEPT_EFF_TO_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptEffToTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptEffToTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptEffToTs,TARAEPT_EFF_TO_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptEffToTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEffToTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEffToTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptLstUpdtUserId
	 *	@return taraeptLstUpdtUserId
	 */
   public char[] getTaraeptLstUpdtUserId() throws CFException{
     if (isTaraeptLstUpdtUserIdModified()) { 
        taraeptLstUpdtUserId = refreshTaraeptLstUpdtUserId();
     }
   		return taraeptLstUpdtUserId;
   }

  
	/**
	*  set variable taraeptLstUpdtUserId
	*  Corresponding COBOL Variable is TARAEPT-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setTaraeptLstUpdtUserId(char[] value) {
      taraeptLstUpdtUserId = checkTaraeptLstUpdtUserIdConstraints(value);
      serializeTaraeptLstUpdtUserId(taraeptLstUpdtUserId);
   } 

     /**
	 * 	Update TaraeptLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptLstUpdtUserId,taraeptLstUpdtUserId.length);
   	
   }
   
   public void setTaraeptLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtUserId,taraeptLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update TaraeptLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setTaraeptLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginTaraeptLstUpdtUserId,TARAEPT_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtUserId,TARAEPT_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptLstUpdtTs
	 *	@return taraeptLstUpdtTs
	 */
   public char[] getTaraeptLstUpdtTs() throws CFException{
     if (isTaraeptLstUpdtTsModified()) { 
        taraeptLstUpdtTs = refreshTaraeptLstUpdtTs();
     }
   		return taraeptLstUpdtTs;
   }

  
	/**
	*  set variable taraeptLstUpdtTs
	*  Corresponding COBOL Variable is TARAEPT-LST-UPDT-TS
	*  @param value
	**/
   public void setTaraeptLstUpdtTs(char[] value) {
      taraeptLstUpdtTs = checkTaraeptLstUpdtTsConstraints(value);
      serializeTaraeptLstUpdtTs(taraeptLstUpdtTs);
   } 

     /**
	 * 	Update TaraeptLstUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptLstUpdtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptLstUpdtTs,taraeptLstUpdtTs.length);
   	
   }
   
   public void setTaraeptLstUpdtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtTs,taraeptLstUpdtTs.length);
   	
   }
   
     /**
	 * 	Update TaraeptLstUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptLstUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptLstUpdtTs with another Field
	 *	@param value
	 */
   public void setTaraeptLstUpdtTs(Field source) {
       replace(source,0,source.length(),beginTaraeptLstUpdtTs,TARAEPT_LST_UPDT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptLstUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptLstUpdtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtTs,TARAEPT_LST_UPDT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptLstUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptLstUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptLstUpdtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptGftSrvrNam
	 *	@return taraeptGftSrvrNam
	 */
   public char[] getTaraeptGftSrvrNam() throws CFException{
     if (isTaraeptGftSrvrNamModified()) { 
        taraeptGftSrvrNam = refreshTaraeptGftSrvrNam();
     }
   		return taraeptGftSrvrNam;
   }

  
	/**
	*  set variable taraeptGftSrvrNam
	*  Corresponding COBOL Variable is TARAEPT-GFT-SRVR-NAM
	*  @param value
	**/
   public void setTaraeptGftSrvrNam(char[] value) {
      taraeptGftSrvrNam = checkTaraeptGftSrvrNamConstraints(value);
      serializeTaraeptGftSrvrNam(taraeptGftSrvrNam);
   } 

     /**
	 * 	Update TaraeptGftSrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptGftSrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptGftSrvrNam,taraeptGftSrvrNam.length);
   	
   }
   
   public void setTaraeptGftSrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptGftSrvrNam,taraeptGftSrvrNam.length);
   	
   }
   
     /**
	 * 	Update TaraeptGftSrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptGftSrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptGftSrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptGftSrvrNam with another Field
	 *	@param value
	 */
   public void setTaraeptGftSrvrNam(Field source) {
       replace(source,0,source.length(),beginTaraeptGftSrvrNam,TARAEPT_GFT_SRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptGftSrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptGftSrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptGftSrvrNam,TARAEPT_GFT_SRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptGftSrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptGftSrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptGftSrvrNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptCsMipId
	 *	@return taraeptCsMipId
	 */
   public char[] getTaraeptCsMipId() throws CFException{
     if (isTaraeptCsMipIdModified()) { 
        taraeptCsMipId = refreshTaraeptCsMipId();
     }
   		return taraeptCsMipId;
   }

  
	/**
	*  set variable taraeptCsMipId
	*  Corresponding COBOL Variable is TARAEPT-CS-MIP-ID
	*  @param value
	**/
   public void setTaraeptCsMipId(char[] value) {
      taraeptCsMipId = checkTaraeptCsMipIdConstraints(value);
      serializeTaraeptCsMipId(taraeptCsMipId);
   } 

     /**
	 * 	Update TaraeptCsMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptCsMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptCsMipId,taraeptCsMipId.length);
   	
   }
   
   public void setTaraeptCsMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptCsMipId,taraeptCsMipId.length);
   	
   }
   
     /**
	 * 	Update TaraeptCsMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptCsMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptCsMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptCsMipId with another Field
	 *	@param value
	 */
   public void setTaraeptCsMipId(Field source) {
       replace(source,0,source.length(),beginTaraeptCsMipId,TARAEPT_CS_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptCsMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptCsMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptCsMipId,TARAEPT_CS_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptCsMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptCsMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptCsMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptRmMipId
	 *	@return taraeptRmMipId
	 */
   public char[] getTaraeptRmMipId() throws CFException{
     if (isTaraeptRmMipIdModified()) { 
        taraeptRmMipId = refreshTaraeptRmMipId();
     }
   		return taraeptRmMipId;
   }

  
	/**
	*  set variable taraeptRmMipId
	*  Corresponding COBOL Variable is TARAEPT-RM-MIP-ID
	*  @param value
	**/
   public void setTaraeptRmMipId(char[] value) {
      taraeptRmMipId = checkTaraeptRmMipIdConstraints(value);
      serializeTaraeptRmMipId(taraeptRmMipId);
   } 

     /**
	 * 	Update TaraeptRmMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptRmMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptRmMipId,taraeptRmMipId.length);
   	
   }
   
   public void setTaraeptRmMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRmMipId,taraeptRmMipId.length);
   	
   }
   
     /**
	 * 	Update TaraeptRmMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptRmMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRmMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptRmMipId with another Field
	 *	@param value
	 */
   public void setTaraeptRmMipId(Field source) {
       replace(source,0,source.length(),beginTaraeptRmMipId,TARAEPT_RM_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptRmMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptRmMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptRmMipId,TARAEPT_RM_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptRmMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptRmMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRmMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptBusPrtnrNam
	 *	@return taraeptBusPrtnrNam
	 */
   public char[] getTaraeptBusPrtnrNam() throws CFException{
     if (isTaraeptBusPrtnrNamModified()) { 
        taraeptBusPrtnrNam = refreshTaraeptBusPrtnrNam();
     }
   		return taraeptBusPrtnrNam;
   }

  
	/**
	*  set variable taraeptBusPrtnrNam
	*  Corresponding COBOL Variable is TARAEPT-BUS-PRTNR-NAM
	*  @param value
	**/
   public void setTaraeptBusPrtnrNam(char[] value) {
      taraeptBusPrtnrNam = checkTaraeptBusPrtnrNamConstraints(value);
      serializeTaraeptBusPrtnrNam(taraeptBusPrtnrNam);
   } 

     /**
	 * 	Update TaraeptBusPrtnrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptBusPrtnrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptBusPrtnrNam,taraeptBusPrtnrNam.length);
   	
   }
   
   public void setTaraeptBusPrtnrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrNam,taraeptBusPrtnrNam.length);
   	
   }
   
     /**
	 * 	Update TaraeptBusPrtnrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBusPrtnrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptBusPrtnrNam with another Field
	 *	@param value
	 */
   public void setTaraeptBusPrtnrNam(Field source) {
       replace(source,0,source.length(),beginTaraeptBusPrtnrNam,TARAEPT_BUS_PRTNR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptBusPrtnrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptBusPrtnrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrNam,TARAEPT_BUS_PRTNR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptBusPrtnrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptBusPrtnrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptBusPrtnrNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptTapeMediaCd
	 *	@return taraeptTapeMediaCd
	 */
   public char[] getTaraeptTapeMediaCd() throws CFException{
     if (isTaraeptTapeMediaCdModified()) { 
        taraeptTapeMediaCd = refreshTaraeptTapeMediaCd();
     }
   		return taraeptTapeMediaCd;
   }

  
	/**
	*  set variable taraeptTapeMediaCd
	*  Corresponding COBOL Variable is TARAEPT-TAPE-MEDIA-CD
	*  @param value
	**/
   public void setTaraeptTapeMediaCd(char[] value) {
      taraeptTapeMediaCd = checkTaraeptTapeMediaCdConstraints(value);
      serializeTaraeptTapeMediaCd(taraeptTapeMediaCd);
   } 

     /**
	 * 	Update TaraeptTapeMediaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptTapeMediaCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptTapeMediaCd,taraeptTapeMediaCd.length);
   	
   }
   
   public void setTaraeptTapeMediaCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeMediaCd,taraeptTapeMediaCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptTapeMediaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptTapeMediaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeMediaCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptTapeMediaCd with another Field
	 *	@param value
	 */
   public void setTaraeptTapeMediaCd(Field source) {
       replace(source,0,source.length(),beginTaraeptTapeMediaCd,TARAEPT_TAPE_MEDIA_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptTapeMediaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptTapeMediaCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptTapeMediaCd,TARAEPT_TAPE_MEDIA_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptTapeMediaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptTapeMediaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeMediaCd+targetIndex,targetLen);
    
   }
	public short getTaraeptTapeTrckNum() throws CFException {
        if (isTaraeptTapeTrckNumModified()) { 
           taraeptTapeTrckNum = refreshTaraeptTapeTrckNum();
        }
   		return taraeptTapeTrckNum;
	}
	
	/**
	 * 	Update TaraeptTapeTrckNum with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-TAPE-TRCK-NUM
	 *	@param number
	 */
	public void setTaraeptTapeTrckNum(short number) {
			taraeptTapeTrckNum = checkTaraeptTapeTrckNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraeptTapeTrckNum(taraeptTapeTrckNum);
	}

	public void setTaraeptTapeTrckNum(int number) {
	    number = checkTaraeptTapeTrckNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptTapeTrckNum((short)number);
	}
	public void setTaraeptTapeTrckNum(long number) {
	    number = checkTaraeptTapeTrckNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptTapeTrckNum((short)number);
	}
	

	/**
	 *	Returns the value of taraeptTapeLblFrmtCd
	 *	@return taraeptTapeLblFrmtCd
	 */
   public char[] getTaraeptTapeLblFrmtCd() throws CFException{
     if (isTaraeptTapeLblFrmtCdModified()) { 
        taraeptTapeLblFrmtCd = refreshTaraeptTapeLblFrmtCd();
     }
   		return taraeptTapeLblFrmtCd;
   }

  
	/**
	*  set variable taraeptTapeLblFrmtCd
	*  Corresponding COBOL Variable is TARAEPT-TAPE-LBL-FRMT-CD
	*  @param value
	**/
   public void setTaraeptTapeLblFrmtCd(char[] value) {
      taraeptTapeLblFrmtCd = checkTaraeptTapeLblFrmtCdConstraints(value);
      serializeTaraeptTapeLblFrmtCd(taraeptTapeLblFrmtCd);
   } 

     /**
	 * 	Update TaraeptTapeLblFrmtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptTapeLblFrmtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptTapeLblFrmtCd,taraeptTapeLblFrmtCd.length);
   	
   }
   
   public void setTaraeptTapeLblFrmtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeLblFrmtCd,taraeptTapeLblFrmtCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptTapeLblFrmtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptTapeLblFrmtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeLblFrmtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptTapeLblFrmtCd with another Field
	 *	@param value
	 */
   public void setTaraeptTapeLblFrmtCd(Field source) {
       replace(source,0,source.length(),beginTaraeptTapeLblFrmtCd,TARAEPT_TAPE_LBL_FRMT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptTapeLblFrmtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptTapeLblFrmtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptTapeLblFrmtCd,TARAEPT_TAPE_LBL_FRMT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptTapeLblFrmtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptTapeLblFrmtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptTapeLblFrmtCd+targetIndex,targetLen);
    
   }
	public short getTaraeptTapeAddrIndxNum() throws CFException {
        if (isTaraeptTapeAddrIndxNumModified()) { 
           taraeptTapeAddrIndxNum = refreshTaraeptTapeAddrIndxNum();
        }
   		return taraeptTapeAddrIndxNum;
	}
	
	/**
	 * 	Update TaraeptTapeAddrIndxNum with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-TAPE-ADDR-INDX-NUM
	 *	@param number
	 */
	public void setTaraeptTapeAddrIndxNum(short number) {
			taraeptTapeAddrIndxNum = checkTaraeptTapeAddrIndxNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraeptTapeAddrIndxNum(taraeptTapeAddrIndxNum);
	}

	public void setTaraeptTapeAddrIndxNum(int number) {
	    number = checkTaraeptTapeAddrIndxNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptTapeAddrIndxNum((short)number);
	}
	public void setTaraeptTapeAddrIndxNum(long number) {
	    number = checkTaraeptTapeAddrIndxNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptTapeAddrIndxNum((short)number);
	}
	

	/**
	 *	Returns the value of taraeptXferModeCd
	 *	@return taraeptXferModeCd
	 */
   public char[] getTaraeptXferModeCd() throws CFException{
     if (isTaraeptXferModeCdModified()) { 
        taraeptXferModeCd = refreshTaraeptXferModeCd();
     }
   		return taraeptXferModeCd;
   }

  
	/**
	*  set variable taraeptXferModeCd
	*  Corresponding COBOL Variable is TARAEPT-XFER-MODE-CD
	*  @param value
	**/
   public void setTaraeptXferModeCd(char[] value) {
      taraeptXferModeCd = checkTaraeptXferModeCdConstraints(value);
      serializeTaraeptXferModeCd(taraeptXferModeCd);
   } 

     /**
	 * 	Update TaraeptXferModeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptXferModeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptXferModeCd,taraeptXferModeCd.length);
   	
   }
   
   public void setTaraeptXferModeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferModeCd,taraeptXferModeCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptXferModeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferModeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferModeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptXferModeCd with another Field
	 *	@param value
	 */
   public void setTaraeptXferModeCd(Field source) {
       replace(source,0,source.length(),beginTaraeptXferModeCd,TARAEPT_XFER_MODE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptXferModeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptXferModeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptXferModeCd,TARAEPT_XFER_MODE_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptXferModeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptXferModeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptXferModeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptAltUserSrvrId
	 *	@return taraeptAltUserSrvrId
	 */
   public char[] getTaraeptAltUserSrvrId() throws CFException{
     if (isTaraeptAltUserSrvrIdModified()) { 
        taraeptAltUserSrvrId = refreshTaraeptAltUserSrvrId();
     }
   		return taraeptAltUserSrvrId;
   }

  
	/**
	*  set variable taraeptAltUserSrvrId
	*  Corresponding COBOL Variable is TARAEPT-ALT-USER-SRVR-ID
	*  @param value
	**/
   public void setTaraeptAltUserSrvrId(char[] value) {
      taraeptAltUserSrvrId = checkTaraeptAltUserSrvrIdConstraints(value);
      serializeTaraeptAltUserSrvrId(taraeptAltUserSrvrId);
   } 

     /**
	 * 	Update TaraeptAltUserSrvrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltUserSrvrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptAltUserSrvrId,taraeptAltUserSrvrId.length);
   	
   }
   
   public void setTaraeptAltUserSrvrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltUserSrvrId,taraeptAltUserSrvrId.length);
   	
   }
   
     /**
	 * 	Update TaraeptAltUserSrvrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltUserSrvrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltUserSrvrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptAltUserSrvrId with another Field
	 *	@param value
	 */
   public void setTaraeptAltUserSrvrId(Field source) {
       replace(source,0,source.length(),beginTaraeptAltUserSrvrId,TARAEPT_ALT_USER_SRVR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptAltUserSrvrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptAltUserSrvrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptAltUserSrvrId,TARAEPT_ALT_USER_SRVR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptAltUserSrvrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltUserSrvrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptAltUserSrvrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptAltXferUserId
	 *	@return taraeptAltXferUserId
	 */   
	 public TaraeptAltXferUserId getTaraeptAltXferUserId() {
   	return taraeptAltXferUserId;
   }
   /**
	* 	Update TaraeptAltXferUserId with the passed value
	*   Corresponding COBOL Variable is TARAEPT-ALT-XFER-USER-ID
	*	@param value
	*/
   public void setTaraeptAltXferUserId(char[] value) {
      taraeptAltXferUserId.setString(value); 
   }   
    
     /**
	 * 	Update TaraeptAltXferUserId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferUserId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferUserId.begin,taraeptAltXferUserId.length());
   }
   
     /**
	 * 	Update TaraeptAltXferUserId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferUserId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraeptAltXferUserId with another Field
	 *	@param value
	 */
   public void setTaraeptAltXferUserId(Field source) {
   	replace(source,0,source.length(),taraeptAltXferUserId.begin,taraeptAltXferUserId.length());
   }  
   
     /**
	 * 	Update TaraeptAltXferUserId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferUserId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferUserId.begin,taraeptAltXferUserId.length());
   }
   
     /**
	 * 	Update TaraeptAltXferUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferUserId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of taraeptAltXferPswdId
	 *	@return taraeptAltXferPswdId
	 */   
	 public TaraeptAltXferPswdId getTaraeptAltXferPswdId() {
   	return taraeptAltXferPswdId;
   }
   /**
	* 	Update TaraeptAltXferPswdId with the passed value
	*   Corresponding COBOL Variable is TARAEPT-ALT-XFER-PSWD-ID
	*	@param value
	*/
   public void setTaraeptAltXferPswdId(char[] value) {
      taraeptAltXferPswdId.setString(value); 
   }   
    
     /**
	 * 	Update TaraeptAltXferPswdId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferPswdId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferPswdId.begin,taraeptAltXferPswdId.length());
   }
   
     /**
	 * 	Update TaraeptAltXferPswdId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferPswdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferPswdId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraeptAltXferPswdId with another Field
	 *	@param value
	 */
   public void setTaraeptAltXferPswdId(Field source) {
   	replace(source,0,source.length(),taraeptAltXferPswdId.begin,taraeptAltXferPswdId.length());
   }  
   
     /**
	 * 	Update TaraeptAltXferPswdId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraeptAltXferPswdId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferPswdId.begin,taraeptAltXferPswdId.length());
   }
   
     /**
	 * 	Update TaraeptAltXferPswdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptAltXferPswdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraeptAltXferPswdId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of taraeptRteToHubSw
	 *	@return taraeptRteToHubSw
	 */
   public char[] getTaraeptRteToHubSw() throws CFException{
     if (isTaraeptRteToHubSwModified()) { 
        taraeptRteToHubSw = refreshTaraeptRteToHubSw();
     }
   		return taraeptRteToHubSw;
   }

  
	/**
	*  set variable taraeptRteToHubSw
	*  Corresponding COBOL Variable is TARAEPT-RTE-TO-HUB-SW
	*  @param value
	**/
   public void setTaraeptRteToHubSw(char[] value) {
      taraeptRteToHubSw = checkTaraeptRteToHubSwConstraints(value);
      serializeTaraeptRteToHubSw(taraeptRteToHubSw);
   } 

     /**
	 * 	Update TaraeptRteToHubSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptRteToHubSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptRteToHubSw,taraeptRteToHubSw.length);
   	
   }
   
   public void setTaraeptRteToHubSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRteToHubSw,taraeptRteToHubSw.length);
   	
   }
   
     /**
	 * 	Update TaraeptRteToHubSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptRteToHubSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRteToHubSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptRteToHubSw with another Field
	 *	@param value
	 */
   public void setTaraeptRteToHubSw(Field source) {
       replace(source,0,source.length(),beginTaraeptRteToHubSw,TARAEPT_RTE_TO_HUB_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptRteToHubSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptRteToHubSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptRteToHubSw,TARAEPT_RTE_TO_HUB_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptRteToHubSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptRteToHubSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptRteToHubSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptEndptTypCd
	 *	@return taraeptEndptTypCd
	 */
   public char[] getTaraeptEndptTypCd() throws CFException{
     if (isTaraeptEndptTypCdModified()) { 
        taraeptEndptTypCd = refreshTaraeptEndptTypCd();
     }
   		return taraeptEndptTypCd;
   }

  
	/**
	*  set variable taraeptEndptTypCd
	*  Corresponding COBOL Variable is TARAEPT-ENDPT-TYP-CD
	*  @param value
	**/
   public void setTaraeptEndptTypCd(char[] value) {
      taraeptEndptTypCd = checkTaraeptEndptTypCdConstraints(value);
      serializeTaraeptEndptTypCd(taraeptEndptTypCd);
   } 

     /**
	 * 	Update TaraeptEndptTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptEndptTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptEndptTypCd,taraeptEndptTypCd.length);
   	
   }
   
   public void setTaraeptEndptTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptTypCd,taraeptEndptTypCd.length);
   	
   }
   
     /**
	 * 	Update TaraeptEndptTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEndptTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptEndptTypCd with another Field
	 *	@param value
	 */
   public void setTaraeptEndptTypCd(Field source) {
       replace(source,0,source.length(),beginTaraeptEndptTypCd,TARAEPT_ENDPT_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptEndptTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptEndptTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptEndptTypCd,TARAEPT_ENDPT_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptEndptTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptEndptTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptEndptTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraeptHubId
	 *	@return taraeptHubId
	 */
   public char[] getTaraeptHubId() throws CFException{
     if (isTaraeptHubIdModified()) { 
        taraeptHubId = refreshTaraeptHubId();
     }
   		return taraeptHubId;
   }

  
	/**
	*  set variable taraeptHubId
	*  Corresponding COBOL Variable is TARAEPT-HUB-ID
	*  @param value
	**/
   public void setTaraeptHubId(char[] value) {
      taraeptHubId = checkTaraeptHubIdConstraints(value);
      serializeTaraeptHubId(taraeptHubId);
   } 

     /**
	 * 	Update TaraeptHubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraeptHubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraeptHubId,taraeptHubId.length);
   	
   }
   
   public void setTaraeptHubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHubId,taraeptHubId.length);
   	
   }
   
     /**
	 * 	Update TaraeptHubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptHubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraeptHubId with another Field
	 *	@param value
	 */
   public void setTaraeptHubId(Field source) {
       replace(source,0,source.length(),beginTaraeptHubId,TARAEPT_HUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraeptHubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraeptHubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraeptHubId,TARAEPT_HUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraeptHubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraeptHubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraeptHubId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Taraept
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setTaraeptEndptId(CONSTANTS.SPACE_7);
         setTaraeptXferMthdCd(CONSTANTS.SPACE);
         setTaraeptBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraeptXferLocNam(CONSTANTS.SPACE_20);
          taraeptXferUserId.initialize();
     
          taraeptXferPswdId.initialize();
     
         setTaraeptUserSrvrId(CONSTANTS.SPACE_20);
         setTaraeptHostTypeCd(CONSTANTS.SPACE);
         setTaraeptUserNam(CONSTANTS.SPACE_30);
         setTaraeptUserPhnNum(CONSTANTS.SPACE_10);
         setTaraeptUserFaxNum(CONSTANTS.SPACE_10);
         setTaraeptUserEmailAddr(CONSTANTS.SPACE_70);
         setTaraeptBkupEndptId(CONSTANTS.SPACE_7);
         setTaraeptBkupActvSw(CONSTANTS.SPACE);
         setTaraeptEffFromTs(CONSTANTS.SPACE_26);
         setTaraeptEffToTs(CONSTANTS.SPACE_26);
         setTaraeptLstUpdtUserId(CONSTANTS.SPACE_9);
         setTaraeptLstUpdtTs(CONSTANTS.SPACE_26);
         setTaraeptGftSrvrNam(CONSTANTS.SPACE_10);
         setTaraeptCsMipId(CONSTANTS.SPACE_3);
         setTaraeptRmMipId(CONSTANTS.SPACE_3);
         setTaraeptBusPrtnrNam(CONSTANTS.SPACE_70);
         setTaraeptTapeMediaCd(CONSTANTS.SPACE);
         	setTaraeptTapeTrckNum((short)0);
         setTaraeptTapeLblFrmtCd(CONSTANTS.SPACE);
         	setTaraeptTapeAddrIndxNum((short)0);
         setTaraeptXferModeCd(CONSTANTS.SPACE_4);
         setTaraeptAltUserSrvrId(CONSTANTS.SPACE_20);
          taraeptAltXferUserId.initialize();
     
          taraeptAltXferPswdId.initialize();
     
         setTaraeptRteToHubSw(CONSTANTS.SPACE);
         setTaraeptEndptTypCd(CONSTANTS.SPACE_2);
         setTaraeptHubId(CONSTANTS.SPACE_8);
   }

		public static int getTaraeptFieldLength() {
			return TARAEPT_LENGTH;
		}

}
  
