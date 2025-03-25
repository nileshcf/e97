package org.optum.uhg.dto.cics0012;

/**
*  The class LsOutputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0012.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsOutputData extends LsOutputDataSerialized { 
   

						private char[] isin01 = Field.fillLowValue(12);

						private char[] sedol01 = Field.fillLowValue(8);

						private char[] ric01 = Field.fillLowValue(10);

						private char[] intlkey01 = Field.fillLowValue(8);

						private char[] company01 = Field.fillLowValue(40);

						private char[] country01 = Field.fillLowValue(2);

						private char[] currencycd01 = Field.fillLowValue(3);

						private char[] industry01 = Field.fillLowValue(40);

						private char[] sector01 = Field.fillLowValue(40);

								private int ffmcapmilusd01;

						private char[] sectorweight01 = Field.fillLowValue(8);
	
	/**
	* Constructor for LsOutputData
	**/
    public LsOutputData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LsOutputData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsOutputData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException{
     if (isIsin01Modified()) { 
        isin01 = refreshIsin01();
     }
   		return isin01;
   }

  
	/**
	*  set variable isin01
	*  Corresponding COBOL Variable is ISIN
	*  @param value
	**/
   public void setIsin01(char[] value) {
      isin01 = checkIsin01Constraints(value);
      serializeIsin01(isin01);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsin01,isin01.length);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsin01,isin01.length);
   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
       replace(source,0,source.length(),beginIsin01,ISIN_01_LEN);
   	
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsin01,ISIN_01_LEN);
   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsin01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01() throws CFException{
     if (isSedol01Modified()) { 
        sedol01 = refreshSedol01();
     }
   		return sedol01;
   }

  
	/**
	*  set variable sedol01
	*  Corresponding COBOL Variable is SEDOL
	*  @param value
	**/
   public void setSedol01(char[] value) {
      sedol01 = checkSedol01Constraints(value);
      serializeSedol01(sedol01);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSedol01,sedol01.length);
   	
   }
   
   public void setSedol01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSedol01,sedol01.length);
   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(Field source) {
       replace(source,0,source.length(),beginSedol01,SEDOL_01_LEN);
   	
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSedol01,SEDOL_01_LEN);
   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSedol01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01() throws CFException{
     if (isRic01Modified()) { 
        ric01 = refreshRic01();
     }
   		return ric01;
   }

  
	/**
	*  set variable ric01
	*  Corresponding COBOL Variable is RIC
	*  @param value
	**/
   public void setRic01(char[] value) {
      ric01 = checkRic01Constraints(value);
      serializeRic01(ric01);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRic01,ric01.length);
   	
   }
   
   public void setRic01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRic01,ric01.length);
   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(Field source) {
       replace(source,0,source.length(),beginRic01,RIC_01_LEN);
   	
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRic01,RIC_01_LEN);
   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRic01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01() throws CFException{
     if (isIntlkey01Modified()) { 
        intlkey01 = refreshIntlkey01();
     }
   		return intlkey01;
   }

  
	/**
	*  set variable intlkey01
	*  Corresponding COBOL Variable is INTLKEY
	*  @param value
	**/
   public void setIntlkey01(char[] value) {
      intlkey01 = checkIntlkey01Constraints(value);
      serializeIntlkey01(intlkey01);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIntlkey01,intlkey01.length);
   	
   }
   
   public void setIntlkey01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey01,intlkey01.length);
   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(Field source) {
       replace(source,0,source.length(),beginIntlkey01,INTLKEY_01_LEN);
   	
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIntlkey01,INTLKEY_01_LEN);
   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIntlkey01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01() throws CFException{
     if (isCompany01Modified()) { 
        company01 = refreshCompany01();
     }
   		return company01;
   }

  
	/**
	*  set variable company01
	*  Corresponding COBOL Variable is COMPANY
	*  @param value
	**/
   public void setCompany01(char[] value) {
      company01 = checkCompany01Constraints(value);
      serializeCompany01(company01);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompany01,company01.length);
   	
   }
   
   public void setCompany01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompany01,company01.length);
   	
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(Field source) {
       replace(source,0,source.length(),beginCompany01,COMPANY_01_LEN);
   	
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompany01,COMPANY_01_LEN);
   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompany01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01() throws CFException{
     if (isCountry01Modified()) { 
        country01 = refreshCountry01();
     }
   		return country01;
   }

  
	/**
	*  set variable country01
	*  Corresponding COBOL Variable is COUNTRY
	*  @param value
	**/
   public void setCountry01(char[] value) {
      country01 = checkCountry01Constraints(value);
      serializeCountry01(country01);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountry01,country01.length);
   	
   }
   
   public void setCountry01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountry01,country01.length);
   	
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(Field source) {
       replace(source,0,source.length(),beginCountry01,COUNTRY_01_LEN);
   	
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountry01,COUNTRY_01_LEN);
   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01() throws CFException{
     if (isCurrencycd01Modified()) { 
        currencycd01 = refreshCurrencycd01();
     }
   		return currencycd01;
   }

  
	/**
	*  set variable currencycd01
	*  Corresponding COBOL Variable is CURRENCYCD
	*  @param value
	**/
   public void setCurrencycd01(char[] value) {
      currencycd01 = checkCurrencycd01Constraints(value);
      serializeCurrencycd01(currencycd01);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrencycd01,currencycd01.length);
   	
   }
   
   public void setCurrencycd01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencycd01,currencycd01.length);
   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencycd01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(Field source) {
       replace(source,0,source.length(),beginCurrencycd01,CURRENCYCD_01_LEN);
   	
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrencycd01,CURRENCYCD_01_LEN);
   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrencycd01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01() throws CFException{
     if (isIndustry01Modified()) { 
        industry01 = refreshIndustry01();
     }
   		return industry01;
   }

  
	/**
	*  set variable industry01
	*  Corresponding COBOL Variable is INDUSTRY
	*  @param value
	**/
   public void setIndustry01(char[] value) {
      industry01 = checkIndustry01Constraints(value);
      serializeIndustry01(industry01);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIndustry01,industry01.length);
   	
   }
   
   public void setIndustry01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry01,industry01.length);
   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(Field source) {
       replace(source,0,source.length(),beginIndustry01,INDUSTRY_01_LEN);
   	
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIndustry01,INDUSTRY_01_LEN);
   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01() throws CFException{
     if (isSector01Modified()) { 
        sector01 = refreshSector01();
     }
   		return sector01;
   }

  
	/**
	*  set variable sector01
	*  Corresponding COBOL Variable is SECTOR
	*  @param value
	**/
   public void setSector01(char[] value) {
      sector01 = checkSector01Constraints(value);
      serializeSector01(sector01);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSector01,sector01.length);
   	
   }
   
   public void setSector01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSector01,sector01.length);
   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(Field source) {
       replace(source,0,source.length(),beginSector01,SECTOR_01_LEN);
   	
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSector01,SECTOR_01_LEN);
   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01() throws CFException {
        if (isFfmcapmilusd01Modified()) { 
           ffmcapmilusd01 = refreshFfmcapmilusd01();
        }
   		return ffmcapmilusd01;
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *  Corresponding COBOL Variable is FFMCAPMILUSD
	 *	@param number
	 */
	public void setFfmcapmilusd01(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ffmcapmilusd01 = checkFfmcapmilusd01MaxLimit(number); 
		serializeFfmcapmilusd01(ffmcapmilusd01);
	}


	public void setFfmcapmilusd01(long number) {
	    number = checkFfmcapmilusd01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFfmcapmilusd01((int)number);
	}
	
	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01() throws CFException{
     if (isSectorweight01Modified()) { 
        sectorweight01 = refreshSectorweight01();
     }
   		return sectorweight01;
   }

  
	/**
	*  set variable sectorweight01
	*  Corresponding COBOL Variable is SECTORWEIGHT
	*  @param value
	**/
   public void setSectorweight01(char[] value) {
      sectorweight01 = checkSectorweight01Constraints(value);
      serializeSectorweight01(sectorweight01);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSectorweight01,sectorweight01.length);
   	
   }
   
   public void setSectorweight01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight01,sectorweight01.length);
   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(Field source) {
       replace(source,0,source.length(),beginSectorweight01,SECTORWEIGHT_01_LEN);
   	
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSectorweight01,SECTORWEIGHT_01_LEN);
   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLsOutputDataFieldLength() {
			return LS_OUTPUT_DATA_LENGTH;
		}

}
  
