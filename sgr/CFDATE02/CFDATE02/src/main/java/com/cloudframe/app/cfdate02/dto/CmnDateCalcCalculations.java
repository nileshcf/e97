package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcCalculations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcCalculations extends CmnDateCalcCalculationsSerialized { 
   

						private char[] cmnDateCalcNewDateCalc = Field.fillLowValue(10);

						private char[] cmnDateCalcNewDateCalcR = Field.fillLowValue(10);
	
	/**
	* Constructor for CmnDateCalcCalculations
	**/
    public CmnDateCalcCalculations() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcCalculations. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalculations(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcNewDateCalc
	 *	@return cmnDateCalcNewDateCalc
	 */
   public char[] getCmnDateCalcNewDateCalc() throws CFException{
     if (isCmnDateCalcNewDateCalcModified()) { 
        cmnDateCalcNewDateCalc = refreshCmnDateCalcNewDateCalc();
     }
   		return cmnDateCalcNewDateCalc;
   }

  
	/**
	*  set variable cmnDateCalcNewDateCalc
	*  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-CALC
	*  @param value
	**/
   public void setCmnDateCalcNewDateCalc(char[] value) {
      cmnDateCalcNewDateCalc = checkCmnDateCalcNewDateCalcConstraints(value);
      serializeCmnDateCalcNewDateCalc(cmnDateCalcNewDateCalc);
   } 

     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcNewDateCalc,cmnDateCalcNewDateCalc.length);
   	
   }
   
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc,cmnDateCalcNewDateCalc.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcNewDateCalc with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcNewDateCalcR
	 *	@return cmnDateCalcNewDateCalcR
	 */
   public char[] getCmnDateCalcNewDateCalcR() throws CFException{
     if (isCmnDateCalcNewDateCalcRModified()) { 
        cmnDateCalcNewDateCalcR = refreshCmnDateCalcNewDateCalcR();
     }
   		return cmnDateCalcNewDateCalcR;
   }

  
	/**
	*  set variable cmnDateCalcNewDateCalcR
	*  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-CALC-R
	*  @param value
	**/
   public void setCmnDateCalcNewDateCalcR(char[] value) {
      cmnDateCalcNewDateCalcR = checkCmnDateCalcNewDateCalcRConstraints(value);
      serializeCmnDateCalcNewDateCalcR(cmnDateCalcNewDateCalcR);
   } 

     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcNewDateCalcR,cmnDateCalcNewDateCalcR.length);
   	
   }
   
   public void setCmnDateCalcNewDateCalcR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalcR,cmnDateCalcNewDateCalcR.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalcR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcNewDateCalcR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcNewDateCalcR,CMN_DATE_CALC_NEW_DATE_CALC_R_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalcR,CMN_DATE_CALC_NEW_DATE_CALC_R_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalcR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateCalcCalculationsFieldLength() {
			return CMN_DATE_CALC_CALCULATIONS_LENGTH;
		}

}
  
