package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidateOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeValidateOutputArea extends CmnTimeValidateOutputAreaSerialized { 
   

								private int cmnTimeValidReturnCode;

						private char[] cmnTimeValidIso = Field.fillLowValue(8);

								private long cmnTimeValidNumeric;
	
	/**
	* Constructor for CmnTimeValidateOutputArea
	**/
    public CmnTimeValidateOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeValidateOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidateOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeValidReturnCode
	 *	@return cmnTimeValidReturnCode
	 */
	public int getCmnTimeValidReturnCode() throws CFException {
       if (isCmnTimeValidReturnCodeModified()) { 
           cmnTimeValidReturnCode = refreshCmnTimeValidReturnCode();
        }
   		return cmnTimeValidReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnTimeValidReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-VALID-RETURN-CODE
	 *	@param number
	 */
	public void setCmnTimeValidReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeValidReturnCode = checkCmnTimeValidReturnCodeMaxLimit(number); 
		serializeCmnTimeValidReturnCode(cmnTimeValidReturnCode);
	}
	

	public void setCmnTimeValidReturnCode(long number) {
	    number = checkCmnTimeValidReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeValidReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnTimeValidReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeValidReturnCode(char[] value) throws CFException {
		 cmnTimeValidReturnCode = serializeCmnTimeValidReturnCode(value);
	}
	/**
	 * 	Update CmnTimeValidReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeValidReturnCodeString(char[] value) throws CFException {
		 setCmnTimeValidReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfullCall14()
	 *	@return  Returns true if isSuccessfullCall14() is 0
	 */
   public boolean isSuccessfullCall14() throws CFException {
      return (  getCmnTimeValidReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfullCall14True() {  			
    	setCmnTimeValidReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters14()
	 *	@return  Returns true if isValidParameters14() is 0
	 */
   public boolean isValidParameters14() throws CFException {
      return (  getCmnTimeValidReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters14True() {  			
    	setCmnTimeValidReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall14()
	 *	@return  Returns true if isErrorInCall14() is 1 THRU 9
	 */
   public boolean isErrorInCall14() throws CFException {
      return (   (getCmnTimeValidReturnCode()  >=  1 ) &&   (getCmnTimeValidReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall14True() {  			
    	setCmnTimeValidReturnCode( 1);
   	}
	
	/**
	 *	Test condition 7 for isOutOfRangeTimeInput14()
	 *	@return  Returns true if isOutOfRangeTimeInput14() is 7
	 */
   public boolean isOutOfRangeTimeInput14() throws CFException {
      return (  getCmnTimeValidReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutOfRangeTimeInput14True() {  			
    	setCmnTimeValidReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isNonNumericTimeInput14()
	 *	@return  Returns true if isNonNumericTimeInput14() is 8
	 */
   public boolean isNonNumericTimeInput14() throws CFException {
      return (  getCmnTimeValidReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setNonNumericTimeInput14True() {  			
    	setCmnTimeValidReturnCode( 8);
   	}
	/**
	 *	Returns the value of cmnTimeValidIso
	 *	@return cmnTimeValidIso
	 */
   public char[] getCmnTimeValidIso() throws CFException{
     if (isCmnTimeValidIsoModified()) { 
        cmnTimeValidIso = refreshCmnTimeValidIso();
     }
   		return cmnTimeValidIso;
   }

  
	/**
	*  set variable cmnTimeValidIso
	*  Corresponding COBOL Variable is CMN-TIME-VALID-ISO
	*  @param value
	**/
   public void setCmnTimeValidIso(char[] value) {
      cmnTimeValidIso = checkCmnTimeValidIsoConstraints(value);
      serializeCmnTimeValidIso(cmnTimeValidIso);
   } 

     /**
	 * 	Update CmnTimeValidIso 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidIso(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeValidIso,cmnTimeValidIso.length);
   	
   }
   
   public void setCmnTimeValidIso(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidIso,cmnTimeValidIso.length);
   	
   }
   
     /**
	 * 	Update CmnTimeValidIso 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidIso(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidIso+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeValidIso with another Field
	 *	@param value
	 */
   public void setCmnTimeValidIso(Field source) {
       replace(source,0,source.length(),beginCmnTimeValidIso,CMN_TIME_VALID_ISO_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeValidIso 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeValidIso(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeValidIso,CMN_TIME_VALID_ISO_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeValidIso 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidIso(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeValidIso+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeValidNumeric
	 *	@return cmnTimeValidNumeric
	 */
	public long getCmnTimeValidNumeric() throws CFException {
       if (isCmnTimeValidNumericModified()) { 
           cmnTimeValidNumeric = refreshCmnTimeValidNumeric();
        }
   		return cmnTimeValidNumeric;
	}
	

	
	   
	/**
	 * 	Update CmnTimeValidNumeric with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-VALID-NUMERIC
	 *	@param number
	 */
	public void setCmnTimeValidNumeric(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeValidNumeric = checkCmnTimeValidNumericMaxLimit(number); 
		serializeCmnTimeValidNumeric(cmnTimeValidNumeric);
	}
	

	/**
	 * 	Update CmnTimeValidNumeric with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeValidNumeric(char[] value) throws CFException {
		 cmnTimeValidNumeric = serializeCmnTimeValidNumeric(value);
	}
	/**
	 * 	Update CmnTimeValidNumeric with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeValidNumericString(char[] value) throws CFException {
		 setCmnTimeValidNumeric(value);
	}

	
	
	

		public static int getCmnTimeValidateOutputAreaFieldLength() {
			return CMN_TIME_VALIDATE_OUTPUT_AREA_LENGTH;
		}

}
  
