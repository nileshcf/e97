package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01AdpMasterExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01AdpMasterExpData extends Bdms01AdpMasterExpDataSerialized { 
   

								private long bdms01EisNumber;

						private char[] bdms01EisCntry = Field.fillLowValue(2);

						private char[] bdms01SecLckdInd = Field.fillLowValue(1);

						private char[] bdms01FatcaCd = Field.fillLowValue(1);

						private char[] bdms01MtrlMdfdDt = Field.fillLowValue(10);

						private char[] bdms01FatcaOvrrdCd = Field.fillLowValue(1);

						private char[] bdms01FatcaCdCalcInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01AdpMasterExpData
	**/
    public Bdms01AdpMasterExpData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01AdpMasterExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01EisNumber
	 *	@return bdms01EisNumber
	 */
	public long getBdms01EisNumber() throws CFException {
       if (isBdms01EisNumberModified()) { 
           bdms01EisNumber = refreshBdms01EisNumber();
        }
   		return bdms01EisNumber;
	}
	

	
	   
	/**
	 * 	Update Bdms01EisNumber with the passed value
	 *  Corresponding COBOL Variable is BDMS01-EIS-NUMBER
	 *	@param number
	 */
	public void setBdms01EisNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01EisNumber = checkBdms01EisNumberMaxLimit(number); 
		serializeBdms01EisNumber(bdms01EisNumber);
	}
	

	/**
	 * 	Update Bdms01EisNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01EisNumber(char[] value) throws CFException {
		 bdms01EisNumber = serializeBdms01EisNumber(value);
	}
	/**
	 * 	Update Bdms01EisNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01EisNumberString(char[] value) throws CFException {
		 setBdms01EisNumber(value);
	}
	/**
	 *	Returns the value of bdms01EisCntry
	 *	@return bdms01EisCntry
	 */
   public char[] getBdms01EisCntry() throws CFException{
     if (isBdms01EisCntryModified()) { 
        bdms01EisCntry = refreshBdms01EisCntry();
     }
   		return bdms01EisCntry;
   }

  
	/**
	*  set variable bdms01EisCntry
	*  Corresponding COBOL Variable is BDMS01-EIS-CNTRY
	*  @param value
	**/
   public void setBdms01EisCntry(char[] value) {
      bdms01EisCntry = checkBdms01EisCntryConstraints(value);
      serializeBdms01EisCntry(bdms01EisCntry);
   } 

     /**
	 * 	Update Bdms01EisCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EisCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EisCntry,bdms01EisCntry.length);
   	
   }
   
   public void setBdms01EisCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EisCntry,bdms01EisCntry.length);
   	
   }
   
     /**
	 * 	Update Bdms01EisCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EisCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EisCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EisCntry with another Field
	 *	@param value
	 */
   public void setBdms01EisCntry(Field source) {
       replace(source,0,source.length(),beginBdms01EisCntry,BDMS_01_EIS_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EisCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EisCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EisCntry,BDMS_01_EIS_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EisCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EisCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EisCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecLckdInd
	 *	@return bdms01SecLckdInd
	 */
   public char[] getBdms01SecLckdInd() throws CFException{
     if (isBdms01SecLckdIndModified()) { 
        bdms01SecLckdInd = refreshBdms01SecLckdInd();
     }
   		return bdms01SecLckdInd;
   }

  
	/**
	*  set variable bdms01SecLckdInd
	*  Corresponding COBOL Variable is BDMS01-SEC-LCKD-IND
	*  @param value
	**/
   public void setBdms01SecLckdInd(char[] value) {
      bdms01SecLckdInd = checkBdms01SecLckdIndConstraints(value);
      serializeBdms01SecLckdInd(bdms01SecLckdInd);
   } 

     /**
	 * 	Update Bdms01SecLckdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecLckdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecLckdInd,bdms01SecLckdInd.length);
   	
   }
   
   public void setBdms01SecLckdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecLckdInd,bdms01SecLckdInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecLckdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecLckdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecLckdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecLckdInd with another Field
	 *	@param value
	 */
   public void setBdms01SecLckdInd(Field source) {
       replace(source,0,source.length(),beginBdms01SecLckdInd,BDMS_01_SEC_LCKD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecLckdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecLckdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecLckdInd,BDMS_01_SEC_LCKD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecLckdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecLckdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecLckdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FatcaCd
	 *	@return bdms01FatcaCd
	 */
   public char[] getBdms01FatcaCd() throws CFException{
     if (isBdms01FatcaCdModified()) { 
        bdms01FatcaCd = refreshBdms01FatcaCd();
     }
   		return bdms01FatcaCd;
   }

  
	/**
	*  set variable bdms01FatcaCd
	*  Corresponding COBOL Variable is BDMS01-FATCA-CD
	*  @param value
	**/
   public void setBdms01FatcaCd(char[] value) {
      bdms01FatcaCd = checkBdms01FatcaCdConstraints(value);
      serializeBdms01FatcaCd(bdms01FatcaCd);
   } 

     /**
	 * 	Update Bdms01FatcaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FatcaCd,bdms01FatcaCd.length);
   	
   }
   
   public void setBdms01FatcaCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCd,bdms01FatcaCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FatcaCd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source) {
       replace(source,0,source.length(),beginBdms01FatcaCd,BDMS_01_FATCA_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FatcaCd,BDMS_01_FATCA_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MtrlMdfdDt
	 *	@return bdms01MtrlMdfdDt
	 */
   public char[] getBdms01MtrlMdfdDt() throws CFException{
     if (isBdms01MtrlMdfdDtModified()) { 
        bdms01MtrlMdfdDt = refreshBdms01MtrlMdfdDt();
     }
   		return bdms01MtrlMdfdDt;
   }

  
	/**
	*  set variable bdms01MtrlMdfdDt
	*  Corresponding COBOL Variable is BDMS01-MTRL-MDFD-DT
	*  @param value
	**/
   public void setBdms01MtrlMdfdDt(char[] value) {
      bdms01MtrlMdfdDt = checkBdms01MtrlMdfdDtConstraints(value);
      serializeBdms01MtrlMdfdDt(bdms01MtrlMdfdDt);
   } 

     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MtrlMdfdDt,bdms01MtrlMdfdDt.length);
   	
   }
   
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrlMdfdDt,bdms01MtrlMdfdDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrlMdfdDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MtrlMdfdDt with another Field
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source) {
       replace(source,0,source.length(),beginBdms01MtrlMdfdDt,BDMS_01_MTRL_MDFD_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MtrlMdfdDt,BDMS_01_MTRL_MDFD_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrlMdfdDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FatcaOvrrdCd
	 *	@return bdms01FatcaOvrrdCd
	 */
   public char[] getBdms01FatcaOvrrdCd() throws CFException{
     if (isBdms01FatcaOvrrdCdModified()) { 
        bdms01FatcaOvrrdCd = refreshBdms01FatcaOvrrdCd();
     }
   		return bdms01FatcaOvrrdCd;
   }

  
	/**
	*  set variable bdms01FatcaOvrrdCd
	*  Corresponding COBOL Variable is BDMS01-FATCA-OVRRD-CD
	*  @param value
	**/
   public void setBdms01FatcaOvrrdCd(char[] value) {
      bdms01FatcaOvrrdCd = checkBdms01FatcaOvrrdCdConstraints(value);
      serializeBdms01FatcaOvrrdCd(bdms01FatcaOvrrdCd);
   } 

     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FatcaOvrrdCd,bdms01FatcaOvrrdCd.length);
   	
   }
   
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaOvrrdCd,bdms01FatcaOvrrdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaOvrrdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FatcaOvrrdCd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source) {
       replace(source,0,source.length(),beginBdms01FatcaOvrrdCd,BDMS_01_FATCA_OVRRD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FatcaOvrrdCd,BDMS_01_FATCA_OVRRD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaOvrrdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FatcaCdCalcInd
	 *	@return bdms01FatcaCdCalcInd
	 */
   public char[] getBdms01FatcaCdCalcInd() throws CFException{
     if (isBdms01FatcaCdCalcIndModified()) { 
        bdms01FatcaCdCalcInd = refreshBdms01FatcaCdCalcInd();
     }
   		return bdms01FatcaCdCalcInd;
   }

  
	/**
	*  set variable bdms01FatcaCdCalcInd
	*  Corresponding COBOL Variable is BDMS01-FATCA-CD-CALC-IND
	*  @param value
	**/
   public void setBdms01FatcaCdCalcInd(char[] value) {
      bdms01FatcaCdCalcInd = checkBdms01FatcaCdCalcIndConstraints(value);
      serializeBdms01FatcaCdCalcInd(bdms01FatcaCdCalcInd);
   } 

     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FatcaCdCalcInd,bdms01FatcaCdCalcInd.length);
   	
   }
   
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCdCalcInd,bdms01FatcaCdCalcInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCdCalcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FatcaCdCalcInd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source) {
       replace(source,0,source.length(),beginBdms01FatcaCdCalcInd,BDMS_01_FATCA_CD_CALC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FatcaCdCalcInd,BDMS_01_FATCA_CD_CALC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FatcaCdCalcInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01AdpMasterExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01EisNumber(0);
         setBdms01EisCntry(CONSTANTS.SPACE_2);
         setBdms01SecLckdInd(CONSTANTS.SPACE);
         setBdms01FatcaCd(CONSTANTS.SPACE);
         setBdms01MtrlMdfdDt(CONSTANTS.SPACE_10);
         setBdms01FatcaOvrrdCd(CONSTANTS.SPACE);
         setBdms01FatcaCdCalcInd(CONSTANTS.SPACE);
   }

		public static int getBdms01AdpMasterExpDataFieldLength() {
			return BDMS_01_ADP_MASTER_EXP_DATA_LENGTH;
		}

}
  
