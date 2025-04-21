package com.cloudframe.app.dlcrntof.dto;

/**
*  The class Dcltbdelsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbdelsec extends DcltbdelsecSerialized {
   

						private char[] isin = Field.fillLowValue(12);

						private char[] sedol = Field.fillLowValue(8);

						private char[] ric = Field.fillLowValue(10);

						private char[] intlkey = Field.fillLowValue(8);

						private char[] company = Field.fillLowValue(40);

						private char[] country = Field.fillLowValue(2);
	
	/**
	* Constructor for Dcltbdelsec
	**/
    public Dcltbdelsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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
	*  Corresponding COBOL Variable is ISIN
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
	*  Corresponding COBOL Variable is SEDOL
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
	*  Corresponding COBOL Variable is RIC
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
	*  Corresponding COBOL Variable is INTLKEY
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
	*  Corresponding COBOL Variable is COMPANY
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
	*  Corresponding COBOL Variable is COUNTRY
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

	
	
	

		public static int getDcltbdelsecFieldLength() {
			return DCLTBDELSEC_LENGTH;
		}

}
  
