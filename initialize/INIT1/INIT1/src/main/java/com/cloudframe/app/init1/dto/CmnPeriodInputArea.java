package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodInputArea extends CmnPeriodInputAreaSerialized { 
   
				private CmnPeriodInput cmnPeriodInput = new CmnPeriodInput();
	
	/**
	* Constructor for CmnPeriodInputArea
	**/
    public CmnPeriodInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnPeriodInput.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnPeriodInput
	 *	@return cmnPeriodInput
	 */   
	 public CmnPeriodInput getCmnPeriodInput() {
   	return cmnPeriodInput;
   }
   /**
	* 	Update CmnPeriodInput with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-INPUT
	*	@param value
	*/
   public void setCmnPeriodInput(char[] value) {
      cmnPeriodInput.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodInput 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodInput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInput.begin,cmnPeriodInput.length());
   }
   
     /**
	 * 	Update CmnPeriodInput 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInput.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodInput with another Field
	 *	@param value
	 */
   public void setCmnPeriodInput(Field source) {
   	replace(source,0,source.length(),cmnPeriodInput.begin,cmnPeriodInput.length());
   }  
   
     /**
	 * 	Update CmnPeriodInput 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodInput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInput.begin,cmnPeriodInput.length());
   }
   
     /**
	 * 	Update CmnPeriodInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInput.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnPeriodInputAreaFieldLength() {
			return CMN_PERIOD_INPUT_AREA_LENGTH;
		}

}
  
