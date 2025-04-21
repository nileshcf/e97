package com.cloudframe.app.mcwin.dto;

/**
*  The class WorkArea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WorkArea800 extends WorkArea800Serialized {
   

								private int parmsCheck800;

								private long currYear1800;

								private long currYear2800;

								private int currYear3800;

								private int yearValue800;
	
	/**
	* Constructor for WorkArea800
	**/
    public WorkArea800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setParmsCheck800(0);
								setCurrYear1800(0L);
								setCurrYear2800(0L);
								setCurrYear3800(0);
								setYearValue800(0);
    }


 

	/**
	 *	Returns the value of parmsCheck800
	 *	@return parmsCheck800
	 */
	public int getParmsCheck800() throws CFException {
       if (isParmsCheck800Modified()) { 
           parmsCheck800 = refreshParmsCheck800();
        }
   		return parmsCheck800;
	}
	

	
	   
	/**
	 * 	Update ParmsCheck800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARMS-CHECK
	 *	@param number
	 */
	public void setParmsCheck800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmsCheck800 = checkParmsCheck800MaxLimit(number); 
		serializeParmsCheck800(parmsCheck800);
	}
	

	public void setParmsCheck800(long number) {
	    number = checkParmsCheck800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setParmsCheck800((int)number);
	}
	
	/**
	 * 	Update ParmsCheck800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmsCheck800(char[] value) throws CFException {
		 parmsCheck800 = serializeParmsCheck800(value);
	}
	/**
	 * 	Update ParmsCheck800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmsCheck800String(char[] value) throws CFException {
		 setParmsCheck800(value);
	}
	/**
	 *	Returns the value of currYear1800
	 *	@return currYear1800
	 */
	public long getCurrYear1800() throws CFException {
       if (isCurrYear1800Modified()) { 
           currYear1800 = refreshCurrYear1800();
        }
   		return currYear1800;
	}
	

	
	   
	/**
	 * 	Update CurrYear1800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURR-YEAR1
	 *	@param number
	 */
	public void setCurrYear1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    currYear1800 = checkCurrYear1800MaxLimit(number); 
		serializeCurrYear1800(currYear1800);
	}
	

	/**
	 * 	Update CurrYear1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrYear1800(char[] value) throws CFException {
		 currYear1800 = serializeCurrYear1800(value);
	}
	/**
	 * 	Update CurrYear1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrYear1800String(char[] value) throws CFException {
		 setCurrYear1800(value);
	}
	/**
	 *	Returns the value of currYear2800
	 *	@return currYear2800
	 */
	public long getCurrYear2800() throws CFException {
       if (isCurrYear2800Modified()) { 
           currYear2800 = refreshCurrYear2800();
        }
   		return currYear2800;
	}
	

	
	   
	/**
	 * 	Update CurrYear2800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURR-YEAR2
	 *	@param number
	 */
	public void setCurrYear2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    currYear2800 = checkCurrYear2800MaxLimit(number); 
		serializeCurrYear2800(currYear2800);
	}
	

	/**
	 * 	Update CurrYear2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrYear2800(char[] value) throws CFException {
		 currYear2800 = serializeCurrYear2800(value);
	}
	/**
	 * 	Update CurrYear2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrYear2800String(char[] value) throws CFException {
		 setCurrYear2800(value);
	}
	/**
	 *	Returns the value of currYear3800
	 *	@return currYear3800
	 */
	public int getCurrYear3800() throws CFException {
       if (isCurrYear3800Modified()) { 
           currYear3800 = refreshCurrYear3800();
        }
   		return currYear3800;
	}
	

	
	   
	/**
	 * 	Update CurrYear3800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURR-YEAR3
	 *	@param number
	 */
	public void setCurrYear3800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    currYear3800 = checkCurrYear3800MaxLimit(number); 
		serializeCurrYear3800(currYear3800);
	}
	

	public void setCurrYear3800(long number) {
	    number = checkCurrYear3800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrYear3800((int)number);
	}
	
	/**
	 * 	Update CurrYear3800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrYear3800(char[] value) throws CFException {
		 currYear3800 = serializeCurrYear3800(value);
	}
	/**
	 * 	Update CurrYear3800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrYear3800String(char[] value) throws CFException {
		 setCurrYear3800(value);
	}
	/**
	 *	Returns the value of yearValue800
	 *	@return yearValue800
	 */
	public int getYearValue800() throws CFException {
       if (isYearValue800Modified()) { 
           yearValue800 = refreshYearValue800();
        }
   		return yearValue800;
	}
	

	
	   
	/**
	 * 	Update YearValue800 with the passed value
	 *  Corresponding COBOL Variable is 800-YEAR-VALUE
	 *	@param number
	 */
	public void setYearValue800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    yearValue800 = checkYearValue800MaxLimit(number); 
		serializeYearValue800(yearValue800);
	}
	

	public void setYearValue800(long number) {
	    number = checkYearValue800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setYearValue800((int)number);
	}
	
	/**
	 * 	Update YearValue800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setYearValue800(char[] value) throws CFException {
		 yearValue800 = serializeYearValue800(value);
	}
	/**
	 * 	Update YearValue800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setYearValue800String(char[] value) throws CFException {
		 setYearValue800(value);
	}

	
	
	

		public static int getWorkArea800FieldLength() {
			return WORK_AREA_800_LENGTH;
		}

}
  
