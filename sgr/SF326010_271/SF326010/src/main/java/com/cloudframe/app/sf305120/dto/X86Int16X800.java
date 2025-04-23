package com.cloudframe.app.sf305120.dto;

/**
*  The class X86Int16X800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X86Int16X800 extends X86Int16X800Serialized { 
   

						private char[] x86Int16B2800 = Field.fillLowValue(1);

						private char[] x86Int16B1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for X86Int16X800
	**/
    public X86Int16X800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X86Int16X800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X86Int16X800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x86Int16B2800
	 *	@return x86Int16B2800
	 */
   public char[] getX86Int16B2800() throws CFException{
     if (isX86Int16B2800Modified()) { 
        x86Int16B2800 = refreshX86Int16B2800();
     }
   		return x86Int16B2800;
   }

  
	/**
	*  set variable x86Int16B2800
	*  Corresponding COBOL Variable is 800-X86-INT16-B2
	*  @param value
	**/
   public void setX86Int16B2800(char[] value) {
      x86Int16B2800 = checkX86Int16B2800Constraints(value);
      serializeX86Int16B2800(x86Int16B2800);
   } 

     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int16B2800,x86Int16B2800.length);
   	
   }
   
   public void setX86Int16B2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B2800,x86Int16B2800.length);
   	
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int16B2800 with another Field
	 *	@param value
	 */
   public void setX86Int16B2800(Field source) {
       replace(source,0,source.length(),beginX86Int16B2800,X_86_INT_16_B_2800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int16B2800,X_86_INT_16_B_2800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x86Int16B1800
	 *	@return x86Int16B1800
	 */
   public char[] getX86Int16B1800() throws CFException{
     if (isX86Int16B1800Modified()) { 
        x86Int16B1800 = refreshX86Int16B1800();
     }
   		return x86Int16B1800;
   }

  
	/**
	*  set variable x86Int16B1800
	*  Corresponding COBOL Variable is 800-X86-INT16-B1
	*  @param value
	**/
   public void setX86Int16B1800(char[] value) {
      x86Int16B1800 = checkX86Int16B1800Constraints(value);
      serializeX86Int16B1800(x86Int16B1800);
   } 

     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int16B1800,x86Int16B1800.length);
   	
   }
   
   public void setX86Int16B1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B1800,x86Int16B1800.length);
   	
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int16B1800 with another Field
	 *	@param value
	 */
   public void setX86Int16B1800(Field source) {
       replace(source,0,source.length(),beginX86Int16B1800,X_86_INT_16_B_1800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int16B1800,X_86_INT_16_B_1800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int16B1800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX86Int16X800FieldLength() {
			return X_86_INT_16_X_800_LENGTH;
		}

}
  
