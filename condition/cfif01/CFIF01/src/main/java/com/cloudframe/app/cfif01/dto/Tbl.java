package com.cloudframe.app.cfif01.dto;

/**
*  The class Tbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Tbl extends TblSerialized { 
   

						private char[] charA = new char[1];

								private int intA;

						private char[] char2A = new char[5];
	
	/**
	* Constructor for Tbl
	**/
    public Tbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Tbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Tbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCharA(fillSpace(1));
								setIntA(0);
								setChar2A(fillSpace(5));
    } 

	/**
	 *	Returns the value of charA
	 *	@return charA
	 */
   public char[] getCharA() throws CFException{
     if (isCharAModified()) { 
        charA = refreshCharA();
     }
   		return charA;
   }

  
	/**
	*  set variable charA
	*  Corresponding COBOL Variable is WS-CHAR-A
	*  @param value
	**/
   public void setCharA(char[] value) {
      charA = checkCharAConstraints(value);
      serializeCharA(charA);
   } 

     /**
	 * 	Update CharA 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharA(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharA,charA.length);
   	
   }
   
   public void setCharA(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharA,charA.length);
   	
   }
   
     /**
	 * 	Update CharA 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharA(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharA+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharA with another Field
	 *	@param value
	 */
   public void setCharA(Field source) {
       replace(source,0,source.length(),beginCharA,CHAR_A_LEN);
   	
   }  
   
     /**
	 * 	Update CharA 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharA(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharA,CHAR_A_LEN);
   	
   }
   
     /**
	 * 	Update CharA 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharA(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharA+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of intA
	 *	@return intA
	 */
	public int getIntA() throws CFException {
        if (isIntAModified()) { 
           intA = refreshIntA();
        }
   		return intA;
	}
	
	/**
	 * 	Update IntA with the passed value
	 *  Corresponding COBOL Variable is WS-INT-A
	 *	@param number
	 */
	public void setIntA(int number) {
	     // Truncate if the number is beyond +/- Max range
	    intA = checkIntAMaxLimit(number); 
		serializeIntA(intA);
	}


	public void setIntA(long number) {
	    number = checkIntAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntA((int)number);
	}
	
	/**
	 *	Returns the value of char2A
	 *	@return char2A
	 */
   public char[] getChar2A() throws CFException{
     if (isChar2AModified()) { 
        char2A = refreshChar2A();
     }
   		return char2A;
   }

  
	/**
	*  set variable char2A
	*  Corresponding COBOL Variable is WS-CHAR2-A
	*  @param value
	**/
   public void setChar2A(char[] value) {
      char2A = checkChar2AConstraints(value);
      serializeChar2A(char2A);
   } 

     /**
	 * 	Update Char2A 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChar2A(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChar2A,char2A.length);
   	
   }
   
   public void setChar2A(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChar2A,char2A.length);
   	
   }
   
     /**
	 * 	Update Char2A 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChar2A(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar2A+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Char2A with another Field
	 *	@param value
	 */
   public void setChar2A(Field source) {
       replace(source,0,source.length(),beginChar2A,CHAR_2_A_LEN);
   	
   }  
   
     /**
	 * 	Update Char2A 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChar2A(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChar2A,CHAR_2_A_LEN);
   	
   }
   
     /**
	 * 	Update Char2A 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChar2A(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar2A+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Tbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCharA(CONSTANTS.SPACE);
                     setIntA(0);
         setChar2A(CONSTANTS.SPACE_5);
   }

		public static int getTblFieldLength() {
			return TBL_LENGTH;
		}

}
  
