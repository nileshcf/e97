package com.cloudframe.app.sf305120.dto;

/**
*  The class Z9Int16X800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Z9Int16X800 extends Z9Int16X800Serialized { 
   

						private char[] z9Int16B1800 = Field.fillLowValue(1);

						private char[] z9Int16B2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Z9Int16X800
	**/
    public Z9Int16X800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Z9Int16X800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Z9Int16X800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of z9Int16B1800
	 *	@return z9Int16B1800
	 */
   public char[] getZ9Int16B1800() throws CFException{
     if (isZ9Int16B1800Modified()) { 
        z9Int16B1800 = refreshZ9Int16B1800();
     }
   		return z9Int16B1800;
   }

  
	/**
	*  set variable z9Int16B1800
	*  Corresponding COBOL Variable is 800-Z9-INT16-B1
	*  @param value
	**/
   public void setZ9Int16B1800(char[] value) {
      z9Int16B1800 = checkZ9Int16B1800Constraints(value);
      serializeZ9Int16B1800(z9Int16B1800);
   } 

     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZ9Int16B1800,z9Int16B1800.length);
   	
   }
   
   public void setZ9Int16B1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B1800,z9Int16B1800.length);
   	
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Z9Int16B1800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source) {
       replace(source,0,source.length(),beginZ9Int16B1800,Z_9_INT_16_B_1800_LEN);
   	
   }  
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZ9Int16B1800,Z_9_INT_16_B_1800_LEN);
   	
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of z9Int16B2800
	 *	@return z9Int16B2800
	 */
   public char[] getZ9Int16B2800() throws CFException{
     if (isZ9Int16B2800Modified()) { 
        z9Int16B2800 = refreshZ9Int16B2800();
     }
   		return z9Int16B2800;
   }

  
	/**
	*  set variable z9Int16B2800
	*  Corresponding COBOL Variable is 800-Z9-INT16-B2
	*  @param value
	**/
   public void setZ9Int16B2800(char[] value) {
      z9Int16B2800 = checkZ9Int16B2800Constraints(value);
      serializeZ9Int16B2800(z9Int16B2800);
   } 

     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZ9Int16B2800,z9Int16B2800.length);
   	
   }
   
   public void setZ9Int16B2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B2800,z9Int16B2800.length);
   	
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Z9Int16B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source) {
       replace(source,0,source.length(),beginZ9Int16B2800,Z_9_INT_16_B_2800_LEN);
   	
   }  
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZ9Int16B2800,Z_9_INT_16_B_2800_LEN);
   	
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZ9Int16B2800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getZ9Int16X800FieldLength() {
			return Z_9_INT_16_X_800_LENGTH;
		}

}
  
