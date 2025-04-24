package com.cloudframe.app.sf326010.dto;

/**
*  The class CompileDate600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CompileDate600 extends CompileDate600Serialized { 
   

						private char[] compDateYyyy600 = new char[4];


						private char[] compDateMm600 = new char[2];


						private char[] compDateDd600 = new char[2];
	
	/**
	* Constructor for CompileDate600
	**/
    public CompileDate600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CompileDate600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileDate600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCompDateYyyy600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setCompDateMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setCompDateDd600(fillSpace(2));
    } 

	/**
	 *	Returns the value of compDateYyyy600
	 *	@return compDateYyyy600
	 */
   public char[] getCompDateYyyy600() throws CFException{
     if (isCompDateYyyy600Modified()) { 
        compDateYyyy600 = refreshCompDateYyyy600();
     }
   		return compDateYyyy600;
   }

  
	/**
	*  set variable compDateYyyy600
	*  Corresponding COBOL Variable is 600-COMP-DATE-YYYY
	*  @param value
	**/
   public void setCompDateYyyy600(char[] value) {
      compDateYyyy600 = checkCompDateYyyy600Constraints(value);
      serializeCompDateYyyy600(compDateYyyy600);
   } 

     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompDateYyyy600,compDateYyyy600.length);
   	
   }
   
   public void setCompDateYyyy600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateYyyy600,compDateYyyy600.length);
   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateYyyy600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source) {
       replace(source,0,source.length(),beginCompDateYyyy600,COMP_DATE_YYYY_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompDateYyyy600,COMP_DATE_YYYY_600_LEN);
   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateYyyy600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compDateMm600
	 *	@return compDateMm600
	 */
   public char[] getCompDateMm600() throws CFException{
     if (isCompDateMm600Modified()) { 
        compDateMm600 = refreshCompDateMm600();
     }
   		return compDateMm600;
   }

  
	/**
	*  set variable compDateMm600
	*  Corresponding COBOL Variable is 600-COMP-DATE-MM
	*  @param value
	**/
   public void setCompDateMm600(char[] value) {
      compDateMm600 = checkCompDateMm600Constraints(value);
      serializeCompDateMm600(compDateMm600);
   } 

     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompDateMm600,compDateMm600.length);
   	
   }
   
   public void setCompDateMm600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateMm600,compDateMm600.length);
   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateMm600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompDateMm600 with another Field
	 *	@param value
	 */
   public void setCompDateMm600(Field source) {
       replace(source,0,source.length(),beginCompDateMm600,COMP_DATE_MM_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompDateMm600,COMP_DATE_MM_600_LEN);
   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateMm600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compDateDd600
	 *	@return compDateDd600
	 */
   public char[] getCompDateDd600() throws CFException{
     if (isCompDateDd600Modified()) { 
        compDateDd600 = refreshCompDateDd600();
     }
   		return compDateDd600;
   }

  
	/**
	*  set variable compDateDd600
	*  Corresponding COBOL Variable is 600-COMP-DATE-DD
	*  @param value
	**/
   public void setCompDateDd600(char[] value) {
      compDateDd600 = checkCompDateDd600Constraints(value);
      serializeCompDateDd600(compDateDd600);
   } 

     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompDateDd600,compDateDd600.length);
   	
   }
   
   public void setCompDateDd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateDd600,compDateDd600.length);
   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateDd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompDateDd600 with another Field
	 *	@param value
	 */
   public void setCompDateDd600(Field source) {
       replace(source,0,source.length(),beginCompDateDd600,COMP_DATE_DD_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompDateDd600,COMP_DATE_DD_600_LEN);
   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompDateDd600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCompileDate600FieldLength() {
			return COMPILE_DATE_600_LENGTH;
		}

}
  
