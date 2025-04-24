package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateValidOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateValidOutputArea extends CmnDateValidOutputAreaSerialized { 
   

								private int cmnDateValidReturnCode;

								private long cmnDateValid;
				private CmnDateValidR cmnDateValidR = new CmnDateValidR();
	
	/**
	* Constructor for CmnDateValidOutputArea
	**/
    public CmnDateValidOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateValidOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateValidR.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnDateValidReturnCode
	 *	@return cmnDateValidReturnCode
	 */
	public int getCmnDateValidReturnCode() throws CFException {
       if (isCmnDateValidReturnCodeModified()) { 
           cmnDateValidReturnCode = refreshCmnDateValidReturnCode();
        }
   		return cmnDateValidReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnDateValidReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID-RETURN-CODE
	 *	@param number
	 */
	public void setCmnDateValidReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValidReturnCode = checkCmnDateValidReturnCodeMaxLimit(number); 
		serializeCmnDateValidReturnCode(cmnDateValidReturnCode);
	}
	

	public void setCmnDateValidReturnCode(long number) {
	    number = checkCmnDateValidReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateValidReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnDateValidReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidReturnCode(char[] value) throws CFException {
		 cmnDateValidReturnCode = serializeCmnDateValidReturnCode(value);
	}
	/**
	 * 	Update CmnDateValidReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidReturnCodeString(char[] value) throws CFException {
		 setCmnDateValidReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfullCall11()
	 *	@return  Returns true if isSuccessfullCall11() is 0
	 */
   public boolean isSuccessfullCall11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfullCall11True() {  			
    	setCmnDateValidReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters11()
	 *	@return  Returns true if isValidParameters11() is 0
	 */
   public boolean isValidParameters11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters11True() {  			
    	setCmnDateValidReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall11()
	 *	@return  Returns true if isErrorInCall11() is 1 THRU 9
	 */
   public boolean isErrorInCall11() throws CFException {
      return (   (getCmnDateValidReturnCode()  >=  1 ) &&   (getCmnDateValidReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall11True() {  			
    	setCmnDateValidReturnCode( 1);
   	}
	
	/**
	 *	Test condition 1 for isNonNumericDateInputMm11()
	 *	@return  Returns true if isNonNumericDateInputMm11() is 1
	 */
   public boolean isNonNumericDateInputMm11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNonNumericDateInputMm11True() {  			
    	setCmnDateValidReturnCode( 1);
   	}
	
	/**
	 *	Test condition 2 for isNonNumericDateInputDd11()
	 *	@return  Returns true if isNonNumericDateInputDd11() is 2
	 */
   public boolean isNonNumericDateInputDd11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setNonNumericDateInputDd11True() {  			
    	setCmnDateValidReturnCode( 2);
   	}
	
	/**
	 *	Test condition 3 for isNonNumericDateInputYyyy11()
	 *	@return  Returns true if isNonNumericDateInputYyyy11() is 3
	 */
   public boolean isNonNumericDateInputYyyy11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setNonNumericDateInputYyyy11True() {  			
    	setCmnDateValidReturnCode( 3);
   	}
	
	/**
	 *	Test condition 7 for isOutOfRangeDateInputMm11()
	 *	@return  Returns true if isOutOfRangeDateInputMm11() is 7
	 */
   public boolean isOutOfRangeDateInputMm11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutOfRangeDateInputMm11True() {  			
    	setCmnDateValidReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isOutOfRangeDateInputDd11()
	 *	@return  Returns true if isOutOfRangeDateInputDd11() is 8
	 */
   public boolean isOutOfRangeDateInputDd11() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setOutOfRangeDateInputDd11True() {  			
    	setCmnDateValidReturnCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isYyyyNot1900Thru200011()
	 *	@return  Returns true if isYyyyNot1900Thru200011() is 9
	 */
   public boolean isYyyyNot1900Thru200011() throws CFException {
      return (  getCmnDateValidReturnCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setYyyyNot1900Thru200011True() {  			
    	setCmnDateValidReturnCode( 9);
   	}
	/**
	 *	Returns the value of cmnDateValid
	 *	@return cmnDateValid
	 */
	public long getCmnDateValid() throws CFException {
       if (isCmnDateValidModified()) { 
           cmnDateValid = refreshCmnDateValid();
        }
   		return cmnDateValid;
	}
	

	
	   
	/**
	 * 	Update CmnDateValid with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID
	 *	@param number
	 */
	public void setCmnDateValid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValid = checkCmnDateValidMaxLimit(number); 
		serializeCmnDateValid(cmnDateValid);
	}
	

	/**
	 * 	Update CmnDateValid with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValid(char[] value) throws CFException {
		 cmnDateValid = serializeCmnDateValid(value);
	}
	/**
	 * 	Update CmnDateValid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidString(char[] value) throws CFException {
		 setCmnDateValid(value);
	}
	/**
	 *	Returns the value of cmnDateValidR
	 *	@return cmnDateValidR
	 */   
	 public CmnDateValidR getCmnDateValidR() {
   	return cmnDateValidR;
   }
   /**
	* 	Update CmnDateValidR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-VALID-R
	*	@param value
	*/
   public void setCmnDateValidR(char[] value) {
      cmnDateValidR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateValidR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin,cmnDateValidR.length());
   }
   
     /**
	 * 	Update CmnDateValidR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateValidR with another Field
	 *	@param value
	 */
   public void setCmnDateValidR(Field source) {
   	replace(source,0,source.length(),cmnDateValidR.begin,cmnDateValidR.length());
   }  
   
     /**
	 * 	Update CmnDateValidR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin,cmnDateValidR.length());
   }
   
     /**
	 * 	Update CmnDateValidR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateValidOutputAreaFieldLength() {
			return CMN_DATE_VALID_OUTPUT_AREA_LENGTH;
		}

}
  
