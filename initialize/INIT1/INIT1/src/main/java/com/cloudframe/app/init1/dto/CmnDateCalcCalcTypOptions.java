package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcCalcTypOptions is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcCalcTypOptions extends CmnDateCalcCalcTypOptionsSerialized { 
   

						private char[] cmnDateCalcTypeOpt1 = Field.fillLowValue(1);

						private char[] cmnDateCalcTypeOpt123 = Field.fillLowValue(1);

						private char[] cmnDateCalcTypeOpt23 = Field.fillLowValue(1);
				private CmnDateCalcTypeOpt56 cmnDateCalcTypeOpt56 = new CmnDateCalcTypeOpt56();
	
	/**
	* Constructor for CmnDateCalcCalcTypOptions
	**/
    public CmnDateCalcCalcTypOptions() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcCalcTypOptions. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalcTypOptions(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcTypeOpt56.setParent(this,getStartOffset() + 3);
    } 

	/**
	 *	Returns the value of cmnDateCalcTypeOpt1
	 *	@return cmnDateCalcTypeOpt1
	 */
   public char[] getCmnDateCalcTypeOpt1() throws CFException{
     if (isCmnDateCalcTypeOpt1Modified()) { 
        cmnDateCalcTypeOpt1 = refreshCmnDateCalcTypeOpt1();
     }
   		return cmnDateCalcTypeOpt1;
   }

  
	/**
	*  set variable cmnDateCalcTypeOpt1
	*  Corresponding COBOL Variable is CMN-DATE-CALC-TYPE-OPT-1
	*  @param value
	**/
   public void setCmnDateCalcTypeOpt1(char[] value) {
      cmnDateCalcTypeOpt1 = checkCmnDateCalcTypeOpt1Constraints(value);
      serializeCmnDateCalcTypeOpt1(cmnDateCalcTypeOpt1);
   } 

     /**
	 * 	Update CmnDateCalcTypeOpt1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcTypeOpt1,cmnDateCalcTypeOpt1.length);
   	
   }
   
   public void setCmnDateCalcTypeOpt1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt1,cmnDateCalcTypeOpt1.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcTypeOpt1 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt1(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcTypeOpt1,CMN_DATE_CALC_TYPE_OPT_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcTypeOpt1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt1,CMN_DATE_CALC_TYPE_OPT_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt1+targetIndex,targetLen);
    
   }
	char[] includeStartEndDates1288Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIncludeStartEndDates12()
	 *	@return  Returns true if isIncludeStartEndDates12() is "I"
	 */
   public boolean isIncludeStartEndDates12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt1() , includeStartEndDates1288Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIncludeStartEndDates12True() {  			
    	setCmnDateCalcTypeOpt1( includeStartEndDates1288Value);
   	}
	char[] excludeStartDate1288Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isExcludeStartDate12()
	 *	@return  Returns true if isExcludeStartDate12() is "E"
	 */
   public boolean isExcludeStartDate12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt1() , excludeStartDate1288Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setExcludeStartDate12True() {  			
    	setCmnDateCalcTypeOpt1( excludeStartDate1288Value);
   	}
	/**
	 *	Returns the value of cmnDateCalcTypeOpt123
	 *	@return cmnDateCalcTypeOpt123
	 */
   public char[] getCmnDateCalcTypeOpt123() throws CFException{
     if (isCmnDateCalcTypeOpt123Modified()) { 
        cmnDateCalcTypeOpt123 = refreshCmnDateCalcTypeOpt123();
     }
   		return cmnDateCalcTypeOpt123;
   }

  
	/**
	*  set variable cmnDateCalcTypeOpt123
	*  Corresponding COBOL Variable is CMN-DATE-CALC-TYPE-OPT-1-2-3
	*  @param value
	**/
   public void setCmnDateCalcTypeOpt123(char[] value) {
      cmnDateCalcTypeOpt123 = checkCmnDateCalcTypeOpt123Constraints(value);
      serializeCmnDateCalcTypeOpt123(cmnDateCalcTypeOpt123);
   } 

     /**
	 * 	Update CmnDateCalcTypeOpt123 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt123(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcTypeOpt123,cmnDateCalcTypeOpt123.length);
   	
   }
   
   public void setCmnDateCalcTypeOpt123(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt123,cmnDateCalcTypeOpt123.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt123 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt123(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt123+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcTypeOpt123 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt123(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcTypeOpt123,CMN_DATE_CALC_TYPE_OPT_123_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcTypeOpt123 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt123(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt123,CMN_DATE_CALC_TYPE_OPT_123_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt123 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt123(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt123+targetIndex,targetLen);
    
   }
	char[] noExclusions1288Value = " ".toCharArray();
	/**
	 *	Test condition " " for isNoExclusions12()
	 *	@return  Returns true if isNoExclusions12() is " "
	 */
   public boolean isNoExclusions12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt123() , noExclusions1288Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setNoExclusions12True() {  			
    	setCmnDateCalcTypeOpt123( noExclusions1288Value);
   	}
	char[] excludeWkEnds1288Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isExcludeWkEnds12()
	 *	@return  Returns true if isExcludeWkEnds12() is "E"
	 */
   public boolean isExcludeWkEnds12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt123() , excludeWkEnds1288Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setExcludeWkEnds12True() {  			
    	setCmnDateCalcTypeOpt123( excludeWkEnds1288Value);
   	}
	char[] excludeWkEndsNHol1288Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isExcludeWkEndsNHol12()
	 *	@return  Returns true if isExcludeWkEndsNHol12() is "X"
	 */
   public boolean isExcludeWkEndsNHol12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt123() , excludeWkEndsNHol1288Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setExcludeWkEndsNHol12True() {  			
    	setCmnDateCalcTypeOpt123( excludeWkEndsNHol1288Value);
   	}
	char[] excludeHolidays1288Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isExcludeHolidays12()
	 *	@return  Returns true if isExcludeHolidays12() is "H"
	 */
   public boolean isExcludeHolidays12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt123() , excludeHolidays1288Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setExcludeHolidays12True() {  			
    	setCmnDateCalcTypeOpt123( excludeHolidays1288Value);
   	}
	/**
	 *	Returns the value of cmnDateCalcTypeOpt23
	 *	@return cmnDateCalcTypeOpt23
	 */
   public char[] getCmnDateCalcTypeOpt23() throws CFException{
     if (isCmnDateCalcTypeOpt23Modified()) { 
        cmnDateCalcTypeOpt23 = refreshCmnDateCalcTypeOpt23();
     }
   		return cmnDateCalcTypeOpt23;
   }

  
	/**
	*  set variable cmnDateCalcTypeOpt23
	*  Corresponding COBOL Variable is CMN-DATE-CALC-TYPE-OPT-2-3
	*  @param value
	**/
   public void setCmnDateCalcTypeOpt23(char[] value) {
      cmnDateCalcTypeOpt23 = checkCmnDateCalcTypeOpt23Constraints(value);
      serializeCmnDateCalcTypeOpt23(cmnDateCalcTypeOpt23);
   } 

     /**
	 * 	Update CmnDateCalcTypeOpt23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcTypeOpt23,cmnDateCalcTypeOpt23.length);
   	
   }
   
   public void setCmnDateCalcTypeOpt23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt23,cmnDateCalcTypeOpt23.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcTypeOpt23 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt23(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcTypeOpt23,CMN_DATE_CALC_TYPE_OPT_23_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcTypeOpt23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt23,CMN_DATE_CALC_TYPE_OPT_23_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcTypeOpt23+targetIndex,targetLen);
    
   }
	char[] noBusDayAdjust1288Value = " ".toCharArray();
	/**
	 *	Test condition " " for isNoBusDayAdjust12()
	 *	@return  Returns true if isNoBusDayAdjust12() is " "
	 */
   public boolean isNoBusDayAdjust12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt23() , noBusDayAdjust1288Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setNoBusDayAdjust12True() {  			
    	setCmnDateCalcTypeOpt23( noBusDayAdjust1288Value);
   	}
	char[] adjustToPrevBusDay1288Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isAdjustToPrevBusDay12()
	 *	@return  Returns true if isAdjustToPrevBusDay12() is "P"
	 */
   public boolean isAdjustToPrevBusDay12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt23() , adjustToPrevBusDay1288Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setAdjustToPrevBusDay12True() {  			
    	setCmnDateCalcTypeOpt23( adjustToPrevBusDay1288Value);
   	}
	char[] adjustToNextBusDay1288Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAdjustToNextBusDay12()
	 *	@return  Returns true if isAdjustToNextBusDay12() is "N"
	 */
   public boolean isAdjustToNextBusDay12() throws CFException {
      return (  compareChars( getCmnDateCalcTypeOpt23() , adjustToNextBusDay1288Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAdjustToNextBusDay12True() {  			
    	setCmnDateCalcTypeOpt23( adjustToNextBusDay1288Value);
   	}
	/**
	 *	Returns the value of cmnDateCalcTypeOpt56
	 *	@return cmnDateCalcTypeOpt56
	 */   
	 public CmnDateCalcTypeOpt56 getCmnDateCalcTypeOpt56() {
   	return cmnDateCalcTypeOpt56;
   }
   /**
	* 	Update CmnDateCalcTypeOpt56 with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-TYPE-OPT-5-6
	*	@param value
	*/
   public void setCmnDateCalcTypeOpt56(char[] value) {
      cmnDateCalcTypeOpt56.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcTypeOpt56 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt56(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcTypeOpt56.begin,cmnDateCalcTypeOpt56.length());
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt56 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt56(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcTypeOpt56.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcTypeOpt56 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt56(Field source) {
   	replace(source,0,source.length(),cmnDateCalcTypeOpt56.begin,cmnDateCalcTypeOpt56.length());
   }  
   
     /**
	 * 	Update CmnDateCalcTypeOpt56 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt56(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcTypeOpt56.begin,cmnDateCalcTypeOpt56.length());
   }
   
     /**
	 * 	Update CmnDateCalcTypeOpt56 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcTypeOpt56(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcTypeOpt56.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcCalcTypOptionsFieldLength() {
			return CMN_DATE_CALC_CALC_TYP_OPTIONS_LENGTH;
		}

}
  
