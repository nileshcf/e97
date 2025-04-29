package com.cloudframe.app.sf326010.dto;

/**
*  The class X86Int32X800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X86Int32X800 extends X86Int32X800Serialized { 
   

						private char[] x86Int32B4800 = Field.fillLowValue(1);

						private char[] x86Int32B3800 = Field.fillLowValue(1);

						private char[] x86Int32B2800 = Field.fillLowValue(1);

						private char[] x86Int32B1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for X86Int32X800
	**/
    public X86Int32X800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X86Int32X800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X86Int32X800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x86Int32B4800
	 *	@return x86Int32B4800
	 */
   public char[] getX86Int32B4800() throws CFException{
     if (isX86Int32B4800Modified()) { 
        x86Int32B4800 = refreshX86Int32B4800();
     }
   		return x86Int32B4800;
   }

  
	/**
	*  set variable x86Int32B4800
	*  Corresponding COBOL Variable is 800-X86-INT32-B4
	*  @param value
	**/
   public void setX86Int32B4800(char[] value) {
      x86Int32B4800 = checkX86Int32B4800Constraints(value);
      serializeX86Int32B4800(x86Int32B4800);
   } 

     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int32B4800,x86Int32B4800.length);
   	
   }
   
   public void setX86Int32B4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B4800,x86Int32B4800.length);
   	
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int32B4800 with another Field
	 *	@param value
	 */
   public void setX86Int32B4800(Field source) {
       replace(source,0,source.length(),beginX86Int32B4800,X_86_INT_32_B_4800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int32B4800,X_86_INT_32_B_4800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B4800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x86Int32B3800
	 *	@return x86Int32B3800
	 */
   public char[] getX86Int32B3800() throws CFException{
     if (isX86Int32B3800Modified()) { 
        x86Int32B3800 = refreshX86Int32B3800();
     }
   		return x86Int32B3800;
   }

  
	/**
	*  set variable x86Int32B3800
	*  Corresponding COBOL Variable is 800-X86-INT32-B3
	*  @param value
	**/
   public void setX86Int32B3800(char[] value) {
      x86Int32B3800 = checkX86Int32B3800Constraints(value);
      serializeX86Int32B3800(x86Int32B3800);
   } 

     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int32B3800,x86Int32B3800.length);
   	
   }
   
   public void setX86Int32B3800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B3800,x86Int32B3800.length);
   	
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B3800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int32B3800 with another Field
	 *	@param value
	 */
   public void setX86Int32B3800(Field source) {
       replace(source,0,source.length(),beginX86Int32B3800,X_86_INT_32_B_3800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int32B3800,X_86_INT_32_B_3800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B3800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x86Int32B2800
	 *	@return x86Int32B2800
	 */
   public char[] getX86Int32B2800() throws CFException{
     if (isX86Int32B2800Modified()) { 
        x86Int32B2800 = refreshX86Int32B2800();
     }
   		return x86Int32B2800;
   }

  
	/**
	*  set variable x86Int32B2800
	*  Corresponding COBOL Variable is 800-X86-INT32-B2
	*  @param value
	**/
   public void setX86Int32B2800(char[] value) {
      x86Int32B2800 = checkX86Int32B2800Constraints(value);
      serializeX86Int32B2800(x86Int32B2800);
   } 

     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int32B2800,x86Int32B2800.length);
   	
   }
   
   public void setX86Int32B2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B2800,x86Int32B2800.length);
   	
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int32B2800 with another Field
	 *	@param value
	 */
   public void setX86Int32B2800(Field source) {
       replace(source,0,source.length(),beginX86Int32B2800,X_86_INT_32_B_2800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int32B2800,X_86_INT_32_B_2800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x86Int32B1800
	 *	@return x86Int32B1800
	 */
   public char[] getX86Int32B1800() throws CFException{
     if (isX86Int32B1800Modified()) { 
        x86Int32B1800 = refreshX86Int32B1800();
     }
   		return x86Int32B1800;
   }

  
	/**
	*  set variable x86Int32B1800
	*  Corresponding COBOL Variable is 800-X86-INT32-B1
	*  @param value
	**/
   public void setX86Int32B1800(char[] value) {
      x86Int32B1800 = checkX86Int32B1800Constraints(value);
      serializeX86Int32B1800(x86Int32B1800);
   } 

     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX86Int32B1800,x86Int32B1800.length);
   	
   }
   
   public void setX86Int32B1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B1800,x86Int32B1800.length);
   	
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X86Int32B1800 with another Field
	 *	@param value
	 */
   public void setX86Int32B1800(Field source) {
       replace(source,0,source.length(),beginX86Int32B1800,X_86_INT_32_B_1800_LEN);
   	
   }  
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX86Int32B1800,X_86_INT_32_B_1800_LEN);
   	
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX86Int32B1800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX86Int32X800FieldLength() {
			return X_86_INT_32_X_800_LENGTH;
		}

}
  
