package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinReturnedYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MciwinReturnedYear extends MciwinReturnedYearSerialized {
   

								private int mciwinRetCentury;

								private int mciwinRetYearL2;
	
	/**
	* Constructor for MciwinReturnedYear
	**/
    public MciwinReturnedYear() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinRetCentury(0);
								setMciwinRetYearL2(0);
    }


 

	/**
	 *	Returns the value of mciwinRetCentury
	 *	@return mciwinRetCentury
	 */
	public int getMciwinRetCentury() throws CFException {
       if (isMciwinRetCenturyModified()) { 
           mciwinRetCentury = refreshMciwinRetCentury();
        }
   		return mciwinRetCentury;
	}
	

	
	   
	/**
	 * 	Update MciwinRetCentury with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-RET-CENTURY
	 *	@param number
	 */
	public void setMciwinRetCentury(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinRetCentury = checkMciwinRetCenturyMaxLimit(number); 
		serializeMciwinRetCentury(mciwinRetCentury);
	}
	

	public void setMciwinRetCentury(long number) {
	    number = checkMciwinRetCenturyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinRetCentury((int)number);
	}
	
	/**
	 * 	Update MciwinRetCentury with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCentury(char[] value) throws CFException {
		 mciwinRetCentury = serializeMciwinRetCentury(value);
	}
	/**
	 * 	Update MciwinRetCentury with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCenturyString(char[] value) throws CFException {
		 setMciwinRetCentury(value);
	}
	/**
	 *	Returns the value of mciwinRetYearL2
	 *	@return mciwinRetYearL2
	 */
	public int getMciwinRetYearL2() throws CFException {
       if (isMciwinRetYearL2Modified()) { 
           mciwinRetYearL2 = refreshMciwinRetYearL2();
        }
   		return mciwinRetYearL2;
	}
	

	
	   
	/**
	 * 	Update MciwinRetYearL2 with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-RET-YEAR-L2
	 *	@param number
	 */
	public void setMciwinRetYearL2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinRetYearL2 = checkMciwinRetYearL2MaxLimit(number); 
		serializeMciwinRetYearL2(mciwinRetYearL2);
	}
	

	public void setMciwinRetYearL2(long number) {
	    number = checkMciwinRetYearL2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinRetYearL2((int)number);
	}
	
	/**
	 * 	Update MciwinRetYearL2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2(char[] value) throws CFException {
		 mciwinRetYearL2 = serializeMciwinRetYearL2(value);
	}
	/**
	 * 	Update MciwinRetYearL2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2String(char[] value) throws CFException {
		 setMciwinRetYearL2(value);
	}

	
	
	

		public static int getMciwinReturnedYearFieldLength() {
			return MCIWIN_RETURNED_YEAR_LENGTH;
		}

}
  
