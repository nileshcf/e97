package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondFeatureSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BondFeatureSegData extends Bdms01BondFeatureSegDataSerialized { 
   

								private int bdms01BondFeatureSegSqlcd;
				private MsdBondCallMmddyycc msdBondCallMmddyycc = new MsdBondCallMmddyycc();

								private BigDecimal msdBondCallPrice = BigDecimal.ZERO;

						private char[] bdms01CallRateBondDt = Field.fillLowValue(10);

						private char[] bdms01CallTypePutCd = Field.fillLowValue(1);

						private char[] bdms01CallFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01CallRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01CallSelectionBondCd = Field.fillLowValue(2);
				private MsdBondPutMmddyycc msdBondPutMmddyycc = new MsdBondPutMmddyycc();

								private BigDecimal msdBondPutPrice = BigDecimal.ZERO;

						private char[] bdms01PutRateBondDt = Field.fillLowValue(10);

						private char[] bdms01PutTypePutCd = Field.fillLowValue(1);

						private char[] msdBondPutType = Field.fillLowValue(1);

						private char[] bdms01PutFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01PutRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01PutSelectionBondCd = Field.fillLowValue(2);

								private long msdBndPrerefDate;

								private BigDecimal msdBndPrerefPrice = BigDecimal.ZERO;

						private char[] bdms01PrerefRateBondDt = Field.fillLowValue(10);

						private char[] bdms01PrefTypePutCd = Field.fillLowValue(1);

						private char[] bdms01PrefFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01PrefRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01PrefSelectionBondCd = Field.fillLowValue(2);

								private long msdBondParCallDate;

								private BigDecimal msdBondParCallPrice = BigDecimal.ZERO;

						private char[] bdms01PcRateBondDt = Field.fillLowValue(10);

						private char[] bdms01PcTypePutCd = Field.fillLowValue(1);

						private char[] bdms01PcFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01PcRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01PcSelectionBondCd = Field.fillLowValue(2);

						private char[] bdms01BndRefundDate = Field.fillLowValue(10);

								private BigDecimal bdms01BndRefundPrice = BigDecimal.ZERO;

						private char[] bdms01RfTypePutCd = Field.fillLowValue(1);

						private char[] bdms01RfFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01RfRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01RfSelectionBondCd = Field.fillLowValue(2);

						private char[] bdms01AddtlPutDate = Field.fillLowValue(10);

								private BigDecimal bdms01AddtlPutPrice = BigDecimal.ZERO;

						private char[] bdms01PaTypePutCd = Field.fillLowValue(1);

						private char[] bdms01PaFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01PaRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01PaSelectionBondCd = Field.fillLowValue(2);

						private char[] bdms01BndOfferingDate = Field.fillLowValue(10);

								private BigDecimal bdms01BndOfferingPrice = BigDecimal.ZERO;

						private char[] bdms01ExTypePutCd = Field.fillLowValue(1);

						private char[] bdms01ExFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01ExRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01ExSelectionBondCd = Field.fillLowValue(2);

						private char[] bdms01BndRetractDate = Field.fillLowValue(10);

								private BigDecimal bdms01BndRetractPrice = BigDecimal.ZERO;

						private char[] bdms01RtTypePutCd = Field.fillLowValue(1);

						private char[] bdms01RtFeatureFrqncCd = Field.fillLowValue(2);

						private char[] bdms01RtRdmptPartialCd = Field.fillLowValue(2);

						private char[] bdms01RtSelectionBondCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01BondFeatureSegData
	**/
    public Bdms01BondFeatureSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BondFeatureSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFeatureSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdBondCallMmddyycc.setParent(this,getStartOffset() + 4);
	       			msdBondPutMmddyycc.setParent(this,getStartOffset() + 47);
    } 

	/**
	 *	Returns the value of bdms01BondFeatureSegSqlcd
	 *	@return bdms01BondFeatureSegSqlcd
	 */
	public int getBdms01BondFeatureSegSqlcd() throws CFException {
       if (isBdms01BondFeatureSegSqlcdModified()) { 
           bdms01BondFeatureSegSqlcd = refreshBdms01BondFeatureSegSqlcd();
        }
   		return bdms01BondFeatureSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01BondFeatureSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-BOND-FEATURE-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01BondFeatureSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01BondFeatureSegSqlcd = checkBdms01BondFeatureSegSqlcdMaxLimit(number); 
		serializeBdms01BondFeatureSegSqlcd(bdms01BondFeatureSegSqlcd);
	}
	

	public void setBdms01BondFeatureSegSqlcd(long number) {
	    number = checkBdms01BondFeatureSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01BondFeatureSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01BondFeatureSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BondFeatureSegSqlcd(char[] value) throws CFException {
		 bdms01BondFeatureSegSqlcd = serializeBdms01BondFeatureSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01BondFeatureSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BondFeatureSegSqlcdString(char[] value) throws CFException {
		 setBdms01BondFeatureSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdBondCallMmddyycc
	 *	@return msdBondCallMmddyycc
	 */   
	 public MsdBondCallMmddyycc getMsdBondCallMmddyycc() {
   	return msdBondCallMmddyycc;
   }
   /**
	* 	Update MsdBondCallMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-CALL-MMDDYYCC
	*	@param value
	*/
   public void setMsdBondCallMmddyycc(char[] value) {
      msdBondCallMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondCallMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCallMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyycc.begin,msdBondCallMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondCallMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCallMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondCallMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdBondCallMmddyycc(Field source) {
   	replace(source,0,source.length(),msdBondCallMmddyycc.begin,msdBondCallMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdBondCallMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCallMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyycc.begin,msdBondCallMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondCallMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCallMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCallMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondCallPrice
	 *	@return msdBondCallPrice
	 */
	public BigDecimal getMsdBondCallPrice() throws CFException {
       if (isMsdBondCallPriceModified()) { 
           msdBondCallPrice = refreshMsdBondCallPrice();
        }
   		return msdBondCallPrice;
	}
	

	
	   
	/**
	 * 	Update MsdBondCallPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-BOND-CALL-PRICE
	 *	@param number
	 */
	public void setMsdBondCallPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdBondCallPrice = checkMsdBondCallPriceMaxLimit(number);
	    serializeMsdBondCallPrice(msdBondCallPrice);
   }
	/**
	 * 	Update MsdBondCallPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallPrice(char[] value) throws CFException {
		 msdBondCallPrice = serializeMsdBondCallPrice(value);
	}   
	/**
	 *	Returns the value of bdms01CallRateBondDt
	 *	@return bdms01CallRateBondDt
	 */
   public char[] getBdms01CallRateBondDt() throws CFException{
     if (isBdms01CallRateBondDtModified()) { 
        bdms01CallRateBondDt = refreshBdms01CallRateBondDt();
     }
   		return bdms01CallRateBondDt;
   }

  
	/**
	*  set variable bdms01CallRateBondDt
	*  Corresponding COBOL Variable is BDMS01-CALL-RATE-BOND-DT
	*  @param value
	**/
   public void setBdms01CallRateBondDt(char[] value) {
      bdms01CallRateBondDt = checkBdms01CallRateBondDtConstraints(value);
      serializeBdms01CallRateBondDt(bdms01CallRateBondDt);
   } 

     /**
	 * 	Update Bdms01CallRateBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallRateBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallRateBondDt,bdms01CallRateBondDt.length);
   	
   }
   
   public void setBdms01CallRateBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRateBondDt,bdms01CallRateBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallRateBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallRateBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRateBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallRateBondDt with another Field
	 *	@param value
	 */
   public void setBdms01CallRateBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01CallRateBondDt,BDMS_01_CALL_RATE_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallRateBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallRateBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallRateBondDt,BDMS_01_CALL_RATE_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallRateBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallRateBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRateBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallTypePutCd
	 *	@return bdms01CallTypePutCd
	 */
   public char[] getBdms01CallTypePutCd() throws CFException{
     if (isBdms01CallTypePutCdModified()) { 
        bdms01CallTypePutCd = refreshBdms01CallTypePutCd();
     }
   		return bdms01CallTypePutCd;
   }

  
	/**
	*  set variable bdms01CallTypePutCd
	*  Corresponding COBOL Variable is BDMS01-CALL-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01CallTypePutCd(char[] value) {
      bdms01CallTypePutCd = checkBdms01CallTypePutCdConstraints(value);
      serializeBdms01CallTypePutCd(bdms01CallTypePutCd);
   } 

     /**
	 * 	Update Bdms01CallTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallTypePutCd,bdms01CallTypePutCd.length);
   	
   }
   
   public void setBdms01CallTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypePutCd,bdms01CallTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01CallTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallTypePutCd,BDMS_01_CALL_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallTypePutCd,BDMS_01_CALL_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallFeatureFrqncCd
	 *	@return bdms01CallFeatureFrqncCd
	 */
   public char[] getBdms01CallFeatureFrqncCd() throws CFException{
     if (isBdms01CallFeatureFrqncCdModified()) { 
        bdms01CallFeatureFrqncCd = refreshBdms01CallFeatureFrqncCd();
     }
   		return bdms01CallFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01CallFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-CALL-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01CallFeatureFrqncCd(char[] value) {
      bdms01CallFeatureFrqncCd = checkBdms01CallFeatureFrqncCdConstraints(value);
      serializeBdms01CallFeatureFrqncCd(bdms01CallFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01CallFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallFeatureFrqncCd,bdms01CallFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01CallFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallFeatureFrqncCd,bdms01CallFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01CallFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallFeatureFrqncCd,BDMS_01_CALL_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallFeatureFrqncCd,BDMS_01_CALL_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallRdmptPartialCd
	 *	@return bdms01CallRdmptPartialCd
	 */
   public char[] getBdms01CallRdmptPartialCd() throws CFException{
     if (isBdms01CallRdmptPartialCdModified()) { 
        bdms01CallRdmptPartialCd = refreshBdms01CallRdmptPartialCd();
     }
   		return bdms01CallRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01CallRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-CALL-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01CallRdmptPartialCd(char[] value) {
      bdms01CallRdmptPartialCd = checkBdms01CallRdmptPartialCdConstraints(value);
      serializeBdms01CallRdmptPartialCd(bdms01CallRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01CallRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallRdmptPartialCd,bdms01CallRdmptPartialCd.length);
   	
   }
   
   public void setBdms01CallRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRdmptPartialCd,bdms01CallRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01CallRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallRdmptPartialCd,BDMS_01_CALL_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallRdmptPartialCd,BDMS_01_CALL_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallSelectionBondCd
	 *	@return bdms01CallSelectionBondCd
	 */
   public char[] getBdms01CallSelectionBondCd() throws CFException{
     if (isBdms01CallSelectionBondCdModified()) { 
        bdms01CallSelectionBondCd = refreshBdms01CallSelectionBondCd();
     }
   		return bdms01CallSelectionBondCd;
   }

  
	/**
	*  set variable bdms01CallSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-CALL-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01CallSelectionBondCd(char[] value) {
      bdms01CallSelectionBondCd = checkBdms01CallSelectionBondCdConstraints(value);
      serializeBdms01CallSelectionBondCd(bdms01CallSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01CallSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallSelectionBondCd,bdms01CallSelectionBondCd.length);
   	
   }
   
   public void setBdms01CallSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallSelectionBondCd,bdms01CallSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01CallSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallSelectionBondCd,BDMS_01_CALL_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallSelectionBondCd,BDMS_01_CALL_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondPutMmddyycc
	 *	@return msdBondPutMmddyycc
	 */   
	 public MsdBondPutMmddyycc getMsdBondPutMmddyycc() {
   	return msdBondPutMmddyycc;
   }
   /**
	* 	Update MsdBondPutMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-PUT-MMDDYYCC
	*	@param value
	*/
   public void setMsdBondPutMmddyycc(char[] value) {
      msdBondPutMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondPutMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondPutMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPutMmddyycc.begin,msdBondPutMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondPutMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPutMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPutMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondPutMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdBondPutMmddyycc(Field source) {
   	replace(source,0,source.length(),msdBondPutMmddyycc.begin,msdBondPutMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdBondPutMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondPutMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPutMmddyycc.begin,msdBondPutMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondPutMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPutMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPutMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondPutPrice
	 *	@return msdBondPutPrice
	 */
	public BigDecimal getMsdBondPutPrice() throws CFException {
       if (isMsdBondPutPriceModified()) { 
           msdBondPutPrice = refreshMsdBondPutPrice();
        }
   		return msdBondPutPrice;
	}
	

	
	   
	/**
	 * 	Update MsdBondPutPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-BOND-PUT-PRICE
	 *	@param number
	 */
	public void setMsdBondPutPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdBondPutPrice = checkMsdBondPutPriceMaxLimit(number);
	    serializeMsdBondPutPrice(msdBondPutPrice);
   }
	/**
	 * 	Update MsdBondPutPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondPutPrice(char[] value) throws CFException {
		 msdBondPutPrice = serializeMsdBondPutPrice(value);
	}   
	/**
	 *	Returns the value of bdms01PutRateBondDt
	 *	@return bdms01PutRateBondDt
	 */
   public char[] getBdms01PutRateBondDt() throws CFException{
     if (isBdms01PutRateBondDtModified()) { 
        bdms01PutRateBondDt = refreshBdms01PutRateBondDt();
     }
   		return bdms01PutRateBondDt;
   }

  
	/**
	*  set variable bdms01PutRateBondDt
	*  Corresponding COBOL Variable is BDMS01-PUT-RATE-BOND-DT
	*  @param value
	**/
   public void setBdms01PutRateBondDt(char[] value) {
      bdms01PutRateBondDt = checkBdms01PutRateBondDtConstraints(value);
      serializeBdms01PutRateBondDt(bdms01PutRateBondDt);
   } 

     /**
	 * 	Update Bdms01PutRateBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutRateBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutRateBondDt,bdms01PutRateBondDt.length);
   	
   }
   
   public void setBdms01PutRateBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRateBondDt,bdms01PutRateBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutRateBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutRateBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRateBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutRateBondDt with another Field
	 *	@param value
	 */
   public void setBdms01PutRateBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01PutRateBondDt,BDMS_01_PUT_RATE_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutRateBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutRateBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutRateBondDt,BDMS_01_PUT_RATE_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutRateBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutRateBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRateBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutTypePutCd
	 *	@return bdms01PutTypePutCd
	 */
   public char[] getBdms01PutTypePutCd() throws CFException{
     if (isBdms01PutTypePutCdModified()) { 
        bdms01PutTypePutCd = refreshBdms01PutTypePutCd();
     }
   		return bdms01PutTypePutCd;
   }

  
	/**
	*  set variable bdms01PutTypePutCd
	*  Corresponding COBOL Variable is BDMS01-PUT-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01PutTypePutCd(char[] value) {
      bdms01PutTypePutCd = checkBdms01PutTypePutCdConstraints(value);
      serializeBdms01PutTypePutCd(bdms01PutTypePutCd);
   } 

     /**
	 * 	Update Bdms01PutTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutTypePutCd,bdms01PutTypePutCd.length);
   	
   }
   
   public void setBdms01PutTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTypePutCd,bdms01PutTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01PutTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutTypePutCd,BDMS_01_PUT_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutTypePutCd,BDMS_01_PUT_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondPutType
	 *	@return msdBondPutType
	 */
   public char[] getMsdBondPutType() throws CFException{
     if (isMsdBondPutTypeModified()) { 
        msdBondPutType = refreshMsdBondPutType();
     }
   		return msdBondPutType;
   }

  
	/**
	*  set variable msdBondPutType
	*  Corresponding COBOL Variable is MSD-BOND-PUT-TYPE
	*  @param value
	**/
   public void setMsdBondPutType(char[] value) {
      msdBondPutType = checkMsdBondPutTypeConstraints(value);
      serializeMsdBondPutType(msdBondPutType);
   } 

     /**
	 * 	Update MsdBondPutType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBondPutType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBondPutType,msdBondPutType.length);
   	
   }
   
   public void setMsdBondPutType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondPutType,msdBondPutType.length);
   	
   }
   
     /**
	 * 	Update MsdBondPutType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPutType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondPutType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBondPutType with another Field
	 *	@param value
	 */
   public void setMsdBondPutType(Field source) {
       replace(source,0,source.length(),beginMsdBondPutType,MSD_BOND_PUT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBondPutType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBondPutType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBondPutType,MSD_BOND_PUT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update MsdBondPutType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPutType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondPutType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutFeatureFrqncCd
	 *	@return bdms01PutFeatureFrqncCd
	 */
   public char[] getBdms01PutFeatureFrqncCd() throws CFException{
     if (isBdms01PutFeatureFrqncCdModified()) { 
        bdms01PutFeatureFrqncCd = refreshBdms01PutFeatureFrqncCd();
     }
   		return bdms01PutFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01PutFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-PUT-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01PutFeatureFrqncCd(char[] value) {
      bdms01PutFeatureFrqncCd = checkBdms01PutFeatureFrqncCdConstraints(value);
      serializeBdms01PutFeatureFrqncCd(bdms01PutFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01PutFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutFeatureFrqncCd,bdms01PutFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01PutFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFeatureFrqncCd,bdms01PutFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01PutFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutFeatureFrqncCd,BDMS_01_PUT_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutFeatureFrqncCd,BDMS_01_PUT_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutRdmptPartialCd
	 *	@return bdms01PutRdmptPartialCd
	 */
   public char[] getBdms01PutRdmptPartialCd() throws CFException{
     if (isBdms01PutRdmptPartialCdModified()) { 
        bdms01PutRdmptPartialCd = refreshBdms01PutRdmptPartialCd();
     }
   		return bdms01PutRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01PutRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-PUT-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01PutRdmptPartialCd(char[] value) {
      bdms01PutRdmptPartialCd = checkBdms01PutRdmptPartialCdConstraints(value);
      serializeBdms01PutRdmptPartialCd(bdms01PutRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01PutRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutRdmptPartialCd,bdms01PutRdmptPartialCd.length);
   	
   }
   
   public void setBdms01PutRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRdmptPartialCd,bdms01PutRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01PutRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutRdmptPartialCd,BDMS_01_PUT_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutRdmptPartialCd,BDMS_01_PUT_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutSelectionBondCd
	 *	@return bdms01PutSelectionBondCd
	 */
   public char[] getBdms01PutSelectionBondCd() throws CFException{
     if (isBdms01PutSelectionBondCdModified()) { 
        bdms01PutSelectionBondCd = refreshBdms01PutSelectionBondCd();
     }
   		return bdms01PutSelectionBondCd;
   }

  
	/**
	*  set variable bdms01PutSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-PUT-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01PutSelectionBondCd(char[] value) {
      bdms01PutSelectionBondCd = checkBdms01PutSelectionBondCdConstraints(value);
      serializeBdms01PutSelectionBondCd(bdms01PutSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01PutSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutSelectionBondCd,bdms01PutSelectionBondCd.length);
   	
   }
   
   public void setBdms01PutSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutSelectionBondCd,bdms01PutSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01PutSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutSelectionBondCd,BDMS_01_PUT_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutSelectionBondCd,BDMS_01_PUT_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBndPrerefDate
	 *	@return msdBndPrerefDate
	 */
	public long getMsdBndPrerefDate() throws CFException {
       if (isMsdBndPrerefDateModified()) { 
           msdBndPrerefDate = refreshMsdBndPrerefDate();
        }
   		return msdBndPrerefDate;
	}
	

	
	   
	/**
	 * 	Update MsdBndPrerefDate with the passed value
	 *  Corresponding COBOL Variable is MSD-BND-PREREF-DATE
	 *	@param number
	 */
	public void setMsdBndPrerefDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBndPrerefDate = checkMsdBndPrerefDateMaxLimit(number); 
		serializeMsdBndPrerefDate(msdBndPrerefDate);
	}
	

	/**
	 * 	Update MsdBndPrerefDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBndPrerefDate(char[] value) throws CFException {
		 msdBndPrerefDate = serializeMsdBndPrerefDate(value);
	}
	/**
	 * 	Update MsdBndPrerefDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBndPrerefDateString(char[] value) throws CFException {
		 setMsdBndPrerefDate(value);
	}
	/**
	 *	Returns the value of msdBndPrerefPrice
	 *	@return msdBndPrerefPrice
	 */
	public BigDecimal getMsdBndPrerefPrice() throws CFException {
       if (isMsdBndPrerefPriceModified()) { 
           msdBndPrerefPrice = refreshMsdBndPrerefPrice();
        }
   		return msdBndPrerefPrice;
	}
	

	
	   
	/**
	 * 	Update MsdBndPrerefPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-BND-PREREF-PRICE
	 *	@param number
	 */
	public void setMsdBndPrerefPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdBndPrerefPrice = checkMsdBndPrerefPriceMaxLimit(number);
	    serializeMsdBndPrerefPrice(msdBndPrerefPrice);
   }
	/**
	 * 	Update MsdBndPrerefPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBndPrerefPrice(char[] value) throws CFException {
		 msdBndPrerefPrice = serializeMsdBndPrerefPrice(value);
	}   
	/**
	 *	Returns the value of bdms01PrerefRateBondDt
	 *	@return bdms01PrerefRateBondDt
	 */
   public char[] getBdms01PrerefRateBondDt() throws CFException{
     if (isBdms01PrerefRateBondDtModified()) { 
        bdms01PrerefRateBondDt = refreshBdms01PrerefRateBondDt();
     }
   		return bdms01PrerefRateBondDt;
   }

  
	/**
	*  set variable bdms01PrerefRateBondDt
	*  Corresponding COBOL Variable is BDMS01-PREREF-RATE-BOND-DT
	*  @param value
	**/
   public void setBdms01PrerefRateBondDt(char[] value) {
      bdms01PrerefRateBondDt = checkBdms01PrerefRateBondDtConstraints(value);
      serializeBdms01PrerefRateBondDt(bdms01PrerefRateBondDt);
   } 

     /**
	 * 	Update Bdms01PrerefRateBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrerefRateBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrerefRateBondDt,bdms01PrerefRateBondDt.length);
   	
   }
   
   public void setBdms01PrerefRateBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrerefRateBondDt,bdms01PrerefRateBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrerefRateBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrerefRateBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrerefRateBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrerefRateBondDt with another Field
	 *	@param value
	 */
   public void setBdms01PrerefRateBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01PrerefRateBondDt,BDMS_01_PREREF_RATE_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrerefRateBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrerefRateBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrerefRateBondDt,BDMS_01_PREREF_RATE_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrerefRateBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrerefRateBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrerefRateBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrefTypePutCd
	 *	@return bdms01PrefTypePutCd
	 */
   public char[] getBdms01PrefTypePutCd() throws CFException{
     if (isBdms01PrefTypePutCdModified()) { 
        bdms01PrefTypePutCd = refreshBdms01PrefTypePutCd();
     }
   		return bdms01PrefTypePutCd;
   }

  
	/**
	*  set variable bdms01PrefTypePutCd
	*  Corresponding COBOL Variable is BDMS01-PREF-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01PrefTypePutCd(char[] value) {
      bdms01PrefTypePutCd = checkBdms01PrefTypePutCdConstraints(value);
      serializeBdms01PrefTypePutCd(bdms01PrefTypePutCd);
   } 

     /**
	 * 	Update Bdms01PrefTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrefTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrefTypePutCd,bdms01PrefTypePutCd.length);
   	
   }
   
   public void setBdms01PrefTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefTypePutCd,bdms01PrefTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrefTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrefTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01PrefTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrefTypePutCd,BDMS_01_PREF_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrefTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrefTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrefTypePutCd,BDMS_01_PREF_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrefTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrefFeatureFrqncCd
	 *	@return bdms01PrefFeatureFrqncCd
	 */
   public char[] getBdms01PrefFeatureFrqncCd() throws CFException{
     if (isBdms01PrefFeatureFrqncCdModified()) { 
        bdms01PrefFeatureFrqncCd = refreshBdms01PrefFeatureFrqncCd();
     }
   		return bdms01PrefFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01PrefFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-PREF-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01PrefFeatureFrqncCd(char[] value) {
      bdms01PrefFeatureFrqncCd = checkBdms01PrefFeatureFrqncCdConstraints(value);
      serializeBdms01PrefFeatureFrqncCd(bdms01PrefFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01PrefFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrefFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrefFeatureFrqncCd,bdms01PrefFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01PrefFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefFeatureFrqncCd,bdms01PrefFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrefFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrefFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01PrefFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrefFeatureFrqncCd,BDMS_01_PREF_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrefFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrefFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrefFeatureFrqncCd,BDMS_01_PREF_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrefFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrefRdmptPartialCd
	 *	@return bdms01PrefRdmptPartialCd
	 */
   public char[] getBdms01PrefRdmptPartialCd() throws CFException{
     if (isBdms01PrefRdmptPartialCdModified()) { 
        bdms01PrefRdmptPartialCd = refreshBdms01PrefRdmptPartialCd();
     }
   		return bdms01PrefRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01PrefRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-PREF-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01PrefRdmptPartialCd(char[] value) {
      bdms01PrefRdmptPartialCd = checkBdms01PrefRdmptPartialCdConstraints(value);
      serializeBdms01PrefRdmptPartialCd(bdms01PrefRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01PrefRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrefRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrefRdmptPartialCd,bdms01PrefRdmptPartialCd.length);
   	
   }
   
   public void setBdms01PrefRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefRdmptPartialCd,bdms01PrefRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrefRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrefRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01PrefRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrefRdmptPartialCd,BDMS_01_PREF_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrefRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrefRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrefRdmptPartialCd,BDMS_01_PREF_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrefRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrefSelectionBondCd
	 *	@return bdms01PrefSelectionBondCd
	 */
   public char[] getBdms01PrefSelectionBondCd() throws CFException{
     if (isBdms01PrefSelectionBondCdModified()) { 
        bdms01PrefSelectionBondCd = refreshBdms01PrefSelectionBondCd();
     }
   		return bdms01PrefSelectionBondCd;
   }

  
	/**
	*  set variable bdms01PrefSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-PREF-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01PrefSelectionBondCd(char[] value) {
      bdms01PrefSelectionBondCd = checkBdms01PrefSelectionBondCdConstraints(value);
      serializeBdms01PrefSelectionBondCd(bdms01PrefSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01PrefSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrefSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrefSelectionBondCd,bdms01PrefSelectionBondCd.length);
   	
   }
   
   public void setBdms01PrefSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefSelectionBondCd,bdms01PrefSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrefSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrefSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01PrefSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrefSelectionBondCd,BDMS_01_PREF_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrefSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrefSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrefSelectionBondCd,BDMS_01_PREF_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrefSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrefSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrefSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondParCallDate
	 *	@return msdBondParCallDate
	 */
	public long getMsdBondParCallDate() throws CFException {
       if (isMsdBondParCallDateModified()) { 
           msdBondParCallDate = refreshMsdBondParCallDate();
        }
   		return msdBondParCallDate;
	}
	

	
	   
	/**
	 * 	Update MsdBondParCallDate with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-PAR-CALL-DATE
	 *	@param number
	 */
	public void setMsdBondParCallDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondParCallDate = checkMsdBondParCallDateMaxLimit(number); 
		serializeMsdBondParCallDate(msdBondParCallDate);
	}
	

	/**
	 * 	Update MsdBondParCallDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondParCallDate(char[] value) throws CFException {
		 msdBondParCallDate = serializeMsdBondParCallDate(value);
	}
	/**
	 * 	Update MsdBondParCallDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondParCallDateString(char[] value) throws CFException {
		 setMsdBondParCallDate(value);
	}
	/**
	 *	Returns the value of msdBondParCallPrice
	 *	@return msdBondParCallPrice
	 */
	public BigDecimal getMsdBondParCallPrice() throws CFException {
       if (isMsdBondParCallPriceModified()) { 
           msdBondParCallPrice = refreshMsdBondParCallPrice();
        }
   		return msdBondParCallPrice;
	}
	

	
	   
	/**
	 * 	Update MsdBondParCallPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-BOND-PAR-CALL-PRICE
	 *	@param number
	 */
	public void setMsdBondParCallPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdBondParCallPrice = checkMsdBondParCallPriceMaxLimit(number);
	    serializeMsdBondParCallPrice(msdBondParCallPrice);
   }
	/**
	 * 	Update MsdBondParCallPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondParCallPrice(char[] value) throws CFException {
		 msdBondParCallPrice = serializeMsdBondParCallPrice(value);
	}   
	/**
	 *	Returns the value of bdms01PcRateBondDt
	 *	@return bdms01PcRateBondDt
	 */
   public char[] getBdms01PcRateBondDt() throws CFException{
     if (isBdms01PcRateBondDtModified()) { 
        bdms01PcRateBondDt = refreshBdms01PcRateBondDt();
     }
   		return bdms01PcRateBondDt;
   }

  
	/**
	*  set variable bdms01PcRateBondDt
	*  Corresponding COBOL Variable is BDMS01-PC-RATE-BOND-DT
	*  @param value
	**/
   public void setBdms01PcRateBondDt(char[] value) {
      bdms01PcRateBondDt = checkBdms01PcRateBondDtConstraints(value);
      serializeBdms01PcRateBondDt(bdms01PcRateBondDt);
   } 

     /**
	 * 	Update Bdms01PcRateBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcRateBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcRateBondDt,bdms01PcRateBondDt.length);
   	
   }
   
   public void setBdms01PcRateBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRateBondDt,bdms01PcRateBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcRateBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcRateBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRateBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcRateBondDt with another Field
	 *	@param value
	 */
   public void setBdms01PcRateBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01PcRateBondDt,BDMS_01_PC_RATE_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcRateBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcRateBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcRateBondDt,BDMS_01_PC_RATE_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcRateBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcRateBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRateBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PcTypePutCd
	 *	@return bdms01PcTypePutCd
	 */
   public char[] getBdms01PcTypePutCd() throws CFException{
     if (isBdms01PcTypePutCdModified()) { 
        bdms01PcTypePutCd = refreshBdms01PcTypePutCd();
     }
   		return bdms01PcTypePutCd;
   }

  
	/**
	*  set variable bdms01PcTypePutCd
	*  Corresponding COBOL Variable is BDMS01-PC-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01PcTypePutCd(char[] value) {
      bdms01PcTypePutCd = checkBdms01PcTypePutCdConstraints(value);
      serializeBdms01PcTypePutCd(bdms01PcTypePutCd);
   } 

     /**
	 * 	Update Bdms01PcTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcTypePutCd,bdms01PcTypePutCd.length);
   	
   }
   
   public void setBdms01PcTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcTypePutCd,bdms01PcTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01PcTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01PcTypePutCd,BDMS_01_PC_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcTypePutCd,BDMS_01_PC_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PcFeatureFrqncCd
	 *	@return bdms01PcFeatureFrqncCd
	 */
   public char[] getBdms01PcFeatureFrqncCd() throws CFException{
     if (isBdms01PcFeatureFrqncCdModified()) { 
        bdms01PcFeatureFrqncCd = refreshBdms01PcFeatureFrqncCd();
     }
   		return bdms01PcFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01PcFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-PC-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01PcFeatureFrqncCd(char[] value) {
      bdms01PcFeatureFrqncCd = checkBdms01PcFeatureFrqncCdConstraints(value);
      serializeBdms01PcFeatureFrqncCd(bdms01PcFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01PcFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcFeatureFrqncCd,bdms01PcFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01PcFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcFeatureFrqncCd,bdms01PcFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01PcFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01PcFeatureFrqncCd,BDMS_01_PC_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcFeatureFrqncCd,BDMS_01_PC_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PcRdmptPartialCd
	 *	@return bdms01PcRdmptPartialCd
	 */
   public char[] getBdms01PcRdmptPartialCd() throws CFException{
     if (isBdms01PcRdmptPartialCdModified()) { 
        bdms01PcRdmptPartialCd = refreshBdms01PcRdmptPartialCd();
     }
   		return bdms01PcRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01PcRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-PC-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01PcRdmptPartialCd(char[] value) {
      bdms01PcRdmptPartialCd = checkBdms01PcRdmptPartialCdConstraints(value);
      serializeBdms01PcRdmptPartialCd(bdms01PcRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01PcRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcRdmptPartialCd,bdms01PcRdmptPartialCd.length);
   	
   }
   
   public void setBdms01PcRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRdmptPartialCd,bdms01PcRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01PcRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01PcRdmptPartialCd,BDMS_01_PC_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcRdmptPartialCd,BDMS_01_PC_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PcSelectionBondCd
	 *	@return bdms01PcSelectionBondCd
	 */
   public char[] getBdms01PcSelectionBondCd() throws CFException{
     if (isBdms01PcSelectionBondCdModified()) { 
        bdms01PcSelectionBondCd = refreshBdms01PcSelectionBondCd();
     }
   		return bdms01PcSelectionBondCd;
   }

  
	/**
	*  set variable bdms01PcSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-PC-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01PcSelectionBondCd(char[] value) {
      bdms01PcSelectionBondCd = checkBdms01PcSelectionBondCdConstraints(value);
      serializeBdms01PcSelectionBondCd(bdms01PcSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01PcSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcSelectionBondCd,bdms01PcSelectionBondCd.length);
   	
   }
   
   public void setBdms01PcSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcSelectionBondCd,bdms01PcSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01PcSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01PcSelectionBondCd,BDMS_01_PC_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcSelectionBondCd,BDMS_01_PC_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndRefundDate
	 *	@return bdms01BndRefundDate
	 */
   public char[] getBdms01BndRefundDate() throws CFException{
     if (isBdms01BndRefundDateModified()) { 
        bdms01BndRefundDate = refreshBdms01BndRefundDate();
     }
   		return bdms01BndRefundDate;
   }

  
	/**
	*  set variable bdms01BndRefundDate
	*  Corresponding COBOL Variable is BDMS01-BND-REFUND-DATE
	*  @param value
	**/
   public void setBdms01BndRefundDate(char[] value) {
      bdms01BndRefundDate = checkBdms01BndRefundDateConstraints(value);
      serializeBdms01BndRefundDate(bdms01BndRefundDate);
   } 

     /**
	 * 	Update Bdms01BndRefundDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BndRefundDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BndRefundDate,bdms01BndRefundDate.length);
   	
   }
   
   public void setBdms01BndRefundDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRefundDate,bdms01BndRefundDate.length);
   	
   }
   
     /**
	 * 	Update Bdms01BndRefundDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndRefundDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRefundDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BndRefundDate with another Field
	 *	@param value
	 */
   public void setBdms01BndRefundDate(Field source) {
       replace(source,0,source.length(),beginBdms01BndRefundDate,BDMS_01_BND_REFUND_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BndRefundDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BndRefundDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BndRefundDate,BDMS_01_BND_REFUND_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BndRefundDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndRefundDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRefundDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndRefundPrice
	 *	@return bdms01BndRefundPrice
	 */
	public BigDecimal getBdms01BndRefundPrice() throws CFException {
       if (isBdms01BndRefundPriceModified()) { 
           bdms01BndRefundPrice = refreshBdms01BndRefundPrice();
        }
   		return bdms01BndRefundPrice;
	}
	

	
	   
	/**
	 * 	Update Bdms01BndRefundPrice with the passed number
	 *  Corresponding COBOL Variable is BDMS01-BND-REFUND-PRICE
	 *	@param number
	 */
	public void setBdms01BndRefundPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01BndRefundPrice = checkBdms01BndRefundPriceMaxLimit(number);
	    serializeBdms01BndRefundPrice(bdms01BndRefundPrice);
   }
	/**
	 * 	Update Bdms01BndRefundPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BndRefundPrice(char[] value) throws CFException {
		 bdms01BndRefundPrice = serializeBdms01BndRefundPrice(value);
	}   
	/**
	 *	Returns the value of bdms01RfTypePutCd
	 *	@return bdms01RfTypePutCd
	 */
   public char[] getBdms01RfTypePutCd() throws CFException{
     if (isBdms01RfTypePutCdModified()) { 
        bdms01RfTypePutCd = refreshBdms01RfTypePutCd();
     }
   		return bdms01RfTypePutCd;
   }

  
	/**
	*  set variable bdms01RfTypePutCd
	*  Corresponding COBOL Variable is BDMS01-RF-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01RfTypePutCd(char[] value) {
      bdms01RfTypePutCd = checkBdms01RfTypePutCdConstraints(value);
      serializeBdms01RfTypePutCd(bdms01RfTypePutCd);
   } 

     /**
	 * 	Update Bdms01RfTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RfTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RfTypePutCd,bdms01RfTypePutCd.length);
   	
   }
   
   public void setBdms01RfTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfTypePutCd,bdms01RfTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RfTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RfTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01RfTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01RfTypePutCd,BDMS_01_RF_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RfTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RfTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RfTypePutCd,BDMS_01_RF_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RfTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RfFeatureFrqncCd
	 *	@return bdms01RfFeatureFrqncCd
	 */
   public char[] getBdms01RfFeatureFrqncCd() throws CFException{
     if (isBdms01RfFeatureFrqncCdModified()) { 
        bdms01RfFeatureFrqncCd = refreshBdms01RfFeatureFrqncCd();
     }
   		return bdms01RfFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01RfFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-RF-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01RfFeatureFrqncCd(char[] value) {
      bdms01RfFeatureFrqncCd = checkBdms01RfFeatureFrqncCdConstraints(value);
      serializeBdms01RfFeatureFrqncCd(bdms01RfFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01RfFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RfFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RfFeatureFrqncCd,bdms01RfFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01RfFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfFeatureFrqncCd,bdms01RfFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RfFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RfFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01RfFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01RfFeatureFrqncCd,BDMS_01_RF_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RfFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RfFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RfFeatureFrqncCd,BDMS_01_RF_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RfFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RfRdmptPartialCd
	 *	@return bdms01RfRdmptPartialCd
	 */
   public char[] getBdms01RfRdmptPartialCd() throws CFException{
     if (isBdms01RfRdmptPartialCdModified()) { 
        bdms01RfRdmptPartialCd = refreshBdms01RfRdmptPartialCd();
     }
   		return bdms01RfRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01RfRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-RF-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01RfRdmptPartialCd(char[] value) {
      bdms01RfRdmptPartialCd = checkBdms01RfRdmptPartialCdConstraints(value);
      serializeBdms01RfRdmptPartialCd(bdms01RfRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01RfRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RfRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RfRdmptPartialCd,bdms01RfRdmptPartialCd.length);
   	
   }
   
   public void setBdms01RfRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfRdmptPartialCd,bdms01RfRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RfRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RfRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01RfRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01RfRdmptPartialCd,BDMS_01_RF_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RfRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RfRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RfRdmptPartialCd,BDMS_01_RF_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RfRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RfSelectionBondCd
	 *	@return bdms01RfSelectionBondCd
	 */
   public char[] getBdms01RfSelectionBondCd() throws CFException{
     if (isBdms01RfSelectionBondCdModified()) { 
        bdms01RfSelectionBondCd = refreshBdms01RfSelectionBondCd();
     }
   		return bdms01RfSelectionBondCd;
   }

  
	/**
	*  set variable bdms01RfSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-RF-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01RfSelectionBondCd(char[] value) {
      bdms01RfSelectionBondCd = checkBdms01RfSelectionBondCdConstraints(value);
      serializeBdms01RfSelectionBondCd(bdms01RfSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01RfSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RfSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RfSelectionBondCd,bdms01RfSelectionBondCd.length);
   	
   }
   
   public void setBdms01RfSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfSelectionBondCd,bdms01RfSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RfSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RfSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01RfSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01RfSelectionBondCd,BDMS_01_RF_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RfSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RfSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RfSelectionBondCd,BDMS_01_RF_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RfSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RfSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RfSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AddtlPutDate
	 *	@return bdms01AddtlPutDate
	 */
   public char[] getBdms01AddtlPutDate() throws CFException{
     if (isBdms01AddtlPutDateModified()) { 
        bdms01AddtlPutDate = refreshBdms01AddtlPutDate();
     }
   		return bdms01AddtlPutDate;
   }

  
	/**
	*  set variable bdms01AddtlPutDate
	*  Corresponding COBOL Variable is BDMS01-ADDTL-PUT-DATE
	*  @param value
	**/
   public void setBdms01AddtlPutDate(char[] value) {
      bdms01AddtlPutDate = checkBdms01AddtlPutDateConstraints(value);
      serializeBdms01AddtlPutDate(bdms01AddtlPutDate);
   } 

     /**
	 * 	Update Bdms01AddtlPutDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AddtlPutDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AddtlPutDate,bdms01AddtlPutDate.length);
   	
   }
   
   public void setBdms01AddtlPutDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddtlPutDate,bdms01AddtlPutDate.length);
   	
   }
   
     /**
	 * 	Update Bdms01AddtlPutDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AddtlPutDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddtlPutDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AddtlPutDate with another Field
	 *	@param value
	 */
   public void setBdms01AddtlPutDate(Field source) {
       replace(source,0,source.length(),beginBdms01AddtlPutDate,BDMS_01_ADDTL_PUT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AddtlPutDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AddtlPutDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AddtlPutDate,BDMS_01_ADDTL_PUT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AddtlPutDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AddtlPutDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddtlPutDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AddtlPutPrice
	 *	@return bdms01AddtlPutPrice
	 */
	public BigDecimal getBdms01AddtlPutPrice() throws CFException {
       if (isBdms01AddtlPutPriceModified()) { 
           bdms01AddtlPutPrice = refreshBdms01AddtlPutPrice();
        }
   		return bdms01AddtlPutPrice;
	}
	

	
	   
	/**
	 * 	Update Bdms01AddtlPutPrice with the passed number
	 *  Corresponding COBOL Variable is BDMS01-ADDTL-PUT-PRICE
	 *	@param number
	 */
	public void setBdms01AddtlPutPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01AddtlPutPrice = checkBdms01AddtlPutPriceMaxLimit(number);
	    serializeBdms01AddtlPutPrice(bdms01AddtlPutPrice);
   }
	/**
	 * 	Update Bdms01AddtlPutPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01AddtlPutPrice(char[] value) throws CFException {
		 bdms01AddtlPutPrice = serializeBdms01AddtlPutPrice(value);
	}   
	/**
	 *	Returns the value of bdms01PaTypePutCd
	 *	@return bdms01PaTypePutCd
	 */
   public char[] getBdms01PaTypePutCd() throws CFException{
     if (isBdms01PaTypePutCdModified()) { 
        bdms01PaTypePutCd = refreshBdms01PaTypePutCd();
     }
   		return bdms01PaTypePutCd;
   }

  
	/**
	*  set variable bdms01PaTypePutCd
	*  Corresponding COBOL Variable is BDMS01-PA-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01PaTypePutCd(char[] value) {
      bdms01PaTypePutCd = checkBdms01PaTypePutCdConstraints(value);
      serializeBdms01PaTypePutCd(bdms01PaTypePutCd);
   } 

     /**
	 * 	Update Bdms01PaTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PaTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PaTypePutCd,bdms01PaTypePutCd.length);
   	
   }
   
   public void setBdms01PaTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaTypePutCd,bdms01PaTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PaTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PaTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01PaTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01PaTypePutCd,BDMS_01_PA_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PaTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PaTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PaTypePutCd,BDMS_01_PA_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PaTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PaFeatureFrqncCd
	 *	@return bdms01PaFeatureFrqncCd
	 */
   public char[] getBdms01PaFeatureFrqncCd() throws CFException{
     if (isBdms01PaFeatureFrqncCdModified()) { 
        bdms01PaFeatureFrqncCd = refreshBdms01PaFeatureFrqncCd();
     }
   		return bdms01PaFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01PaFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-PA-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01PaFeatureFrqncCd(char[] value) {
      bdms01PaFeatureFrqncCd = checkBdms01PaFeatureFrqncCdConstraints(value);
      serializeBdms01PaFeatureFrqncCd(bdms01PaFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01PaFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PaFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PaFeatureFrqncCd,bdms01PaFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01PaFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaFeatureFrqncCd,bdms01PaFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PaFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PaFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01PaFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01PaFeatureFrqncCd,BDMS_01_PA_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PaFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PaFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PaFeatureFrqncCd,BDMS_01_PA_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PaFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PaRdmptPartialCd
	 *	@return bdms01PaRdmptPartialCd
	 */
   public char[] getBdms01PaRdmptPartialCd() throws CFException{
     if (isBdms01PaRdmptPartialCdModified()) { 
        bdms01PaRdmptPartialCd = refreshBdms01PaRdmptPartialCd();
     }
   		return bdms01PaRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01PaRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-PA-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01PaRdmptPartialCd(char[] value) {
      bdms01PaRdmptPartialCd = checkBdms01PaRdmptPartialCdConstraints(value);
      serializeBdms01PaRdmptPartialCd(bdms01PaRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01PaRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PaRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PaRdmptPartialCd,bdms01PaRdmptPartialCd.length);
   	
   }
   
   public void setBdms01PaRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaRdmptPartialCd,bdms01PaRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PaRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PaRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01PaRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01PaRdmptPartialCd,BDMS_01_PA_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PaRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PaRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PaRdmptPartialCd,BDMS_01_PA_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PaRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PaSelectionBondCd
	 *	@return bdms01PaSelectionBondCd
	 */
   public char[] getBdms01PaSelectionBondCd() throws CFException{
     if (isBdms01PaSelectionBondCdModified()) { 
        bdms01PaSelectionBondCd = refreshBdms01PaSelectionBondCd();
     }
   		return bdms01PaSelectionBondCd;
   }

  
	/**
	*  set variable bdms01PaSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-PA-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01PaSelectionBondCd(char[] value) {
      bdms01PaSelectionBondCd = checkBdms01PaSelectionBondCdConstraints(value);
      serializeBdms01PaSelectionBondCd(bdms01PaSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01PaSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PaSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PaSelectionBondCd,bdms01PaSelectionBondCd.length);
   	
   }
   
   public void setBdms01PaSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaSelectionBondCd,bdms01PaSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PaSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PaSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01PaSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01PaSelectionBondCd,BDMS_01_PA_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PaSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PaSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PaSelectionBondCd,BDMS_01_PA_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PaSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PaSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PaSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndOfferingDate
	 *	@return bdms01BndOfferingDate
	 */
   public char[] getBdms01BndOfferingDate() throws CFException{
     if (isBdms01BndOfferingDateModified()) { 
        bdms01BndOfferingDate = refreshBdms01BndOfferingDate();
     }
   		return bdms01BndOfferingDate;
   }

  
	/**
	*  set variable bdms01BndOfferingDate
	*  Corresponding COBOL Variable is BDMS01-BND-OFFERING-DATE
	*  @param value
	**/
   public void setBdms01BndOfferingDate(char[] value) {
      bdms01BndOfferingDate = checkBdms01BndOfferingDateConstraints(value);
      serializeBdms01BndOfferingDate(bdms01BndOfferingDate);
   } 

     /**
	 * 	Update Bdms01BndOfferingDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BndOfferingDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BndOfferingDate,bdms01BndOfferingDate.length);
   	
   }
   
   public void setBdms01BndOfferingDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndOfferingDate,bdms01BndOfferingDate.length);
   	
   }
   
     /**
	 * 	Update Bdms01BndOfferingDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndOfferingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndOfferingDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BndOfferingDate with another Field
	 *	@param value
	 */
   public void setBdms01BndOfferingDate(Field source) {
       replace(source,0,source.length(),beginBdms01BndOfferingDate,BDMS_01_BND_OFFERING_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BndOfferingDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BndOfferingDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BndOfferingDate,BDMS_01_BND_OFFERING_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BndOfferingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndOfferingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndOfferingDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndOfferingPrice
	 *	@return bdms01BndOfferingPrice
	 */
	public BigDecimal getBdms01BndOfferingPrice() throws CFException {
       if (isBdms01BndOfferingPriceModified()) { 
           bdms01BndOfferingPrice = refreshBdms01BndOfferingPrice();
        }
   		return bdms01BndOfferingPrice;
	}
	

	
	   
	/**
	 * 	Update Bdms01BndOfferingPrice with the passed number
	 *  Corresponding COBOL Variable is BDMS01-BND-OFFERING-PRICE
	 *	@param number
	 */
	public void setBdms01BndOfferingPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01BndOfferingPrice = checkBdms01BndOfferingPriceMaxLimit(number);
	    serializeBdms01BndOfferingPrice(bdms01BndOfferingPrice);
   }
	/**
	 * 	Update Bdms01BndOfferingPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BndOfferingPrice(char[] value) throws CFException {
		 bdms01BndOfferingPrice = serializeBdms01BndOfferingPrice(value);
	}   
	/**
	 *	Returns the value of bdms01ExTypePutCd
	 *	@return bdms01ExTypePutCd
	 */
   public char[] getBdms01ExTypePutCd() throws CFException{
     if (isBdms01ExTypePutCdModified()) { 
        bdms01ExTypePutCd = refreshBdms01ExTypePutCd();
     }
   		return bdms01ExTypePutCd;
   }

  
	/**
	*  set variable bdms01ExTypePutCd
	*  Corresponding COBOL Variable is BDMS01-EX-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01ExTypePutCd(char[] value) {
      bdms01ExTypePutCd = checkBdms01ExTypePutCdConstraints(value);
      serializeBdms01ExTypePutCd(bdms01ExTypePutCd);
   } 

     /**
	 * 	Update Bdms01ExTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExTypePutCd,bdms01ExTypePutCd.length);
   	
   }
   
   public void setBdms01ExTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExTypePutCd,bdms01ExTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01ExTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01ExTypePutCd,BDMS_01_EX_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExTypePutCd,BDMS_01_EX_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExFeatureFrqncCd
	 *	@return bdms01ExFeatureFrqncCd
	 */
   public char[] getBdms01ExFeatureFrqncCd() throws CFException{
     if (isBdms01ExFeatureFrqncCdModified()) { 
        bdms01ExFeatureFrqncCd = refreshBdms01ExFeatureFrqncCd();
     }
   		return bdms01ExFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01ExFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-EX-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01ExFeatureFrqncCd(char[] value) {
      bdms01ExFeatureFrqncCd = checkBdms01ExFeatureFrqncCdConstraints(value);
      serializeBdms01ExFeatureFrqncCd(bdms01ExFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01ExFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExFeatureFrqncCd,bdms01ExFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01ExFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExFeatureFrqncCd,bdms01ExFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01ExFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01ExFeatureFrqncCd,BDMS_01_EX_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExFeatureFrqncCd,BDMS_01_EX_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExRdmptPartialCd
	 *	@return bdms01ExRdmptPartialCd
	 */
   public char[] getBdms01ExRdmptPartialCd() throws CFException{
     if (isBdms01ExRdmptPartialCdModified()) { 
        bdms01ExRdmptPartialCd = refreshBdms01ExRdmptPartialCd();
     }
   		return bdms01ExRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01ExRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-EX-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01ExRdmptPartialCd(char[] value) {
      bdms01ExRdmptPartialCd = checkBdms01ExRdmptPartialCdConstraints(value);
      serializeBdms01ExRdmptPartialCd(bdms01ExRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01ExRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExRdmptPartialCd,bdms01ExRdmptPartialCd.length);
   	
   }
   
   public void setBdms01ExRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExRdmptPartialCd,bdms01ExRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01ExRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01ExRdmptPartialCd,BDMS_01_EX_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExRdmptPartialCd,BDMS_01_EX_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExSelectionBondCd
	 *	@return bdms01ExSelectionBondCd
	 */
   public char[] getBdms01ExSelectionBondCd() throws CFException{
     if (isBdms01ExSelectionBondCdModified()) { 
        bdms01ExSelectionBondCd = refreshBdms01ExSelectionBondCd();
     }
   		return bdms01ExSelectionBondCd;
   }

  
	/**
	*  set variable bdms01ExSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-EX-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01ExSelectionBondCd(char[] value) {
      bdms01ExSelectionBondCd = checkBdms01ExSelectionBondCdConstraints(value);
      serializeBdms01ExSelectionBondCd(bdms01ExSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01ExSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExSelectionBondCd,bdms01ExSelectionBondCd.length);
   	
   }
   
   public void setBdms01ExSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExSelectionBondCd,bdms01ExSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01ExSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01ExSelectionBondCd,BDMS_01_EX_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExSelectionBondCd,BDMS_01_EX_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExSelectionBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndRetractDate
	 *	@return bdms01BndRetractDate
	 */
   public char[] getBdms01BndRetractDate() throws CFException{
     if (isBdms01BndRetractDateModified()) { 
        bdms01BndRetractDate = refreshBdms01BndRetractDate();
     }
   		return bdms01BndRetractDate;
   }

  
	/**
	*  set variable bdms01BndRetractDate
	*  Corresponding COBOL Variable is BDMS01-BND-RETRACT-DATE
	*  @param value
	**/
   public void setBdms01BndRetractDate(char[] value) {
      bdms01BndRetractDate = checkBdms01BndRetractDateConstraints(value);
      serializeBdms01BndRetractDate(bdms01BndRetractDate);
   } 

     /**
	 * 	Update Bdms01BndRetractDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BndRetractDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BndRetractDate,bdms01BndRetractDate.length);
   	
   }
   
   public void setBdms01BndRetractDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRetractDate,bdms01BndRetractDate.length);
   	
   }
   
     /**
	 * 	Update Bdms01BndRetractDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndRetractDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRetractDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BndRetractDate with another Field
	 *	@param value
	 */
   public void setBdms01BndRetractDate(Field source) {
       replace(source,0,source.length(),beginBdms01BndRetractDate,BDMS_01_BND_RETRACT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BndRetractDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BndRetractDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BndRetractDate,BDMS_01_BND_RETRACT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BndRetractDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BndRetractDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BndRetractDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BndRetractPrice
	 *	@return bdms01BndRetractPrice
	 */
	public BigDecimal getBdms01BndRetractPrice() throws CFException {
       if (isBdms01BndRetractPriceModified()) { 
           bdms01BndRetractPrice = refreshBdms01BndRetractPrice();
        }
   		return bdms01BndRetractPrice;
	}
	

	
	   
	/**
	 * 	Update Bdms01BndRetractPrice with the passed number
	 *  Corresponding COBOL Variable is BDMS01-BND-RETRACT-PRICE
	 *	@param number
	 */
	public void setBdms01BndRetractPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01BndRetractPrice = checkBdms01BndRetractPriceMaxLimit(number);
	    serializeBdms01BndRetractPrice(bdms01BndRetractPrice);
   }
	/**
	 * 	Update Bdms01BndRetractPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BndRetractPrice(char[] value) throws CFException {
		 bdms01BndRetractPrice = serializeBdms01BndRetractPrice(value);
	}   
	/**
	 *	Returns the value of bdms01RtTypePutCd
	 *	@return bdms01RtTypePutCd
	 */
   public char[] getBdms01RtTypePutCd() throws CFException{
     if (isBdms01RtTypePutCdModified()) { 
        bdms01RtTypePutCd = refreshBdms01RtTypePutCd();
     }
   		return bdms01RtTypePutCd;
   }

  
	/**
	*  set variable bdms01RtTypePutCd
	*  Corresponding COBOL Variable is BDMS01-RT-TYPE-PUT-CD
	*  @param value
	**/
   public void setBdms01RtTypePutCd(char[] value) {
      bdms01RtTypePutCd = checkBdms01RtTypePutCdConstraints(value);
      serializeBdms01RtTypePutCd(bdms01RtTypePutCd);
   } 

     /**
	 * 	Update Bdms01RtTypePutCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RtTypePutCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RtTypePutCd,bdms01RtTypePutCd.length);
   	
   }
   
   public void setBdms01RtTypePutCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtTypePutCd,bdms01RtTypePutCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RtTypePutCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtTypePutCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtTypePutCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RtTypePutCd with another Field
	 *	@param value
	 */
   public void setBdms01RtTypePutCd(Field source) {
       replace(source,0,source.length(),beginBdms01RtTypePutCd,BDMS_01_RT_TYPE_PUT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RtTypePutCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RtTypePutCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RtTypePutCd,BDMS_01_RT_TYPE_PUT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RtTypePutCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtTypePutCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtTypePutCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RtFeatureFrqncCd
	 *	@return bdms01RtFeatureFrqncCd
	 */
   public char[] getBdms01RtFeatureFrqncCd() throws CFException{
     if (isBdms01RtFeatureFrqncCdModified()) { 
        bdms01RtFeatureFrqncCd = refreshBdms01RtFeatureFrqncCd();
     }
   		return bdms01RtFeatureFrqncCd;
   }

  
	/**
	*  set variable bdms01RtFeatureFrqncCd
	*  Corresponding COBOL Variable is BDMS01-RT-FEATURE-FRQNC-CD
	*  @param value
	**/
   public void setBdms01RtFeatureFrqncCd(char[] value) {
      bdms01RtFeatureFrqncCd = checkBdms01RtFeatureFrqncCdConstraints(value);
      serializeBdms01RtFeatureFrqncCd(bdms01RtFeatureFrqncCd);
   } 

     /**
	 * 	Update Bdms01RtFeatureFrqncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RtFeatureFrqncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RtFeatureFrqncCd,bdms01RtFeatureFrqncCd.length);
   	
   }
   
   public void setBdms01RtFeatureFrqncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtFeatureFrqncCd,bdms01RtFeatureFrqncCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RtFeatureFrqncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtFeatureFrqncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtFeatureFrqncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RtFeatureFrqncCd with another Field
	 *	@param value
	 */
   public void setBdms01RtFeatureFrqncCd(Field source) {
       replace(source,0,source.length(),beginBdms01RtFeatureFrqncCd,BDMS_01_RT_FEATURE_FRQNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RtFeatureFrqncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RtFeatureFrqncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RtFeatureFrqncCd,BDMS_01_RT_FEATURE_FRQNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RtFeatureFrqncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtFeatureFrqncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtFeatureFrqncCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RtRdmptPartialCd
	 *	@return bdms01RtRdmptPartialCd
	 */
   public char[] getBdms01RtRdmptPartialCd() throws CFException{
     if (isBdms01RtRdmptPartialCdModified()) { 
        bdms01RtRdmptPartialCd = refreshBdms01RtRdmptPartialCd();
     }
   		return bdms01RtRdmptPartialCd;
   }

  
	/**
	*  set variable bdms01RtRdmptPartialCd
	*  Corresponding COBOL Variable is BDMS01-RT-RDMPT-PARTIAL-CD
	*  @param value
	**/
   public void setBdms01RtRdmptPartialCd(char[] value) {
      bdms01RtRdmptPartialCd = checkBdms01RtRdmptPartialCdConstraints(value);
      serializeBdms01RtRdmptPartialCd(bdms01RtRdmptPartialCd);
   } 

     /**
	 * 	Update Bdms01RtRdmptPartialCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RtRdmptPartialCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RtRdmptPartialCd,bdms01RtRdmptPartialCd.length);
   	
   }
   
   public void setBdms01RtRdmptPartialCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtRdmptPartialCd,bdms01RtRdmptPartialCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RtRdmptPartialCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtRdmptPartialCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtRdmptPartialCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RtRdmptPartialCd with another Field
	 *	@param value
	 */
   public void setBdms01RtRdmptPartialCd(Field source) {
       replace(source,0,source.length(),beginBdms01RtRdmptPartialCd,BDMS_01_RT_RDMPT_PARTIAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RtRdmptPartialCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RtRdmptPartialCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RtRdmptPartialCd,BDMS_01_RT_RDMPT_PARTIAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RtRdmptPartialCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtRdmptPartialCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtRdmptPartialCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RtSelectionBondCd
	 *	@return bdms01RtSelectionBondCd
	 */
   public char[] getBdms01RtSelectionBondCd() throws CFException{
     if (isBdms01RtSelectionBondCdModified()) { 
        bdms01RtSelectionBondCd = refreshBdms01RtSelectionBondCd();
     }
   		return bdms01RtSelectionBondCd;
   }

  
	/**
	*  set variable bdms01RtSelectionBondCd
	*  Corresponding COBOL Variable is BDMS01-RT-SELECTION-BOND-CD
	*  @param value
	**/
   public void setBdms01RtSelectionBondCd(char[] value) {
      bdms01RtSelectionBondCd = checkBdms01RtSelectionBondCdConstraints(value);
      serializeBdms01RtSelectionBondCd(bdms01RtSelectionBondCd);
   } 

     /**
	 * 	Update Bdms01RtSelectionBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RtSelectionBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RtSelectionBondCd,bdms01RtSelectionBondCd.length);
   	
   }
   
   public void setBdms01RtSelectionBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtSelectionBondCd,bdms01RtSelectionBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RtSelectionBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtSelectionBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtSelectionBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RtSelectionBondCd with another Field
	 *	@param value
	 */
   public void setBdms01RtSelectionBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01RtSelectionBondCd,BDMS_01_RT_SELECTION_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RtSelectionBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RtSelectionBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RtSelectionBondCd,BDMS_01_RT_SELECTION_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RtSelectionBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RtSelectionBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RtSelectionBondCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BondFeatureSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondFeatureSegSqlcd(0);
          msdBondCallMmddyycc.initialize();
     
			setMsdBondCallPrice(BigDecimal.ZERO);
         setBdms01CallRateBondDt(CONSTANTS.SPACE_10);
         setBdms01CallTypePutCd(CONSTANTS.SPACE);
         setBdms01CallFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01CallRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01CallSelectionBondCd(CONSTANTS.SPACE_2);
          msdBondPutMmddyycc.initialize();
     
			setMsdBondPutPrice(BigDecimal.ZERO);
         setBdms01PutRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PutTypePutCd(CONSTANTS.SPACE);
         setBdms01PutFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PutRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PutSelectionBondCd(CONSTANTS.SPACE_2);
                     setMsdBndPrerefDate(0);
			setMsdBndPrerefPrice(BigDecimal.ZERO);
         setBdms01PrerefRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PrefTypePutCd(CONSTANTS.SPACE);
         setBdms01PrefFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PrefRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PrefSelectionBondCd(CONSTANTS.SPACE_2);
                     setMsdBondParCallDate(0);
			setMsdBondParCallPrice(BigDecimal.ZERO);
         setBdms01PcRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PcTypePutCd(CONSTANTS.SPACE);
         setBdms01PcFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PcRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PcSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndRefundDate(CONSTANTS.SPACE_10);
			setBdms01BndRefundPrice(BigDecimal.ZERO);
         setBdms01RfTypePutCd(CONSTANTS.SPACE);
         setBdms01RfFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01RfRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01RfSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01AddtlPutDate(CONSTANTS.SPACE_10);
			setBdms01AddtlPutPrice(BigDecimal.ZERO);
         setBdms01PaTypePutCd(CONSTANTS.SPACE);
         setBdms01PaFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PaRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PaSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndOfferingDate(CONSTANTS.SPACE_10);
			setBdms01BndOfferingPrice(BigDecimal.ZERO);
         setBdms01ExTypePutCd(CONSTANTS.SPACE);
         setBdms01ExFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01ExRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01ExSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndRetractDate(CONSTANTS.SPACE_10);
			setBdms01BndRetractPrice(BigDecimal.ZERO);
         setBdms01RtTypePutCd(CONSTANTS.SPACE);
         setBdms01RtFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01RtRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01RtSelectionBondCd(CONSTANTS.SPACE_2);
   }

		public static int getBdms01BondFeatureSegDataFieldLength() {
			return BDMS_01_BOND_FEATURE_SEG_DATA_LENGTH;
		}

}
  
