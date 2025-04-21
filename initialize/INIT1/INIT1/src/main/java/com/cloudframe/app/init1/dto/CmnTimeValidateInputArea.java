package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidateInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeValidateInputArea extends CmnTimeValidateInputAreaSerialized { 
   
				private CmnTimeValidInput cmnTimeValidInput = new CmnTimeValidInput();
	
	/**
	* Constructor for CmnTimeValidateInputArea
	**/
    public CmnTimeValidateInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeValidateInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidateInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeValidInput.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnTimeValidInput
	 *	@return cmnTimeValidInput
	 */   
	 public CmnTimeValidInput getCmnTimeValidInput() {
   	return cmnTimeValidInput;
   }
   /**
	* 	Update CmnTimeValidInput with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-VALID-INPUT
	*	@param value
	*/
   public void setCmnTimeValidInput(char[] value) {
      cmnTimeValidInput.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeValidInput 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidInput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidInput.begin,cmnTimeValidInput.length());
   }
   
     /**
	 * 	Update CmnTimeValidInput 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidInput.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeValidInput with another Field
	 *	@param value
	 */
   public void setCmnTimeValidInput(Field source) {
   	replace(source,0,source.length(),cmnTimeValidInput.begin,cmnTimeValidInput.length());
   }  
   
     /**
	 * 	Update CmnTimeValidInput 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidInput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidInput.begin,cmnTimeValidInput.length());
   }
   
     /**
	 * 	Update CmnTimeValidInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidInput.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnTimeValidateInputAreaFieldLength() {
			return CMN_TIME_VALIDATE_INPUT_AREA_LENGTH;
		}

}
  
