package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumericInputGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WvNumericInputGroup extends WvNumericInputGroupSerialized {
   

						private char[] wvNumericInput = Field.fillLowValue(18);
					private WvNumInpArray wvNumInpArray = new WvNumInpArray();
	
	/**
	* Constructor for WvNumericInputGroup
	**/
    public WvNumericInputGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wvNumInpArray.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException{
     if (isWvNumericInputModified()) { 
        wvNumericInput = refreshWvNumericInput();
     }
   		return wvNumericInput;
   }

  
	/**
	*  set variable wvNumericInput
	*  Corresponding COBOL Variable is WV-NUMERIC-INPUT
	*  @param value
	**/
   public void setWvNumericInput(char[] value) {
      wvNumericInput = checkWvNumericInputConstraints(value);
      serializeWvNumericInput(wvNumericInput);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvNumericInput,wvNumericInput.length);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumericInput,wvNumericInput.length);
   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumericInput+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
       replace(source,0,source.length(),beginWvNumericInput,WV_NUMERIC_INPUT_LEN);
   	
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvNumericInput,WV_NUMERIC_INPUT_LEN);
   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumericInput+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvNumInpArray
	 *	@return wvNumInpArray
	 */   
	 public WvNumInpArray getWvNumInpArray() {
   	return wvNumInpArray;
   }
   /**
	* 	Update WvNumInpArray with the passed value
	*   Corresponding COBOL Variable is WV-NUM-INP-ARRAY
	*	@param value
	*/
   public void setWvNumInpArray(char[] value) {
      wvNumInpArray.setString(value); 
   }   
    
     /**
	 * 	Update WvNumInpArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvNumInpArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvNumInpArray.begin,wvNumInpArray.length());
   }
   
     /**
	 * 	Update WvNumInpArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInpArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvNumInpArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvNumInpArray with another Field
	 *	@param value
	 */
   public void setWvNumInpArray(Field source) {
   	replace(source,0,source.length(),wvNumInpArray.begin,wvNumInpArray.length());
   }  
   
     /**
	 * 	Update WvNumInpArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvNumInpArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvNumInpArray.begin,wvNumInpArray.length());
   }
   
     /**
	 * 	Update WvNumInpArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInpArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvNumInpArray.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWvNumericInputGroupFieldLength() {
			return WV_NUMERIC_INPUT_GROUP_LENGTH;
		}

}
  
