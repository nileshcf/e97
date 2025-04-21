package com.cloudframe.app.db2func.dto;

/**
*  The class AcceptInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcceptInput extends AcceptInputSerialized {
   

						private char[] scalarFunction = Field.fillLowValue(20);
	
	/**
	* Constructor for AcceptInput
	**/
    public AcceptInput() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of scalarFunction
	 *	@return scalarFunction
	 */
   public char[] getScalarFunction() throws CFException{
     if (isScalarFunctionModified()) { 
        scalarFunction = refreshScalarFunction();
     }
   		return scalarFunction;
   }

  
	/**
	*  set variable scalarFunction
	*  Corresponding COBOL Variable is WS-SCALAR-FUNCTION
	*  @param value
	**/
   public void setScalarFunction(char[] value) {
      scalarFunction = checkScalarFunctionConstraints(value);
      serializeScalarFunction(scalarFunction);
   } 

     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginScalarFunction,scalarFunction.length);
   	
   }
   
   public void setScalarFunction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginScalarFunction,scalarFunction.length);
   	
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScalarFunction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ScalarFunction with another Field
	 *	@param value
	 */
   public void setScalarFunction(Field source) {
       replace(source,0,source.length(),beginScalarFunction,SCALAR_FUNCTION_LEN);
   	
   }  
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginScalarFunction,SCALAR_FUNCTION_LEN);
   	
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginScalarFunction+targetIndex,targetLen);
    
   }
	char[] cDate88Value = "DATE                ".toCharArray();
	/**
	 *	Test condition "DATE" for isCDate()
	 *	@return  Returns true if isCDate() is "DATE"
	 */
   public boolean isCDate() throws CFException {
      return (  compareChars( getScalarFunction() , cDate88Value)  == 0  );
   }


	/**
	*  set values "DATE"
	*/
   	public void setCDateTrue() {  			
    	setScalarFunction( cDate88Value);
   	}
	char[] cSpGetprml88Value = "SP-GETPRML          ".toCharArray();
	/**
	 *	Test condition "SP-GETPRML" for isCSpGetprml()
	 *	@return  Returns true if isCSpGetprml() is "SP-GETPRML"
	 */
   public boolean isCSpGetprml() throws CFException {
      return (  compareChars( getScalarFunction() , cSpGetprml88Value)  == 0  );
   }


	/**
	*  set values "SP-GETPRML"
	*/
   	public void setCSpGetprmlTrue() {  			
    	setScalarFunction( cSpGetprml88Value);
   	}
	char[] cSpGetdata88Value = "SP-GETDATA          ".toCharArray();
	/**
	 *	Test condition "SP-GETDATA" for isCSpGetdata()
	 *	@return  Returns true if isCSpGetdata() is "SP-GETDATA"
	 */
   public boolean isCSpGetdata() throws CFException {
      return (  compareChars( getScalarFunction() , cSpGetdata88Value)  == 0  );
   }


	/**
	*  set values "SP-GETDATA"
	*/
   	public void setCSpGetdataTrue() {  			
    	setScalarFunction( cSpGetdata88Value);
   	}
	char[] cCursor188Value = "CURSOR1             ".toCharArray();
	/**
	 *	Test condition "CURSOR1" for isCCursor1()
	 *	@return  Returns true if isCCursor1() is "CURSOR1"
	 */
   public boolean isCCursor1() throws CFException {
      return (  compareChars( getScalarFunction() , cCursor188Value)  == 0  );
   }


	/**
	*  set values "CURSOR1"
	*/
   	public void setCCursor1True() {  			
    	setScalarFunction( cCursor188Value);
   	}
	char[] cDateSubstringChar88Value = "DATE-SUBSTRING-CHAR ".toCharArray();
	/**
	 *	Test condition "DATE-SUBSTRING-CHAR" for isCDateSubstringChar()
	 *	@return  Returns true if isCDateSubstringChar() is "DATE-SUBSTRING-CHAR"
	 */
   public boolean isCDateSubstringChar() throws CFException {
      return (  compareChars( getScalarFunction() , cDateSubstringChar88Value)  == 0  );
   }


	/**
	*  set values "DATE-SUBSTRING-CHAR"
	*/
   	public void setCDateSubstringCharTrue() {  			
    	setScalarFunction( cDateSubstringChar88Value);
   	}
	char[] cSecurityLookup88Value = "SECURITY-LOOKUP     ".toCharArray();
	/**
	 *	Test condition "SECURITY-LOOKUP" for isCSecurityLookup()
	 *	@return  Returns true if isCSecurityLookup() is "SECURITY-LOOKUP"
	 */
   public boolean isCSecurityLookup() throws CFException {
      return (  compareChars( getScalarFunction() , cSecurityLookup88Value)  == 0  );
   }


	/**
	*  set values "SECURITY-LOOKUP"
	*/
   	public void setCSecurityLookupTrue() {  			
    	setScalarFunction( cSecurityLookup88Value);
   	}
	char[] cCurrency88Value = "CURRENCY            ".toCharArray();
	/**
	 *	Test condition "CURRENCY" for isCCurrency()
	 *	@return  Returns true if isCCurrency() is "CURRENCY"
	 */
   public boolean isCCurrency() throws CFException {
      return (  compareChars( getScalarFunction() , cCurrency88Value)  == 0  );
   }


	/**
	*  set values "CURRENCY"
	*/
   	public void setCCurrencyTrue() {  			
    	setScalarFunction( cCurrency88Value);
   	}
	char[] cXrefCursor88Value = "XREF-CURSOR         ".toCharArray();
	/**
	 *	Test condition "XREF-CURSOR" for isCXrefCursor()
	 *	@return  Returns true if isCXrefCursor() is "XREF-CURSOR"
	 */
   public boolean isCXrefCursor() throws CFException {
      return (  compareChars( getScalarFunction() , cXrefCursor88Value)  == 0  );
   }


	/**
	*  set values "XREF-CURSOR"
	*/
   	public void setCXrefCursorTrue() {  			
    	setScalarFunction( cXrefCursor88Value);
   	}
	char[] cIsinCursor88Value = "ISIN-CURSOR         ".toCharArray();
	/**
	 *	Test condition "ISIN-CURSOR" for isCIsinCursor()
	 *	@return  Returns true if isCIsinCursor() is "ISIN-CURSOR"
	 */
   public boolean isCIsinCursor() throws CFException {
      return (  compareChars( getScalarFunction() , cIsinCursor88Value)  == 0  );
   }


	/**
	*  set values "ISIN-CURSOR"
	*/
   	public void setCIsinCursorTrue() {  			
    	setScalarFunction( cIsinCursor88Value);
   	}
	char[] cDecimalToFloat88Value = "DECIMAL-TO-FLOAT    ".toCharArray();
	/**
	 *	Test condition "DECIMAL-TO-FLOAT" for isCDecimalToFloat()
	 *	@return  Returns true if isCDecimalToFloat() is "DECIMAL-TO-FLOAT"
	 */
   public boolean isCDecimalToFloat() throws CFException {
      return (  compareChars( getScalarFunction() , cDecimalToFloat88Value)  == 0  );
   }


	/**
	*  set values "DECIMAL-TO-FLOAT"
	*/
   	public void setCDecimalToFloatTrue() {  			
    	setScalarFunction( cDecimalToFloat88Value);
   	}
	char[] cSelect188Value = "SELECT-1            ".toCharArray();
	/**
	 *	Test condition "SELECT-1" for isCSelect1()
	 *	@return  Returns true if isCSelect1() is "SELECT-1"
	 */
   public boolean isCSelect1() throws CFException {
      return (  compareChars( getScalarFunction() , cSelect188Value)  == 0  );
   }


	/**
	*  set values "SELECT-1"
	*/
   	public void setCSelect1True() {  			
    	setScalarFunction( cSelect188Value);
   	}
	char[] cSelectCount88Value = "SELECT-COUNT        ".toCharArray();
	/**
	 *	Test condition "SELECT-COUNT" for isCSelectCount()
	 *	@return  Returns true if isCSelectCount() is "SELECT-COUNT"
	 */
   public boolean isCSelectCount() throws CFException {
      return (  compareChars( getScalarFunction() , cSelectCount88Value)  == 0  );
   }


	/**
	*  set values "SELECT-COUNT"
	*/
   	public void setCSelectCountTrue() {  			
    	setScalarFunction( cSelectCount88Value);
   	}
	char[] cTerminate88Value = "*END*               ".toCharArray();
	/**
	 *	Test condition "*END*" for isCTerminate()
	 *	@return  Returns true if isCTerminate() is "*END*"
	 */
   public boolean isCTerminate() throws CFException {
      return (  compareChars( getScalarFunction() , cTerminate88Value)  == 0  );
   }


	/**
	*  set values "*END*"
	*/
   	public void setCTerminateTrue() {  			
    	setScalarFunction( cTerminate88Value);
   	}

	
	
	

		public static int getAcceptInputFieldLength() {
			return ACCEPT_INPUT_LENGTH;
		}

}
  
