package com.cloudframe.app.db2func.dto;

/**
*  The class C1Dtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class C1Dtl extends C1DtlSerialized { 
   


						private char[] isin = Field.fillLowValue(12);


						private char[] sedol = Field.fillLowValue(8);


						private char[] ric = Field.fillLowValue(10);


						private char[] intlkey = Field.fillLowValue(8);


						private char[] company = Field.fillLowValue(40);


						private char[] country = Field.fillLowValue(2);


						private char[] currency = Field.fillLowValue(3);
	
	/**
	* Constructor for C1Dtl
	**/
    public C1Dtl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 14
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 24
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 36
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 92
             ,2
             );
    }


 

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException{
     if (isIsinModified()) { 
        isin = refreshIsin();
     }
   		return isin;
   }

  
	/**
	*  set variable isin
	*  Corresponding COBOL Variable is WS-ISIN
	*  @param value
	**/
   public void setIsin(char[] value) {
      isin = checkIsinConstraints(value);
      serializeIsin(isin);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsin,isin.length);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsin,isin.length);
   	
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
       replace(source,0,source.length(),beginIsin,ISIN_LEN);
   	
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsin,ISIN_LEN);
   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException{
     if (isSedolModified()) { 
        sedol = refreshSedol();
     }
   		return sedol;
   }

  
	/**
	*  set variable sedol
	*  Corresponding COBOL Variable is WS-SEDOL
	*  @param value
	**/
   public void setSedol(char[] value) {
      sedol = checkSedolConstraints(value);
      serializeSedol(sedol);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSedol,sedol.length);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSedol,sedol.length);
   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
       replace(source,0,source.length(),beginSedol,SEDOL_LEN);
   	
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSedol,SEDOL_LEN);
   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException{
     if (isRicModified()) { 
        ric = refreshRic();
     }
   		return ric;
   }

  
	/**
	*  set variable ric
	*  Corresponding COBOL Variable is WS-RIC
	*  @param value
	**/
   public void setRic(char[] value) {
      ric = checkRicConstraints(value);
      serializeRic(ric);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRic,ric.length);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRic,ric.length);
   	
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
       replace(source,0,source.length(),beginRic,RIC_LEN);
   	
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRic,RIC_LEN);
   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException{
     if (isIntlkeyModified()) { 
        intlkey = refreshIntlkey();
     }
   		return intlkey;
   }

  
	/**
	*  set variable intlkey
	*  Corresponding COBOL Variable is WS-INTLKEY
	*  @param value
	**/
   public void setIntlkey(char[] value) {
      intlkey = checkIntlkeyConstraints(value);
      serializeIntlkey(intlkey);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIntlkey,intlkey.length);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey,intlkey.length);
   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
       replace(source,0,source.length(),beginIntlkey,INTLKEY_LEN);
   	
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIntlkey,INTLKEY_LEN);
   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException{
     if (isCompanyModified()) { 
        company = refreshCompany();
     }
   		return company;
   }

  
	/**
	*  set variable company
	*  Corresponding COBOL Variable is WS-COMPANY
	*  @param value
	**/
   public void setCompany(char[] value) {
      company = checkCompanyConstraints(value);
      serializeCompany(company);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompany,company.length);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompany,company.length);
   	
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
       replace(source,0,source.length(),beginCompany,COMPANY_LEN);
   	
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompany,COMPANY_LEN);
   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException{
     if (isCountryModified()) { 
        country = refreshCountry();
     }
   		return country;
   }

  
	/**
	*  set variable country
	*  Corresponding COBOL Variable is WS-COUNTRY
	*  @param value
	**/
   public void setCountry(char[] value) {
      country = checkCountryConstraints(value);
      serializeCountry(country);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountry,country.length);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountry,country.length);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
       replace(source,0,source.length(),beginCountry,COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountry,COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currency
	 *	@return currency
	 */
   public char[] getCurrency() throws CFException{
     if (isCurrencyModified()) { 
        currency = refreshCurrency();
     }
   		return currency;
   }

  
	/**
	*  set variable currency
	*  Corresponding COBOL Variable is WS-CURRENCY
	*  @param value
	**/
   public void setCurrency(char[] value) {
      currency = checkCurrencyConstraints(value);
      serializeCurrency(currency);
   } 

     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrency,currency.length);
   	
   }
   
   public void setCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency,currency.length);
   	
   }
   
     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Currency with another Field
	 *	@param value
	 */
   public void setCurrency(Field source) {
       replace(source,0,source.length(),beginCurrency,CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrency,CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency+targetIndex,targetLen);
    
   }

	
	
	

		public static int getC1DtlFieldLength() {
			return C_1_DTL_LENGTH;
		}

}
  
