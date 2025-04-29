package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcInputDateArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcInputDateArea extends CmnDateCalcInputDateAreaSerialized { 
   

						private char[] cmnDateCalcStartDate = Field.fillLowValue(10);
				private CmnDateCalcStartDateR cmnDateCalcStartDateR = new CmnDateCalcStartDateR();

						private char[] cmnDateCalcEndDate = Field.fillLowValue(10);
				private CmnDateCalcEndDateR cmnDateCalcEndDateR = new CmnDateCalcEndDateR();

								private int cmnDateCalcNumOfDaysIn;

								private short cmnDateCalcNumOfMonthsIn;
	
	/**
	* Constructor for CmnDateCalcInputDateArea
	**/
    public CmnDateCalcInputDateArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcInputDateArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputDateArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcStartDateR.setParent(this,getStartOffset() + 0);
	       			cmnDateCalcEndDateR.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of cmnDateCalcStartDate
	 *	@return cmnDateCalcStartDate
	 */
   public char[] getCmnDateCalcStartDate() throws CFException{
     if (isCmnDateCalcStartDateModified()) { 
        cmnDateCalcStartDate = refreshCmnDateCalcStartDate();
     }
   		return cmnDateCalcStartDate;
   }

  
	/**
	*  set variable cmnDateCalcStartDate
	*  Corresponding COBOL Variable is CMN-DATE-CALC-START-DATE
	*  @param value
	**/
   public void setCmnDateCalcStartDate(char[] value) {
      cmnDateCalcStartDate = checkCmnDateCalcStartDateConstraints(value);
      serializeCmnDateCalcStartDate(cmnDateCalcStartDate);
   } 

     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcStartDate,cmnDateCalcStartDate.length);
   	
   }
   
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate,cmnDateCalcStartDate.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcStartDate with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcStartDateR
	 *	@return cmnDateCalcStartDateR
	 */   
	 public CmnDateCalcStartDateR getCmnDateCalcStartDateR() {
   	return cmnDateCalcStartDateR;
   }
   /**
	* 	Update CmnDateCalcStartDateR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-START-DATE-R
	*	@param value
	*/
   public void setCmnDateCalcStartDateR(char[] value) {
      cmnDateCalcStartDateR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartDateR.begin,cmnDateCalcStartDateR.length());
   }
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartDateR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcStartDateR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source) {
   	replace(source,0,source.length(),cmnDateCalcStartDateR.begin,cmnDateCalcStartDateR.length());
   }  
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartDateR.begin,cmnDateCalcStartDateR.length());
   }
   
     /**
	 * 	Update CmnDateCalcStartDateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartDateR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateCalcEndDate
	 *	@return cmnDateCalcEndDate
	 */
   public char[] getCmnDateCalcEndDate() throws CFException{
     if (isCmnDateCalcEndDateModified()) { 
        cmnDateCalcEndDate = refreshCmnDateCalcEndDate();
     }
   		return cmnDateCalcEndDate;
   }

  
	/**
	*  set variable cmnDateCalcEndDate
	*  Corresponding COBOL Variable is CMN-DATE-CALC-END-DATE
	*  @param value
	**/
   public void setCmnDateCalcEndDate(char[] value) {
      cmnDateCalcEndDate = checkCmnDateCalcEndDateConstraints(value);
      serializeCmnDateCalcEndDate(cmnDateCalcEndDate);
   } 

     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcEndDate,cmnDateCalcEndDate.length);
   	
   }
   
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate,cmnDateCalcEndDate.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcEndDate with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcEndDateR
	 *	@return cmnDateCalcEndDateR
	 */   
	 public CmnDateCalcEndDateR getCmnDateCalcEndDateR() {
   	return cmnDateCalcEndDateR;
   }
   /**
	* 	Update CmnDateCalcEndDateR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-END-DATE-R
	*	@param value
	*/
   public void setCmnDateCalcEndDateR(char[] value) {
      cmnDateCalcEndDateR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndDateR.begin,cmnDateCalcEndDateR.length());
   }
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndDateR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcEndDateR with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source) {
   	replace(source,0,source.length(),cmnDateCalcEndDateR.begin,cmnDateCalcEndDateR.length());
   }  
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndDateR.begin,cmnDateCalcEndDateR.length());
   }
   
     /**
	 * 	Update CmnDateCalcEndDateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndDateR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateCalcNumOfDaysIn
	 *	@return cmnDateCalcNumOfDaysIn
	 */
	public int getCmnDateCalcNumOfDaysIn() throws CFException {
       if (isCmnDateCalcNumOfDaysInModified()) { 
           cmnDateCalcNumOfDaysIn = refreshCmnDateCalcNumOfDaysIn();
        }
   		return cmnDateCalcNumOfDaysIn;
	}
	

    /**
	 *	Returns the String value of cmnDateCalcNumOfDaysIn
	 *	@return cmnDateCalcNumOfDaysIn
	 */
	public char[]  getCmnDateCalcNumOfDaysInActualString() {
	    String value = String.valueOf(cmnDateCalcNumOfDaysIn).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CmnDateCalcNumOfDaysIn with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NUM-OF-DAYS-IN
	 *	@param number
	 */
	public void setCmnDateCalcNumOfDaysIn(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNumOfDaysIn = checkCmnDateCalcNumOfDaysInMaxLimit(number); 
		serializeCmnDateCalcNumOfDaysIn(cmnDateCalcNumOfDaysIn);
	}
	

	public void setCmnDateCalcNumOfDaysIn(long number) {
	    number = checkCmnDateCalcNumOfDaysInMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNumOfDaysIn((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNumOfDaysIn with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfDaysIn(char[] value) throws CFException {
		 cmnDateCalcNumOfDaysIn = serializeCmnDateCalcNumOfDaysIn(value);
	}
	/**
	 * 	Update CmnDateCalcNumOfDaysIn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfDaysInString(char[] value) throws CFException {
		 setCmnDateCalcNumOfDaysIn(value);
	}
	/**
	 *	Returns the value of cmnDateCalcNumOfMonthsIn
	 *	@return cmnDateCalcNumOfMonthsIn
	 */
	public short getCmnDateCalcNumOfMonthsIn() throws CFException {
       if (isCmnDateCalcNumOfMonthsInModified()) { 
           cmnDateCalcNumOfMonthsIn = refreshCmnDateCalcNumOfMonthsIn();
        }
   		return cmnDateCalcNumOfMonthsIn;
	}
	

    /**
	 *	Returns the String value of cmnDateCalcNumOfMonthsIn
	 *	@return cmnDateCalcNumOfMonthsIn
	 */
	public char[]  getCmnDateCalcNumOfMonthsInActualString() {
	    String value = String.valueOf(cmnDateCalcNumOfMonthsIn).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CmnDateCalcNumOfMonthsIn with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NUM-OF-MONTHS-IN
	 *	@param number
	 */
	public void setCmnDateCalcNumOfMonthsIn(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNumOfMonthsIn = checkCmnDateCalcNumOfMonthsInMaxLimit(number); 
		serializeCmnDateCalcNumOfMonthsIn(cmnDateCalcNumOfMonthsIn);
	}
	
	public void setCmnDateCalcNumOfMonthsIn(int number) {
	    number = checkCmnDateCalcNumOfMonthsInMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNumOfMonthsIn((short)number);
	}
	public void setCmnDateCalcNumOfMonthsIn(long number) {
	    number = checkCmnDateCalcNumOfMonthsInMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNumOfMonthsIn((short)number);
	}
	

	/**
	 * 	Update CmnDateCalcNumOfMonthsIn with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfMonthsIn(char[] value) throws CFException {
		 cmnDateCalcNumOfMonthsIn = serializeCmnDateCalcNumOfMonthsIn(value);
	}
	/**
	 * 	Update CmnDateCalcNumOfMonthsIn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNumOfMonthsInString(char[] value) throws CFException {
		 setCmnDateCalcNumOfMonthsIn(value);
	}

	
	
	

		public static int getCmnDateCalcInputDateAreaFieldLength() {
			return CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH;
		}

}
  
