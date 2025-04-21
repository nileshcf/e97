package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01TaxSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01TaxSegData extends Bdms01TaxSegDataSerialized { 
   

								private int bdms01TaxSegSqlcd;

						private char[] bdms01EffectiveTaxDt = Field.fillLowValue(10);

						private char[] bdms01TaxCountryCd = Field.fillLowValue(2);

						private char[] bdms01EligTaxCrdtInd = Field.fillLowValue(1);

						private char[] bdms01StatusTaxCd = Field.fillLowValue(1);

								private BigDecimal bdms01TaxWitholdRt = BigDecimal.ZERO;

								private BigDecimal bdms01TaxCreditRt = BigDecimal.ZERO;

	
	/**
	* Constructor for Bdms01TaxSegData
	**/
    public Bdms01TaxSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01TaxSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TaxSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01TaxSegSqlcd
	 *	@return bdms01TaxSegSqlcd
	 */
	public int getBdms01TaxSegSqlcd() throws CFException {
       if (isBdms01TaxSegSqlcdModified()) { 
           bdms01TaxSegSqlcd = refreshBdms01TaxSegSqlcd();
        }
   		return bdms01TaxSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01TaxSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-TAX-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01TaxSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01TaxSegSqlcd = checkBdms01TaxSegSqlcdMaxLimit(number); 
		serializeBdms01TaxSegSqlcd(bdms01TaxSegSqlcd);
	}
	

	public void setBdms01TaxSegSqlcd(long number) {
	    number = checkBdms01TaxSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01TaxSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01TaxSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01TaxSegSqlcd(char[] value) throws CFException {
		 bdms01TaxSegSqlcd = serializeBdms01TaxSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01TaxSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01TaxSegSqlcdString(char[] value) throws CFException {
		 setBdms01TaxSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01EffectiveTaxDt
	 *	@return bdms01EffectiveTaxDt
	 */
   public char[] getBdms01EffectiveTaxDt() throws CFException{
     if (isBdms01EffectiveTaxDtModified()) { 
        bdms01EffectiveTaxDt = refreshBdms01EffectiveTaxDt();
     }
   		return bdms01EffectiveTaxDt;
   }

  
	/**
	*  set variable bdms01EffectiveTaxDt
	*  Corresponding COBOL Variable is BDMS01-EFFECTIVE-TAX-DT
	*  @param value
	**/
   public void setBdms01EffectiveTaxDt(char[] value) {
      bdms01EffectiveTaxDt = checkBdms01EffectiveTaxDtConstraints(value);
      serializeBdms01EffectiveTaxDt(bdms01EffectiveTaxDt);
   } 

     /**
	 * 	Update Bdms01EffectiveTaxDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EffectiveTaxDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EffectiveTaxDt,bdms01EffectiveTaxDt.length);
   	
   }
   
   public void setBdms01EffectiveTaxDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EffectiveTaxDt,bdms01EffectiveTaxDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01EffectiveTaxDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EffectiveTaxDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EffectiveTaxDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EffectiveTaxDt with another Field
	 *	@param value
	 */
   public void setBdms01EffectiveTaxDt(Field source) {
       replace(source,0,source.length(),beginBdms01EffectiveTaxDt,BDMS_01_EFFECTIVE_TAX_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EffectiveTaxDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EffectiveTaxDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EffectiveTaxDt,BDMS_01_EFFECTIVE_TAX_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EffectiveTaxDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EffectiveTaxDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EffectiveTaxDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TaxCountryCd
	 *	@return bdms01TaxCountryCd
	 */
   public char[] getBdms01TaxCountryCd() throws CFException{
     if (isBdms01TaxCountryCdModified()) { 
        bdms01TaxCountryCd = refreshBdms01TaxCountryCd();
     }
   		return bdms01TaxCountryCd;
   }

  
	/**
	*  set variable bdms01TaxCountryCd
	*  Corresponding COBOL Variable is BDMS01-TAX-COUNTRY-CD
	*  @param value
	**/
   public void setBdms01TaxCountryCd(char[] value) {
      bdms01TaxCountryCd = checkBdms01TaxCountryCdConstraints(value);
      serializeBdms01TaxCountryCd(bdms01TaxCountryCd);
   } 

     /**
	 * 	Update Bdms01TaxCountryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxCountryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TaxCountryCd,bdms01TaxCountryCd.length);
   	
   }
   
   public void setBdms01TaxCountryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxCountryCd,bdms01TaxCountryCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TaxCountryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxCountryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxCountryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TaxCountryCd with another Field
	 *	@param value
	 */
   public void setBdms01TaxCountryCd(Field source) {
       replace(source,0,source.length(),beginBdms01TaxCountryCd,BDMS_01_TAX_COUNTRY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TaxCountryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TaxCountryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TaxCountryCd,BDMS_01_TAX_COUNTRY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TaxCountryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxCountryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxCountryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EligTaxCrdtInd
	 *	@return bdms01EligTaxCrdtInd
	 */
   public char[] getBdms01EligTaxCrdtInd() throws CFException{
     if (isBdms01EligTaxCrdtIndModified()) { 
        bdms01EligTaxCrdtInd = refreshBdms01EligTaxCrdtInd();
     }
   		return bdms01EligTaxCrdtInd;
   }

  
	/**
	*  set variable bdms01EligTaxCrdtInd
	*  Corresponding COBOL Variable is BDMS01-ELIG-TAX-CRDT-IND
	*  @param value
	**/
   public void setBdms01EligTaxCrdtInd(char[] value) {
      bdms01EligTaxCrdtInd = checkBdms01EligTaxCrdtIndConstraints(value);
      serializeBdms01EligTaxCrdtInd(bdms01EligTaxCrdtInd);
   } 

     /**
	 * 	Update Bdms01EligTaxCrdtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EligTaxCrdtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EligTaxCrdtInd,bdms01EligTaxCrdtInd.length);
   	
   }
   
   public void setBdms01EligTaxCrdtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EligTaxCrdtInd,bdms01EligTaxCrdtInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EligTaxCrdtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EligTaxCrdtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EligTaxCrdtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EligTaxCrdtInd with another Field
	 *	@param value
	 */
   public void setBdms01EligTaxCrdtInd(Field source) {
       replace(source,0,source.length(),beginBdms01EligTaxCrdtInd,BDMS_01_ELIG_TAX_CRDT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EligTaxCrdtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EligTaxCrdtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EligTaxCrdtInd,BDMS_01_ELIG_TAX_CRDT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EligTaxCrdtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EligTaxCrdtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EligTaxCrdtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StatusTaxCd
	 *	@return bdms01StatusTaxCd
	 */
   public char[] getBdms01StatusTaxCd() throws CFException{
     if (isBdms01StatusTaxCdModified()) { 
        bdms01StatusTaxCd = refreshBdms01StatusTaxCd();
     }
   		return bdms01StatusTaxCd;
   }

  
	/**
	*  set variable bdms01StatusTaxCd
	*  Corresponding COBOL Variable is BDMS01-STATUS-TAX-CD
	*  @param value
	**/
   public void setBdms01StatusTaxCd(char[] value) {
      bdms01StatusTaxCd = checkBdms01StatusTaxCdConstraints(value);
      serializeBdms01StatusTaxCd(bdms01StatusTaxCd);
   } 

     /**
	 * 	Update Bdms01StatusTaxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StatusTaxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StatusTaxCd,bdms01StatusTaxCd.length);
   	
   }
   
   public void setBdms01StatusTaxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StatusTaxCd,bdms01StatusTaxCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StatusTaxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StatusTaxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StatusTaxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StatusTaxCd with another Field
	 *	@param value
	 */
   public void setBdms01StatusTaxCd(Field source) {
       replace(source,0,source.length(),beginBdms01StatusTaxCd,BDMS_01_STATUS_TAX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StatusTaxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StatusTaxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StatusTaxCd,BDMS_01_STATUS_TAX_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StatusTaxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StatusTaxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StatusTaxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TaxWitholdRt
	 *	@return bdms01TaxWitholdRt
	 */
	public BigDecimal getBdms01TaxWitholdRt() throws CFException {
       if (isBdms01TaxWitholdRtModified()) { 
           bdms01TaxWitholdRt = refreshBdms01TaxWitholdRt();
        }
   		return bdms01TaxWitholdRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01TaxWitholdRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-TAX-WITHOLD-RT
	 *	@param number
	 */
	public void setBdms01TaxWitholdRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01TaxWitholdRt = checkBdms01TaxWitholdRtMaxLimit(number);
	    serializeBdms01TaxWitholdRt(bdms01TaxWitholdRt);
   }
	/**
	 * 	Update Bdms01TaxWitholdRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01TaxWitholdRt(char[] value) throws CFException {
		 bdms01TaxWitholdRt = serializeBdms01TaxWitholdRt(value);
	}   
	/**
	 *	Returns the value of bdms01TaxCreditRt
	 *	@return bdms01TaxCreditRt
	 */
	public BigDecimal getBdms01TaxCreditRt() throws CFException {
       if (isBdms01TaxCreditRtModified()) { 
           bdms01TaxCreditRt = refreshBdms01TaxCreditRt();
        }
   		return bdms01TaxCreditRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01TaxCreditRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-TAX-CREDIT-RT
	 *	@param number
	 */
	public void setBdms01TaxCreditRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01TaxCreditRt = checkBdms01TaxCreditRtMaxLimit(number);
	    serializeBdms01TaxCreditRt(bdms01TaxCreditRt);
   }
	/**
	 * 	Update Bdms01TaxCreditRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01TaxCreditRt(char[] value) throws CFException {
		 bdms01TaxCreditRt = serializeBdms01TaxCreditRt(value);
	}   

	
	
	
	/**
	 * 	initializes Bdms01TaxSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01TaxSegSqlcd(0);
         setBdms01EffectiveTaxDt(CONSTANTS.SPACE_10);
         setBdms01TaxCountryCd(CONSTANTS.SPACE_2);
         setBdms01EligTaxCrdtInd(CONSTANTS.SPACE);
         setBdms01StatusTaxCd(CONSTANTS.SPACE);
			setBdms01TaxWitholdRt(BigDecimal.ZERO);
			setBdms01TaxCreditRt(BigDecimal.ZERO);
   }

		public static int getBdms01TaxSegDataFieldLength() {
			return BDMS_01_TAX_SEG_DATA_LENGTH;
		}

}
  
