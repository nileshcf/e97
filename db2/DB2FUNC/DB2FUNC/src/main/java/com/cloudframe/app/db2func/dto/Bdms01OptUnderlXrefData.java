package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OptUnderlXrefData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01OptUnderlXrefData extends Bdms01OptUnderlXrefDataSerialized { 
   

								private int bdms01UndlSecSegSqlcd;

						private char[] bdms01UndlSymblTrdsAsCd = Field.fillLowValue(20);

						private char[] bdms01UndlPrimeExchangeCd = Field.fillLowValue(10);

						private char[] bdms01UndlPrimeSymbolCd = Field.fillLowValue(12);

						private char[] bdms01UndlCanadaExchangeCd = Field.fillLowValue(10);

						private char[] bdms01UndlCanadaSymbolCd = Field.fillLowValue(12);

						private char[] bdms01UndlCusip = Field.fillLowValue(12);

						private char[] bdms01UndlIsin = Field.fillLowValue(12);

						private char[] bdms01UndlSedol = Field.fillLowValue(12);

						private char[] bdms01UndlCommonCode = Field.fillLowValue(12);

						private char[] bdms01UndlCins = Field.fillLowValue(12);
	
	/**
	* Constructor for Bdms01OptUnderlXrefData
	**/
    public Bdms01OptUnderlXrefData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01OptUnderlXrefData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptUnderlXrefData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01UndlSecSegSqlcd
	 *	@return bdms01UndlSecSegSqlcd
	 */
	public int getBdms01UndlSecSegSqlcd() throws CFException {
       if (isBdms01UndlSecSegSqlcdModified()) { 
           bdms01UndlSecSegSqlcd = refreshBdms01UndlSecSegSqlcd();
        }
   		return bdms01UndlSecSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01UndlSecSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-UNDL-SEC-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01UndlSecSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01UndlSecSegSqlcd = checkBdms01UndlSecSegSqlcdMaxLimit(number); 
		serializeBdms01UndlSecSegSqlcd(bdms01UndlSecSegSqlcd);
	}
	

	public void setBdms01UndlSecSegSqlcd(long number) {
	    number = checkBdms01UndlSecSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01UndlSecSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01UndlSecSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01UndlSecSegSqlcd(char[] value) throws CFException {
		 bdms01UndlSecSegSqlcd = serializeBdms01UndlSecSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01UndlSecSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01UndlSecSegSqlcdString(char[] value) throws CFException {
		 setBdms01UndlSecSegSqlcd(value);
	}
	/**
	 *	Returns the value of bdms01UndlSymblTrdsAsCd
	 *	@return bdms01UndlSymblTrdsAsCd
	 */
   public char[] getBdms01UndlSymblTrdsAsCd() throws CFException{
     if (isBdms01UndlSymblTrdsAsCdModified()) { 
        bdms01UndlSymblTrdsAsCd = refreshBdms01UndlSymblTrdsAsCd();
     }
   		return bdms01UndlSymblTrdsAsCd;
   }

  
	/**
	*  set variable bdms01UndlSymblTrdsAsCd
	*  Corresponding COBOL Variable is BDMS01-UNDL-SYMBL-TRDS-AS-CD
	*  @param value
	**/
   public void setBdms01UndlSymblTrdsAsCd(char[] value) {
      bdms01UndlSymblTrdsAsCd = checkBdms01UndlSymblTrdsAsCdConstraints(value);
      serializeBdms01UndlSymblTrdsAsCd(bdms01UndlSymblTrdsAsCd);
   } 

     /**
	 * 	Update Bdms01UndlSymblTrdsAsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlSymblTrdsAsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlSymblTrdsAsCd,bdms01UndlSymblTrdsAsCd.length);
   	
   }
   
   public void setBdms01UndlSymblTrdsAsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSymblTrdsAsCd,bdms01UndlSymblTrdsAsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlSymblTrdsAsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlSymblTrdsAsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSymblTrdsAsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlSymblTrdsAsCd with another Field
	 *	@param value
	 */
   public void setBdms01UndlSymblTrdsAsCd(Field source) {
       replace(source,0,source.length(),beginBdms01UndlSymblTrdsAsCd,BDMS_01_UNDL_SYMBL_TRDS_AS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlSymblTrdsAsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlSymblTrdsAsCd,BDMS_01_UNDL_SYMBL_TRDS_AS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlSymblTrdsAsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSymblTrdsAsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlPrimeExchangeCd
	 *	@return bdms01UndlPrimeExchangeCd
	 */
   public char[] getBdms01UndlPrimeExchangeCd() throws CFException{
     if (isBdms01UndlPrimeExchangeCdModified()) { 
        bdms01UndlPrimeExchangeCd = refreshBdms01UndlPrimeExchangeCd();
     }
   		return bdms01UndlPrimeExchangeCd;
   }

  
	/**
	*  set variable bdms01UndlPrimeExchangeCd
	*  Corresponding COBOL Variable is BDMS01-UNDL-PRIME-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01UndlPrimeExchangeCd(char[] value) {
      bdms01UndlPrimeExchangeCd = checkBdms01UndlPrimeExchangeCdConstraints(value);
      serializeBdms01UndlPrimeExchangeCd(bdms01UndlPrimeExchangeCd);
   } 

     /**
	 * 	Update Bdms01UndlPrimeExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlPrimeExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlPrimeExchangeCd,bdms01UndlPrimeExchangeCd.length);
   	
   }
   
   public void setBdms01UndlPrimeExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeExchangeCd,bdms01UndlPrimeExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlPrimeExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlPrimeExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlPrimeExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01UndlPrimeExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01UndlPrimeExchangeCd,BDMS_01_UNDL_PRIME_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlPrimeExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlPrimeExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeExchangeCd,BDMS_01_UNDL_PRIME_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlPrimeExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlPrimeExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlPrimeSymbolCd
	 *	@return bdms01UndlPrimeSymbolCd
	 */
   public char[] getBdms01UndlPrimeSymbolCd() throws CFException{
     if (isBdms01UndlPrimeSymbolCdModified()) { 
        bdms01UndlPrimeSymbolCd = refreshBdms01UndlPrimeSymbolCd();
     }
   		return bdms01UndlPrimeSymbolCd;
   }

  
	/**
	*  set variable bdms01UndlPrimeSymbolCd
	*  Corresponding COBOL Variable is BDMS01-UNDL-PRIME-SYMBOL-CD
	*  @param value
	**/
   public void setBdms01UndlPrimeSymbolCd(char[] value) {
      bdms01UndlPrimeSymbolCd = checkBdms01UndlPrimeSymbolCdConstraints(value);
      serializeBdms01UndlPrimeSymbolCd(bdms01UndlPrimeSymbolCd);
   } 

     /**
	 * 	Update Bdms01UndlPrimeSymbolCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlPrimeSymbolCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlPrimeSymbolCd,bdms01UndlPrimeSymbolCd.length);
   	
   }
   
   public void setBdms01UndlPrimeSymbolCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeSymbolCd,bdms01UndlPrimeSymbolCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlPrimeSymbolCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlPrimeSymbolCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeSymbolCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlPrimeSymbolCd with another Field
	 *	@param value
	 */
   public void setBdms01UndlPrimeSymbolCd(Field source) {
       replace(source,0,source.length(),beginBdms01UndlPrimeSymbolCd,BDMS_01_UNDL_PRIME_SYMBOL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlPrimeSymbolCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlPrimeSymbolCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeSymbolCd,BDMS_01_UNDL_PRIME_SYMBOL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlPrimeSymbolCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlPrimeSymbolCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlPrimeSymbolCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlCanadaExchangeCd
	 *	@return bdms01UndlCanadaExchangeCd
	 */
   public char[] getBdms01UndlCanadaExchangeCd() throws CFException{
     if (isBdms01UndlCanadaExchangeCdModified()) { 
        bdms01UndlCanadaExchangeCd = refreshBdms01UndlCanadaExchangeCd();
     }
   		return bdms01UndlCanadaExchangeCd;
   }

  
	/**
	*  set variable bdms01UndlCanadaExchangeCd
	*  Corresponding COBOL Variable is BDMS01-UNDL-CANADA-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01UndlCanadaExchangeCd(char[] value) {
      bdms01UndlCanadaExchangeCd = checkBdms01UndlCanadaExchangeCdConstraints(value);
      serializeBdms01UndlCanadaExchangeCd(bdms01UndlCanadaExchangeCd);
   } 

     /**
	 * 	Update Bdms01UndlCanadaExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlCanadaExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlCanadaExchangeCd,bdms01UndlCanadaExchangeCd.length);
   	
   }
   
   public void setBdms01UndlCanadaExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaExchangeCd,bdms01UndlCanadaExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCanadaExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCanadaExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlCanadaExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01UndlCanadaExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01UndlCanadaExchangeCd,BDMS_01_UNDL_CANADA_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlCanadaExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlCanadaExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaExchangeCd,BDMS_01_UNDL_CANADA_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCanadaExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCanadaExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlCanadaSymbolCd
	 *	@return bdms01UndlCanadaSymbolCd
	 */
   public char[] getBdms01UndlCanadaSymbolCd() throws CFException{
     if (isBdms01UndlCanadaSymbolCdModified()) { 
        bdms01UndlCanadaSymbolCd = refreshBdms01UndlCanadaSymbolCd();
     }
   		return bdms01UndlCanadaSymbolCd;
   }

  
	/**
	*  set variable bdms01UndlCanadaSymbolCd
	*  Corresponding COBOL Variable is BDMS01-UNDL-CANADA-SYMBOL-CD
	*  @param value
	**/
   public void setBdms01UndlCanadaSymbolCd(char[] value) {
      bdms01UndlCanadaSymbolCd = checkBdms01UndlCanadaSymbolCdConstraints(value);
      serializeBdms01UndlCanadaSymbolCd(bdms01UndlCanadaSymbolCd);
   } 

     /**
	 * 	Update Bdms01UndlCanadaSymbolCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlCanadaSymbolCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlCanadaSymbolCd,bdms01UndlCanadaSymbolCd.length);
   	
   }
   
   public void setBdms01UndlCanadaSymbolCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaSymbolCd,bdms01UndlCanadaSymbolCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCanadaSymbolCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCanadaSymbolCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaSymbolCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlCanadaSymbolCd with another Field
	 *	@param value
	 */
   public void setBdms01UndlCanadaSymbolCd(Field source) {
       replace(source,0,source.length(),beginBdms01UndlCanadaSymbolCd,BDMS_01_UNDL_CANADA_SYMBOL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlCanadaSymbolCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlCanadaSymbolCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaSymbolCd,BDMS_01_UNDL_CANADA_SYMBOL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCanadaSymbolCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCanadaSymbolCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCanadaSymbolCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlCusip
	 *	@return bdms01UndlCusip
	 */
   public char[] getBdms01UndlCusip() throws CFException{
     if (isBdms01UndlCusipModified()) { 
        bdms01UndlCusip = refreshBdms01UndlCusip();
     }
   		return bdms01UndlCusip;
   }

  
	/**
	*  set variable bdms01UndlCusip
	*  Corresponding COBOL Variable is BDMS01-UNDL-CUSIP
	*  @param value
	**/
   public void setBdms01UndlCusip(char[] value) {
      bdms01UndlCusip = checkBdms01UndlCusipConstraints(value);
      serializeBdms01UndlCusip(bdms01UndlCusip);
   } 

     /**
	 * 	Update Bdms01UndlCusip 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlCusip(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlCusip,bdms01UndlCusip.length);
   	
   }
   
   public void setBdms01UndlCusip(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCusip,bdms01UndlCusip.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCusip 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCusip(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCusip+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlCusip with another Field
	 *	@param value
	 */
   public void setBdms01UndlCusip(Field source) {
       replace(source,0,source.length(),beginBdms01UndlCusip,BDMS_01_UNDL_CUSIP_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlCusip 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlCusip(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlCusip,BDMS_01_UNDL_CUSIP_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCusip 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCusip(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCusip+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlIsin
	 *	@return bdms01UndlIsin
	 */
   public char[] getBdms01UndlIsin() throws CFException{
     if (isBdms01UndlIsinModified()) { 
        bdms01UndlIsin = refreshBdms01UndlIsin();
     }
   		return bdms01UndlIsin;
   }

  
	/**
	*  set variable bdms01UndlIsin
	*  Corresponding COBOL Variable is BDMS01-UNDL-ISIN
	*  @param value
	**/
   public void setBdms01UndlIsin(char[] value) {
      bdms01UndlIsin = checkBdms01UndlIsinConstraints(value);
      serializeBdms01UndlIsin(bdms01UndlIsin);
   } 

     /**
	 * 	Update Bdms01UndlIsin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlIsin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlIsin,bdms01UndlIsin.length);
   	
   }
   
   public void setBdms01UndlIsin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlIsin,bdms01UndlIsin.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlIsin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlIsin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlIsin with another Field
	 *	@param value
	 */
   public void setBdms01UndlIsin(Field source) {
       replace(source,0,source.length(),beginBdms01UndlIsin,BDMS_01_UNDL_ISIN_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlIsin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlIsin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlIsin,BDMS_01_UNDL_ISIN_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlIsin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlIsin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlSedol
	 *	@return bdms01UndlSedol
	 */
   public char[] getBdms01UndlSedol() throws CFException{
     if (isBdms01UndlSedolModified()) { 
        bdms01UndlSedol = refreshBdms01UndlSedol();
     }
   		return bdms01UndlSedol;
   }

  
	/**
	*  set variable bdms01UndlSedol
	*  Corresponding COBOL Variable is BDMS01-UNDL-SEDOL
	*  @param value
	**/
   public void setBdms01UndlSedol(char[] value) {
      bdms01UndlSedol = checkBdms01UndlSedolConstraints(value);
      serializeBdms01UndlSedol(bdms01UndlSedol);
   } 

     /**
	 * 	Update Bdms01UndlSedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlSedol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlSedol,bdms01UndlSedol.length);
   	
   }
   
   public void setBdms01UndlSedol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSedol,bdms01UndlSedol.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlSedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSedol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlSedol with another Field
	 *	@param value
	 */
   public void setBdms01UndlSedol(Field source) {
       replace(source,0,source.length(),beginBdms01UndlSedol,BDMS_01_UNDL_SEDOL_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlSedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlSedol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlSedol,BDMS_01_UNDL_SEDOL_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlSedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlSedol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlCommonCode
	 *	@return bdms01UndlCommonCode
	 */
   public char[] getBdms01UndlCommonCode() throws CFException{
     if (isBdms01UndlCommonCodeModified()) { 
        bdms01UndlCommonCode = refreshBdms01UndlCommonCode();
     }
   		return bdms01UndlCommonCode;
   }

  
	/**
	*  set variable bdms01UndlCommonCode
	*  Corresponding COBOL Variable is BDMS01-UNDL-COMMON-CODE
	*  @param value
	**/
   public void setBdms01UndlCommonCode(char[] value) {
      bdms01UndlCommonCode = checkBdms01UndlCommonCodeConstraints(value);
      serializeBdms01UndlCommonCode(bdms01UndlCommonCode);
   } 

     /**
	 * 	Update Bdms01UndlCommonCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlCommonCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlCommonCode,bdms01UndlCommonCode.length);
   	
   }
   
   public void setBdms01UndlCommonCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCommonCode,bdms01UndlCommonCode.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCommonCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCommonCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCommonCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlCommonCode with another Field
	 *	@param value
	 */
   public void setBdms01UndlCommonCode(Field source) {
       replace(source,0,source.length(),beginBdms01UndlCommonCode,BDMS_01_UNDL_COMMON_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlCommonCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlCommonCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlCommonCode,BDMS_01_UNDL_COMMON_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCommonCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCommonCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCommonCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UndlCins
	 *	@return bdms01UndlCins
	 */
   public char[] getBdms01UndlCins() throws CFException{
     if (isBdms01UndlCinsModified()) { 
        bdms01UndlCins = refreshBdms01UndlCins();
     }
   		return bdms01UndlCins;
   }

  
	/**
	*  set variable bdms01UndlCins
	*  Corresponding COBOL Variable is BDMS01-UNDL-CINS
	*  @param value
	**/
   public void setBdms01UndlCins(char[] value) {
      bdms01UndlCins = checkBdms01UndlCinsConstraints(value);
      serializeBdms01UndlCins(bdms01UndlCins);
   } 

     /**
	 * 	Update Bdms01UndlCins 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UndlCins(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UndlCins,bdms01UndlCins.length);
   	
   }
   
   public void setBdms01UndlCins(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCins,bdms01UndlCins.length);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCins 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCins(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCins+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UndlCins with another Field
	 *	@param value
	 */
   public void setBdms01UndlCins(Field source) {
       replace(source,0,source.length(),beginBdms01UndlCins,BDMS_01_UNDL_CINS_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UndlCins 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UndlCins(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UndlCins,BDMS_01_UNDL_CINS_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UndlCins 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UndlCins(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UndlCins+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01OptUnderlXrefData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UndlSecSegSqlcd(0);
         setBdms01UndlSymblTrdsAsCd(CONSTANTS.SPACE_20);
         setBdms01UndlPrimeExchangeCd(CONSTANTS.SPACE_10);
         setBdms01UndlPrimeSymbolCd(CONSTANTS.SPACE_12);
         setBdms01UndlCanadaExchangeCd(CONSTANTS.SPACE_10);
         setBdms01UndlCanadaSymbolCd(CONSTANTS.SPACE_12);
         setBdms01UndlCusip(CONSTANTS.SPACE_12);
         setBdms01UndlIsin(CONSTANTS.SPACE_12);
         setBdms01UndlSedol(CONSTANTS.SPACE_12);
         setBdms01UndlCommonCode(CONSTANTS.SPACE_12);
         setBdms01UndlCins(CONSTANTS.SPACE_12);
   }

		public static int getBdms01OptUnderlXrefDataFieldLength() {
			return BDMS_01_OPT_UNDERL_XREF_DATA_LENGTH;
		}

}
  
