package com.cloudframe.app.sf311010.dto;

/**
*  The class WhenCompiled804 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WhenCompiled804 extends WhenCompiled804Serialized {
   

						private char[] compileDate804 = new char[8];

						private char[] compileTime804 = new char[8];

	
	/**
	* Constructor for WhenCompiled804
	**/
    public WhenCompiled804() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCompileDate804(fillSpace(8));
								setCompileTime804(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 16
             ,8
             );
    }


 

	/**
	 *	Returns the value of compileDate804
	 *	@return compileDate804
	 */
   public char[] getCompileDate804() throws CFException{
     if (isCompileDate804Modified()) { 
        compileDate804 = refreshCompileDate804();
     }
   		return compileDate804;
   }

  
	/**
	*  set variable compileDate804
	*  Corresponding COBOL Variable is 804-COMPILE-DATE
	*  @param value
	**/
   public void setCompileDate804(char[] value) {
      compileDate804 = checkCompileDate804Constraints(value);
      serializeCompileDate804(compileDate804);
   } 

     /**
	 * 	Update CompileDate804 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileDate804(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileDate804,compileDate804.length);
   	
   }
   
   public void setCompileDate804(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDate804,compileDate804.length);
   	
   }
   
     /**
	 * 	Update CompileDate804 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileDate804(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDate804+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileDate804 with another Field
	 *	@param value
	 */
   public void setCompileDate804(Field source) {
       replace(source,0,source.length(),beginCompileDate804,COMPILE_DATE_804_LEN);
   	
   }  
   
     /**
	 * 	Update CompileDate804 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileDate804(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileDate804,COMPILE_DATE_804_LEN);
   	
   }
   
     /**
	 * 	Update CompileDate804 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileDate804(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDate804+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileTime804
	 *	@return compileTime804
	 */
   public char[] getCompileTime804() throws CFException{
     if (isCompileTime804Modified()) { 
        compileTime804 = refreshCompileTime804();
     }
   		return compileTime804;
   }

  
	/**
	*  set variable compileTime804
	*  Corresponding COBOL Variable is 804-COMPILE-TIME
	*  @param value
	**/
   public void setCompileTime804(char[] value) {
      compileTime804 = checkCompileTime804Constraints(value);
      serializeCompileTime804(compileTime804);
   } 

     /**
	 * 	Update CompileTime804 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileTime804(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileTime804,compileTime804.length);
   	
   }
   
   public void setCompileTime804(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileTime804,compileTime804.length);
   	
   }
   
     /**
	 * 	Update CompileTime804 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileTime804(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileTime804+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileTime804 with another Field
	 *	@param value
	 */
   public void setCompileTime804(Field source) {
       replace(source,0,source.length(),beginCompileTime804,COMPILE_TIME_804_LEN);
   	
   }  
   
     /**
	 * 	Update CompileTime804 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileTime804(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileTime804,COMPILE_TIME_804_LEN);
   	
   }
   
     /**
	 * 	Update CompileTime804 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileTime804(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileTime804+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWhenCompiled804FieldLength() {
			return WHEN_COMPILED_804_LENGTH;
		}

}
  
