package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcInputArea extends CmnDateCalcInputAreaSerialized { 
   
				private CmnDateCalcInputDateArea cmnDateCalcInputDateArea = new CmnDateCalcInputDateArea();
	
	/**
	* Constructor for CmnDateCalcInputArea
	**/
    public CmnDateCalcInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcInputDateArea.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of cmnDateCalcInputDateArea
	 *	@return cmnDateCalcInputDateArea
	 */   
	 public CmnDateCalcInputDateArea getCmnDateCalcInputDateArea() {
   	return cmnDateCalcInputDateArea;
   }
   /**
	* 	Update CmnDateCalcInputDateArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-INPUT-DATE-AREA
	*	@param value
	*/
   public void setCmnDateCalcInputDateArea(char[] value) {
      cmnDateCalcInputDateArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcInputDateArea with another Field
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source) {
   	replace(source,0,source.length(),cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }  
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcInputAreaFieldLength() {
			return CMN_DATE_CALC_INPUT_AREA_LENGTH;
		}

}
  
