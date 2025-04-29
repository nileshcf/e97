package com.cloudframe.app.db2func.dto;

/**
*  The class Dclvcrrexrt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Dclvcrrexrt extends DclvcrrexrtSerialized {
   

						private char[] currencyCd = Field.fillLowValue(2);

								private BigDecimal exchangeRateAmt;
	
	/**
	* Constructor for Dclvcrrexrt
	**/
    public Dclvcrrexrt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currencyCd
	 *	@return currencyCd
	 */
   public char[] getCurrencyCd() throws CFException{
     if (isCurrencyCdModified()) { 
        currencyCd = refreshCurrencyCd();
     }
   		return currencyCd;
   }

  
	/**
	*  set variable currencyCd
	*  Corresponding COBOL Variable is CURRENCY-CD
	*  @param value
	**/
   public void setCurrencyCd(char[] value) {
      currencyCd = checkCurrencyCdConstraints(value);
      serializeCurrencyCd(currencyCd);
   } 

     /**
	 * 	Update CurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrencyCd,currencyCd.length);
   	
   }
   
   public void setCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCd,currencyCd.length);
   	
   }
   
     /**
	 * 	Update CurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrencyCd with another Field
	 *	@param value
	 */
   public void setCurrencyCd(Field source) {
       replace(source,0,source.length(),beginCurrencyCd,CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrencyCd,CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update CurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exchangeRateAmt
	 *	@return exchangeRateAmt
	 */
   public BigDecimal getExchangeRateAmt() {
	if (isExchangeRateAmtModified()) {
		exchangeRateAmt = refreshExchangeRateAmt();
	}
   	return exchangeRateAmt;
   }

  
	/**
	*  set variable exchangeRateAmt
	*  @param value
	**/
   public void setExchangeRateAmt(BigDecimal value) {
	setExchangeRateAmt(value, true);
   } 


	/**
	 *	Update ExchangeRateAmt with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setExchangeRateAmt(BigDecimal value,boolean setModified) {
      exchangeRateAmt = value;
      if (setModified) {
          serializeExchangeRateAmt(value);
      }
   }  
	
	

	
	
	

		public static int getDclvcrrexrtFieldLength() {
			return DCLVCRREXRT_LENGTH;
		}

}
  
