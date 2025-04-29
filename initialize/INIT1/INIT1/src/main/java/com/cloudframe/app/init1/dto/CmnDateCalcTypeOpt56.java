package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcTypeOpt56 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcTypeOpt56 extends CmnDateCalcTypeOpt56Serialized { 
   

						private char[] cmnDateCalcDowIndicator = Field.fillLowValue(1);
	
	/**
	* Constructor for CmnDateCalcTypeOpt56
	**/
    public CmnDateCalcTypeOpt56() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcTypeOpt56. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcTypeOpt56(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcDowIndicator
	 *	@return cmnDateCalcDowIndicator
	 */
   public char[] getCmnDateCalcDowIndicator() throws CFException{
     if (isCmnDateCalcDowIndicatorModified()) { 
        cmnDateCalcDowIndicator = refreshCmnDateCalcDowIndicator();
     }
   		return cmnDateCalcDowIndicator;
   }

  
	/**
	*  set variable cmnDateCalcDowIndicator
	*  Corresponding COBOL Variable is CMN-DATE-CALC-DOW-INDICATOR
	*  @param value
	**/
   public void setCmnDateCalcDowIndicator(char[] value) {
      cmnDateCalcDowIndicator = checkCmnDateCalcDowIndicatorConstraints(value);
      serializeCmnDateCalcDowIndicator(cmnDateCalcDowIndicator);
   } 

     /**
	 * 	Update CmnDateCalcDowIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcDowIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcDowIndicator,cmnDateCalcDowIndicator.length);
   	
   }
   
   public void setCmnDateCalcDowIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDowIndicator,cmnDateCalcDowIndicator.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcDowIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcDowIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDowIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcDowIndicator with another Field
	 *	@param value
	 */
   public void setCmnDateCalcDowIndicator(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcDowIndicator,CMN_DATE_CALC_DOW_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcDowIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcDowIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcDowIndicator,CMN_DATE_CALC_DOW_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcDowIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcDowIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDowIndicator+targetIndex,targetLen);
    
   }
	char[] mondaysDate1288Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMondaysDate12()
	 *	@return  Returns true if isMondaysDate12() is "1"
	 */
   public boolean isMondaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , mondaysDate1288Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMondaysDate12True() {  			
    	setCmnDateCalcDowIndicator( mondaysDate1288Value);
   	}
	char[] tuesdaysDate1288Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isTuesdaysDate12()
	 *	@return  Returns true if isTuesdaysDate12() is "2"
	 */
   public boolean isTuesdaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , tuesdaysDate1288Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setTuesdaysDate12True() {  			
    	setCmnDateCalcDowIndicator( tuesdaysDate1288Value);
   	}
	char[] wednesdaysDate1288Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isWednesdaysDate12()
	 *	@return  Returns true if isWednesdaysDate12() is "3"
	 */
   public boolean isWednesdaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , wednesdaysDate1288Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setWednesdaysDate12True() {  			
    	setCmnDateCalcDowIndicator( wednesdaysDate1288Value);
   	}
	char[] thursdaysDate1288Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isThursdaysDate12()
	 *	@return  Returns true if isThursdaysDate12() is "4"
	 */
   public boolean isThursdaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , thursdaysDate1288Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setThursdaysDate12True() {  			
    	setCmnDateCalcDowIndicator( thursdaysDate1288Value);
   	}
	char[] fridaysDate1288Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isFridaysDate12()
	 *	@return  Returns true if isFridaysDate12() is "5"
	 */
   public boolean isFridaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , fridaysDate1288Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setFridaysDate12True() {  			
    	setCmnDateCalcDowIndicator( fridaysDate1288Value);
   	}
	char[] saturdaysDate1288Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isSaturdaysDate12()
	 *	@return  Returns true if isSaturdaysDate12() is "6"
	 */
   public boolean isSaturdaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , saturdaysDate1288Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setSaturdaysDate12True() {  			
    	setCmnDateCalcDowIndicator( saturdaysDate1288Value);
   	}
	char[] sundaysDate1288Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isSundaysDate12()
	 *	@return  Returns true if isSundaysDate12() is "7"
	 */
   public boolean isSundaysDate12() throws CFException {
      return (  compareChars( getCmnDateCalcDowIndicator() , sundaysDate1288Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setSundaysDate12True() {  			
    	setCmnDateCalcDowIndicator( sundaysDate1288Value);
   	}

	
	
	

		public static int getCmnDateCalcTypeOpt56FieldLength() {
			return CMN_DATE_CALC_TYPE_OPT_56_LENGTH;
		}

}
  
