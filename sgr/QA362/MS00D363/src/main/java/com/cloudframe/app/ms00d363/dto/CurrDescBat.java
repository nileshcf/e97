package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrDescBat is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrDescBat extends CurrDescBatSerialized { 
   

						private char[] swchCerDescription = Field.fillLowValue(30);
	
	/**
	* Constructor for CurrDescBat
	**/
    public CurrDescBat() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrDescBat. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescBat(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of swchCerDescription
	 *	@return swchCerDescription
	 */
   public char[] getSwchCerDescription() throws CFException{
     if (isSwchCerDescriptionModified()) { 
        swchCerDescription = refreshSwchCerDescription();
     }
   		return swchCerDescription;
   }

  
	/**
	*  set variable swchCerDescription
	*  Corresponding COBOL Variable is SWCH-CER-DESCRIPTION
	*  @param value
	**/
   public void setSwchCerDescription(char[] value) {
      swchCerDescription = checkSwchCerDescriptionConstraints(value);
      serializeSwchCerDescription(swchCerDescription);
   } 

     /**
	 * 	Update SwchCerDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSwchCerDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSwchCerDescription,swchCerDescription.length);
   	
   }
   
   public void setSwchCerDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerDescription,swchCerDescription.length);
   	
   }
   
     /**
	 * 	Update SwchCerDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SwchCerDescription with another Field
	 *	@param value
	 */
   public void setSwchCerDescription(Field source) {
       replace(source,0,source.length(),beginSwchCerDescription,SWCH_CER_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update SwchCerDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSwchCerDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSwchCerDescription,SWCH_CER_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update SwchCerDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerDescription+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrDescBatFieldLength() {
			return CURR_DESC_BAT_LENGTH;
		}

}
  
