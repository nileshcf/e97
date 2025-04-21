package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclvmstranb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dclvmstranb extends DclvmstranbSerialized {
   

						private char[] securityAdpNbr = Field.fillLowValue(7);

						private char[] trmlCd = Field.fillLowValue(8);

						private char[] tranCd = Field.fillLowValue(8);

						private char[] addedTmstp = Field.fillLowValue(26);

						private char[] doNotUseDt = Field.fillLowValue(10);

						private char[] srceSetupSecCd = Field.fillLowValue(2);

						private char[] securityIdaCd = Field.fillLowValue(4);

						private char[] typeSecurityCd = Field.fillLowValue(3);

						private char[] cntryIssueCd = Field.fillLowValue(2);

						private char[] cntryOrgnCd = Field.fillLowValue(2);

						private char[] clientNbr = Field.fillLowValue(4);

						private char[] descSecTxt = Field.fillLowValue(30);

								private int mcgillCd;

						private char[] cusipCntraNbr = Field.fillLowValue(8);

						private char[] classInd = Field.fillLowValue(1);

						private char[] symblTrdsAsCd = Field.fillLowValue(20);

						private char[] symblTrdsWhiCd = Field.fillLowValue(20);

						private char[] secLckdInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Dclvmstranb
	**/
    public Dclvmstranb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of securityAdpNbr
	 *	@return securityAdpNbr
	 */
   public char[] getSecurityAdpNbr() throws CFException{
     if (isSecurityAdpNbrModified()) { 
        securityAdpNbr = refreshSecurityAdpNbr();
     }
   		return securityAdpNbr;
   }

  
	/**
	*  set variable securityAdpNbr
	*  Corresponding COBOL Variable is SECURITY-ADP-NBR
	*  @param value
	**/
   public void setSecurityAdpNbr(char[] value) {
      securityAdpNbr = checkSecurityAdpNbrConstraints(value);
      serializeSecurityAdpNbr(securityAdpNbr);
   } 

     /**
	 * 	Update SecurityAdpNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityAdpNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecurityAdpNbr,securityAdpNbr.length);
   	
   }
   
   public void setSecurityAdpNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr,securityAdpNbr.length);
   	
   }
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecurityAdpNbr with another Field
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source) {
       replace(source,0,source.length(),beginSecurityAdpNbr,SECURITY_ADP_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr,SECURITY_ADP_NBR_LEN);
   	
   }
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityAdpNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trmlCd
	 *	@return trmlCd
	 */
   public char[] getTrmlCd() throws CFException{
     if (isTrmlCdModified()) { 
        trmlCd = refreshTrmlCd();
     }
   		return trmlCd;
   }

  
	/**
	*  set variable trmlCd
	*  Corresponding COBOL Variable is TRML-CD
	*  @param value
	**/
   public void setTrmlCd(char[] value) {
      trmlCd = checkTrmlCdConstraints(value);
      serializeTrmlCd(trmlCd);
   } 

     /**
	 * 	Update TrmlCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrmlCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrmlCd,trmlCd.length);
   	
   }
   
   public void setTrmlCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrmlCd,trmlCd.length);
   	
   }
   
     /**
	 * 	Update TrmlCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrmlCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrmlCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrmlCd with another Field
	 *	@param value
	 */
   public void setTrmlCd(Field source) {
       replace(source,0,source.length(),beginTrmlCd,TRML_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TrmlCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrmlCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrmlCd,TRML_CD_LEN);
   	
   }
   
     /**
	 * 	Update TrmlCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrmlCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrmlCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tranCd
	 *	@return tranCd
	 */
   public char[] getTranCd() throws CFException{
     if (isTranCdModified()) { 
        tranCd = refreshTranCd();
     }
   		return tranCd;
   }

  
	/**
	*  set variable tranCd
	*  Corresponding COBOL Variable is TRAN-CD
	*  @param value
	**/
   public void setTranCd(char[] value) {
      tranCd = checkTranCdConstraints(value);
      serializeTranCd(tranCd);
   } 

     /**
	 * 	Update TranCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTranCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTranCd,tranCd.length);
   	
   }
   
   public void setTranCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTranCd,tranCd.length);
   	
   }
   
     /**
	 * 	Update TranCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTranCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTranCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TranCd with another Field
	 *	@param value
	 */
   public void setTranCd(Field source) {
       replace(source,0,source.length(),beginTranCd,TRAN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TranCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTranCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTranCd,TRAN_CD_LEN);
   	
   }
   
     /**
	 * 	Update TranCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTranCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTranCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of addedTmstp
	 *	@return addedTmstp
	 */
   public char[] getAddedTmstp() throws CFException{
     if (isAddedTmstpModified()) { 
        addedTmstp = refreshAddedTmstp();
     }
   		return addedTmstp;
   }

  
	/**
	*  set variable addedTmstp
	*  Corresponding COBOL Variable is ADDED-TMSTP
	*  @param value
	**/
   public void setAddedTmstp(char[] value) {
      addedTmstp = checkAddedTmstpConstraints(value);
      serializeAddedTmstp(addedTmstp);
   } 

     /**
	 * 	Update AddedTmstp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAddedTmstp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAddedTmstp,addedTmstp.length);
   	
   }
   
   public void setAddedTmstp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAddedTmstp,addedTmstp.length);
   	
   }
   
     /**
	 * 	Update AddedTmstp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAddedTmstp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAddedTmstp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AddedTmstp with another Field
	 *	@param value
	 */
   public void setAddedTmstp(Field source) {
       replace(source,0,source.length(),beginAddedTmstp,ADDED_TMSTP_LEN);
   	
   }  
   
     /**
	 * 	Update AddedTmstp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAddedTmstp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAddedTmstp,ADDED_TMSTP_LEN);
   	
   }
   
     /**
	 * 	Update AddedTmstp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAddedTmstp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAddedTmstp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of doNotUseDt
	 *	@return doNotUseDt
	 */
   public char[] getDoNotUseDt() throws CFException{
     if (isDoNotUseDtModified()) { 
        doNotUseDt = refreshDoNotUseDt();
     }
   		return doNotUseDt;
   }

  
	/**
	*  set variable doNotUseDt
	*  Corresponding COBOL Variable is DO-NOT-USE-DT
	*  @param value
	**/
   public void setDoNotUseDt(char[] value) {
      doNotUseDt = checkDoNotUseDtConstraints(value);
      serializeDoNotUseDt(doNotUseDt);
   } 

     /**
	 * 	Update DoNotUseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDoNotUseDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDoNotUseDt,doNotUseDt.length);
   	
   }
   
   public void setDoNotUseDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDoNotUseDt,doNotUseDt.length);
   	
   }
   
     /**
	 * 	Update DoNotUseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDoNotUseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDoNotUseDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DoNotUseDt with another Field
	 *	@param value
	 */
   public void setDoNotUseDt(Field source) {
       replace(source,0,source.length(),beginDoNotUseDt,DO_NOT_USE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update DoNotUseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDoNotUseDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDoNotUseDt,DO_NOT_USE_DT_LEN);
   	
   }
   
     /**
	 * 	Update DoNotUseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDoNotUseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDoNotUseDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of srceSetupSecCd
	 *	@return srceSetupSecCd
	 */
   public char[] getSrceSetupSecCd() throws CFException{
     if (isSrceSetupSecCdModified()) { 
        srceSetupSecCd = refreshSrceSetupSecCd();
     }
   		return srceSetupSecCd;
   }

  
	/**
	*  set variable srceSetupSecCd
	*  Corresponding COBOL Variable is SRCE-SETUP-SEC-CD
	*  @param value
	**/
   public void setSrceSetupSecCd(char[] value) {
      srceSetupSecCd = checkSrceSetupSecCdConstraints(value);
      serializeSrceSetupSecCd(srceSetupSecCd);
   } 

     /**
	 * 	Update SrceSetupSecCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceSetupSecCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrceSetupSecCd,srceSetupSecCd.length);
   	
   }
   
   public void setSrceSetupSecCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrceSetupSecCd,srceSetupSecCd.length);
   	
   }
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceSetupSecCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceSetupSecCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrceSetupSecCd with another Field
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source) {
       replace(source,0,source.length(),beginSrceSetupSecCd,SRCE_SETUP_SEC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrceSetupSecCd,SRCE_SETUP_SEC_CD_LEN);
   	
   }
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceSetupSecCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of securityIdaCd
	 *	@return securityIdaCd
	 */
   public char[] getSecurityIdaCd() throws CFException{
     if (isSecurityIdaCdModified()) { 
        securityIdaCd = refreshSecurityIdaCd();
     }
   		return securityIdaCd;
   }

  
	/**
	*  set variable securityIdaCd
	*  Corresponding COBOL Variable is SECURITY-IDA-CD
	*  @param value
	**/
   public void setSecurityIdaCd(char[] value) {
      securityIdaCd = checkSecurityIdaCdConstraints(value);
      serializeSecurityIdaCd(securityIdaCd);
   } 

     /**
	 * 	Update SecurityIdaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityIdaCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecurityIdaCd,securityIdaCd.length);
   	
   }
   
   public void setSecurityIdaCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityIdaCd,securityIdaCd.length);
   	
   }
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityIdaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityIdaCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecurityIdaCd with another Field
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source) {
       replace(source,0,source.length(),beginSecurityIdaCd,SECURITY_IDA_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecurityIdaCd,SECURITY_IDA_CD_LEN);
   	
   }
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityIdaCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of typeSecurityCd
	 *	@return typeSecurityCd
	 */
   public char[] getTypeSecurityCd() throws CFException{
     if (isTypeSecurityCdModified()) { 
        typeSecurityCd = refreshTypeSecurityCd();
     }
   		return typeSecurityCd;
   }

  
	/**
	*  set variable typeSecurityCd
	*  Corresponding COBOL Variable is TYPE-SECURITY-CD
	*  @param value
	**/
   public void setTypeSecurityCd(char[] value) {
      typeSecurityCd = checkTypeSecurityCdConstraints(value);
      serializeTypeSecurityCd(typeSecurityCd);
   } 

     /**
	 * 	Update TypeSecurityCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTypeSecurityCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTypeSecurityCd,typeSecurityCd.length);
   	
   }
   
   public void setTypeSecurityCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTypeSecurityCd,typeSecurityCd.length);
   	
   }
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTypeSecurityCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTypeSecurityCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TypeSecurityCd with another Field
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source) {
       replace(source,0,source.length(),beginTypeSecurityCd,TYPE_SECURITY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTypeSecurityCd,TYPE_SECURITY_CD_LEN);
   	
   }
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTypeSecurityCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cntryIssueCd
	 *	@return cntryIssueCd
	 */
   public char[] getCntryIssueCd() throws CFException{
     if (isCntryIssueCdModified()) { 
        cntryIssueCd = refreshCntryIssueCd();
     }
   		return cntryIssueCd;
   }

  
	/**
	*  set variable cntryIssueCd
	*  Corresponding COBOL Variable is CNTRY-ISSUE-CD
	*  @param value
	**/
   public void setCntryIssueCd(char[] value) {
      cntryIssueCd = checkCntryIssueCdConstraints(value);
      serializeCntryIssueCd(cntryIssueCd);
   } 

     /**
	 * 	Update CntryIssueCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCntryIssueCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCntryIssueCd,cntryIssueCd.length);
   	
   }
   
   public void setCntryIssueCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCntryIssueCd,cntryIssueCd.length);
   	
   }
   
     /**
	 * 	Update CntryIssueCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCntryIssueCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCntryIssueCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CntryIssueCd with another Field
	 *	@param value
	 */
   public void setCntryIssueCd(Field source) {
       replace(source,0,source.length(),beginCntryIssueCd,CNTRY_ISSUE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CntryIssueCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCntryIssueCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCntryIssueCd,CNTRY_ISSUE_CD_LEN);
   	
   }
   
     /**
	 * 	Update CntryIssueCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCntryIssueCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCntryIssueCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cntryOrgnCd
	 *	@return cntryOrgnCd
	 */
   public char[] getCntryOrgnCd() throws CFException{
     if (isCntryOrgnCdModified()) { 
        cntryOrgnCd = refreshCntryOrgnCd();
     }
   		return cntryOrgnCd;
   }

  
	/**
	*  set variable cntryOrgnCd
	*  Corresponding COBOL Variable is CNTRY-ORGN-CD
	*  @param value
	**/
   public void setCntryOrgnCd(char[] value) {
      cntryOrgnCd = checkCntryOrgnCdConstraints(value);
      serializeCntryOrgnCd(cntryOrgnCd);
   } 

     /**
	 * 	Update CntryOrgnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCntryOrgnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCntryOrgnCd,cntryOrgnCd.length);
   	
   }
   
   public void setCntryOrgnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCntryOrgnCd,cntryOrgnCd.length);
   	
   }
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCntryOrgnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCntryOrgnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CntryOrgnCd with another Field
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source) {
       replace(source,0,source.length(),beginCntryOrgnCd,CNTRY_ORGN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCntryOrgnCd,CNTRY_ORGN_CD_LEN);
   	
   }
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCntryOrgnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clientNbr
	 *	@return clientNbr
	 */
   public char[] getClientNbr() throws CFException{
     if (isClientNbrModified()) { 
        clientNbr = refreshClientNbr();
     }
   		return clientNbr;
   }

  
	/**
	*  set variable clientNbr
	*  Corresponding COBOL Variable is CLIENT-NBR
	*  @param value
	**/
   public void setClientNbr(char[] value) {
      clientNbr = checkClientNbrConstraints(value);
      serializeClientNbr(clientNbr);
   } 

     /**
	 * 	Update ClientNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClientNbr,clientNbr.length);
   	
   }
   
   public void setClientNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClientNbr,clientNbr.length);
   	
   }
   
     /**
	 * 	Update ClientNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClientNbr with another Field
	 *	@param value
	 */
   public void setClientNbr(Field source) {
       replace(source,0,source.length(),beginClientNbr,CLIENT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update ClientNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClientNbr,CLIENT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update ClientNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClientNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of descSecTxt
	 *	@return descSecTxt
	 */
   public char[] getDescSecTxt() throws CFException{
     if (isDescSecTxtModified()) { 
        descSecTxt = refreshDescSecTxt();
     }
   		return descSecTxt;
   }

  
	/**
	*  set variable descSecTxt
	*  Corresponding COBOL Variable is DESC-SEC-TXT
	*  @param value
	**/
   public void setDescSecTxt(char[] value) {
      descSecTxt = checkDescSecTxtConstraints(value);
      serializeDescSecTxt(descSecTxt);
   } 

     /**
	 * 	Update DescSecTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDescSecTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDescSecTxt,descSecTxt.length);
   	
   }
   
   public void setDescSecTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDescSecTxt,descSecTxt.length);
   	
   }
   
     /**
	 * 	Update DescSecTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDescSecTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDescSecTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DescSecTxt with another Field
	 *	@param value
	 */
   public void setDescSecTxt(Field source) {
       replace(source,0,source.length(),beginDescSecTxt,DESC_SEC_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update DescSecTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDescSecTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDescSecTxt,DESC_SEC_TXT_LEN);
   	
   }
   
     /**
	 * 	Update DescSecTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDescSecTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDescSecTxt+targetIndex,targetLen);
    
   }
	public int getMcgillCd() throws CFException {
        if (isMcgillCdModified()) { 
           mcgillCd = refreshMcgillCd();
        }
   		return mcgillCd;
	}
	
	/**
	 * 	Update McgillCd with the passed value
	 *  Corresponding COBOL Variable is MCGILL-CD
	 *	@param number
	 */
	public void setMcgillCd(int number) {
			mcgillCd = checkMcgillCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMcgillCd(mcgillCd);
	}


	public void setMcgillCd(long number) {
	    number = checkMcgillCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMcgillCd((int)number);
	}
	
	/**
	 *	Returns the value of cusipCntraNbr
	 *	@return cusipCntraNbr
	 */
   public char[] getCusipCntraNbr() throws CFException{
     if (isCusipCntraNbrModified()) { 
        cusipCntraNbr = refreshCusipCntraNbr();
     }
   		return cusipCntraNbr;
   }

  
	/**
	*  set variable cusipCntraNbr
	*  Corresponding COBOL Variable is CUSIP-CNTRA-NBR
	*  @param value
	**/
   public void setCusipCntraNbr(char[] value) {
      cusipCntraNbr = checkCusipCntraNbrConstraints(value);
      serializeCusipCntraNbr(cusipCntraNbr);
   } 

     /**
	 * 	Update CusipCntraNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusipCntraNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusipCntraNbr,cusipCntraNbr.length);
   	
   }
   
   public void setCusipCntraNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusipCntraNbr,cusipCntraNbr.length);
   	
   }
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusipCntraNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusipCntraNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusipCntraNbr with another Field
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source) {
       replace(source,0,source.length(),beginCusipCntraNbr,CUSIP_CNTRA_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusipCntraNbr,CUSIP_CNTRA_NBR_LEN);
   	
   }
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusipCntraNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of classInd
	 *	@return classInd
	 */
   public char[] getClassInd() throws CFException{
     if (isClassIndModified()) { 
        classInd = refreshClassInd();
     }
   		return classInd;
   }

  
	/**
	*  set variable classInd
	*  Corresponding COBOL Variable is CLASS-IND
	*  @param value
	**/
   public void setClassInd(char[] value) {
      classInd = checkClassIndConstraints(value);
      serializeClassInd(classInd);
   } 

     /**
	 * 	Update ClassInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClassInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClassInd,classInd.length);
   	
   }
   
   public void setClassInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClassInd,classInd.length);
   	
   }
   
     /**
	 * 	Update ClassInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClassInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClassInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClassInd with another Field
	 *	@param value
	 */
   public void setClassInd(Field source) {
       replace(source,0,source.length(),beginClassInd,CLASS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update ClassInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClassInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClassInd,CLASS_IND_LEN);
   	
   }
   
     /**
	 * 	Update ClassInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClassInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClassInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of symblTrdsAsCd
	 *	@return symblTrdsAsCd
	 */
   public char[] getSymblTrdsAsCd() throws CFException{
     if (isSymblTrdsAsCdModified()) { 
        symblTrdsAsCd = refreshSymblTrdsAsCd();
     }
   		return symblTrdsAsCd;
   }

  
	/**
	*  set variable symblTrdsAsCd
	*  Corresponding COBOL Variable is SYMBL-TRDS-AS-CD
	*  @param value
	**/
   public void setSymblTrdsAsCd(char[] value) {
      symblTrdsAsCd = checkSymblTrdsAsCdConstraints(value);
      serializeSymblTrdsAsCd(symblTrdsAsCd);
   } 

     /**
	 * 	Update SymblTrdsAsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSymblTrdsAsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSymblTrdsAsCd,symblTrdsAsCd.length);
   	
   }
   
   public void setSymblTrdsAsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsAsCd,symblTrdsAsCd.length);
   	
   }
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsAsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsAsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SymblTrdsAsCd with another Field
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source) {
       replace(source,0,source.length(),beginSymblTrdsAsCd,SYMBL_TRDS_AS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSymblTrdsAsCd,SYMBL_TRDS_AS_CD_LEN);
   	
   }
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsAsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of symblTrdsWhiCd
	 *	@return symblTrdsWhiCd
	 */
   public char[] getSymblTrdsWhiCd() throws CFException{
     if (isSymblTrdsWhiCdModified()) { 
        symblTrdsWhiCd = refreshSymblTrdsWhiCd();
     }
   		return symblTrdsWhiCd;
   }

  
	/**
	*  set variable symblTrdsWhiCd
	*  Corresponding COBOL Variable is SYMBL-TRDS-WHI-CD
	*  @param value
	**/
   public void setSymblTrdsWhiCd(char[] value) {
      symblTrdsWhiCd = checkSymblTrdsWhiCdConstraints(value);
      serializeSymblTrdsWhiCd(symblTrdsWhiCd);
   } 

     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSymblTrdsWhiCd,symblTrdsWhiCd.length);
   	
   }
   
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsWhiCd,symblTrdsWhiCd.length);
   	
   }
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsWhiCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SymblTrdsWhiCd with another Field
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source) {
       replace(source,0,source.length(),beginSymblTrdsWhiCd,SYMBL_TRDS_WHI_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSymblTrdsWhiCd,SYMBL_TRDS_WHI_CD_LEN);
   	
   }
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymblTrdsWhiCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secLckdInd
	 *	@return secLckdInd
	 */
   public char[] getSecLckdInd() throws CFException{
     if (isSecLckdIndModified()) { 
        secLckdInd = refreshSecLckdInd();
     }
   		return secLckdInd;
   }

  
	/**
	*  set variable secLckdInd
	*  Corresponding COBOL Variable is SEC-LCKD-IND
	*  @param value
	**/
   public void setSecLckdInd(char[] value) {
      secLckdInd = checkSecLckdIndConstraints(value);
      serializeSecLckdInd(secLckdInd);
   } 

     /**
	 * 	Update SecLckdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecLckdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecLckdInd,secLckdInd.length);
   	
   }
   
   public void setSecLckdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecLckdInd,secLckdInd.length);
   	
   }
   
     /**
	 * 	Update SecLckdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecLckdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecLckdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecLckdInd with another Field
	 *	@param value
	 */
   public void setSecLckdInd(Field source) {
       replace(source,0,source.length(),beginSecLckdInd,SEC_LCKD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update SecLckdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecLckdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecLckdInd,SEC_LCKD_IND_LEN);
   	
   }
   
     /**
	 * 	Update SecLckdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecLckdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecLckdInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDclvmstranbFieldLength() {
			return DCLVMSTRANB_LENGTH;
		}

}
  
