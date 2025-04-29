package com.cloudframe.app.ar640010.dto;

/**
*  The class CompileMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CompileMsg600 extends CompileMsg600Serialized { 
   


						private char[] compileYear600 = new char[4];


						private char[] compileMonth600 = new char[2];


						private char[] compileDay600 = new char[2];


						private char[] compileHour600 = new char[2];


						private char[] compileMinute600 = new char[2];


						private char[] compileSecond600 = new char[2];
	
	/**
	* Constructor for CompileMsg600
	**/
    public CompileMsg600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CompileMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0001-COMPILE DATE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setCompileYear600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 23
             ,1
             );
								setCompileMonth600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 26
             ,1
             );
								setCompileDay600(fillSpace(2));
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 29
             ,8
             );
								setCompileHour600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 39
             ,1
             );
								setCompileMinute600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setCompileSecond600(fillSpace(2));
    } 

	/**
	 *	Returns the value of compileYear600
	 *	@return compileYear600
	 */
   public char[] getCompileYear600() throws CFException{
     if (isCompileYear600Modified()) { 
        compileYear600 = refreshCompileYear600();
     }
   		return compileYear600;
   }

  
	/**
	*  set variable compileYear600
	*  Corresponding COBOL Variable is 600-COMPILE-YEAR
	*  @param value
	**/
   public void setCompileYear600(char[] value) {
      compileYear600 = checkCompileYear600Constraints(value);
      serializeCompileYear600(compileYear600);
   } 

     /**
	 * 	Update CompileYear600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileYear600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileYear600,compileYear600.length);
   	
   }
   
   public void setCompileYear600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileYear600,compileYear600.length);
   	
   }
   
     /**
	 * 	Update CompileYear600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileYear600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileYear600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileYear600 with another Field
	 *	@param value
	 */
   public void setCompileYear600(Field source) {
       replace(source,0,source.length(),beginCompileYear600,COMPILE_YEAR_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileYear600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileYear600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileYear600,COMPILE_YEAR_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileYear600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileYear600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileYear600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileMonth600
	 *	@return compileMonth600
	 */
   public char[] getCompileMonth600() throws CFException{
     if (isCompileMonth600Modified()) { 
        compileMonth600 = refreshCompileMonth600();
     }
   		return compileMonth600;
   }

  
	/**
	*  set variable compileMonth600
	*  Corresponding COBOL Variable is 600-COMPILE-MONTH
	*  @param value
	**/
   public void setCompileMonth600(char[] value) {
      compileMonth600 = checkCompileMonth600Constraints(value);
      serializeCompileMonth600(compileMonth600);
   } 

     /**
	 * 	Update CompileMonth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileMonth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileMonth600,compileMonth600.length);
   	
   }
   
   public void setCompileMonth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMonth600,compileMonth600.length);
   	
   }
   
     /**
	 * 	Update CompileMonth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileMonth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMonth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileMonth600 with another Field
	 *	@param value
	 */
   public void setCompileMonth600(Field source) {
       replace(source,0,source.length(),beginCompileMonth600,COMPILE_MONTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileMonth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileMonth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileMonth600,COMPILE_MONTH_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileMonth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileMonth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMonth600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileDay600
	 *	@return compileDay600
	 */
   public char[] getCompileDay600() throws CFException{
     if (isCompileDay600Modified()) { 
        compileDay600 = refreshCompileDay600();
     }
   		return compileDay600;
   }

  
	/**
	*  set variable compileDay600
	*  Corresponding COBOL Variable is 600-COMPILE-DAY
	*  @param value
	**/
   public void setCompileDay600(char[] value) {
      compileDay600 = checkCompileDay600Constraints(value);
      serializeCompileDay600(compileDay600);
   } 

     /**
	 * 	Update CompileDay600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileDay600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileDay600,compileDay600.length);
   	
   }
   
   public void setCompileDay600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDay600,compileDay600.length);
   	
   }
   
     /**
	 * 	Update CompileDay600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileDay600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDay600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileDay600 with another Field
	 *	@param value
	 */
   public void setCompileDay600(Field source) {
       replace(source,0,source.length(),beginCompileDay600,COMPILE_DAY_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileDay600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileDay600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileDay600,COMPILE_DAY_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileDay600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileDay600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileDay600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileHour600
	 *	@return compileHour600
	 */
   public char[] getCompileHour600() throws CFException{
     if (isCompileHour600Modified()) { 
        compileHour600 = refreshCompileHour600();
     }
   		return compileHour600;
   }

  
	/**
	*  set variable compileHour600
	*  Corresponding COBOL Variable is 600-COMPILE-HOUR
	*  @param value
	**/
   public void setCompileHour600(char[] value) {
      compileHour600 = checkCompileHour600Constraints(value);
      serializeCompileHour600(compileHour600);
   } 

     /**
	 * 	Update CompileHour600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileHour600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileHour600,compileHour600.length);
   	
   }
   
   public void setCompileHour600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileHour600,compileHour600.length);
   	
   }
   
     /**
	 * 	Update CompileHour600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileHour600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileHour600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileHour600 with another Field
	 *	@param value
	 */
   public void setCompileHour600(Field source) {
       replace(source,0,source.length(),beginCompileHour600,COMPILE_HOUR_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileHour600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileHour600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileHour600,COMPILE_HOUR_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileHour600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileHour600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileHour600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileMinute600
	 *	@return compileMinute600
	 */
   public char[] getCompileMinute600() throws CFException{
     if (isCompileMinute600Modified()) { 
        compileMinute600 = refreshCompileMinute600();
     }
   		return compileMinute600;
   }

  
	/**
	*  set variable compileMinute600
	*  Corresponding COBOL Variable is 600-COMPILE-MINUTE
	*  @param value
	**/
   public void setCompileMinute600(char[] value) {
      compileMinute600 = checkCompileMinute600Constraints(value);
      serializeCompileMinute600(compileMinute600);
   } 

     /**
	 * 	Update CompileMinute600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileMinute600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileMinute600,compileMinute600.length);
   	
   }
   
   public void setCompileMinute600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMinute600,compileMinute600.length);
   	
   }
   
     /**
	 * 	Update CompileMinute600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileMinute600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMinute600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileMinute600 with another Field
	 *	@param value
	 */
   public void setCompileMinute600(Field source) {
       replace(source,0,source.length(),beginCompileMinute600,COMPILE_MINUTE_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileMinute600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileMinute600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileMinute600,COMPILE_MINUTE_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileMinute600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileMinute600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileMinute600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compileSecond600
	 *	@return compileSecond600
	 */
   public char[] getCompileSecond600() throws CFException{
     if (isCompileSecond600Modified()) { 
        compileSecond600 = refreshCompileSecond600();
     }
   		return compileSecond600;
   }

  
	/**
	*  set variable compileSecond600
	*  Corresponding COBOL Variable is 600-COMPILE-SECOND
	*  @param value
	**/
   public void setCompileSecond600(char[] value) {
      compileSecond600 = checkCompileSecond600Constraints(value);
      serializeCompileSecond600(compileSecond600);
   } 

     /**
	 * 	Update CompileSecond600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompileSecond600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompileSecond600,compileSecond600.length);
   	
   }
   
   public void setCompileSecond600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompileSecond600,compileSecond600.length);
   	
   }
   
     /**
	 * 	Update CompileSecond600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileSecond600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileSecond600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompileSecond600 with another Field
	 *	@param value
	 */
   public void setCompileSecond600(Field source) {
       replace(source,0,source.length(),beginCompileSecond600,COMPILE_SECOND_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompileSecond600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompileSecond600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompileSecond600,COMPILE_SECOND_600_LEN);
   	
   }
   
     /**
	 * 	Update CompileSecond600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileSecond600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompileSecond600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCompileMsg600FieldLength() {
			return COMPILE_MSG_600_LENGTH;
		}

}
  
