package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01GetpriceSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01GetpriceSegData extends Bdms01GetpriceSegDataSerialized { 
   

								private int bdms01GetpriceSegSqlcd;

						private char[] bdms01GetprcRetPriceDate = Field.fillLowValue(10);

						private char[] bdms01GetprcRetCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01GetprcRetExchangeCd = Field.fillLowValue(10);

						private char[] bdms01GetprcRetVendorCd = Field.fillLowValue(10);

						private char[] bdms01GetprcRetWiInd = Field.fillLowValue(1);

						private char[] bdms01GetprcRetCountryCd = Field.fillLowValue(2);

						private char[] bdms01GetprcRetCloseAvSw = Field.fillLowValue(2);

								private BigDecimal bdms01GetprcRetCloseAvPrc = BigDecimal.ZERO;

						private char[] bdms01GetprcRetAskHiSw = Field.fillLowValue(2);

								private BigDecimal bdms01GetprcRetAskHiPrc = BigDecimal.ZERO;

						private char[] bdms01GetprcRetBidLoSw = Field.fillLowValue(2);

								private BigDecimal bdms01GetprcRetBidLoPrc = BigDecimal.ZERO;

	
	/**
	* Constructor for Bdms01GetpriceSegData
	**/
    public Bdms01GetpriceSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01GetpriceSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01GetpriceSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01GetpriceSegSqlcd
	 *	@return bdms01GetpriceSegSqlcd
	 */
	public int getBdms01GetpriceSegSqlcd() throws CFException {
       if (isBdms01GetpriceSegSqlcdModified()) { 
           bdms01GetpriceSegSqlcd = refreshBdms01GetpriceSegSqlcd();
        }
   		return bdms01GetpriceSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01GetpriceSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-GETPRICE-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01GetpriceSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01GetpriceSegSqlcd = checkBdms01GetpriceSegSqlcdMaxLimit(number); 
		serializeBdms01GetpriceSegSqlcd(bdms01GetpriceSegSqlcd);
	}
	

	public void setBdms01GetpriceSegSqlcd(long number) {
	    number = checkBdms01GetpriceSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01GetpriceSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01GetpriceSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01GetpriceSegSqlcd(char[] value) throws CFException {
		 bdms01GetpriceSegSqlcd = serializeBdms01GetpriceSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01GetpriceSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01GetpriceSegSqlcdString(char[] value) throws CFException {
		 setBdms01GetpriceSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01GetprcRetPriceDate
	 *	@return bdms01GetprcRetPriceDate
	 */
   public char[] getBdms01GetprcRetPriceDate() throws CFException{
     if (isBdms01GetprcRetPriceDateModified()) { 
        bdms01GetprcRetPriceDate = refreshBdms01GetprcRetPriceDate();
     }
   		return bdms01GetprcRetPriceDate;
   }

  
	/**
	*  set variable bdms01GetprcRetPriceDate
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-PRICE-DATE
	*  @param value
	**/
   public void setBdms01GetprcRetPriceDate(char[] value) {
      bdms01GetprcRetPriceDate = checkBdms01GetprcRetPriceDateConstraints(value);
      serializeBdms01GetprcRetPriceDate(bdms01GetprcRetPriceDate);
   } 

     /**
	 * 	Update Bdms01GetprcRetPriceDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetPriceDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetPriceDate,bdms01GetprcRetPriceDate.length);
   	
   }
   
   public void setBdms01GetprcRetPriceDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetPriceDate,bdms01GetprcRetPriceDate.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetPriceDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetPriceDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetPriceDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetPriceDate with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetPriceDate(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetPriceDate,BDMS_01_GETPRC_RET_PRICE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetPriceDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetPriceDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetPriceDate,BDMS_01_GETPRC_RET_PRICE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetPriceDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetPriceDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetPriceDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetCurrencyCd
	 *	@return bdms01GetprcRetCurrencyCd
	 */
   public char[] getBdms01GetprcRetCurrencyCd() throws CFException{
     if (isBdms01GetprcRetCurrencyCdModified()) { 
        bdms01GetprcRetCurrencyCd = refreshBdms01GetprcRetCurrencyCd();
     }
   		return bdms01GetprcRetCurrencyCd;
   }

  
	/**
	*  set variable bdms01GetprcRetCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01GetprcRetCurrencyCd(char[] value) {
      bdms01GetprcRetCurrencyCd = checkBdms01GetprcRetCurrencyCdConstraints(value);
      serializeBdms01GetprcRetCurrencyCd(bdms01GetprcRetCurrencyCd);
   } 

     /**
	 * 	Update Bdms01GetprcRetCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetCurrencyCd,bdms01GetprcRetCurrencyCd.length);
   	
   }
   
   public void setBdms01GetprcRetCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCurrencyCd,bdms01GetprcRetCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetCurrencyCd,BDMS_01_GETPRC_RET_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCurrencyCd,BDMS_01_GETPRC_RET_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetExchangeCd
	 *	@return bdms01GetprcRetExchangeCd
	 */
   public char[] getBdms01GetprcRetExchangeCd() throws CFException{
     if (isBdms01GetprcRetExchangeCdModified()) { 
        bdms01GetprcRetExchangeCd = refreshBdms01GetprcRetExchangeCd();
     }
   		return bdms01GetprcRetExchangeCd;
   }

  
	/**
	*  set variable bdms01GetprcRetExchangeCd
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01GetprcRetExchangeCd(char[] value) {
      bdms01GetprcRetExchangeCd = checkBdms01GetprcRetExchangeCdConstraints(value);
      serializeBdms01GetprcRetExchangeCd(bdms01GetprcRetExchangeCd);
   } 

     /**
	 * 	Update Bdms01GetprcRetExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetExchangeCd,bdms01GetprcRetExchangeCd.length);
   	
   }
   
   public void setBdms01GetprcRetExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetExchangeCd,bdms01GetprcRetExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetExchangeCd,BDMS_01_GETPRC_RET_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetExchangeCd,BDMS_01_GETPRC_RET_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetVendorCd
	 *	@return bdms01GetprcRetVendorCd
	 */
   public char[] getBdms01GetprcRetVendorCd() throws CFException{
     if (isBdms01GetprcRetVendorCdModified()) { 
        bdms01GetprcRetVendorCd = refreshBdms01GetprcRetVendorCd();
     }
   		return bdms01GetprcRetVendorCd;
   }

  
	/**
	*  set variable bdms01GetprcRetVendorCd
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-VENDOR-CD
	*  @param value
	**/
   public void setBdms01GetprcRetVendorCd(char[] value) {
      bdms01GetprcRetVendorCd = checkBdms01GetprcRetVendorCdConstraints(value);
      serializeBdms01GetprcRetVendorCd(bdms01GetprcRetVendorCd);
   } 

     /**
	 * 	Update Bdms01GetprcRetVendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetVendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetVendorCd,bdms01GetprcRetVendorCd.length);
   	
   }
   
   public void setBdms01GetprcRetVendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetVendorCd,bdms01GetprcRetVendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetVendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetVendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetVendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetVendorCd with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetVendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetVendorCd,BDMS_01_GETPRC_RET_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetVendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetVendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetVendorCd,BDMS_01_GETPRC_RET_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetVendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetVendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetVendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetWiInd
	 *	@return bdms01GetprcRetWiInd
	 */
   public char[] getBdms01GetprcRetWiInd() throws CFException{
     if (isBdms01GetprcRetWiIndModified()) { 
        bdms01GetprcRetWiInd = refreshBdms01GetprcRetWiInd();
     }
   		return bdms01GetprcRetWiInd;
   }

  
	/**
	*  set variable bdms01GetprcRetWiInd
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-WI-IND
	*  @param value
	**/
   public void setBdms01GetprcRetWiInd(char[] value) {
      bdms01GetprcRetWiInd = checkBdms01GetprcRetWiIndConstraints(value);
      serializeBdms01GetprcRetWiInd(bdms01GetprcRetWiInd);
   } 

     /**
	 * 	Update Bdms01GetprcRetWiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetWiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetWiInd,bdms01GetprcRetWiInd.length);
   	
   }
   
   public void setBdms01GetprcRetWiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetWiInd,bdms01GetprcRetWiInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetWiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetWiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetWiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetWiInd with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetWiInd(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetWiInd,BDMS_01_GETPRC_RET_WI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetWiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetWiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetWiInd,BDMS_01_GETPRC_RET_WI_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetWiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetWiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetWiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetCountryCd
	 *	@return bdms01GetprcRetCountryCd
	 */
   public char[] getBdms01GetprcRetCountryCd() throws CFException{
     if (isBdms01GetprcRetCountryCdModified()) { 
        bdms01GetprcRetCountryCd = refreshBdms01GetprcRetCountryCd();
     }
   		return bdms01GetprcRetCountryCd;
   }

  
	/**
	*  set variable bdms01GetprcRetCountryCd
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-COUNTRY-CD
	*  @param value
	**/
   public void setBdms01GetprcRetCountryCd(char[] value) {
      bdms01GetprcRetCountryCd = checkBdms01GetprcRetCountryCdConstraints(value);
      serializeBdms01GetprcRetCountryCd(bdms01GetprcRetCountryCd);
   } 

     /**
	 * 	Update Bdms01GetprcRetCountryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetCountryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetCountryCd,bdms01GetprcRetCountryCd.length);
   	
   }
   
   public void setBdms01GetprcRetCountryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCountryCd,bdms01GetprcRetCountryCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCountryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCountryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCountryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetCountryCd with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetCountryCd(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetCountryCd,BDMS_01_GETPRC_RET_COUNTRY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetCountryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetCountryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCountryCd,BDMS_01_GETPRC_RET_COUNTRY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCountryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCountryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCountryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetCloseAvSw
	 *	@return bdms01GetprcRetCloseAvSw
	 */
   public char[] getBdms01GetprcRetCloseAvSw() throws CFException{
     if (isBdms01GetprcRetCloseAvSwModified()) { 
        bdms01GetprcRetCloseAvSw = refreshBdms01GetprcRetCloseAvSw();
     }
   		return bdms01GetprcRetCloseAvSw;
   }

  
	/**
	*  set variable bdms01GetprcRetCloseAvSw
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-CLOSE-AV-SW
	*  @param value
	**/
   public void setBdms01GetprcRetCloseAvSw(char[] value) {
      bdms01GetprcRetCloseAvSw = checkBdms01GetprcRetCloseAvSwConstraints(value);
      serializeBdms01GetprcRetCloseAvSw(bdms01GetprcRetCloseAvSw);
   } 

     /**
	 * 	Update Bdms01GetprcRetCloseAvSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetCloseAvSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetCloseAvSw,bdms01GetprcRetCloseAvSw.length);
   	
   }
   
   public void setBdms01GetprcRetCloseAvSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCloseAvSw,bdms01GetprcRetCloseAvSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCloseAvSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCloseAvSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCloseAvSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetCloseAvSw with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetCloseAvSw(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetCloseAvSw,BDMS_01_GETPRC_RET_CLOSE_AV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetCloseAvSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetCloseAvSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCloseAvSw,BDMS_01_GETPRC_RET_CLOSE_AV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetCloseAvSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetCloseAvSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetCloseAvSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetCloseAvPrc
	 *	@return bdms01GetprcRetCloseAvPrc
	 */
	public BigDecimal getBdms01GetprcRetCloseAvPrc() throws CFException {
       if (isBdms01GetprcRetCloseAvPrcModified()) { 
           bdms01GetprcRetCloseAvPrc = refreshBdms01GetprcRetCloseAvPrc();
        }
   		return bdms01GetprcRetCloseAvPrc;
	}
	

	
	   
	/**
	 * 	Update Bdms01GetprcRetCloseAvPrc with the passed number
	 *  Corresponding COBOL Variable is BDMS01-GETPRC-RET-CLOSE-AV-PRC
	 *	@param number
	 */
	public void setBdms01GetprcRetCloseAvPrc(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01GetprcRetCloseAvPrc = checkBdms01GetprcRetCloseAvPrcMaxLimit(number);
	    serializeBdms01GetprcRetCloseAvPrc(bdms01GetprcRetCloseAvPrc);
   }
	/**
	 * 	Update Bdms01GetprcRetCloseAvPrc with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01GetprcRetCloseAvPrc(char[] value) throws CFException {
		 bdms01GetprcRetCloseAvPrc = serializeBdms01GetprcRetCloseAvPrc(value);
	}   
	/**
	 *	Returns the value of bdms01GetprcRetAskHiSw
	 *	@return bdms01GetprcRetAskHiSw
	 */
   public char[] getBdms01GetprcRetAskHiSw() throws CFException{
     if (isBdms01GetprcRetAskHiSwModified()) { 
        bdms01GetprcRetAskHiSw = refreshBdms01GetprcRetAskHiSw();
     }
   		return bdms01GetprcRetAskHiSw;
   }

  
	/**
	*  set variable bdms01GetprcRetAskHiSw
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-ASK-HI-SW
	*  @param value
	**/
   public void setBdms01GetprcRetAskHiSw(char[] value) {
      bdms01GetprcRetAskHiSw = checkBdms01GetprcRetAskHiSwConstraints(value);
      serializeBdms01GetprcRetAskHiSw(bdms01GetprcRetAskHiSw);
   } 

     /**
	 * 	Update Bdms01GetprcRetAskHiSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetAskHiSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetAskHiSw,bdms01GetprcRetAskHiSw.length);
   	
   }
   
   public void setBdms01GetprcRetAskHiSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetAskHiSw,bdms01GetprcRetAskHiSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetAskHiSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetAskHiSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetAskHiSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetAskHiSw with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetAskHiSw(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetAskHiSw,BDMS_01_GETPRC_RET_ASK_HI_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetAskHiSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetAskHiSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetAskHiSw,BDMS_01_GETPRC_RET_ASK_HI_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetAskHiSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetAskHiSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetAskHiSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetAskHiPrc
	 *	@return bdms01GetprcRetAskHiPrc
	 */
	public BigDecimal getBdms01GetprcRetAskHiPrc() throws CFException {
       if (isBdms01GetprcRetAskHiPrcModified()) { 
           bdms01GetprcRetAskHiPrc = refreshBdms01GetprcRetAskHiPrc();
        }
   		return bdms01GetprcRetAskHiPrc;
	}
	

	
	   
	/**
	 * 	Update Bdms01GetprcRetAskHiPrc with the passed number
	 *  Corresponding COBOL Variable is BDMS01-GETPRC-RET-ASK-HI-PRC
	 *	@param number
	 */
	public void setBdms01GetprcRetAskHiPrc(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01GetprcRetAskHiPrc = checkBdms01GetprcRetAskHiPrcMaxLimit(number);
	    serializeBdms01GetprcRetAskHiPrc(bdms01GetprcRetAskHiPrc);
   }
	/**
	 * 	Update Bdms01GetprcRetAskHiPrc with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01GetprcRetAskHiPrc(char[] value) throws CFException {
		 bdms01GetprcRetAskHiPrc = serializeBdms01GetprcRetAskHiPrc(value);
	}   
	/**
	 *	Returns the value of bdms01GetprcRetBidLoSw
	 *	@return bdms01GetprcRetBidLoSw
	 */
   public char[] getBdms01GetprcRetBidLoSw() throws CFException{
     if (isBdms01GetprcRetBidLoSwModified()) { 
        bdms01GetprcRetBidLoSw = refreshBdms01GetprcRetBidLoSw();
     }
   		return bdms01GetprcRetBidLoSw;
   }

  
	/**
	*  set variable bdms01GetprcRetBidLoSw
	*  Corresponding COBOL Variable is BDMS01-GETPRC-RET-BID-LO-SW
	*  @param value
	**/
   public void setBdms01GetprcRetBidLoSw(char[] value) {
      bdms01GetprcRetBidLoSw = checkBdms01GetprcRetBidLoSwConstraints(value);
      serializeBdms01GetprcRetBidLoSw(bdms01GetprcRetBidLoSw);
   } 

     /**
	 * 	Update Bdms01GetprcRetBidLoSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetprcRetBidLoSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetprcRetBidLoSw,bdms01GetprcRetBidLoSw.length);
   	
   }
   
   public void setBdms01GetprcRetBidLoSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetBidLoSw,bdms01GetprcRetBidLoSw.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetBidLoSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetBidLoSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetBidLoSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetprcRetBidLoSw with another Field
	 *	@param value
	 */
   public void setBdms01GetprcRetBidLoSw(Field source) {
       replace(source,0,source.length(),beginBdms01GetprcRetBidLoSw,BDMS_01_GETPRC_RET_BID_LO_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetprcRetBidLoSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetprcRetBidLoSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetBidLoSw,BDMS_01_GETPRC_RET_BID_LO_SW_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetprcRetBidLoSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetprcRetBidLoSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetprcRetBidLoSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetprcRetBidLoPrc
	 *	@return bdms01GetprcRetBidLoPrc
	 */
	public BigDecimal getBdms01GetprcRetBidLoPrc() throws CFException {
       if (isBdms01GetprcRetBidLoPrcModified()) { 
           bdms01GetprcRetBidLoPrc = refreshBdms01GetprcRetBidLoPrc();
        }
   		return bdms01GetprcRetBidLoPrc;
	}
	

	
	   
	/**
	 * 	Update Bdms01GetprcRetBidLoPrc with the passed number
	 *  Corresponding COBOL Variable is BDMS01-GETPRC-RET-BID-LO-PRC
	 *	@param number
	 */
	public void setBdms01GetprcRetBidLoPrc(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01GetprcRetBidLoPrc = checkBdms01GetprcRetBidLoPrcMaxLimit(number);
	    serializeBdms01GetprcRetBidLoPrc(bdms01GetprcRetBidLoPrc);
   }
	/**
	 * 	Update Bdms01GetprcRetBidLoPrc with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01GetprcRetBidLoPrc(char[] value) throws CFException {
		 bdms01GetprcRetBidLoPrc = serializeBdms01GetprcRetBidLoPrc(value);
	}   

	
	
	
	/**
	 * 	initializes Bdms01GetpriceSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01GetpriceSegSqlcd(0);
         setBdms01GetprcRetPriceDate(CONSTANTS.SPACE_10);
         setBdms01GetprcRetCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01GetprcRetExchangeCd(CONSTANTS.SPACE_10);
         setBdms01GetprcRetVendorCd(CONSTANTS.SPACE_10);
         setBdms01GetprcRetWiInd(CONSTANTS.SPACE);
         setBdms01GetprcRetCountryCd(CONSTANTS.SPACE_2);
         setBdms01GetprcRetCloseAvSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetCloseAvPrc(BigDecimal.ZERO);
         setBdms01GetprcRetAskHiSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetAskHiPrc(BigDecimal.ZERO);
         setBdms01GetprcRetBidLoSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetBidLoPrc(BigDecimal.ZERO);
   }

		public static int getBdms01GetpriceSegDataFieldLength() {
			return BDMS_01_GETPRICE_SEG_DATA_LENGTH;
		}

}
  
