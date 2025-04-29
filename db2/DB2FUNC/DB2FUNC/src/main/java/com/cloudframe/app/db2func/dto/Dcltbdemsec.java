package com.cloudframe.app.db2func.dto;

/**
*  The class Dcltbdemsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbdemsec extends DcltbdemsecSerialized {
   

						private char[] isin01 = Field.fillLowValue(12);

						private char[] sedol01 = Field.fillLowValue(8);

						private char[] ric01 = Field.fillLowValue(10);

						private char[] intlkey01 = Field.fillLowValue(8);

						private char[] company01 = Field.fillLowValue(40);

						private char[] country01 = Field.fillLowValue(2);

						private char[] currency1 = Field.fillLowValue(3);

						private char[] industry = Field.fillLowValue(40);

						private char[] sector = Field.fillLowValue(40);

								private int ffmcapmilusd;

						private char[] sectorweight = Field.fillLowValue(8);
	
	/**
	* Constructor for Dcltbdemsec
	**/
    public Dcltbdemsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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
	 *	Returns the value of currency1
	 *	@return currency1
	 */
   public char[] getCurrency1() throws CFException{
     if (isCurrency1Modified()) { 
        currency1 = refreshCurrency1();
     }
   		return currency1;
   }

  
	/**
	*  set variable currency1
	*  Corresponding COBOL Variable is CURRENCY1
	*  @param value
	**/
   public void setCurrency1(char[] value) {
      currency1 = checkCurrency1Constraints(value);
      serializeCurrency1(currency1);
   } 

     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrency1,currency1.length);
   	
   }
   
   public void setCurrency1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency1,currency1.length);
   	
   }
   
     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Currency1 with another Field
	 *	@param value
	 */
   public void setCurrency1(Field source) {
       replace(source,0,source.length(),beginCurrency1,CURRENCY_1_LEN);
   	
   }  
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrency1,CURRENCY_1_LEN);
   	
   }
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException{
     if (isIndustryModified()) { 
        industry = refreshIndustry();
     }
   		return industry;
   }

  
	/**
	*  set variable industry
	*  Corresponding COBOL Variable is INDUSTRY
	*  @param value
	**/
   public void setIndustry(char[] value) {
      industry = checkIndustryConstraints(value);
      serializeIndustry(industry);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIndustry,industry.length);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry,industry.length);
   	
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
       replace(source,0,source.length(),beginIndustry,INDUSTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIndustry,INDUSTRY_LEN);
   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndustry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException{
     if (isSectorModified()) { 
        sector = refreshSector();
     }
   		return sector;
   }

  
	/**
	*  set variable sector
	*  Corresponding COBOL Variable is SECTOR
	*  @param value
	**/
   public void setSector(char[] value) {
      sector = checkSectorConstraints(value);
      serializeSector(sector);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSector,sector.length);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSector,sector.length);
   	
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
       replace(source,0,source.length(),beginSector,SECTOR_LEN);
   	
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSector,SECTOR_LEN);
   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSector+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {
        if (isFfmcapmilusdModified()) { 
           ffmcapmilusd = refreshFfmcapmilusd();
        }
   		return ffmcapmilusd;
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *  Corresponding COBOL Variable is FFMCAPMILUSD
	 *	@param number
	 */
	public void setFfmcapmilusd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ffmcapmilusd = checkFfmcapmilusdMaxLimit(number); 
		serializeFfmcapmilusd(ffmcapmilusd);
	}


	public void setFfmcapmilusd(long number) {
	    number = checkFfmcapmilusdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFfmcapmilusd((int)number);
	}
	
	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException{
     if (isSectorweightModified()) { 
        sectorweight = refreshSectorweight();
     }
   		return sectorweight;
   }

  
	/**
	*  set variable sectorweight
	*  Corresponding COBOL Variable is SECTORWEIGHT
	*  @param value
	**/
   public void setSectorweight(char[] value) {
      sectorweight = checkSectorweightConstraints(value);
      serializeSectorweight(sectorweight);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSectorweight,sectorweight.length);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight,sectorweight.length);
   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
       replace(source,0,source.length(),beginSectorweight,SECTORWEIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSectorweight,SECTORWEIGHT_LEN);
   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSectorweight+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbdemsecFieldLength() {
			return DCLTBDEMSEC_LENGTH;
		}

}
  
