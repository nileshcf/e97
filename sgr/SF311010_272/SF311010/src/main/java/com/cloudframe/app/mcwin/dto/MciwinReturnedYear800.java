package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinReturnedYear800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MciwinReturnedYear800 extends MciwinReturnedYear800Serialized { 
   

								private int mciwinRetCentury800;

								private int mciwinRetYearL2800;
	
	/**
	* Constructor for MciwinReturnedYear800
	**/
    public MciwinReturnedYear800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinRetCentury800(0);
								setMciwinRetYearL2800(0);
    }


 

	/**
	 *	Returns the value of mciwinRetCentury800
	 *	@return mciwinRetCentury800
	 */
	public int getMciwinRetCentury800() throws CFException {
       if (isMciwinRetCentury800Modified()) { 
           mciwinRetCentury800 = refreshMciwinRetCentury800();
        }
   		return mciwinRetCentury800;
	}
	

	
	   
	/**
	 * 	Update MciwinRetCentury800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-RET-CENTURY
	 *	@param number
	 */
	public void setMciwinRetCentury800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinRetCentury800 = checkMciwinRetCentury800MaxLimit(number); 
		serializeMciwinRetCentury800(mciwinRetCentury800);
	}
	

	public void setMciwinRetCentury800(long number) {
	    number = checkMciwinRetCentury800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinRetCentury800((int)number);
	}
	
	/**
	 * 	Update MciwinRetCentury800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCentury800(char[] value) throws CFException {
		 mciwinRetCentury800 = serializeMciwinRetCentury800(value);
	}
	/**
	 * 	Update MciwinRetCentury800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCentury800String(char[] value) throws CFException {
		 setMciwinRetCentury800(value);
	}
	/**
	 *	Returns the value of mciwinRetYearL2800
	 *	@return mciwinRetYearL2800
	 */
	public int getMciwinRetYearL2800() throws CFException {
       if (isMciwinRetYearL2800Modified()) { 
           mciwinRetYearL2800 = refreshMciwinRetYearL2800();
        }
   		return mciwinRetYearL2800;
	}
	

	
	   
	/**
	 * 	Update MciwinRetYearL2800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-RET-YEAR-L2
	 *	@param number
	 */
	public void setMciwinRetYearL2800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinRetYearL2800 = checkMciwinRetYearL2800MaxLimit(number); 
		serializeMciwinRetYearL2800(mciwinRetYearL2800);
	}
	

	public void setMciwinRetYearL2800(long number) {
	    number = checkMciwinRetYearL2800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinRetYearL2800((int)number);
	}
	
	/**
	 * 	Update MciwinRetYearL2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2800(char[] value) throws CFException {
		 mciwinRetYearL2800 = serializeMciwinRetYearL2800(value);
	}
	/**
	 * 	Update MciwinRetYearL2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2800String(char[] value) throws CFException {
		 setMciwinRetYearL2800(value);
	}

	
	
	

		public static int getMciwinReturnedYear800FieldLength() {
			return MCIWIN_RETURNED_YEAR_800_LENGTH;
		}

}
  
