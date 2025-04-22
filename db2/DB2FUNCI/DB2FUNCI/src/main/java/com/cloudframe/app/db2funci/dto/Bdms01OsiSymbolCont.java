package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01OsiSymbolCont is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01OsiSymbolCont extends Bdms01OsiSymbolContSerialized { 
   

						private char[] bdms01SearchOptSymbolType = Field.fillLowValue(1);

						private char[] bdms01SearchOptSymbol = Field.fillLowValue(6);

								private BigDecimal bdms01SearchOptStrike = BigDecimal.ZERO;

						private char[] bdms01SearchOptStrikex = Field.fillLowValue(8);
	
	/**
	* Constructor for Bdms01OsiSymbolCont
	**/
    public Bdms01OsiSymbolCont() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01OsiSymbolCont. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OsiSymbolCont(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01SearchOptSymbolType
	 *	@return bdms01SearchOptSymbolType
	 */
   public char[] getBdms01SearchOptSymbolType() throws CFException{
     if (isBdms01SearchOptSymbolTypeModified()) { 
        bdms01SearchOptSymbolType = refreshBdms01SearchOptSymbolType();
     }
   		return bdms01SearchOptSymbolType;
   }

  
	/**
	*  set variable bdms01SearchOptSymbolType
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-SYMBOL-TYPE
	*  @param value
	**/
   public void setBdms01SearchOptSymbolType(char[] value) {
      bdms01SearchOptSymbolType = checkBdms01SearchOptSymbolTypeConstraints(value);
      serializeBdms01SearchOptSymbolType(bdms01SearchOptSymbolType);
   } 

     /**
	 * 	Update Bdms01SearchOptSymbolType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptSymbolType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptSymbolType,bdms01SearchOptSymbolType.length);
   	
   }
   
   public void setBdms01SearchOptSymbolType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbolType,bdms01SearchOptSymbolType.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptSymbolType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptSymbolType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbolType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptSymbolType with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptSymbolType(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptSymbolType,BDMS_01_SEARCH_OPT_SYMBOL_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptSymbolType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptSymbolType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbolType,BDMS_01_SEARCH_OPT_SYMBOL_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptSymbolType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptSymbolType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbolType+targetIndex,targetLen);
    
   }
	char[] bdms01SearchOptUndrSymbol88Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isBdms01SearchOptUndrSymbol()
	 *	@return  Returns true if isBdms01SearchOptUndrSymbol() is "U"
	 */
   public boolean isBdms01SearchOptUndrSymbol() throws CFException {
      return (  compareChars( getBdms01SearchOptSymbolType() , bdms01SearchOptUndrSymbol88Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setBdms01SearchOptUndrSymbolTrue() {  			
    	setBdms01SearchOptSymbolType( bdms01SearchOptUndrSymbol88Value);
   	}
	char[] bdms01SearchOptRootSymbol88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isBdms01SearchOptRootSymbol()
	 *	@return  Returns true if isBdms01SearchOptRootSymbol() is " "
	 */
   public boolean isBdms01SearchOptRootSymbol() throws CFException {
      return (  compareChars( getBdms01SearchOptSymbolType() , bdms01SearchOptRootSymbol88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setBdms01SearchOptRootSymbolTrue() {  			
    	setBdms01SearchOptSymbolType( bdms01SearchOptRootSymbol88Value);
   	}
	char[] bdms01SearchOptBothSymbol88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isBdms01SearchOptBothSymbol()
	 *	@return  Returns true if isBdms01SearchOptBothSymbol() is "B"
	 */
   public boolean isBdms01SearchOptBothSymbol() throws CFException {
      return (  compareChars( getBdms01SearchOptSymbolType() , bdms01SearchOptBothSymbol88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setBdms01SearchOptBothSymbolTrue() {  			
    	setBdms01SearchOptSymbolType( bdms01SearchOptBothSymbol88Value);
   	}
	/**
	 *	Returns the value of bdms01SearchOptSymbol
	 *	@return bdms01SearchOptSymbol
	 */
   public char[] getBdms01SearchOptSymbol() throws CFException{
     if (isBdms01SearchOptSymbolModified()) { 
        bdms01SearchOptSymbol = refreshBdms01SearchOptSymbol();
     }
   		return bdms01SearchOptSymbol;
   }

  
	/**
	*  set variable bdms01SearchOptSymbol
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-SYMBOL
	*  @param value
	**/
   public void setBdms01SearchOptSymbol(char[] value) {
      bdms01SearchOptSymbol = checkBdms01SearchOptSymbolConstraints(value);
      serializeBdms01SearchOptSymbol(bdms01SearchOptSymbol);
   } 

     /**
	 * 	Update Bdms01SearchOptSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptSymbol,bdms01SearchOptSymbol.length);
   	
   }
   
   public void setBdms01SearchOptSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbol,bdms01SearchOptSymbol.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptSymbol with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptSymbol(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptSymbol,BDMS_01_SEARCH_OPT_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbol,BDMS_01_SEARCH_OPT_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchOptStrike
	 *	@return bdms01SearchOptStrike
	 */
	public BigDecimal getBdms01SearchOptStrike() throws CFException {
       if (isBdms01SearchOptStrikeModified()) { 
           bdms01SearchOptStrike = refreshBdms01SearchOptStrike();
        }
   		return bdms01SearchOptStrike;
	}
	

	
	   
	/**
	 * 	Update Bdms01SearchOptStrike with the passed number
	 *  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-STRIKE
	 *	@param number
	 */
	public void setBdms01SearchOptStrike(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01SearchOptStrike = checkBdms01SearchOptStrikeMaxLimit(number);
	    serializeBdms01SearchOptStrike(bdms01SearchOptStrike);
   }
	/**
	 * 	Update Bdms01SearchOptStrike with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SearchOptStrike(char[] value) throws CFException {
		 bdms01SearchOptStrike = serializeBdms01SearchOptStrike(value);
	}   
	/**
	 *	Returns the value of bdms01SearchOptStrikex
	 *	@return bdms01SearchOptStrikex
	 */
   public char[] getBdms01SearchOptStrikex() throws CFException{
     if (isBdms01SearchOptStrikexModified()) { 
        bdms01SearchOptStrikex = refreshBdms01SearchOptStrikex();
     }
   		return bdms01SearchOptStrikex;
   }

  
	/**
	*  set variable bdms01SearchOptStrikex
	*  Corresponding COBOL Variable is BDMS01-SEARCH-OPT-STRIKEX
	*  @param value
	**/
   public void setBdms01SearchOptStrikex(char[] value) {
      bdms01SearchOptStrikex = checkBdms01SearchOptStrikexConstraints(value);
      serializeBdms01SearchOptStrikex(bdms01SearchOptStrikex);
   } 

     /**
	 * 	Update Bdms01SearchOptStrikex 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchOptStrikex(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchOptStrikex,bdms01SearchOptStrikex.length);
   	
   }
   
   public void setBdms01SearchOptStrikex(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStrikex,bdms01SearchOptStrikex.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptStrikex 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptStrikex(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStrikex+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchOptStrikex with another Field
	 *	@param value
	 */
   public void setBdms01SearchOptStrikex(Field source) {
       replace(source,0,source.length(),beginBdms01SearchOptStrikex,BDMS_01_SEARCH_OPT_STRIKEX_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchOptStrikex 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchOptStrikex(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStrikex,BDMS_01_SEARCH_OPT_STRIKEX_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchOptStrikex 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchOptStrikex(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchOptStrikex+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01OsiSymbolCont
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01SearchOptSymbolType(CONSTANTS.SPACE);
         setBdms01SearchOptSymbol(CONSTANTS.SPACE_6);
			setBdms01SearchOptStrike(BigDecimal.ZERO);
   }

		public static int getBdms01OsiSymbolContFieldLength() {
			return BDMS_01_OSI_SYMBOL_CONT_LENGTH;
		}

}
  
