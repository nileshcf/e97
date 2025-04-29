package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmTableEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SyntaxPgmTableEntry500 extends SyntaxPgmTableEntry500Serialized { 
   

						private char[] syntaxPgmPtr500 = Field.fillLowValue(8);
	
	/**
	* Constructor for SyntaxPgmTableEntry500
	**/
    public SyntaxPgmTableEntry500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SyntaxPgmTableEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmTableEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of syntaxPgmPtr500
	 *	@return syntaxPgmPtr500
	 */
   public char[] getSyntaxPgmPtr500() throws CFException{
     if (isSyntaxPgmPtr500Modified()) { 
        syntaxPgmPtr500 = refreshSyntaxPgmPtr500();
     }
   		return syntaxPgmPtr500;
   }

  
	/**
	*  set variable syntaxPgmPtr500
	*  Corresponding COBOL Variable is 500-SYNTAX-PGM-PTR
	*  @param value
	**/
   public void setSyntaxPgmPtr500(char[] value) {
      syntaxPgmPtr500 = checkSyntaxPgmPtr500Constraints(value);
      serializeSyntaxPgmPtr500(syntaxPgmPtr500);
   } 

     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxPgmPtr500,syntaxPgmPtr500.length);
   	
   }
   
   public void setSyntaxPgmPtr500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxPgmPtr500,syntaxPgmPtr500.length);
   	
   }
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxPgmPtr500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxPgmPtr500 with another Field
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(Field source) {
       replace(source,0,source.length(),beginSyntaxPgmPtr500,SYNTAX_PGM_PTR_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxPgmPtr500,SYNTAX_PGM_PTR_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxPgmPtr500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSyntaxPgmTableEntry500FieldLength() {
			return SYNTAX_PGM_TABLE_ENTRY_500_LENGTH;
		}

}
  
