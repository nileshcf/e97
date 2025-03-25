package org.optum.uhg.dto.cics0012;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0012.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class Dfhcommarea extends DfhcommareaSerialized { 
   

						private char[] lsApiRequestType = Field.fillLowValue(1);

						private char[] lsApiRequestKey = Field.fillLowValue(40);

						private char[] lsIsinKey = Field.fillLowValue(12);

						private char[] lsCountryCodeKey = Field.fillLowValue(2);

						private char[] lsCurrencyCodeKey = Field.fillLowValue(3);

						private char[] lsIndustryKey = Field.fillLowValue(40);

						private char[] lsSectorKey = Field.fillLowValue(40);

								private short lsReturnCode;

								private long lsEibresp;

								private long lsEibresp2;

								private int lsOutputCount;
			private List<LsOutputData> lsOutputData = new ArrayList<>();
    	
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < LS_OUTPUT_DATA_SIZE;arrayIndex++) {
						lsOutputData.add(new LsOutputData(this, beginLsOutputData + 
						arrayIndex * LsOutputData.getLsOutputDataFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsApiRequestType
	 *	@return lsApiRequestType
	 */
   public char[] getLsApiRequestType() throws CFException{
     if (isLsApiRequestTypeModified()) { 
        lsApiRequestType = refreshLsApiRequestType();
     }
   		return lsApiRequestType;
   }

  
	/**
	*  set variable lsApiRequestType
	*  Corresponding COBOL Variable is LS-API-REQUEST-TYPE
	*  @param value
	**/
   public void setLsApiRequestType(char[] value) {
      lsApiRequestType = checkLsApiRequestTypeConstraints(value);
      serializeLsApiRequestType(lsApiRequestType);
   } 

     /**
	 * 	Update LsApiRequestType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsApiRequestType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsApiRequestType,lsApiRequestType.length);
   	
   }
   
   public void setLsApiRequestType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestType,lsApiRequestType.length);
   	
   }
   
     /**
	 * 	Update LsApiRequestType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsApiRequestType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsApiRequestType with another Field
	 *	@param value
	 */
   public void setLsApiRequestType(Field source) {
       replace(source,0,source.length(),beginLsApiRequestType,LS_API_REQUEST_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update LsApiRequestType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsApiRequestType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsApiRequestType,LS_API_REQUEST_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update LsApiRequestType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsApiRequestType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestType+targetIndex,targetLen);
    
   }
	char[] isinBased88Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIsinBased()
	 *	@return  Returns true if isIsinBased() is "I"
	 */
   public boolean isIsinBased() throws CFException {
      return (  compareChars( getLsApiRequestType() , isinBased88Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIsinBasedTrue() {  			
    	setLsApiRequestType( isinBased88Value);
   	}
	char[] countryCodeBased88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCountryCodeBased()
	 *	@return  Returns true if isCountryCodeBased() is "C"
	 */
   public boolean isCountryCodeBased() throws CFException {
      return (  compareChars( getLsApiRequestType() , countryCodeBased88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCountryCodeBasedTrue() {  			
    	setLsApiRequestType( countryCodeBased88Value);
   	}
	char[] currencyCodeBased88Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isCurrencyCodeBased()
	 *	@return  Returns true if isCurrencyCodeBased() is "U"
	 */
   public boolean isCurrencyCodeBased() throws CFException {
      return (  compareChars( getLsApiRequestType() , currencyCodeBased88Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setCurrencyCodeBasedTrue() {  			
    	setLsApiRequestType( currencyCodeBased88Value);
   	}
	char[] industryBased88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIndustryBased()
	 *	@return  Returns true if isIndustryBased() is "N"
	 */
   public boolean isIndustryBased() throws CFException {
      return (  compareChars( getLsApiRequestType() , industryBased88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIndustryBasedTrue() {  			
    	setLsApiRequestType( industryBased88Value);
   	}
	char[] sectorBased88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSectorBased()
	 *	@return  Returns true if isSectorBased() is "S"
	 */
   public boolean isSectorBased() throws CFException {
      return (  compareChars( getLsApiRequestType() , sectorBased88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSectorBasedTrue() {  			
    	setLsApiRequestType( sectorBased88Value);
   	}
	/**
	 *	Returns the value of lsApiRequestKey
	 *	@return lsApiRequestKey
	 */
   public char[] getLsApiRequestKey() throws CFException{
     if (isLsApiRequestKeyModified()) { 
        lsApiRequestKey = refreshLsApiRequestKey();
     }
   		return lsApiRequestKey;
   }

  
	/**
	*  set variable lsApiRequestKey
	*  Corresponding COBOL Variable is LS-API-REQUEST-KEY
	*  @param value
	**/
   public void setLsApiRequestKey(char[] value) {
      lsApiRequestKey = checkLsApiRequestKeyConstraints(value);
      serializeLsApiRequestKey(lsApiRequestKey);
   } 

     /**
	 * 	Update LsApiRequestKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsApiRequestKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsApiRequestKey,lsApiRequestKey.length);
   	
   }
   
   public void setLsApiRequestKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestKey,lsApiRequestKey.length);
   	
   }
   
     /**
	 * 	Update LsApiRequestKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsApiRequestKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsApiRequestKey with another Field
	 *	@param value
	 */
   public void setLsApiRequestKey(Field source) {
       replace(source,0,source.length(),beginLsApiRequestKey,LS_API_REQUEST_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsApiRequestKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsApiRequestKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsApiRequestKey,LS_API_REQUEST_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsApiRequestKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsApiRequestKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsApiRequestKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsIsinKey
	 *	@return lsIsinKey
	 */
   public char[] getLsIsinKey() throws CFException{
     if (isLsIsinKeyModified()) { 
        lsIsinKey = refreshLsIsinKey();
     }
   		return lsIsinKey;
   }

  
	/**
	*  set variable lsIsinKey
	*  Corresponding COBOL Variable is LS-ISIN-KEY
	*  @param value
	**/
   public void setLsIsinKey(char[] value) {
      lsIsinKey = checkLsIsinKeyConstraints(value);
      serializeLsIsinKey(lsIsinKey);
   } 

     /**
	 * 	Update LsIsinKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsIsinKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsIsinKey,lsIsinKey.length);
   	
   }
   
   public void setLsIsinKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsIsinKey,lsIsinKey.length);
   	
   }
   
     /**
	 * 	Update LsIsinKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsIsinKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsIsinKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsIsinKey with another Field
	 *	@param value
	 */
   public void setLsIsinKey(Field source) {
       replace(source,0,source.length(),beginLsIsinKey,LS_ISIN_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsIsinKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsIsinKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsIsinKey,LS_ISIN_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsIsinKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsIsinKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsIsinKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCountryCodeKey
	 *	@return lsCountryCodeKey
	 */
   public char[] getLsCountryCodeKey() throws CFException{
     if (isLsCountryCodeKeyModified()) { 
        lsCountryCodeKey = refreshLsCountryCodeKey();
     }
   		return lsCountryCodeKey;
   }

  
	/**
	*  set variable lsCountryCodeKey
	*  Corresponding COBOL Variable is LS-COUNTRY-CODE-KEY
	*  @param value
	**/
   public void setLsCountryCodeKey(char[] value) {
      lsCountryCodeKey = checkLsCountryCodeKeyConstraints(value);
      serializeLsCountryCodeKey(lsCountryCodeKey);
   } 

     /**
	 * 	Update LsCountryCodeKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCountryCodeKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCountryCodeKey,lsCountryCodeKey.length);
   	
   }
   
   public void setLsCountryCodeKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCountryCodeKey,lsCountryCodeKey.length);
   	
   }
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCountryCodeKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCountryCodeKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCountryCodeKey with another Field
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source) {
       replace(source,0,source.length(),beginLsCountryCodeKey,LS_COUNTRY_CODE_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCountryCodeKey,LS_COUNTRY_CODE_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCountryCodeKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCurrencyCodeKey
	 *	@return lsCurrencyCodeKey
	 */
   public char[] getLsCurrencyCodeKey() throws CFException{
     if (isLsCurrencyCodeKeyModified()) { 
        lsCurrencyCodeKey = refreshLsCurrencyCodeKey();
     }
   		return lsCurrencyCodeKey;
   }

  
	/**
	*  set variable lsCurrencyCodeKey
	*  Corresponding COBOL Variable is LS-CURRENCY-CODE-KEY
	*  @param value
	**/
   public void setLsCurrencyCodeKey(char[] value) {
      lsCurrencyCodeKey = checkLsCurrencyCodeKeyConstraints(value);
      serializeLsCurrencyCodeKey(lsCurrencyCodeKey);
   } 

     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCurrencyCodeKey,lsCurrencyCodeKey.length);
   	
   }
   
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrencyCodeKey,lsCurrencyCodeKey.length);
   	
   }
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrencyCodeKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCurrencyCodeKey with another Field
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source) {
       replace(source,0,source.length(),beginLsCurrencyCodeKey,LS_CURRENCY_CODE_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCurrencyCodeKey,LS_CURRENCY_CODE_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrencyCodeKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsIndustryKey
	 *	@return lsIndustryKey
	 */
   public char[] getLsIndustryKey() throws CFException{
     if (isLsIndustryKeyModified()) { 
        lsIndustryKey = refreshLsIndustryKey();
     }
   		return lsIndustryKey;
   }

  
	/**
	*  set variable lsIndustryKey
	*  Corresponding COBOL Variable is LS-INDUSTRY-KEY
	*  @param value
	**/
   public void setLsIndustryKey(char[] value) {
      lsIndustryKey = checkLsIndustryKeyConstraints(value);
      serializeLsIndustryKey(lsIndustryKey);
   } 

     /**
	 * 	Update LsIndustryKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsIndustryKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsIndustryKey,lsIndustryKey.length);
   	
   }
   
   public void setLsIndustryKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsIndustryKey,lsIndustryKey.length);
   	
   }
   
     /**
	 * 	Update LsIndustryKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsIndustryKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsIndustryKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsIndustryKey with another Field
	 *	@param value
	 */
   public void setLsIndustryKey(Field source) {
       replace(source,0,source.length(),beginLsIndustryKey,LS_INDUSTRY_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsIndustryKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsIndustryKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsIndustryKey,LS_INDUSTRY_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsIndustryKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsIndustryKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsIndustryKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsSectorKey
	 *	@return lsSectorKey
	 */
   public char[] getLsSectorKey() throws CFException{
     if (isLsSectorKeyModified()) { 
        lsSectorKey = refreshLsSectorKey();
     }
   		return lsSectorKey;
   }

  
	/**
	*  set variable lsSectorKey
	*  Corresponding COBOL Variable is LS-SECTOR-KEY
	*  @param value
	**/
   public void setLsSectorKey(char[] value) {
      lsSectorKey = checkLsSectorKeyConstraints(value);
      serializeLsSectorKey(lsSectorKey);
   } 

     /**
	 * 	Update LsSectorKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSectorKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsSectorKey,lsSectorKey.length);
   	
   }
   
   public void setLsSectorKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsSectorKey,lsSectorKey.length);
   	
   }
   
     /**
	 * 	Update LsSectorKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSectorKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSectorKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsSectorKey with another Field
	 *	@param value
	 */
   public void setLsSectorKey(Field source) {
       replace(source,0,source.length(),beginLsSectorKey,LS_SECTOR_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LsSectorKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSectorKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsSectorKey,LS_SECTOR_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LsSectorKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSectorKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSectorKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {
        if (isLsReturnCodeModified()) { 
           lsReturnCode = refreshLsReturnCode();
        }
   		return lsReturnCode;
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-CODE
	 *	@param number
	 */
	public void setLsReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsReturnCode = checkLsReturnCodeMaxLimit(number); 
		serializeLsReturnCode(lsReturnCode);
	}

	public void setLsReturnCode(int number) {
	    number = checkLsReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsReturnCode((short)number);
	}
	public void setLsReturnCode(long number) {
	    number = checkLsReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsReturnCode((short)number);
	}
	

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
       if (isLsEibrespModified()) { 
           lsEibresp = refreshLsEibresp();
        }
   		return lsEibresp;
	}
	

	
	   
	/**
	 * 	Update LsEibresp with the passed value
	 *  Corresponding COBOL Variable is LS-EIBRESP
	 *	@param number
	 */
	public void setLsEibresp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsEibresp = checkLsEibrespMaxLimit(number); 
		serializeLsEibresp(lsEibresp);
	}
	

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value) throws CFException {
		 lsEibresp = serializeLsEibresp(value);
	}
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value) throws CFException {
		 setLsEibresp(value);
	}
	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
       if (isLsEibresp2Modified()) { 
           lsEibresp2 = refreshLsEibresp2();
        }
   		return lsEibresp2;
	}
	

	
	   
	/**
	 * 	Update LsEibresp2 with the passed value
	 *  Corresponding COBOL Variable is LS-EIBRESP2
	 *	@param number
	 */
	public void setLsEibresp2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsEibresp2 = checkLsEibresp2MaxLimit(number); 
		serializeLsEibresp2(lsEibresp2);
	}
	

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value) throws CFException {
		 lsEibresp2 = serializeLsEibresp2(value);
	}
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value) throws CFException {
		 setLsEibresp2(value);
	}
	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
       if (isLsOutputCountModified()) { 
           lsOutputCount = refreshLsOutputCount();
        }
   		return lsOutputCount;
	}
	

	
	   
	/**
	 * 	Update LsOutputCount with the passed value
	 *  Corresponding COBOL Variable is LS-OUTPUT-COUNT
	 *	@param number
	 */
	public void setLsOutputCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsOutputCount = checkLsOutputCountMaxLimit(number); 
		serializeLsOutputCount(lsOutputCount);
	}
	

	public void setLsOutputCount(long number) {
	    number = checkLsOutputCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsOutputCount((int)number);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value) throws CFException {
		 lsOutputCount = serializeLsOutputCount(value);
	}
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value) throws CFException {
		 setLsOutputCount(value);
	}
	/**
	 *	Returns the  value of lsOutputData
	 *  Corresponding COBOL Variable is LS-OUTPUT-DATA
	 *	@return lsOutputData
	 */
   public List<LsOutputData> getLsOutputData() {
       return lsOutputData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return lsOutputData
	 */
	public LsOutputData getLsOutputData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getLsOutputData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= LS_OUTPUT_DATA_SIZE) {
             	index = LS_OUTPUT_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("lsOutputData - Array index exceeded max Size {}, resetting it to max allowed",LS_OUTPUT_DATA_SIZE); 
	    }
		if (index >= lsOutputData.size()) {
       		for (int fillIndex =  lsOutputData.size() -1; fillIndex < index;fillIndex++) {
		       lsOutputData.add(null);
		    }
			lsOutputData.set(index,
			   	   	new LsOutputData(this,beginLsOutputData + index * LsOutputData.getLsOutputDataFieldLength()) 
				                        ); 	
		} 
   	   LsOutputData value = lsOutputData.get(index);
   	   if (value == null) {
   	      lsOutputData.set(index,
			   	   	new LsOutputData(this,beginLsOutputData + index * LsOutputData.getLsOutputDataFieldLength()) 
				                        ); 
		  value = lsOutputData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update LsOutputData at index with the passed value
	 *  Corresponding COBOL Variable is LS-OUTPUT-DATA
	 *  @param index
	 *	@param value
	 */
  public void setLsOutputData(int index,char[] value) {
   	getLsOutputData(index).setString(value);
   }
   
	

	
	
	

		public static int getDfhcommareaFieldLength() {
			return DFHCOMMAREA_LENGTH;
		}

}
  
