package com.cloudframe.app.mcindex.dto;

/**
*  The class ZeroValGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ZeroValGroup800 extends ZeroValGroup800Serialized { 
   

								private int zeroVal800;

								private int zero800;
	
	/**
	* Constructor for ZeroValGroup800
	**/
    public ZeroValGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setZeroVal800(0);
    }


 

	/**
	 *	Returns the value of zeroVal800
	 *	@return zeroVal800
	 */
	public int getZeroVal800() throws CFException {
        if (isZeroVal800Modified()) { 
           zeroVal800 = refreshZeroVal800();
        }
   		return zeroVal800;
	}
	
	/**
	 * 	Update ZeroVal800 with the passed value
	 *  Corresponding COBOL Variable is 800-ZERO-VAL
	 *	@param number
	 */
	public void setZeroVal800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    zeroVal800 = checkZeroVal800MaxLimit(number); 
		serializeZeroVal800(zeroVal800);
	}


	public void setZeroVal800(long number) {
	    number = checkZeroVal800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZeroVal800((int)number);
	}
	
	/**
	 *	Returns the value of zero800
	 *	@return zero800
	 */
	public int getZero800() throws CFException {
        if (isZero800Modified()) { 
           zero800 = refreshZero800();
        }
   		return zero800;
	}
	
	/**
	 * 	Update Zero800 with the passed value
	 *  Corresponding COBOL Variable is 800-ZERO
	 *	@param number
	 */
	public void setZero800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    zero800 = checkZero800MaxLimit(number); 
		serializeZero800(zero800);
	}


	public void setZero800(long number) {
	    number = checkZero800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZero800((int)number);
	}
	

	
	
	

		public static int getZeroValGroup800FieldLength() {
			return ZERO_VAL_GROUP_800_LENGTH;
		}

}
  
