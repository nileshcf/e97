package com.cloudframe.app.ip989010.dto;

/**
*  The class RandomX800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RandomX800 extends RandomX800Serialized { 
   

						private char[] randomP4P8800 = Field.fillLowValue(5);
	
	/**
	* Constructor for RandomX800
	**/
    public RandomX800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RandomX800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RandomX800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of randomP4P8800
	 *	@return randomP4P8800
	 */
   public char[] getRandomP4P8800() throws CFException{
     if (isRandomP4P8800Modified()) { 
        randomP4P8800 = refreshRandomP4P8800();
     }
   		return randomP4P8800;
   }

  
	/**
	*  set variable randomP4P8800
	*  Corresponding COBOL Variable is 800-RANDOM-P4-P8
	*  @param value
	**/
   public void setRandomP4P8800(char[] value) {
      randomP4P8800 = checkRandomP4P8800Constraints(value);
      serializeRandomP4P8800(randomP4P8800);
   } 

     /**
	 * 	Update RandomP4P8800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRandomP4P8800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRandomP4P8800,randomP4P8800.length);
   	
   }
   
   public void setRandomP4P8800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRandomP4P8800,randomP4P8800.length);
   	
   }
   
     /**
	 * 	Update RandomP4P8800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRandomP4P8800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRandomP4P8800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RandomP4P8800 with another Field
	 *	@param value
	 */
   public void setRandomP4P8800(Field source) {
       replace(source,0,source.length(),beginRandomP4P8800,RANDOM_P_4_P_8800_LEN);
   	
   }  
   
     /**
	 * 	Update RandomP4P8800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRandomP4P8800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRandomP4P8800,RANDOM_P_4_P_8800_LEN);
   	
   }
   
     /**
	 * 	Update RandomP4P8800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRandomP4P8800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRandomP4P8800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRandomX800FieldLength() {
			return RANDOM_X_800_LENGTH;
		}

}
  
