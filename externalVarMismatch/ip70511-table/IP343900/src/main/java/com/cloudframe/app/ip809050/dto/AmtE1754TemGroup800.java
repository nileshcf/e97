package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1754TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1754TemGroup800 extends AmtE1754TemGroup800Serialized {
   

								private long amtE1754Tem800;
	
	/**
	* Constructor for AmtE1754TemGroup800
	**/
    public AmtE1754TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1754Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1754Tem800
	 *	@return amtE1754Tem800
	 */
	public long getAmtE1754Tem800() throws CFException {
       if (isAmtE1754Tem800Modified()) { 
           amtE1754Tem800 = refreshAmtE1754Tem800();
        }
   		return amtE1754Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1754Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1754-TEM
	 *	@param number
	 */
	public void setAmtE1754Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1754Tem800 = checkAmtE1754Tem800MaxLimit(number); 
		serializeAmtE1754Tem800(amtE1754Tem800);
	}
	

	/**
	 * 	Update AmtE1754Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754Tem800(char[] value) throws CFException {
		 amtE1754Tem800 = serializeAmtE1754Tem800(value);
	}
	/**
	 * 	Update AmtE1754Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754Tem800String(char[] value) throws CFException {
		 setAmtE1754Tem800(value);
	}

	
	
	

		public static int getAmtE1754TemGroup800FieldLength() {
			return AMT_E_1754_TEM_GROUP_800_LENGTH;
		}

}
  
