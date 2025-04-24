package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcCalculations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcCalculations extends CmnDateCalcCalculationsSerialized { 
   

						private char[] cmnDateCalcNewDateCalc = Field.fillLowValue(10);
				private CmnDateCalcNewDateCalcR cmnDateCalcNewDateCalcR = new CmnDateCalcNewDateCalcR();

								private int cmnDateCalcNumOfDaysCalc;

						private char[] cmnDateCalcDayOfWeekLit = Field.fillLowValue(3);

								private int cmnDateCalcDayOfWeekNum;
	
	/**
	* Constructor for CmnDateCalcCalculations
	**/
    public CmnDateCalcCalculations() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcCalculations. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalculations(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcNewDateCalcR.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnDateCalcNewDateCalc
	 *	@return cmnDateCalcNewDateCalc
	 */
   public char[] getCmnDateCalcNewDateCalc() throws CFException{
     if (isCmnDateCalcNewDateCalcModified()) { 
        cmnDateCalcNewDateCalc = refreshCmnDateCalcNewDateCalc();
     }
   		return cmnDateCalcNewDateCalc;
   }

  
	/**
	*  set variable cmnDateCalcNewDateCalc
	*  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-CALC
	*  @param value
	**/
   public void setCmnDateCalcNewDateCalc(char[] value) {
      cmnDateCalcNewDateCalc = checkCmnDateCalcNewDateCalcConstraints(value);
      serializeCmnDateCalcNewDateCalc(cmnDateCalcNewDateCalc);
   } 

     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcNewDateCalc,cmnDateCalcNewDateCalc.length);
   	
   }
   
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc,cmnDateCalcNewDateCalc.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcNewDateCalc with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateCalc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcNewDateCalcR
	 *	@return cmnDateCalcNewDateCalcR
	 */   
	 public CmnDateCalcNewDateCalcR getCmnDateCalcNewDateCalcR() {
   	return cmnDateCalcNewDateCalcR;
   }
   /**
	* 	Update CmnDateCalcNewDateCalcR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-CALC-R
	*	@param value
	*/
   public void setCmnDateCalcNewDateCalcR(char[] value) {
      cmnDateCalcNewDateCalcR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateCalcR.begin,cmnDateCalcNewDateCalcR.length());
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateCalcR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcNewDateCalcR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source) {
   	replace(source,0,source.length(),cmnDateCalcNewDateCalcR.begin,cmnDateCalcNewDateCalcR.length());
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateCalcR.begin,cmnDateCalcNewDateCalcR.length());
   }
   
     /**
	 * 	Update CmnDateCalcNewDateCalcR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateCalcR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateCalcR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateCalcNumOfDaysCalc
	 *	@return cmnDateCalcNumOfDaysCalc
	 */
	public int getCmnDateCalcNumOfDaysCalc() throws CFException {
       if (isCmnDateCalcNumOfDaysCalcModified()) { 
           cmnDateCalcNumOfDaysCalc = refreshCmnDateCalcNumOfDaysCalc();
        }
   		return cmnDateCalcNumOfDaysCalc;
	}
	

    /**
	 *	Returns the String value of cmnDateCalcNumOfDaysCalc
	 *	@return cmnDateCalcNumOfDaysCalc
	 */
	public char[]  getCmnDateCalcNumOfDaysCalcActualString() {
	    String value = String.valueOf(cmnDateCalcNumOfDaysCalc).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CmnDateCalcNumOfDaysCalc with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NUM-OF-DAYS-CALC
	 *	@param number
	 */
	public void setCmnDateCalcNumOfDaysCalc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNumOfDaysCalc = checkCmnDateCalcNumOfDaysCalcMaxLimit(number); 
		serializeCmnDateCalcNumOfDaysCalc(cmnDateCalcNumOfDaysCalc);
	}
	

	public void setCmnDateCalcNumOfDaysCalc(long number) {
	    number = checkCmnDateCalcNumOfDaysCalcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNumOfDaysCalc((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNumOfDaysCalc with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfDaysCalc(char[] value) throws CFException {
		 cmnDateCalcNumOfDaysCalc = serializeCmnDateCalcNumOfDaysCalc(value);
	}
	/**
	 * 	Update CmnDateCalcNumOfDaysCalc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfDaysCalcString(char[] value) throws CFException {
		 setCmnDateCalcNumOfDaysCalc(value);
	}
	/**
	 *	Returns the value of cmnDateCalcDayOfWeekLit
	 *	@return cmnDateCalcDayOfWeekLit
	 */
   public char[] getCmnDateCalcDayOfWeekLit() throws CFException{
     if (isCmnDateCalcDayOfWeekLitModified()) { 
        cmnDateCalcDayOfWeekLit = refreshCmnDateCalcDayOfWeekLit();
     }
   		return cmnDateCalcDayOfWeekLit;
   }

  
	/**
	*  set variable cmnDateCalcDayOfWeekLit
	*  Corresponding COBOL Variable is CMN-DATE-CALC-DAY-OF-WEEK-LIT
	*  @param value
	**/
   public void setCmnDateCalcDayOfWeekLit(char[] value) {
      cmnDateCalcDayOfWeekLit = checkCmnDateCalcDayOfWeekLitConstraints(value);
      serializeCmnDateCalcDayOfWeekLit(cmnDateCalcDayOfWeekLit);
   } 

     /**
	 * 	Update CmnDateCalcDayOfWeekLit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcDayOfWeekLit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcDayOfWeekLit,cmnDateCalcDayOfWeekLit.length);
   	
   }
   
   public void setCmnDateCalcDayOfWeekLit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDayOfWeekLit,cmnDateCalcDayOfWeekLit.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcDayOfWeekLit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcDayOfWeekLit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDayOfWeekLit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcDayOfWeekLit with another Field
	 *	@param value
	 */
   public void setCmnDateCalcDayOfWeekLit(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcDayOfWeekLit,CMN_DATE_CALC_DAY_OF_WEEK_LIT_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcDayOfWeekLit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcDayOfWeekLit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcDayOfWeekLit,CMN_DATE_CALC_DAY_OF_WEEK_LIT_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcDayOfWeekLit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcDayOfWeekLit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcDayOfWeekLit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcDayOfWeekNum
	 *	@return cmnDateCalcDayOfWeekNum
	 */
	public int getCmnDateCalcDayOfWeekNum() throws CFException {
       if (isCmnDateCalcDayOfWeekNumModified()) { 
           cmnDateCalcDayOfWeekNum = refreshCmnDateCalcDayOfWeekNum();
        }
   		return cmnDateCalcDayOfWeekNum;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcDayOfWeekNum with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-DAY-OF-WEEK-NUM
	 *	@param number
	 */
	public void setCmnDateCalcDayOfWeekNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcDayOfWeekNum = checkCmnDateCalcDayOfWeekNumMaxLimit(number); 
		serializeCmnDateCalcDayOfWeekNum(cmnDateCalcDayOfWeekNum);
	}
	

	public void setCmnDateCalcDayOfWeekNum(long number) {
	    number = checkCmnDateCalcDayOfWeekNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcDayOfWeekNum((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcDayOfWeekNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcDayOfWeekNum(char[] value) throws CFException {
		 cmnDateCalcDayOfWeekNum = serializeCmnDateCalcDayOfWeekNum(value);
	}
	/**
	 * 	Update CmnDateCalcDayOfWeekNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcDayOfWeekNumString(char[] value) throws CFException {
		 setCmnDateCalcDayOfWeekNum(value);
	}

	
	
	

		public static int getCmnDateCalcCalculationsFieldLength() {
			return CMN_DATE_CALC_CALCULATIONS_LENGTH;
		}

}
  
