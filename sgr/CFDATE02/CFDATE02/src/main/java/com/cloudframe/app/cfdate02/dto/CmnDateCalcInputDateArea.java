package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcInputDateArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcInputDateArea extends CmnDateCalcInputDateAreaSerialized { 
   

						private char[] cmnDateCalcStartDate = Field.fillLowValue(10);

						private char[] cmnDateCalcStartDateR = Field.fillLowValue(10);

						private char[] cmnDateCalcEndDate = Field.fillLowValue(10);

						private char[] cmnDateCalcEndDateR = Field.fillLowValue(10);
	
	/**
	* Constructor for CmnDateCalcInputDateArea
	**/
    public CmnDateCalcInputDateArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcInputDateArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputDateArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcStartDate
	 *	@return cmnDateCalcStartDate
	 */
   public char[] getCmnDateCalcStartDate() throws CFException{
     if (isCmnDateCalcStartDateModified()) { 
        cmnDateCalcStartDate = refreshCmnDateCalcStartDate();
     }
   		return cmnDateCalcStartDate;
   }

  
	/**
	*  set variable cmnDateCalcStartDate
	*  Corresponding COBOL Variable is CMN-DATE-CALC-START-DATE
	*  @param value
	**/
   public void setCmnDateCalcStartDate(char[] value) {
      cmnDateCalcStartDate = checkCmnDateCalcStartDateConstraints(value);
      serializeCmnDateCalcStartDate(cmnDateCalcStartDate);
   } 

     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcStartDate,cmnDateCalcStartDate.length);
   	
   }
   
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate,cmnDateCalcStartDate.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcStartDate with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcStartDateR
	 *	@return cmnDateCalcStartDateR
	 */
   public char[] getCmnDateCalcStartDateR() throws CFException{
     if (isCmnDateCalcStartDateRModified()) { 
        cmnDateCalcStartDateR = refreshCmnDateCalcStartDateR();
     }
   		return cmnDateCalcStartDateR;
   }

  
	/**
	*  set variable cmnDateCalcStartDateR
	*  Corresponding COBOL Variable is CMN-DATE-CALC-START-DATE-R
	*  @param value
	**/
   public void setCmnDateCalcStartDateR(char[] value) {
      cmnDateCalcStartDateR = checkCmnDateCalcStartDateRConstraints(value);
      serializeCmnDateCalcStartDateR(cmnDateCalcStartDateR);
   } 

     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcStartDateR,cmnDateCalcStartDateR.length);
   	
   }
   
   public void setCmnDateCalcStartDateR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDateR,cmnDateCalcStartDateR.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDateR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcStartDateR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcStartDateR,CMN_DATE_CALC_START_DATE_R_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDateR,CMN_DATE_CALC_START_DATE_R_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDateR+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcEndDate
	 *	@return cmnDateCalcEndDate
	 */
   public char[] getCmnDateCalcEndDate() throws CFException{
     if (isCmnDateCalcEndDateModified()) { 
        cmnDateCalcEndDate = refreshCmnDateCalcEndDate();
     }
   		return cmnDateCalcEndDate;
   }

  
	/**
	*  set variable cmnDateCalcEndDate
	*  Corresponding COBOL Variable is CMN-DATE-CALC-END-DATE
	*  @param value
	**/
   public void setCmnDateCalcEndDate(char[] value) {
      cmnDateCalcEndDate = checkCmnDateCalcEndDateConstraints(value);
      serializeCmnDateCalcEndDate(cmnDateCalcEndDate);
   } 

     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcEndDate,cmnDateCalcEndDate.length);
   	
   }
   
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate,cmnDateCalcEndDate.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcEndDate with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcEndDateR
	 *	@return cmnDateCalcEndDateR
	 */
   public char[] getCmnDateCalcEndDateR() throws CFException{
     if (isCmnDateCalcEndDateRModified()) { 
        cmnDateCalcEndDateR = refreshCmnDateCalcEndDateR();
     }
   		return cmnDateCalcEndDateR;
   }

  
	/**
	*  set variable cmnDateCalcEndDateR
	*  Corresponding COBOL Variable is CMN-DATE-CALC-END-DATE-R
	*  @param value
	**/
   public void setCmnDateCalcEndDateR(char[] value) {
      cmnDateCalcEndDateR = checkCmnDateCalcEndDateRConstraints(value);
      serializeCmnDateCalcEndDateR(cmnDateCalcEndDateR);
   } 

     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcEndDateR,cmnDateCalcEndDateR.length);
   	
   }
   
   public void setCmnDateCalcEndDateR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDateR,cmnDateCalcEndDateR.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDateR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcEndDateR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcEndDateR,CMN_DATE_CALC_END_DATE_R_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDateR,CMN_DATE_CALC_END_DATE_R_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDateR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateCalcInputDateAreaFieldLength() {
			return CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH;
		}

}
  
