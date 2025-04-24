package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcInputArea extends CmnDateCalcInputAreaSerialized { 
   

						private char[] cmnDateCalcType = Field.fillLowValue(1);
				private CmnDateCalcCalcTypOptions cmnDateCalcCalcTypOptions = new CmnDateCalcCalcTypOptions();
				private CmnDateCalcInputDateArea cmnDateCalcInputDateArea = new CmnDateCalcInputDateArea();
	
	/**
	* Constructor for CmnDateCalcInputArea
	**/
    public CmnDateCalcInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcCalcTypOptions.setParent(this,getStartOffset() + 1);
	       			cmnDateCalcInputDateArea.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of cmnDateCalcType
	 *	@return cmnDateCalcType
	 */
   public char[] getCmnDateCalcType() throws CFException{
     if (isCmnDateCalcTypeModified()) { 
        cmnDateCalcType = refreshCmnDateCalcType();
     }
   		return cmnDateCalcType;
   }

  
	/**
	*  set variable cmnDateCalcType
	*  Corresponding COBOL Variable is CMN-DATE-CALC-TYPE
	*  @param value
	**/
   public void setCmnDateCalcType(char[] value) {
      cmnDateCalcType = checkCmnDateCalcTypeConstraints(value);
      serializeCmnDateCalcType(cmnDateCalcType);
   } 

     /**
	 * 	Update CmnDateCalcType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcType,cmnDateCalcType.length);
   	
   }
   
   public void setCmnDateCalcType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcType,cmnDateCalcType.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcType with another Field
	 *	@param value
	 */
   public void setCmnDateCalcType(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcType,CMN_DATE_CALC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcType,CMN_DATE_CALC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcType+targetIndex,targetLen);
    
   }
	char[] daysElapsed1288Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isDaysElapsed12()
	 *	@return  Returns true if isDaysElapsed12() is "1"
	 */
   public boolean isDaysElapsed12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , daysElapsed1288Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setDaysElapsed12True() {  			
    	setCmnDateCalcType( daysElapsed1288Value);
   	}
	char[] futureDate1288Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isFutureDate12()
	 *	@return  Returns true if isFutureDate12() is "2"
	 */
   public boolean isFutureDate12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , futureDate1288Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setFutureDate12True() {  			
    	setCmnDateCalcType( futureDate1288Value);
   	}
	char[] pastDate1288Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isPastDate12()
	 *	@return  Returns true if isPastDate12() is "3"
	 */
   public boolean isPastDate12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , pastDate1288Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setPastDate12True() {  			
    	setCmnDateCalcType( pastDate1288Value);
   	}
	char[] dayOFWeek1288Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isDayOFWeek12()
	 *	@return  Returns true if isDayOFWeek12() is "4"
	 */
   public boolean isDayOFWeek12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , dayOFWeek1288Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setDayOFWeek12True() {  			
    	setCmnDateCalcType( dayOFWeek1288Value);
   	}
	char[] dateDowOnBeforThisDate1288Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isDateDowOnBeforThisDate12()
	 *	@return  Returns true if isDateDowOnBeforThisDate12() is "5"
	 */
   public boolean isDateDowOnBeforThisDate12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , dateDowOnBeforThisDate1288Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setDateDowOnBeforThisDate12True() {  			
    	setCmnDateCalcType( dateDowOnBeforThisDate1288Value);
   	}
	char[] dateDowAfterThisDate1288Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isDateDowAfterThisDate12()
	 *	@return  Returns true if isDateDowAfterThisDate12() is "6"
	 */
   public boolean isDateDowAfterThisDate12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , dateDowAfterThisDate1288Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setDateDowAfterThisDate12True() {  			
    	setCmnDateCalcType( dateDowAfterThisDate1288Value);
   	}
	char[] monthsInFuture1288Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isMonthsInFuture12()
	 *	@return  Returns true if isMonthsInFuture12() is "7"
	 */
   public boolean isMonthsInFuture12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , monthsInFuture1288Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setMonthsInFuture12True() {  			
    	setCmnDateCalcType( monthsInFuture1288Value);
   	}
	char[] monthsInPast1288Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isMonthsInPast12()
	 *	@return  Returns true if isMonthsInPast12() is "8"
	 */
   public boolean isMonthsInPast12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , monthsInPast1288Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setMonthsInPast12True() {  			
    	setCmnDateCalcType( monthsInPast1288Value);
   	}
	char[] lastDayInMonth1288Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isLastDayInMonth12()
	 *	@return  Returns true if isLastDayInMonth12() is "9"
	 */
   public boolean isLastDayInMonth12() throws CFException {
      return (  compareChars( getCmnDateCalcType() , lastDayInMonth1288Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setLastDayInMonth12True() {  			
    	setCmnDateCalcType( lastDayInMonth1288Value);
   	}
	/**
	 *	Returns the value of cmnDateCalcCalcTypOptions
	 *	@return cmnDateCalcCalcTypOptions
	 */   
	 public CmnDateCalcCalcTypOptions getCmnDateCalcCalcTypOptions() {
   	return cmnDateCalcCalcTypOptions;
   }
   /**
	* 	Update CmnDateCalcCalcTypOptions with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-CALC-TYP-OPTIONS
	*	@param value
	*/
   public void setCmnDateCalcCalcTypOptions(char[] value) {
      cmnDateCalcCalcTypOptions.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcCalcTypOptions 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcCalcTypOptions(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalcTypOptions.begin,cmnDateCalcCalcTypOptions.length());
   }
   
     /**
	 * 	Update CmnDateCalcCalcTypOptions 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcCalcTypOptions(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalcTypOptions.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcCalcTypOptions with another Field
	 *	@param value
	 */
   public void setCmnDateCalcCalcTypOptions(Field source) {
   	replace(source,0,source.length(),cmnDateCalcCalcTypOptions.begin,cmnDateCalcCalcTypOptions.length());
   }  
   
     /**
	 * 	Update CmnDateCalcCalcTypOptions 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcCalcTypOptions(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalcTypOptions.begin,cmnDateCalcCalcTypOptions.length());
   }
   
     /**
	 * 	Update CmnDateCalcCalcTypOptions 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcCalcTypOptions(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcCalcTypOptions.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateCalcInputDateArea
	 *	@return cmnDateCalcInputDateArea
	 */   
	 public CmnDateCalcInputDateArea getCmnDateCalcInputDateArea() {
   	return cmnDateCalcInputDateArea;
   }
   /**
	* 	Update CmnDateCalcInputDateArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-INPUT-DATE-AREA
	*	@param value
	*/
   public void setCmnDateCalcInputDateArea(char[] value) {
      cmnDateCalcInputDateArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcInputDateArea with another Field
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source) {
   	replace(source,0,source.length(),cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }  
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin,cmnDateCalcInputDateArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputDateArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputDateArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputDateArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcInputAreaFieldLength() {
			return CMN_DATE_CALC_INPUT_AREA_LENGTH;
		}

}
  
