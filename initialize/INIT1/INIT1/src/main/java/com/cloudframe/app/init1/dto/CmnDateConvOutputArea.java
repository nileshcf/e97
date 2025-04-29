package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateConvOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateConvOutputArea extends CmnDateConvOutputAreaSerialized { 
   

								private int cmnDateConvReturnCode;
				private CmnDateConvertedFormats cmnDateConvertedFormats = new CmnDateConvertedFormats();
	
	/**
	* Constructor for CmnDateConvOutputArea
	**/
    public CmnDateConvOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateConvOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateConvertedFormats.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnDateConvReturnCode
	 *	@return cmnDateConvReturnCode
	 */
	public int getCmnDateConvReturnCode() throws CFException {
       if (isCmnDateConvReturnCodeModified()) { 
           cmnDateConvReturnCode = refreshCmnDateConvReturnCode();
        }
   		return cmnDateConvReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnDateConvReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CONV-RETURN-CODE
	 *	@param number
	 */
	public void setCmnDateConvReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateConvReturnCode = checkCmnDateConvReturnCodeMaxLimit(number); 
		serializeCmnDateConvReturnCode(cmnDateConvReturnCode);
	}
	

	public void setCmnDateConvReturnCode(long number) {
	    number = checkCmnDateConvReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateConvReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnDateConvReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvReturnCode(char[] value) throws CFException {
		 cmnDateConvReturnCode = serializeCmnDateConvReturnCode(value);
	}
	/**
	 * 	Update CmnDateConvReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvReturnCodeString(char[] value) throws CFException {
		 setCmnDateConvReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfulCall13()
	 *	@return  Returns true if isSuccessfulCall13() is 0
	 */
   public boolean isSuccessfulCall13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfulCall13True() {  			
    	setCmnDateConvReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters13()
	 *	@return  Returns true if isValidParameters13() is 0
	 */
   public boolean isValidParameters13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters13True() {  			
    	setCmnDateConvReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall13()
	 *	@return  Returns true if isErrorInCall13() is 1 THRU 9
	 */
   public boolean isErrorInCall13() throws CFException {
      return (   (getCmnDateConvReturnCode()  >=  1 ) &&   (getCmnDateConvReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall13True() {  			
    	setCmnDateConvReturnCode( 1);
   	}
	
	/**
	 *	Test condition 5 for isInvalidConvType13()
	 *	@return  Returns true if isInvalidConvType13() is 5
	 */
   public boolean isInvalidConvType13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setInvalidConvType13True() {  			
    	setCmnDateConvReturnCode( 5);
   	}
	
	/**
	 *	Test condition 7 for isOutOfRangeDateInput13()
	 *	@return  Returns true if isOutOfRangeDateInput13() is 7
	 */
   public boolean isOutOfRangeDateInput13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutOfRangeDateInput13True() {  			
    	setCmnDateConvReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isNonNumericDateInput13()
	 *	@return  Returns true if isNonNumericDateInput13() is 8
	 */
   public boolean isNonNumericDateInput13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setNonNumericDateInput13True() {  			
    	setCmnDateConvReturnCode( 8);
   	}
	
	/**
	 *	Test condition 9 for isDataBaseError13()
	 *	@return  Returns true if isDataBaseError13() is 9
	 */
   public boolean isDataBaseError13() throws CFException {
      return (  getCmnDateConvReturnCode()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setDataBaseError13True() {  			
    	setCmnDateConvReturnCode( 9);
   	}
	/**
	 *	Returns the value of cmnDateConvertedFormats
	 *	@return cmnDateConvertedFormats
	 */   
	 public CmnDateConvertedFormats getCmnDateConvertedFormats() {
   	return cmnDateConvertedFormats;
   }
   /**
	* 	Update CmnDateConvertedFormats with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CONVERTED-FORMATS
	*	@param value
	*/
   public void setCmnDateConvertedFormats(char[] value) {
      cmnDateConvertedFormats.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateConvertedFormats 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvertedFormats(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvertedFormats.begin,cmnDateConvertedFormats.length());
   }
   
     /**
	 * 	Update CmnDateConvertedFormats 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvertedFormats(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvertedFormats.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateConvertedFormats with another Field
	 *	@param value
	 */
   public void setCmnDateConvertedFormats(Field source) {
   	replace(source,0,source.length(),cmnDateConvertedFormats.begin,cmnDateConvertedFormats.length());
   }  
   
     /**
	 * 	Update CmnDateConvertedFormats 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvertedFormats(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvertedFormats.begin,cmnDateConvertedFormats.length());
   }
   
     /**
	 * 	Update CmnDateConvertedFormats 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvertedFormats(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvertedFormats.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateConvOutputAreaFieldLength() {
			return CMN_DATE_CONV_OUTPUT_AREA_LENGTH;
		}

}
  
