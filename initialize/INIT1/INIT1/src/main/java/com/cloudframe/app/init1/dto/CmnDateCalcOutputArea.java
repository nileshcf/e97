package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcOutputArea extends CmnDateCalcOutputAreaSerialized { 
   

								private int cmnDateCalcReturnCode;
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
	 *	Returns the value of cmnDateCalcReturnCode
	 *	@return cmnDateCalcReturnCode
	 */
	public int getCmnDateCalcReturnCode() throws CFException {
       if (isCmnDateCalcReturnCodeModified()) { 
           cmnDateCalcReturnCode = refreshCmnDateCalcReturnCode();
        }
   		return cmnDateCalcReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-RETURN-CODE
	 *	@param number
	 */
	public void setCmnDateCalcReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcReturnCode = checkCmnDateCalcReturnCodeMaxLimit(number); 
		serializeCmnDateCalcReturnCode(cmnDateCalcReturnCode);
	}
	

	public void setCmnDateCalcReturnCode(long number) {
	    number = checkCmnDateCalcReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcReturnCode(char[] value) throws CFException {
		 cmnDateCalcReturnCode = serializeCmnDateCalcReturnCode(value);
	}
	/**
	 * 	Update CmnDateCalcReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcReturnCodeString(char[] value) throws CFException {
		 setCmnDateCalcReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfulCall12()
	 *	@return  Returns true if isSuccessfulCall12() is 0
	 */
   public boolean isSuccessfulCall12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfulCall12True() {  			
    	setCmnDateCalcReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters12()
	 *	@return  Returns true if isValidParameters12() is 0
	 */
   public boolean isValidParameters12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters12True() {  			
    	setCmnDateCalcReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 15 for isErrorInCall12()
	 *	@return  Returns true if isErrorInCall12() is 1 THRU 15
	 */
   public boolean isErrorInCall12() throws CFException {
      return (   (getCmnDateCalcReturnCode()  >=  1 ) &&   (getCmnDateCalcReturnCode()  <=  15 )   );
   }


	/**
	*  set values 1 THRU 15
	*/
   	public void setErrorInCall12True() {  			
    	setCmnDateCalcReturnCode( 1);
   	}
	
	/**
	 *	Test condition 1 for isDateTypeOptionNotValid12()
	 *	@return  Returns true if isDateTypeOptionNotValid12() is 1
	 */
   public boolean isDateTypeOptionNotValid12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDateTypeOptionNotValid12True() {  			
    	setCmnDateCalcReturnCode( 1);
   	}
	
	/**
	 *	Test condition 2 for isDateDowIndNotValid12()
	 *	@return  Returns true if isDateDowIndNotValid12() is 2
	 */
   public boolean isDateDowIndNotValid12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDateDowIndNotValid12True() {  			
    	setCmnDateCalcReturnCode( 2);
   	}
	
	/**
	 *	Test condition 3 for isDateDowIndNotNumeric12()
	 *	@return  Returns true if isDateDowIndNotNumeric12() is 3
	 */
   public boolean isDateDowIndNotNumeric12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setDateDowIndNotNumeric12True() {  			
    	setCmnDateCalcReturnCode( 3);
   	}
	
	/**
	 *	Test condition 5 for isInvalidCalcType12()
	 *	@return  Returns true if isInvalidCalcType12() is 5
	 */
   public boolean isInvalidCalcType12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setInvalidCalcType12True() {  			
    	setCmnDateCalcReturnCode( 5);
   	}
	
	/**
	 *	Test condition 7 for isOutofRangeStrtDateInput12()
	 *	@return  Returns true if isOutofRangeStrtDateInput12() is 7
	 */
   public boolean isOutofRangeStrtDateInput12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutofRangeStrtDateInput12True() {  			
    	setCmnDateCalcReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isOutofRangeEndDateInput12()
	 *	@return  Returns true if isOutofRangeEndDateInput12() is 8
	 */
   public boolean isOutofRangeEndDateInput12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setOutofRangeEndDateInput12True() {  			
    	setCmnDateCalcReturnCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isNonNumericStrtDateInput12()
	 *	@return  Returns true if isNonNumericStrtDateInput12() is 9
	 */
   public boolean isNonNumericStrtDateInput12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setNonNumericStrtDateInput12True() {  			
    	setCmnDateCalcReturnCode( 9);
   	}
	
	/**
	 *	Test condition 10 for isNonNumericEndDateInput12()
	 *	@return  Returns true if isNonNumericEndDateInput12() is 10
	 */
   public boolean isNonNumericEndDateInput12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setNonNumericEndDateInput12True() {  			
    	setCmnDateCalcReturnCode( 10);
   	}
	
	/**
	 *	Test condition 11 for isNonNumericNbrOfDaysIn12()
	 *	@return  Returns true if isNonNumericNbrOfDaysIn12() is 11
	 */
   public boolean isNonNumericNbrOfDaysIn12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  11  );
   }


	/**
	*  set values 11
	*/
   	public void setNonNumericNbrOfDaysIn12True() {  			
    	setCmnDateCalcReturnCode( 11);
   	}
	
	/**
	 *	Test condition 14 for isNonNumericNbrOfMnthsIn12()
	 *	@return  Returns true if isNonNumericNbrOfMnthsIn12() is 14
	 */
   public boolean isNonNumericNbrOfMnthsIn12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  14  );
   }


	/**
	*  set values 14
	*/
   	public void setNonNumericNbrOfMnthsIn12True() {  			
    	setCmnDateCalcReturnCode( 14);
   	}
	
	/**
	 *	Test condition 12 for isOutOfRangeNbrOfDaysIn12()
	 *	@return  Returns true if isOutOfRangeNbrOfDaysIn12() is 12
	 */
   public boolean isOutOfRangeNbrOfDaysIn12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setOutOfRangeNbrOfDaysIn12True() {  			
    	setCmnDateCalcReturnCode( 12);
   	}
	
	/**
	 *	Test condition 13 for isDataBaseError12()
	 *	@return  Returns true if isDataBaseError12() is 13
	 */
   public boolean isDataBaseError12() throws CFException {
      return (  getCmnDateCalcReturnCode()  ==  13  );
   }


	/**
	*  set values 13
	*/
   	public void setDataBaseError12True() {  			
    	setCmnDateCalcReturnCode( 13);
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
  
