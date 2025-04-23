package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OtherExchanges is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01OtherExchanges extends Bdms01OtherExchangesSerialized { 
   

						private char[] bdms01OtherExchangeCd = Field.fillLowValue(10);

						private char[] bdms01OtherExchangeSymbol = Field.fillLowValue(12);
	
	/**
	* Constructor for Bdms01OtherExchanges
	**/
    public Bdms01OtherExchanges() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01OtherExchanges. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OtherExchanges(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01OtherExchangeCd
	 *	@return bdms01OtherExchangeCd
	 */
   public char[] getBdms01OtherExchangeCd() throws CFException{
     if (isBdms01OtherExchangeCdModified()) { 
        bdms01OtherExchangeCd = refreshBdms01OtherExchangeCd();
     }
   		return bdms01OtherExchangeCd;
   }

  
	/**
	*  set variable bdms01OtherExchangeCd
	*  Corresponding COBOL Variable is BDMS01-OTHER-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01OtherExchangeCd(char[] value) {
      bdms01OtherExchangeCd = checkBdms01OtherExchangeCdConstraints(value);
      serializeBdms01OtherExchangeCd(bdms01OtherExchangeCd);
   } 

     /**
	 * 	Update Bdms01OtherExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtherExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtherExchangeCd,bdms01OtherExchangeCd.length);
   	
   }
   
   public void setBdms01OtherExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeCd,bdms01OtherExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtherExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtherExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtherExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01OtherExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01OtherExchangeCd,BDMS_01_OTHER_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtherExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtherExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeCd,BDMS_01_OTHER_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtherExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtherExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtherExchangeSymbol
	 *	@return bdms01OtherExchangeSymbol
	 */
   public char[] getBdms01OtherExchangeSymbol() throws CFException{
     if (isBdms01OtherExchangeSymbolModified()) { 
        bdms01OtherExchangeSymbol = refreshBdms01OtherExchangeSymbol();
     }
   		return bdms01OtherExchangeSymbol;
   }

  
	/**
	*  set variable bdms01OtherExchangeSymbol
	*  Corresponding COBOL Variable is BDMS01-OTHER-EXCHANGE-SYMBOL
	*  @param value
	**/
   public void setBdms01OtherExchangeSymbol(char[] value) {
      bdms01OtherExchangeSymbol = checkBdms01OtherExchangeSymbolConstraints(value);
      serializeBdms01OtherExchangeSymbol(bdms01OtherExchangeSymbol);
   } 

     /**
	 * 	Update Bdms01OtherExchangeSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtherExchangeSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtherExchangeSymbol,bdms01OtherExchangeSymbol.length);
   	
   }
   
   public void setBdms01OtherExchangeSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeSymbol,bdms01OtherExchangeSymbol.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtherExchangeSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtherExchangeSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtherExchangeSymbol with another Field
	 *	@param value
	 */
   public void setBdms01OtherExchangeSymbol(Field source) {
       replace(source,0,source.length(),beginBdms01OtherExchangeSymbol,BDMS_01_OTHER_EXCHANGE_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtherExchangeSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtherExchangeSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeSymbol,BDMS_01_OTHER_EXCHANGE_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtherExchangeSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtherExchangeSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtherExchangeSymbol+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01OtherExchanges
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01OtherExchangeCd(CONSTANTS.SPACE_10);
         setBdms01OtherExchangeSymbol(CONSTANTS.SPACE_12);
   }

		public static int getBdms01OtherExchangesFieldLength() {
			return BDMS_01_OTHER_EXCHANGES_LENGTH;
		}

}
  
