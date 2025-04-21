package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodOutputArea extends CmnPeriodOutputAreaSerialized { 
   

								private int cmnPeriodReturnCode;
				private CmnPeriodOutputYyyymm cmnPeriodOutputYyyymm = new CmnPeriodOutputYyyymm();
				private CmnPeriodOutputMonthYyyy cmnPeriodOutputMonthYyyy = new CmnPeriodOutputMonthYyyy();
	
	/**
	* Constructor for CmnPeriodOutputArea
	**/
    public CmnPeriodOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnPeriodOutputYyyymm.setParent(this,getStartOffset() + 1);
	       			cmnPeriodOutputMonthYyyy.setParent(this,getStartOffset() + 7);
    } 

	/**
	 *	Returns the value of cmnPeriodReturnCode
	 *	@return cmnPeriodReturnCode
	 */
	public int getCmnPeriodReturnCode() throws CFException {
       if (isCmnPeriodReturnCodeModified()) { 
           cmnPeriodReturnCode = refreshCmnPeriodReturnCode();
        }
   		return cmnPeriodReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-RETURN-CODE
	 *	@param number
	 */
	public void setCmnPeriodReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodReturnCode = checkCmnPeriodReturnCodeMaxLimit(number); 
		serializeCmnPeriodReturnCode(cmnPeriodReturnCode);
	}
	

	public void setCmnPeriodReturnCode(long number) {
	    number = checkCmnPeriodReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnPeriodReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodReturnCode(char[] value) throws CFException {
		 cmnPeriodReturnCode = serializeCmnPeriodReturnCode(value);
	}
	/**
	 * 	Update CmnPeriodReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodReturnCodeString(char[] value) throws CFException {
		 setCmnPeriodReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfulCall17()
	 *	@return  Returns true if isSuccessfulCall17() is 0
	 */
   public boolean isSuccessfulCall17() throws CFException {
      return (  getCmnPeriodReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfulCall17True() {  			
    	setCmnPeriodReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidPeriod17()
	 *	@return  Returns true if isValidPeriod17() is 0
	 */
   public boolean isValidPeriod17() throws CFException {
      return (  getCmnPeriodReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidPeriod17True() {  			
    	setCmnPeriodReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall17()
	 *	@return  Returns true if isErrorInCall17() is 1 THRU 9
	 */
   public boolean isErrorInCall17() throws CFException {
      return (   (getCmnPeriodReturnCode()  >=  1 ) &&   (getCmnPeriodReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall17True() {  			
    	setCmnPeriodReturnCode( 1);
   	}
	
	/**
	 *	Test condition 7 for isOutofRangePeriodInputMm17()
	 *	@return  Returns true if isOutofRangePeriodInputMm17() is 7
	 */
   public boolean isOutofRangePeriodInputMm17() throws CFException {
      return (  getCmnPeriodReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutofRangePeriodInputMm17True() {  			
    	setCmnPeriodReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isNonNumericPeriodInputMm17()
	 *	@return  Returns true if isNonNumericPeriodInputMm17() is 8
	 */
   public boolean isNonNumericPeriodInputMm17() throws CFException {
      return (  getCmnPeriodReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setNonNumericPeriodInputMm17True() {  			
    	setCmnPeriodReturnCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isNonNumericPeriodInputYy17()
	 *	@return  Returns true if isNonNumericPeriodInputYy17() is 9
	 */
   public boolean isNonNumericPeriodInputYy17() throws CFException {
      return (  getCmnPeriodReturnCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setNonNumericPeriodInputYy17True() {  			
    	setCmnPeriodReturnCode( 9);
   	}
	/**
	 *	Returns the value of cmnPeriodOutputYyyymm
	 *	@return cmnPeriodOutputYyyymm
	 */   
	 public CmnPeriodOutputYyyymm getCmnPeriodOutputYyyymm() {
   	return cmnPeriodOutputYyyymm;
   }
   /**
	* 	Update CmnPeriodOutputYyyymm with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-YYYYMM
	*	@param value
	*/
   public void setCmnPeriodOutputYyyymm(char[] value) {
      cmnPeriodOutputYyyymm.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodOutputYyyymm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyymm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyymm.begin,cmnPeriodOutputYyyymm.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputYyyymm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyymm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyymm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodOutputYyyymm with another Field
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyymm(Field source) {
   	replace(source,0,source.length(),cmnPeriodOutputYyyymm.begin,cmnPeriodOutputYyyymm.length());
   }  
   
     /**
	 * 	Update CmnPeriodOutputYyyymm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyymm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyymm.begin,cmnPeriodOutputYyyymm.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputYyyymm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyymm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyymm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnPeriodOutputMonthYyyy
	 *	@return cmnPeriodOutputMonthYyyy
	 */   
	 public CmnPeriodOutputMonthYyyy getCmnPeriodOutputMonthYyyy() {
   	return cmnPeriodOutputMonthYyyy;
   }
   /**
	* 	Update CmnPeriodOutputMonthYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-MONTH-YYYY
	*	@param value
	*/
   public void setCmnPeriodOutputMonthYyyy(char[] value) {
      cmnPeriodOutputMonthYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodOutputMonthYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputMonthYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputMonthYyyy.begin,cmnPeriodOutputMonthYyyy.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputMonthYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputMonthYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputMonthYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodOutputMonthYyyy with another Field
	 *	@param value
	 */
   public void setCmnPeriodOutputMonthYyyy(Field source) {
   	replace(source,0,source.length(),cmnPeriodOutputMonthYyyy.begin,cmnPeriodOutputMonthYyyy.length());
   }  
   
     /**
	 * 	Update CmnPeriodOutputMonthYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputMonthYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputMonthYyyy.begin,cmnPeriodOutputMonthYyyy.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputMonthYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputMonthYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputMonthYyyy.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnPeriodOutputAreaFieldLength() {
			return CMN_PERIOD_OUTPUT_AREA_LENGTH;
		}

}
  
