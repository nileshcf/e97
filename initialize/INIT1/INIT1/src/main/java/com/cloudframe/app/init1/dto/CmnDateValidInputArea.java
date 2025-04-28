package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateValidInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateValidInputArea extends CmnDateValidInputAreaSerialized { 
   

						private char[] cmnDateValidInput = Field.fillLowValue(10);
	
	/**
	* Constructor for CmnDateValidInputArea
	**/
    public CmnDateValidInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateValidInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateValidInput
	 *	@return cmnDateValidInput
	 */
   public char[] getCmnDateValidInput() throws CFException{
     if (isCmnDateValidInputModified()) { 
        cmnDateValidInput = refreshCmnDateValidInput();
     }
   		return cmnDateValidInput;
   }

  
	/**
	*  set variable cmnDateValidInput
	*  Corresponding COBOL Variable is CMN-DATE-VALID-INPUT
	*  @param value
	**/
   public void setCmnDateValidInput(char[] value) {
      cmnDateValidInput = checkCmnDateValidInputConstraints(value);
      serializeCmnDateValidInput(cmnDateValidInput);
   } 

     /**
	 * 	Update CmnDateValidInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidInput(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateValidInput,cmnDateValidInput.length);
   	
   }
   
   public void setCmnDateValidInput(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateValidInput,cmnDateValidInput.length);
   	
   }
   
     /**
	 * 	Update CmnDateValidInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateValidInput+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateValidInput with another Field
	 *	@param value
	 */
   public void setCmnDateValidInput(Field source) {
       replace(source,0,source.length(),beginCmnDateValidInput,CMN_DATE_VALID_INPUT_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateValidInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateValidInput(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateValidInput,CMN_DATE_VALID_INPUT_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateValidInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateValidInput+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateValidInputAreaFieldLength() {
			return CMN_DATE_VALID_INPUT_AREA_LENGTH;
		}

}
  
