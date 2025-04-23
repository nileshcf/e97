package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01CvrsnTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01CvrsnTable extends Bdms01CvrsnTableSerialized { 
   

								private BigDecimal bdms01CvrsnCvtblRt = BigDecimal.ZERO;

						private char[] bdms01CvrsnCvtblExerCd = Field.fillLowValue(4);

						private char[] bdms01CvrsnCvtblExpDt = Field.fillLowValue(10);

						private char[] bdms01CvrsnExerSecId = Field.fillLowValue(12);

						private char[] bdms01CvrsnExerCncyCd = Field.fillLowValue(3);

								private BigDecimal bdms01CvrsnCvtblPrcAmt = BigDecimal.ZERO;

						private char[] bdms01CvrsnExerSecCd = Field.fillLowValue(1);

								private BigDecimal bdms01CvrsnExerExchRt = BigDecimal.ZERO;

						private char[] bdms01CvrsnExerRtCd = Field.fillLowValue(1);

						private char[] bdms01CvrsnExerPrcCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01CvrsnTable
	**/
    public Bdms01CvrsnTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01CvrsnTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01CvrsnCvtblRt
	 *	@return bdms01CvrsnCvtblRt
	 */
	public BigDecimal getBdms01CvrsnCvtblRt() throws CFException {
       if (isBdms01CvrsnCvtblRtModified()) { 
           bdms01CvrsnCvtblRt = refreshBdms01CvrsnCvtblRt();
        }
   		return bdms01CvrsnCvtblRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnCvtblRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-CVTBL-RT
	 *	@param number
	 */
	public void setBdms01CvrsnCvtblRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CvrsnCvtblRt = checkBdms01CvrsnCvtblRtMaxLimit(number);
	    serializeBdms01CvrsnCvtblRt(bdms01CvrsnCvtblRt);
   }
	/**
	 * 	Update Bdms01CvrsnCvtblRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnCvtblRt(char[] value) throws CFException {
		 bdms01CvrsnCvtblRt = serializeBdms01CvrsnCvtblRt(value);
	}   
	/**
	 *	Returns the value of bdms01CvrsnCvtblExerCd
	 *	@return bdms01CvrsnCvtblExerCd
	 */
   public char[] getBdms01CvrsnCvtblExerCd() throws CFException{
     if (isBdms01CvrsnCvtblExerCdModified()) { 
        bdms01CvrsnCvtblExerCd = refreshBdms01CvrsnCvtblExerCd();
     }
   		return bdms01CvrsnCvtblExerCd;
   }

  
	/**
	*  set variable bdms01CvrsnCvtblExerCd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-CVTBL-EXER-CD
	*  @param value
	**/
   public void setBdms01CvrsnCvtblExerCd(char[] value) {
      bdms01CvrsnCvtblExerCd = checkBdms01CvrsnCvtblExerCdConstraints(value);
      serializeBdms01CvrsnCvtblExerCd(bdms01CvrsnCvtblExerCd);
   } 

     /**
	 * 	Update Bdms01CvrsnCvtblExerCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExerCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnCvtblExerCd,bdms01CvrsnCvtblExerCd.length);
   	
   }
   
   public void setBdms01CvrsnCvtblExerCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExerCd,bdms01CvrsnCvtblExerCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnCvtblExerCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExerCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExerCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnCvtblExerCd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExerCd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnCvtblExerCd,BDMS_01_CVRSN_CVTBL_EXER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnCvtblExerCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExerCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExerCd,BDMS_01_CVRSN_CVTBL_EXER_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnCvtblExerCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExerCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExerCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnCvtblExpDt
	 *	@return bdms01CvrsnCvtblExpDt
	 */
   public char[] getBdms01CvrsnCvtblExpDt() throws CFException{
     if (isBdms01CvrsnCvtblExpDtModified()) { 
        bdms01CvrsnCvtblExpDt = refreshBdms01CvrsnCvtblExpDt();
     }
   		return bdms01CvrsnCvtblExpDt;
   }

  
	/**
	*  set variable bdms01CvrsnCvtblExpDt
	*  Corresponding COBOL Variable is BDMS01-CVRSN-CVTBL-EXP-DT
	*  @param value
	**/
   public void setBdms01CvrsnCvtblExpDt(char[] value) {
      bdms01CvrsnCvtblExpDt = checkBdms01CvrsnCvtblExpDtConstraints(value);
      serializeBdms01CvrsnCvtblExpDt(bdms01CvrsnCvtblExpDt);
   } 

     /**
	 * 	Update Bdms01CvrsnCvtblExpDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExpDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnCvtblExpDt,bdms01CvrsnCvtblExpDt.length);
   	
   }
   
   public void setBdms01CvrsnCvtblExpDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExpDt,bdms01CvrsnCvtblExpDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnCvtblExpDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExpDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExpDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnCvtblExpDt with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExpDt(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnCvtblExpDt,BDMS_01_CVRSN_CVTBL_EXP_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnCvtblExpDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExpDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExpDt,BDMS_01_CVRSN_CVTBL_EXP_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnCvtblExpDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnCvtblExpDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnCvtblExpDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnExerSecId
	 *	@return bdms01CvrsnExerSecId
	 */
   public char[] getBdms01CvrsnExerSecId() throws CFException{
     if (isBdms01CvrsnExerSecIdModified()) { 
        bdms01CvrsnExerSecId = refreshBdms01CvrsnExerSecId();
     }
   		return bdms01CvrsnExerSecId;
   }

  
	/**
	*  set variable bdms01CvrsnExerSecId
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-SEC-ID
	*  @param value
	**/
   public void setBdms01CvrsnExerSecId(char[] value) {
      bdms01CvrsnExerSecId = checkBdms01CvrsnExerSecIdConstraints(value);
      serializeBdms01CvrsnExerSecId(bdms01CvrsnExerSecId);
   } 

     /**
	 * 	Update Bdms01CvrsnExerSecId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExerSecId,bdms01CvrsnExerSecId.length);
   	
   }
   
   public void setBdms01CvrsnExerSecId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecId,bdms01CvrsnExerSecId.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerSecId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExerSecId with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecId(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExerSecId,BDMS_01_CVRSN_EXER_SEC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExerSecId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecId,BDMS_01_CVRSN_EXER_SEC_ID_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerSecId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnExerCncyCd
	 *	@return bdms01CvrsnExerCncyCd
	 */
   public char[] getBdms01CvrsnExerCncyCd() throws CFException{
     if (isBdms01CvrsnExerCncyCdModified()) { 
        bdms01CvrsnExerCncyCd = refreshBdms01CvrsnExerCncyCd();
     }
   		return bdms01CvrsnExerCncyCd;
   }

  
	/**
	*  set variable bdms01CvrsnExerCncyCd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-CNCY-CD
	*  @param value
	**/
   public void setBdms01CvrsnExerCncyCd(char[] value) {
      bdms01CvrsnExerCncyCd = checkBdms01CvrsnExerCncyCdConstraints(value);
      serializeBdms01CvrsnExerCncyCd(bdms01CvrsnExerCncyCd);
   } 

     /**
	 * 	Update Bdms01CvrsnExerCncyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExerCncyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExerCncyCd,bdms01CvrsnExerCncyCd.length);
   	
   }
   
   public void setBdms01CvrsnExerCncyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerCncyCd,bdms01CvrsnExerCncyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerCncyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerCncyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerCncyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExerCncyCd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExerCncyCd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExerCncyCd,BDMS_01_CVRSN_EXER_CNCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExerCncyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExerCncyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerCncyCd,BDMS_01_CVRSN_EXER_CNCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerCncyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerCncyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerCncyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnCvtblPrcAmt
	 *	@return bdms01CvrsnCvtblPrcAmt
	 */
	public BigDecimal getBdms01CvrsnCvtblPrcAmt() throws CFException {
       if (isBdms01CvrsnCvtblPrcAmtModified()) { 
           bdms01CvrsnCvtblPrcAmt = refreshBdms01CvrsnCvtblPrcAmt();
        }
   		return bdms01CvrsnCvtblPrcAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnCvtblPrcAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-CVTBL-PRC-AMT
	 *	@param number
	 */
	public void setBdms01CvrsnCvtblPrcAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CvrsnCvtblPrcAmt = checkBdms01CvrsnCvtblPrcAmtMaxLimit(number);
	    serializeBdms01CvrsnCvtblPrcAmt(bdms01CvrsnCvtblPrcAmt);
   }
	/**
	 * 	Update Bdms01CvrsnCvtblPrcAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnCvtblPrcAmt(char[] value) throws CFException {
		 bdms01CvrsnCvtblPrcAmt = serializeBdms01CvrsnCvtblPrcAmt(value);
	}   
	/**
	 *	Returns the value of bdms01CvrsnExerSecCd
	 *	@return bdms01CvrsnExerSecCd
	 */
   public char[] getBdms01CvrsnExerSecCd() throws CFException{
     if (isBdms01CvrsnExerSecCdModified()) { 
        bdms01CvrsnExerSecCd = refreshBdms01CvrsnExerSecCd();
     }
   		return bdms01CvrsnExerSecCd;
   }

  
	/**
	*  set variable bdms01CvrsnExerSecCd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-SEC-CD
	*  @param value
	**/
   public void setBdms01CvrsnExerSecCd(char[] value) {
      bdms01CvrsnExerSecCd = checkBdms01CvrsnExerSecCdConstraints(value);
      serializeBdms01CvrsnExerSecCd(bdms01CvrsnExerSecCd);
   } 

     /**
	 * 	Update Bdms01CvrsnExerSecCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExerSecCd,bdms01CvrsnExerSecCd.length);
   	
   }
   
   public void setBdms01CvrsnExerSecCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecCd,bdms01CvrsnExerSecCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerSecCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExerSecCd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecCd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExerSecCd,BDMS_01_CVRSN_EXER_SEC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExerSecCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecCd,BDMS_01_CVRSN_EXER_SEC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerSecCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerSecCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerSecCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnExerExchRt
	 *	@return bdms01CvrsnExerExchRt
	 */
	public BigDecimal getBdms01CvrsnExerExchRt() throws CFException {
       if (isBdms01CvrsnExerExchRtModified()) { 
           bdms01CvrsnExerExchRt = refreshBdms01CvrsnExerExchRt();
        }
   		return bdms01CvrsnExerExchRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnExerExchRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-EXCH-RT
	 *	@param number
	 */
	public void setBdms01CvrsnExerExchRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CvrsnExerExchRt = checkBdms01CvrsnExerExchRtMaxLimit(number);
	    serializeBdms01CvrsnExerExchRt(bdms01CvrsnExerExchRt);
   }
	/**
	 * 	Update Bdms01CvrsnExerExchRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnExerExchRt(char[] value) throws CFException {
		 bdms01CvrsnExerExchRt = serializeBdms01CvrsnExerExchRt(value);
	}   
	/**
	 *	Returns the value of bdms01CvrsnExerRtCd
	 *	@return bdms01CvrsnExerRtCd
	 */
   public char[] getBdms01CvrsnExerRtCd() throws CFException{
     if (isBdms01CvrsnExerRtCdModified()) { 
        bdms01CvrsnExerRtCd = refreshBdms01CvrsnExerRtCd();
     }
   		return bdms01CvrsnExerRtCd;
   }

  
	/**
	*  set variable bdms01CvrsnExerRtCd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-RT-CD
	*  @param value
	**/
   public void setBdms01CvrsnExerRtCd(char[] value) {
      bdms01CvrsnExerRtCd = checkBdms01CvrsnExerRtCdConstraints(value);
      serializeBdms01CvrsnExerRtCd(bdms01CvrsnExerRtCd);
   } 

     /**
	 * 	Update Bdms01CvrsnExerRtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExerRtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExerRtCd,bdms01CvrsnExerRtCd.length);
   	
   }
   
   public void setBdms01CvrsnExerRtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerRtCd,bdms01CvrsnExerRtCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerRtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerRtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerRtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExerRtCd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExerRtCd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExerRtCd,BDMS_01_CVRSN_EXER_RT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExerRtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExerRtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerRtCd,BDMS_01_CVRSN_EXER_RT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerRtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerRtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerRtCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnExerPrcCd
	 *	@return bdms01CvrsnExerPrcCd
	 */
   public char[] getBdms01CvrsnExerPrcCd() throws CFException{
     if (isBdms01CvrsnExerPrcCdModified()) { 
        bdms01CvrsnExerPrcCd = refreshBdms01CvrsnExerPrcCd();
     }
   		return bdms01CvrsnExerPrcCd;
   }

  
	/**
	*  set variable bdms01CvrsnExerPrcCd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXER-PRC-CD
	*  @param value
	**/
   public void setBdms01CvrsnExerPrcCd(char[] value) {
      bdms01CvrsnExerPrcCd = checkBdms01CvrsnExerPrcCdConstraints(value);
      serializeBdms01CvrsnExerPrcCd(bdms01CvrsnExerPrcCd);
   } 

     /**
	 * 	Update Bdms01CvrsnExerPrcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExerPrcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExerPrcCd,bdms01CvrsnExerPrcCd.length);
   	
   }
   
   public void setBdms01CvrsnExerPrcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerPrcCd,bdms01CvrsnExerPrcCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerPrcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerPrcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerPrcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExerPrcCd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExerPrcCd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExerPrcCd,BDMS_01_CVRSN_EXER_PRC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExerPrcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExerPrcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerPrcCd,BDMS_01_CVRSN_EXER_PRC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExerPrcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExerPrcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExerPrcCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01CvrsnTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
			setBdms01CvrsnCvtblRt(BigDecimal.ZERO);
         setBdms01CvrsnCvtblExerCd(CONSTANTS.SPACE_4);
         setBdms01CvrsnCvtblExpDt(CONSTANTS.SPACE_10);
         setBdms01CvrsnExerSecId(CONSTANTS.SPACE_12);
         setBdms01CvrsnExerCncyCd(CONSTANTS.SPACE_3);
			setBdms01CvrsnCvtblPrcAmt(BigDecimal.ZERO);
         setBdms01CvrsnExerSecCd(CONSTANTS.SPACE);
			setBdms01CvrsnExerExchRt(BigDecimal.ZERO);
         setBdms01CvrsnExerRtCd(CONSTANTS.SPACE);
         setBdms01CvrsnExerPrcCd(CONSTANTS.SPACE);
   }

		public static int getBdms01CvrsnTableFieldLength() {
			return BDMS_01_CVRSN_TABLE_LENGTH;
		}

}
  
