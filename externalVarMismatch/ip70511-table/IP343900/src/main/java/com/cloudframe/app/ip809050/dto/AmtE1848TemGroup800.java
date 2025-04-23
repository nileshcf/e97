package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1848TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1848TemGroup800 extends AmtE1848TemGroup800Serialized {
   

								private long amtE1848Tem800;
	
	/**
	* Constructor for AmtE1848TemGroup800
	**/
    public AmtE1848TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1848Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1848Tem800
	 *	@return amtE1848Tem800
	 */
	public long getAmtE1848Tem800() throws CFException {
       if (isAmtE1848Tem800Modified()) { 
           amtE1848Tem800 = refreshAmtE1848Tem800();
        }
   		return amtE1848Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1848Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1848-TEM
	 *	@param number
	 */
	public void setAmtE1848Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1848Tem800 = checkAmtE1848Tem800MaxLimit(number); 
		serializeAmtE1848Tem800(amtE1848Tem800);
	}
	

	/**
	 * 	Update AmtE1848Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848Tem800(char[] value) throws CFException {
		 amtE1848Tem800 = serializeAmtE1848Tem800(value);
	}
	/**
	 * 	Update AmtE1848Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848Tem800String(char[] value) throws CFException {
		 setAmtE1848Tem800(value);
	}

	
	
	

		public static int getAmtE1848TemGroup800FieldLength() {
			return AMT_E_1848_TEM_GROUP_800_LENGTH;
		}

}
  
