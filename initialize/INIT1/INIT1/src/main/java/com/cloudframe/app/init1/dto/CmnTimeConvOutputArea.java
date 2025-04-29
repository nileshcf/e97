package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeConvOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeConvOutputArea extends CmnTimeConvOutputAreaSerialized { 
   

								private int cmnTimeConvReturnCode;
				private CmnConvertedTimeFormats cmnConvertedTimeFormats = new CmnConvertedTimeFormats();
	
	/**
	* Constructor for CmnTimeConvOutputArea
	**/
    public CmnTimeConvOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeConvOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnConvertedTimeFormats.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnTimeConvReturnCode
	 *	@return cmnTimeConvReturnCode
	 */
	public int getCmnTimeConvReturnCode() throws CFException {
       if (isCmnTimeConvReturnCodeModified()) { 
           cmnTimeConvReturnCode = refreshCmnTimeConvReturnCode();
        }
   		return cmnTimeConvReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnTimeConvReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CONV-RETURN-CODE
	 *	@param number
	 */
	public void setCmnTimeConvReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeConvReturnCode = checkCmnTimeConvReturnCodeMaxLimit(number); 
		serializeCmnTimeConvReturnCode(cmnTimeConvReturnCode);
	}
	

	public void setCmnTimeConvReturnCode(long number) {
	    number = checkCmnTimeConvReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeConvReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnTimeConvReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeConvReturnCode(char[] value) throws CFException {
		 cmnTimeConvReturnCode = serializeCmnTimeConvReturnCode(value);
	}
	/**
	 * 	Update CmnTimeConvReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeConvReturnCodeString(char[] value) throws CFException {
		 setCmnTimeConvReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isConversionSuccessful16()
	 *	@return  Returns true if isConversionSuccessful16() is 0
	 */
   public boolean isConversionSuccessful16() throws CFException {
      return (  getCmnTimeConvReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setConversionSuccessful16True() {  			
    	setCmnTimeConvReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters16()
	 *	@return  Returns true if isValidParameters16() is 0
	 */
   public boolean isValidParameters16() throws CFException {
      return (  getCmnTimeConvReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters16True() {  			
    	setCmnTimeConvReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall16()
	 *	@return  Returns true if isErrorInCall16() is 1 THRU 9
	 */
   public boolean isErrorInCall16() throws CFException {
      return (   (getCmnTimeConvReturnCode()  >=  1 ) &&   (getCmnTimeConvReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall16True() {  			
    	setCmnTimeConvReturnCode( 1);
   	}
	
	/**
	 *	Test condition 5 for isInvalidConvType16()
	 *	@return  Returns true if isInvalidConvType16() is 5
	 */
   public boolean isInvalidConvType16() throws CFException {
      return (  getCmnTimeConvReturnCode()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setInvalidConvType16True() {  			
    	setCmnTimeConvReturnCode( 5);
   	}
	
	/**
	 *	Test condition 7 for isOutOfRangeTimeInput16()
	 *	@return  Returns true if isOutOfRangeTimeInput16() is 7
	 */
   public boolean isOutOfRangeTimeInput16() throws CFException {
      return (  getCmnTimeConvReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setOutOfRangeTimeInput16True() {  			
    	setCmnTimeConvReturnCode( 7);
   	}
	
	/**
	 *	Test condition 8 for isNonNumericTimeInput16()
	 *	@return  Returns true if isNonNumericTimeInput16() is 8
	 */
   public boolean isNonNumericTimeInput16() throws CFException {
      return (  getCmnTimeConvReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setNonNumericTimeInput16True() {  			
    	setCmnTimeConvReturnCode( 8);
   	}
	/**
	 *	Returns the value of cmnConvertedTimeFormats
	 *	@return cmnConvertedTimeFormats
	 */   
	 public CmnConvertedTimeFormats getCmnConvertedTimeFormats() {
   	return cmnConvertedTimeFormats;
   }
   /**
	* 	Update CmnConvertedTimeFormats with the passed value
	*   Corresponding COBOL Variable is CMN-CONVERTED-TIME-FORMATS
	*	@param value
	*/
   public void setCmnConvertedTimeFormats(char[] value) {
      cmnConvertedTimeFormats.setString(value); 
   }   
    
     /**
	 * 	Update CmnConvertedTimeFormats 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnConvertedTimeFormats(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnConvertedTimeFormats.begin,cmnConvertedTimeFormats.length());
   }
   
     /**
	 * 	Update CmnConvertedTimeFormats 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvertedTimeFormats(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnConvertedTimeFormats.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnConvertedTimeFormats with another Field
	 *	@param value
	 */
   public void setCmnConvertedTimeFormats(Field source) {
   	replace(source,0,source.length(),cmnConvertedTimeFormats.begin,cmnConvertedTimeFormats.length());
   }  
   
     /**
	 * 	Update CmnConvertedTimeFormats 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnConvertedTimeFormats(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnConvertedTimeFormats.begin,cmnConvertedTimeFormats.length());
   }
   
     /**
	 * 	Update CmnConvertedTimeFormats 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvertedTimeFormats(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnConvertedTimeFormats.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnTimeConvOutputAreaFieldLength() {
			return CMN_TIME_CONV_OUTPUT_AREA_LENGTH;
		}

}
  
