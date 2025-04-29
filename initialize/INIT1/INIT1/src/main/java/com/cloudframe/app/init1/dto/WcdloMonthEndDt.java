package com.cloudframe.app.init1.dto;

/**
*  The class WcdloMonthEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloMonthEndDt extends WcdloMonthEndDtSerialized { 
   


								private int wcdloMonthEndDtDd;

	
	/**
	* Constructor for WcdloMonthEndDt
	**/
    public WcdloMonthEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloMonthEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloMonthEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wcdloMonthEndDtDd
	 *	@return wcdloMonthEndDtDd
	 */
	public int getWcdloMonthEndDtDd() throws CFException {
       if (isWcdloMonthEndDtDdModified()) { 
           wcdloMonthEndDtDd = refreshWcdloMonthEndDtDd();
        }
   		return wcdloMonthEndDtDd;
	}
	

	
	   
	/**
	 * 	Update WcdloMonthEndDtDd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-MONTH-END-DT-DD
	 *	@param number
	 */
	public void setWcdloMonthEndDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloMonthEndDtDd = checkWcdloMonthEndDtDdMaxLimit(number); 
		serializeWcdloMonthEndDtDd(wcdloMonthEndDtDd);
	}
	

	public void setWcdloMonthEndDtDd(long number) {
	    number = checkWcdloMonthEndDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloMonthEndDtDd((int)number);
	}
	
	/**
	 * 	Update WcdloMonthEndDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloMonthEndDtDd(char[] value) throws CFException {
		 wcdloMonthEndDtDd = serializeWcdloMonthEndDtDd(value);
	}
	/**
	 * 	Update WcdloMonthEndDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloMonthEndDtDdString(char[] value) throws CFException {
		 setWcdloMonthEndDtDd(value);
	}

	
	
	
	/**
	 * 	initializes WcdloMonthEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloMonthEndDtDd(0);
   }

		public static int getWcdloMonthEndDtFieldLength() {
			return WCDLO_MONTH_END_DT_LENGTH;
		}

}
  
