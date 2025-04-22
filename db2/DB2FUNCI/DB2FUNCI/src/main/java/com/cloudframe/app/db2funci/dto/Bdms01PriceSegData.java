package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01PriceSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01PriceSegData extends Bdms01PriceSegDataSerialized { 
   

								private int bdms01PriceSegSqlcd;
				private MsdPriceCcyymmdd msdPriceCcyymmdd = new MsdPriceCcyymmdd();

								private BigDecimal msdSecurityPrice = BigDecimal.ZERO;

								private BigDecimal msdSecurityPriceHi = BigDecimal.ZERO;

								private BigDecimal msdSecurityPriceLow = BigDecimal.ZERO;

						private char[] bdms01PriceIssueWhenInd = Field.fillLowValue(1);

						private char[] bdms01PriceExchangeCode = Field.fillLowValue(10);

						private char[] bdms01PriceCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01VendorCd = Field.fillLowValue(5);

						private char[] bdms01PriceSetDt = Field.fillLowValue(10);

						private char[] bdms01PriceCountryCd = Field.fillLowValue(2);

						private char[] bdms01CloseAvSw = Field.fillLowValue(2);

						private char[] bdms01AskHiSw = Field.fillLowValue(2);

						private char[] bdms01BidLoSw = Field.fillLowValue(2);

								private BigDecimal msdHousePrice = BigDecimal.ZERO;

						private char[] msdHousePriceDate = Field.fillLowValue(10);

						private char[] msdHousePriceSource = Field.fillLowValue(15);

						private char[] msdHousePriceRegion = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01PriceSegData
	**/
    public Bdms01PriceSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01PriceSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01PriceSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdPriceCcyymmdd.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of bdms01PriceSegSqlcd
	 *	@return bdms01PriceSegSqlcd
	 */
	public int getBdms01PriceSegSqlcd() throws CFException {
       if (isBdms01PriceSegSqlcdModified()) { 
           bdms01PriceSegSqlcd = refreshBdms01PriceSegSqlcd();
        }
   		return bdms01PriceSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01PriceSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-PRICE-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01PriceSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01PriceSegSqlcd = checkBdms01PriceSegSqlcdMaxLimit(number); 
		serializeBdms01PriceSegSqlcd(bdms01PriceSegSqlcd);
	}
	

	public void setBdms01PriceSegSqlcd(long number) {
	    number = checkBdms01PriceSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01PriceSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01PriceSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01PriceSegSqlcd(char[] value) throws CFException {
		 bdms01PriceSegSqlcd = serializeBdms01PriceSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01PriceSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01PriceSegSqlcdString(char[] value) throws CFException {
		 setBdms01PriceSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdPriceCcyymmdd
	 *	@return msdPriceCcyymmdd
	 */   
	 public MsdPriceCcyymmdd getMsdPriceCcyymmdd() {
   	return msdPriceCcyymmdd;
   }
   /**
	* 	Update MsdPriceCcyymmdd with the passed value
	*   Corresponding COBOL Variable is MSD-PRICE-CCYYMMDD
	*	@param value
	*/
   public void setMsdPriceCcyymmdd(char[] value) {
      msdPriceCcyymmdd.setString(value); 
   }   
    
     /**
	 * 	Update MsdPriceCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdPriceCcyymmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdPriceCcyymmdd.begin,msdPriceCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdPriceCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdPriceCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdPriceCcyymmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdPriceCcyymmdd with another Field
	 *	@param value
	 */
   public void setMsdPriceCcyymmdd(Field source) {
   	replace(source,0,source.length(),msdPriceCcyymmdd.begin,msdPriceCcyymmdd.length());
   }  
   
     /**
	 * 	Update MsdPriceCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdPriceCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdPriceCcyymmdd.begin,msdPriceCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdPriceCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdPriceCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdPriceCcyymmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSecurityPrice
	 *	@return msdSecurityPrice
	 */
	public BigDecimal getMsdSecurityPrice() throws CFException {
       if (isMsdSecurityPriceModified()) { 
           msdSecurityPrice = refreshMsdSecurityPrice();
        }
   		return msdSecurityPrice;
	}
	

	
	   
	/**
	 * 	Update MsdSecurityPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-SECURITY-PRICE
	 *	@param number
	 */
	public void setMsdSecurityPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdSecurityPrice = checkMsdSecurityPriceMaxLimit(number);
	    serializeMsdSecurityPrice(msdSecurityPrice);
   }
	/**
	 * 	Update MsdSecurityPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSecurityPrice(char[] value) throws CFException {
		 msdSecurityPrice = serializeMsdSecurityPrice(value);
	}   
	/**
	 *	Returns the value of msdSecurityPriceHi
	 *	@return msdSecurityPriceHi
	 */
	public BigDecimal getMsdSecurityPriceHi() throws CFException {
       if (isMsdSecurityPriceHiModified()) { 
           msdSecurityPriceHi = refreshMsdSecurityPriceHi();
        }
   		return msdSecurityPriceHi;
	}
	

	
	   
	/**
	 * 	Update MsdSecurityPriceHi with the passed number
	 *  Corresponding COBOL Variable is MSD-SECURITY-PRICE-HI
	 *	@param number
	 */
	public void setMsdSecurityPriceHi(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdSecurityPriceHi = checkMsdSecurityPriceHiMaxLimit(number);
	    serializeMsdSecurityPriceHi(msdSecurityPriceHi);
   }
	/**
	 * 	Update MsdSecurityPriceHi with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSecurityPriceHi(char[] value) throws CFException {
		 msdSecurityPriceHi = serializeMsdSecurityPriceHi(value);
	}   
	/**
	 *	Returns the value of msdSecurityPriceLow
	 *	@return msdSecurityPriceLow
	 */
	public BigDecimal getMsdSecurityPriceLow() throws CFException {
       if (isMsdSecurityPriceLowModified()) { 
           msdSecurityPriceLow = refreshMsdSecurityPriceLow();
        }
   		return msdSecurityPriceLow;
	}
	

	
	   
	/**
	 * 	Update MsdSecurityPriceLow with the passed number
	 *  Corresponding COBOL Variable is MSD-SECURITY-PRICE-LOW
	 *	@param number
	 */
	public void setMsdSecurityPriceLow(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdSecurityPriceLow = checkMsdSecurityPriceLowMaxLimit(number);
	    serializeMsdSecurityPriceLow(msdSecurityPriceLow);
   }
	/**
	 * 	Update MsdSecurityPriceLow with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSecurityPriceLow(char[] value) throws CFException {
		 msdSecurityPriceLow = serializeMsdSecurityPriceLow(value);
	}   
	/**
	 *	Returns the value of bdms01PriceIssueWhenInd
	 *	@return bdms01PriceIssueWhenInd
	 */
   public char[] getBdms01PriceIssueWhenInd() throws CFException{
     if (isBdms01PriceIssueWhenIndModified()) { 
        bdms01PriceIssueWhenInd = refreshBdms01PriceIssueWhenInd();
     }
   		return bdms01PriceIssueWhenInd;
   }

  
	/**
	*  set variable bdms01PriceIssueWhenInd
	*  Corresponding COBOL Variable is BDMS01-PRICE-ISSUE-WHEN-IND
	*  @param value
	**/
   public void setBdms01PriceIssueWhenInd(char[] value) {
      bdms01PriceIssueWhenInd = checkBdms01PriceIssueWhenIndConstraints(value);
      serializeBdms01PriceIssueWhenInd(bdms01PriceIssueWhenInd);
   } 

     /**
	 * 	Update Bdms01PriceIssueWhenInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceIssueWhenInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceIssueWhenInd,bdms01PriceIssueWhenInd.length);
   	
   }
   
   public void setBdms01PriceIssueWhenInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceIssueWhenInd,bdms01PriceIssueWhenInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceIssueWhenInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceIssueWhenInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceIssueWhenInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceIssueWhenInd with another Field
	 *	@param value
	 */
   public void setBdms01PriceIssueWhenInd(Field source) {
       replace(source,0,source.length(),beginBdms01PriceIssueWhenInd,BDMS_01_PRICE_ISSUE_WHEN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceIssueWhenInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceIssueWhenInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceIssueWhenInd,BDMS_01_PRICE_ISSUE_WHEN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceIssueWhenInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceIssueWhenInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceIssueWhenInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PriceExchangeCode
	 *	@return bdms01PriceExchangeCode
	 */
   public char[] getBdms01PriceExchangeCode() throws CFException{
     if (isBdms01PriceExchangeCodeModified()) { 
        bdms01PriceExchangeCode = refreshBdms01PriceExchangeCode();
     }
   		return bdms01PriceExchangeCode;
   }

  
	/**
	*  set variable bdms01PriceExchangeCode
	*  Corresponding COBOL Variable is BDMS01-PRICE-EXCHANGE-CODE
	*  @param value
	**/
   public void setBdms01PriceExchangeCode(char[] value) {
      bdms01PriceExchangeCode = checkBdms01PriceExchangeCodeConstraints(value);
      serializeBdms01PriceExchangeCode(bdms01PriceExchangeCode);
   } 

     /**
	 * 	Update Bdms01PriceExchangeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceExchangeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceExchangeCode,bdms01PriceExchangeCode.length);
   	
   }
   
   public void setBdms01PriceExchangeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceExchangeCode,bdms01PriceExchangeCode.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceExchangeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceExchangeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceExchangeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceExchangeCode with another Field
	 *	@param value
	 */
   public void setBdms01PriceExchangeCode(Field source) {
       replace(source,0,source.length(),beginBdms01PriceExchangeCode,BDMS_01_PRICE_EXCHANGE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceExchangeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceExchangeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceExchangeCode,BDMS_01_PRICE_EXCHANGE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceExchangeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceExchangeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceExchangeCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PriceCurrencyCd
	 *	@return bdms01PriceCurrencyCd
	 */
   public char[] getBdms01PriceCurrencyCd() throws CFException{
     if (isBdms01PriceCurrencyCdModified()) { 
        bdms01PriceCurrencyCd = refreshBdms01PriceCurrencyCd();
     }
   		return bdms01PriceCurrencyCd;
   }

  
	/**
	*  set variable bdms01PriceCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-PRICE-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01PriceCurrencyCd(char[] value) {
      bdms01PriceCurrencyCd = checkBdms01PriceCurrencyCdConstraints(value);
      serializeBdms01PriceCurrencyCd(bdms01PriceCurrencyCd);
   } 

     /**
	 * 	Update Bdms01PriceCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceCurrencyCd,bdms01PriceCurrencyCd.length);
   	
   }
   
   public void setBdms01PriceCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCurrencyCd,bdms01PriceCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01PriceCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01PriceCurrencyCd,BDMS_01_PRICE_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceCurrencyCd,BDMS_01_PRICE_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01VendorCd
	 *	@return bdms01VendorCd
	 */
   public char[] getBdms01VendorCd() throws CFException{
     if (isBdms01VendorCdModified()) { 
        bdms01VendorCd = refreshBdms01VendorCd();
     }
   		return bdms01VendorCd;
   }

  
	/**
	*  set variable bdms01VendorCd
	*  Corresponding COBOL Variable is BDMS01-VENDOR-CD
	*  @param value
	**/
   public void setBdms01VendorCd(char[] value) {
      bdms01VendorCd = checkBdms01VendorCdConstraints(value);
      serializeBdms01VendorCd(bdms01VendorCd);
   } 

     /**
	 * 	Update Bdms01VendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01VendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01VendorCd,bdms01VendorCd.length);
   	
   }
   
   public void setBdms01VendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VendorCd,bdms01VendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01VendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01VendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01VendorCd with another Field
	 *	@param value
	 */
   public void setBdms01VendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01VendorCd,BDMS_01_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01VendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01VendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01VendorCd,BDMS_01_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01VendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01VendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PriceSetDt
	 *	@return bdms01PriceSetDt
	 */
   public char[] getBdms01PriceSetDt() throws CFException{
     if (isBdms01PriceSetDtModified()) { 
        bdms01PriceSetDt = refreshBdms01PriceSetDt();
     }
   		return bdms01PriceSetDt;
   }

  
	/**
	*  set variable bdms01PriceSetDt
	*  Corresponding COBOL Variable is BDMS01-PRICE-SET-DT
	*  @param value
	**/
   public void setBdms01PriceSetDt(char[] value) {
      bdms01PriceSetDt = checkBdms01PriceSetDtConstraints(value);
      serializeBdms01PriceSetDt(bdms01PriceSetDt);
   } 

     /**
	 * 	Update Bdms01PriceSetDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceSetDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceSetDt,bdms01PriceSetDt.length);
   	
   }
   
   public void setBdms01PriceSetDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSetDt,bdms01PriceSetDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceSetDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSetDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSetDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceSetDt with another Field
	 *	@param value
	 */
   public void setBdms01PriceSetDt(Field source) {
       replace(source,0,source.length(),beginBdms01PriceSetDt,BDMS_01_PRICE_SET_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceSetDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceSetDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceSetDt,BDMS_01_PRICE_SET_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceSetDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSetDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSetDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PriceCountryCd
	 *	@return bdms01PriceCountryCd
	 */
   public char[] getBdms01PriceCountryCd() throws CFException{
     if (isBdms01PriceCountryCdModified()) { 
        bdms01PriceCountryCd = refreshBdms01PriceCountryCd();
     }
   		return bdms01PriceCountryCd;
   }

  
	/**
	*  set variable bdms01PriceCountryCd
	*  Corresponding COBOL Variable is BDMS01-PRICE-COUNTRY-CD
	*  @param value
	**/
   public void setBdms01PriceCountryCd(char[] value) {
      bdms01PriceCountryCd = checkBdms01PriceCountryCdConstraints(value);
      serializeBdms01PriceCountryCd(bdms01PriceCountryCd);
   } 

     /**
	 * 	Update Bdms01PriceCountryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceCountryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceCountryCd,bdms01PriceCountryCd.length);
   	
   }
   
   public void setBdms01PriceCountryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCountryCd,bdms01PriceCountryCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceCountryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceCountryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCountryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceCountryCd with another Field
	 *	@param value
	 */
   public void setBdms01PriceCountryCd(Field source) {
       replace(source,0,source.length(),beginBdms01PriceCountryCd,BDMS_01_PRICE_COUNTRY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceCountryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceCountryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceCountryCd,BDMS_01_PRICE_COUNTRY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceCountryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceCountryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceCountryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CloseAvSw
	 *	@return bdms01CloseAvSw
	 */
   public char[] getBdms01CloseAvSw() throws CFException{
     if (isBdms01CloseAvSwModified()) { 
        bdms01CloseAvSw = refreshBdms01CloseAvSw();
     }
   		return bdms01CloseAvSw;
   }

  
	/**
	*  set variable bdms01CloseAvSw
	*  Corresponding COBOL Variable is BDMS01-CLOSE-AV-SW
	*  @param value
	**/
   public void setBdms01CloseAvSw(char[] value) {
      bdms01CloseAvSw = checkBdms01CloseAvSwConstraints(value);
      serializeBdms01CloseAvSw(bdms01CloseAvSw);
   } 

     /**
	 * 	Update Bdms01CloseAvSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CloseAvSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CloseAvSw,bdms01CloseAvSw.length);
   	
   }
   
   public void setBdms01CloseAvSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CloseAvSw,bdms01CloseAvSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01CloseAvSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CloseAvSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CloseAvSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CloseAvSw with another Field
	 *	@param value
	 */
   public void setBdms01CloseAvSw(Field source) {
       replace(source,0,source.length(),beginBdms01CloseAvSw,BDMS_01_CLOSE_AV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CloseAvSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CloseAvSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CloseAvSw,BDMS_01_CLOSE_AV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CloseAvSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CloseAvSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CloseAvSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AskHiSw
	 *	@return bdms01AskHiSw
	 */
   public char[] getBdms01AskHiSw() throws CFException{
     if (isBdms01AskHiSwModified()) { 
        bdms01AskHiSw = refreshBdms01AskHiSw();
     }
   		return bdms01AskHiSw;
   }

  
	/**
	*  set variable bdms01AskHiSw
	*  Corresponding COBOL Variable is BDMS01-ASK-HI-SW
	*  @param value
	**/
   public void setBdms01AskHiSw(char[] value) {
      bdms01AskHiSw = checkBdms01AskHiSwConstraints(value);
      serializeBdms01AskHiSw(bdms01AskHiSw);
   } 

     /**
	 * 	Update Bdms01AskHiSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AskHiSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AskHiSw,bdms01AskHiSw.length);
   	
   }
   
   public void setBdms01AskHiSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AskHiSw,bdms01AskHiSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01AskHiSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AskHiSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AskHiSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AskHiSw with another Field
	 *	@param value
	 */
   public void setBdms01AskHiSw(Field source) {
       replace(source,0,source.length(),beginBdms01AskHiSw,BDMS_01_ASK_HI_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AskHiSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AskHiSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AskHiSw,BDMS_01_ASK_HI_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AskHiSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AskHiSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AskHiSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BidLoSw
	 *	@return bdms01BidLoSw
	 */
   public char[] getBdms01BidLoSw() throws CFException{
     if (isBdms01BidLoSwModified()) { 
        bdms01BidLoSw = refreshBdms01BidLoSw();
     }
   		return bdms01BidLoSw;
   }

  
	/**
	*  set variable bdms01BidLoSw
	*  Corresponding COBOL Variable is BDMS01-BID-LO-SW
	*  @param value
	**/
   public void setBdms01BidLoSw(char[] value) {
      bdms01BidLoSw = checkBdms01BidLoSwConstraints(value);
      serializeBdms01BidLoSw(bdms01BidLoSw);
   } 

     /**
	 * 	Update Bdms01BidLoSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BidLoSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BidLoSw,bdms01BidLoSw.length);
   	
   }
   
   public void setBdms01BidLoSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BidLoSw,bdms01BidLoSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01BidLoSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BidLoSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BidLoSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BidLoSw with another Field
	 *	@param value
	 */
   public void setBdms01BidLoSw(Field source) {
       replace(source,0,source.length(),beginBdms01BidLoSw,BDMS_01_BID_LO_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BidLoSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BidLoSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BidLoSw,BDMS_01_BID_LO_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BidLoSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BidLoSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BidLoSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdHousePrice
	 *	@return msdHousePrice
	 */
	public BigDecimal getMsdHousePrice() throws CFException {
       if (isMsdHousePriceModified()) { 
           msdHousePrice = refreshMsdHousePrice();
        }
   		return msdHousePrice;
	}
	

	
	   
	/**
	 * 	Update MsdHousePrice with the passed number
	 *  Corresponding COBOL Variable is MSD-HOUSE-PRICE
	 *	@param number
	 */
	public void setMsdHousePrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdHousePrice = checkMsdHousePriceMaxLimit(number);
	    serializeMsdHousePrice(msdHousePrice);
   }
	/**
	 * 	Update MsdHousePrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdHousePrice(char[] value) throws CFException {
		 msdHousePrice = serializeMsdHousePrice(value);
	}   
	/**
	 *	Returns the value of msdHousePriceDate
	 *	@return msdHousePriceDate
	 */
   public char[] getMsdHousePriceDate() throws CFException{
     if (isMsdHousePriceDateModified()) { 
        msdHousePriceDate = refreshMsdHousePriceDate();
     }
   		return msdHousePriceDate;
   }

  
	/**
	*  set variable msdHousePriceDate
	*  Corresponding COBOL Variable is MSD-HOUSE-PRICE-DATE
	*  @param value
	**/
   public void setMsdHousePriceDate(char[] value) {
      msdHousePriceDate = checkMsdHousePriceDateConstraints(value);
      serializeMsdHousePriceDate(msdHousePriceDate);
   } 

     /**
	 * 	Update MsdHousePriceDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdHousePriceDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdHousePriceDate,msdHousePriceDate.length);
   	
   }
   
   public void setMsdHousePriceDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceDate,msdHousePriceDate.length);
   	
   }
   
     /**
	 * 	Update MsdHousePriceDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdHousePriceDate with another Field
	 *	@param value
	 */
   public void setMsdHousePriceDate(Field source) {
       replace(source,0,source.length(),beginMsdHousePriceDate,MSD_HOUSE_PRICE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdHousePriceDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdHousePriceDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdHousePriceDate,MSD_HOUSE_PRICE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update MsdHousePriceDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdHousePriceSource
	 *	@return msdHousePriceSource
	 */
   public char[] getMsdHousePriceSource() throws CFException{
     if (isMsdHousePriceSourceModified()) { 
        msdHousePriceSource = refreshMsdHousePriceSource();
     }
   		return msdHousePriceSource;
   }

  
	/**
	*  set variable msdHousePriceSource
	*  Corresponding COBOL Variable is MSD-HOUSE-PRICE-SOURCE
	*  @param value
	**/
   public void setMsdHousePriceSource(char[] value) {
      msdHousePriceSource = checkMsdHousePriceSourceConstraints(value);
      serializeMsdHousePriceSource(msdHousePriceSource);
   } 

     /**
	 * 	Update MsdHousePriceSource 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdHousePriceSource(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdHousePriceSource,msdHousePriceSource.length);
   	
   }
   
   public void setMsdHousePriceSource(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceSource,msdHousePriceSource.length);
   	
   }
   
     /**
	 * 	Update MsdHousePriceSource 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceSource(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceSource+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdHousePriceSource with another Field
	 *	@param value
	 */
   public void setMsdHousePriceSource(Field source) {
       replace(source,0,source.length(),beginMsdHousePriceSource,MSD_HOUSE_PRICE_SOURCE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdHousePriceSource 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdHousePriceSource(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdHousePriceSource,MSD_HOUSE_PRICE_SOURCE_LEN);
   	
   }
   
     /**
	 * 	Update MsdHousePriceSource 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceSource(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceSource+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdHousePriceRegion
	 *	@return msdHousePriceRegion
	 */
   public char[] getMsdHousePriceRegion() throws CFException{
     if (isMsdHousePriceRegionModified()) { 
        msdHousePriceRegion = refreshMsdHousePriceRegion();
     }
   		return msdHousePriceRegion;
   }

  
	/**
	*  set variable msdHousePriceRegion
	*  Corresponding COBOL Variable is MSD-HOUSE-PRICE-REGION
	*  @param value
	**/
   public void setMsdHousePriceRegion(char[] value) {
      msdHousePriceRegion = checkMsdHousePriceRegionConstraints(value);
      serializeMsdHousePriceRegion(msdHousePriceRegion);
   } 

     /**
	 * 	Update MsdHousePriceRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdHousePriceRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdHousePriceRegion,msdHousePriceRegion.length);
   	
   }
   
   public void setMsdHousePriceRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceRegion,msdHousePriceRegion.length);
   	
   }
   
     /**
	 * 	Update MsdHousePriceRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdHousePriceRegion with another Field
	 *	@param value
	 */
   public void setMsdHousePriceRegion(Field source) {
       replace(source,0,source.length(),beginMsdHousePriceRegion,MSD_HOUSE_PRICE_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update MsdHousePriceRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdHousePriceRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdHousePriceRegion,MSD_HOUSE_PRICE_REGION_LEN);
   	
   }
   
     /**
	 * 	Update MsdHousePriceRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdHousePriceRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdHousePriceRegion+targetIndex,targetLen);
    
   }
	char[] msdHousePriceNa88Value1 = "N".toCharArray();
char[] msdHousePriceNa88Value2 = " ".toCharArray();

	/**
	 *	Test condition "N" " " for isMsdHousePriceNa()
	 *	@return  Returns true if isMsdHousePriceNa() is "N" " "
	 */
   public boolean isMsdHousePriceNa() throws CFException {
      return (  compareChars( getMsdHousePriceRegion() , msdHousePriceNa88Value1)  == 0  ||  compareChars( getMsdHousePriceRegion() , msdHousePriceNa88Value2)  == 0  );
   }


	/**
	*  set values "N" " "
	*/
   	public void setMsdHousePriceNaTrue() {  			
    	setMsdHousePriceRegion( msdHousePriceNa88Value1);
   	}
	char[] msdHousePriceEmea88Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isMsdHousePriceEmea()
	 *	@return  Returns true if isMsdHousePriceEmea() is "E"
	 */
   public boolean isMsdHousePriceEmea() throws CFException {
      return (  compareChars( getMsdHousePriceRegion() , msdHousePriceEmea88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setMsdHousePriceEmeaTrue() {  			
    	setMsdHousePriceRegion( msdHousePriceEmea88Value);
   	}

	
	
	
	/**
	 * 	initializes Bdms01PriceSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01PriceSegSqlcd(0);
          msdPriceCcyymmdd.initialize();
     
			setMsdSecurityPrice(BigDecimal.ZERO);
			setMsdSecurityPriceHi(BigDecimal.ZERO);
			setMsdSecurityPriceLow(BigDecimal.ZERO);
         setBdms01PriceIssueWhenInd(CONSTANTS.SPACE);
         setBdms01PriceExchangeCode(CONSTANTS.SPACE_10);
         setBdms01PriceCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01VendorCd(CONSTANTS.SPACE_5);
         setBdms01PriceSetDt(CONSTANTS.SPACE_10);
         setBdms01PriceCountryCd(CONSTANTS.SPACE_2);
         setBdms01CloseAvSw(CONSTANTS.SPACE_2);
         setBdms01AskHiSw(CONSTANTS.SPACE_2);
         setBdms01BidLoSw(CONSTANTS.SPACE_2);
			setMsdHousePrice(BigDecimal.ZERO);
         setMsdHousePriceDate(CONSTANTS.SPACE_10);
         setMsdHousePriceSource(CONSTANTS.SPACE_15);
         setMsdHousePriceRegion(CONSTANTS.SPACE);
   }

		public static int getBdms01PriceSegDataFieldLength() {
			return BDMS_01_PRICE_SEG_DATA_LENGTH;
		}

}
  
