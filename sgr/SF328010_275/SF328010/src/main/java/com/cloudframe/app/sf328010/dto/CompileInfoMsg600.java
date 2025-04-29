package com.cloudframe.app.sf328010.dto;

/**
*  The class CompileInfoMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CompileInfoMsg600 extends CompileInfoMsg600Serialized {
   

				private CompileDate600 compileDate600 = new CompileDate600();

				private CompileTime600 compileTime600 = new CompileTime600();

	
	/**
	* Constructor for CompileInfoMsg600
	**/
    public CompileInfoMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			compileDate600.setParent(this,getStartOffset() + 30);
	       			compileTime600.setParent(this,getStartOffset() + 48);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF328010-0002  COMPILE DATE = ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             ("  TIME= ").toCharArray()
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 56
             ,8
             );
    }


 

	/**
	 *	Returns the value of compileDate600
	 *	@return compileDate600
	 */   
	 public CompileDate600 getCompileDate600() {
   	return compileDate600;
   }
   /**
	* 	Update CompileDate600 with the passed value
	*   Corresponding COBOL Variable is 600-COMPILE-DATE
	*	@param value
	*/
   public void setCompileDate600(char[] value) {
      compileDate600.setString(value); 
   }   
    
     /**
	 * 	Update CompileDate600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCompileDate600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileDate600.begin,compileDate600.length());
   }
   
     /**
	 * 	Update CompileDate600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileDate600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CompileDate600 with another Field
	 *	@param value
	 */
   public void setCompileDate600(Field source) {
   	replace(source,0,source.length(),compileDate600.begin,compileDate600.length());
   }  
   
     /**
	 * 	Update CompileDate600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCompileDate600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileDate600.begin,compileDate600.length());
   }
   
     /**
	 * 	Update CompileDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileDate600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of compileTime600
	 *	@return compileTime600
	 */   
	 public CompileTime600 getCompileTime600() {
   	return compileTime600;
   }
   /**
	* 	Update CompileTime600 with the passed value
	*   Corresponding COBOL Variable is 600-COMPILE-TIME
	*	@param value
	*/
   public void setCompileTime600(char[] value) {
      compileTime600.setString(value); 
   }   
    
     /**
	 * 	Update CompileTime600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCompileTime600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileTime600.begin,compileTime600.length());
   }
   
     /**
	 * 	Update CompileTime600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompileTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileTime600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CompileTime600 with another Field
	 *	@param value
	 */
   public void setCompileTime600(Field source) {
   	replace(source,0,source.length(),compileTime600.begin,compileTime600.length());
   }  
   
     /**
	 * 	Update CompileTime600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCompileTime600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,compileTime600.begin,compileTime600.length());
   }
   
     /**
	 * 	Update CompileTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompileTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,compileTime600.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCompileInfoMsg600FieldLength() {
			return COMPILE_INFO_MSG_600_LENGTH;
		}

}
  
