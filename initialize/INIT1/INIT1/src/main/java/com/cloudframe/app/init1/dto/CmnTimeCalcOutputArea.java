package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcOutputArea extends CmnTimeCalcOutputAreaSerialized { 
   

								private int cmnTimeCalcReturnCode;

								private long cmnTimeCalcNewTime;
				private CmnTimeCalcNewTimeR cmnTimeCalcNewTimeR = new CmnTimeCalcNewTimeR();

								private int cmnTimeCalcNumOfSecElap;
	
	/**
	* Constructor for CmnTimeCalcOutputArea
	**/
    public CmnTimeCalcOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeCalcNewTimeR.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnTimeCalcReturnCode
	 *	@return cmnTimeCalcReturnCode
	 */
	public int getCmnTimeCalcReturnCode() throws CFException {
       if (isCmnTimeCalcReturnCodeModified()) { 
           cmnTimeCalcReturnCode = refreshCmnTimeCalcReturnCode();
        }
   		return cmnTimeCalcReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-RETURN-CODE
	 *	@param number
	 */
	public void setCmnTimeCalcReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcReturnCode = checkCmnTimeCalcReturnCodeMaxLimit(number); 
		serializeCmnTimeCalcReturnCode(cmnTimeCalcReturnCode);
	}
	

	public void setCmnTimeCalcReturnCode(long number) {
	    number = checkCmnTimeCalcReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcReturnCode(char[] value) throws CFException {
		 cmnTimeCalcReturnCode = serializeCmnTimeCalcReturnCode(value);
	}
	/**
	 * 	Update CmnTimeCalcReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcReturnCodeString(char[] value) throws CFException {
		 setCmnTimeCalcReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfullCall15()
	 *	@return  Returns true if isSuccessfullCall15() is 0
	 */
   public boolean isSuccessfullCall15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfullCall15True() {  			
    	setCmnTimeCalcReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters15()
	 *	@return  Returns true if isValidParameters15() is 0
	 */
   public boolean isValidParameters15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters15True() {  			
    	setCmnTimeCalcReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall15()
	 *	@return  Returns true if isErrorInCall15() is 1 THRU 9
	 */
   public boolean isErrorInCall15() throws CFException {
      return (   (getCmnTimeCalcReturnCode()  >=  1 ) &&   (getCmnTimeCalcReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall15True() {  			
    	setCmnTimeCalcReturnCode( 1);
   	}
	
	/**
	 *	Test condition 4 for isSecondsEqualsZero15()
	 *	@return  Returns true if isSecondsEqualsZero15() is 4
	 */
   public boolean isSecondsEqualsZero15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setSecondsEqualsZero15True() {  			
    	setCmnTimeCalcReturnCode( 4);
   	}
	
	/**
	 *	Test condition 5 for isInvalidCalcType15()
	 *	@return  Returns true if isInvalidCalcType15() is 5
	 */
   public boolean isInvalidCalcType15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setInvalidCalcType15True() {  			
    	setCmnTimeCalcReturnCode( 5);
   	}
	
	/**
	 *	Test condition 6 for isOutOfRangeStartTime15()
	 *	@return  Returns true if isOutOfRangeStartTime15() is 6
	 */
   public boolean isOutOfRangeStartTime15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setOutOfRangeStartTime15True() {  			
    	setCmnTimeCalcReturnCode( 6);
   	}
	
	/**
	 *	Test condition 3 for isOutOfRangeEndTime15()
	 *	@return  Returns true if isOutOfRangeEndTime15() is 3
	 */
   public boolean isOutOfRangeEndTime15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setOutOfRangeEndTime15True() {  			
    	setCmnTimeCalcReturnCode( 3);
   	}
	
	/**
	 *	Test condition 7 for isNonNumericTimeStrtInput15()
	 *	@return  Returns true if isNonNumericTimeStrtInput15() is 7
	 */
   public boolean isNonNumericTimeStrtInput15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setNonNumericTimeStrtInput15True() {  			
    	setCmnTimeCalcReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isNonNumericTimeEndInput15()
	 *	@return  Returns true if isNonNumericTimeEndInput15() is 8
	 */
   public boolean isNonNumericTimeEndInput15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setNonNumericTimeEndInput15True() {  			
    	setCmnTimeCalcReturnCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isNonNumericTimeSecInput15()
	 *	@return  Returns true if isNonNumericTimeSecInput15() is 9
	 */
   public boolean isNonNumericTimeSecInput15() throws CFException {
      return (  getCmnTimeCalcReturnCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setNonNumericTimeSecInput15True() {  			
    	setCmnTimeCalcReturnCode( 9);
   	}
	/**
	 *	Returns the value of cmnTimeCalcNewTime
	 *	@return cmnTimeCalcNewTime
	 */
	public long getCmnTimeCalcNewTime() throws CFException {
       if (isCmnTimeCalcNewTimeModified()) { 
           cmnTimeCalcNewTime = refreshCmnTimeCalcNewTime();
        }
   		return cmnTimeCalcNewTime;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNewTime with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME
	 *	@param number
	 */
	public void setCmnTimeCalcNewTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNewTime = checkCmnTimeCalcNewTimeMaxLimit(number); 
		serializeCmnTimeCalcNewTime(cmnTimeCalcNewTime);
	}
	

	/**
	 * 	Update CmnTimeCalcNewTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTime(char[] value) throws CFException {
		 cmnTimeCalcNewTime = serializeCmnTimeCalcNewTime(value);
	}
	/**
	 * 	Update CmnTimeCalcNewTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeString(char[] value) throws CFException {
		 setCmnTimeCalcNewTime(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcNewTimeR
	 *	@return cmnTimeCalcNewTimeR
	 */   
	 public CmnTimeCalcNewTimeR getCmnTimeCalcNewTimeR() {
   	return cmnTimeCalcNewTimeR;
   }
   /**
	* 	Update CmnTimeCalcNewTimeR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME-R
	*	@param value
	*/
   public void setCmnTimeCalcNewTimeR(char[] value) {
      cmnTimeCalcNewTimeR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcNewTimeR with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeCalcNumOfSecElap
	 *	@return cmnTimeCalcNumOfSecElap
	 */
	public int getCmnTimeCalcNumOfSecElap() throws CFException {
       if (isCmnTimeCalcNumOfSecElapModified()) { 
           cmnTimeCalcNumOfSecElap = refreshCmnTimeCalcNumOfSecElap();
        }
   		return cmnTimeCalcNumOfSecElap;
	}
	

    /**
	 *	Returns the String value of cmnTimeCalcNumOfSecElap
	 *	@return cmnTimeCalcNumOfSecElap
	 */
	public char[]  getCmnTimeCalcNumOfSecElapActualString() {
	    String value = String.valueOf(cmnTimeCalcNumOfSecElap).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CmnTimeCalcNumOfSecElap with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NUM-OF-SEC-ELAP
	 *	@param number
	 */
	public void setCmnTimeCalcNumOfSecElap(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNumOfSecElap = checkCmnTimeCalcNumOfSecElapMaxLimit(number); 
		serializeCmnTimeCalcNumOfSecElap(cmnTimeCalcNumOfSecElap);
	}
	

	public void setCmnTimeCalcNumOfSecElap(long number) {
	    number = checkCmnTimeCalcNumOfSecElapMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcNumOfSecElap((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcNumOfSecElap with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNumOfSecElap(char[] value) throws CFException {
		 cmnTimeCalcNumOfSecElap = serializeCmnTimeCalcNumOfSecElap(value);
	}
	/**
	 * 	Update CmnTimeCalcNumOfSecElap with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNumOfSecElapString(char[] value) throws CFException {
		 setCmnTimeCalcNumOfSecElap(value);
	}

	
	
	

		public static int getCmnTimeCalcOutputAreaFieldLength() {
			return CMN_TIME_CALC_OUTPUT_AREA_LENGTH;
		}

}
  
