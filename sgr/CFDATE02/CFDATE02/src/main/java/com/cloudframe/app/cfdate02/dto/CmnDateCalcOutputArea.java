package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcOutputArea extends CmnDateCalcOutputAreaSerialized { 
   
				private CmnDateCalcCalculations cmnDateCalcCalculations = new CmnDateCalcCalculations();
	
	/**
	* Constructor for CmnDateCalcOutputArea
	**/
    public CmnDateCalcOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcCalculations.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of cmnDateCalcCalculations
	 *	@return cmnDateCalcCalculations
	 */   
	 public CmnDateCalcCalculations getCmnDateCalcCalculations() {
   	return cmnDateCalcCalculations;
   }
   /**
	* 	Update CmnDateCalcCalculations with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-CALCULATIONS
	*	@param value
	*/
   public void setCmnDateCalcCalculations(char[] value) {
      cmnDateCalcCalculations.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcCalculations 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcCalculations(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalculations.begin,cmnDateCalcCalculations.length());
   }
   
     /**
	 * 	Update CmnDateCalcCalculations 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcCalculations(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalculations.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcCalculations with another Field
	 *	@param value
	 */
   public void setCmnDateCalcCalculations(Field source) {
   	replace(source,0,source.length(),cmnDateCalcCalculations.begin,cmnDateCalcCalculations.length());
   }  
   
     /**
	 * 	Update CmnDateCalcCalculations 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcCalculations(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalculations.begin,cmnDateCalcCalculations.length());
   }
   
     /**
	 * 	Update CmnDateCalcCalculations 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcCalculations(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalculations.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcOutputAreaFieldLength() {
			return CMN_DATE_CALC_OUTPUT_AREA_LENGTH;
		}

}
  
