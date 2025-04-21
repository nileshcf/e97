package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1850TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1850TemGroup800 extends AmtE1850TemGroup800Serialized {
   

								private long amtE1850Tem800;
	
	/**
	* Constructor for AmtE1850TemGroup800
	**/
    public AmtE1850TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1850Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1850Tem800
	 *	@return amtE1850Tem800
	 */
	public long getAmtE1850Tem800() throws CFException {
       if (isAmtE1850Tem800Modified()) { 
           amtE1850Tem800 = refreshAmtE1850Tem800();
        }
   		return amtE1850Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1850Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1850-TEM
	 *	@param number
	 */
	public void setAmtE1850Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1850Tem800 = checkAmtE1850Tem800MaxLimit(number); 
		serializeAmtE1850Tem800(amtE1850Tem800);
	}
	

	/**
	 * 	Update AmtE1850Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850Tem800(char[] value) throws CFException {
		 amtE1850Tem800 = serializeAmtE1850Tem800(value);
	}
	/**
	 * 	Update AmtE1850Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850Tem800String(char[] value) throws CFException {
		 setAmtE1850Tem800(value);
	}

	
	
	

		public static int getAmtE1850TemGroup800FieldLength() {
			return AMT_E_1850_TEM_GROUP_800_LENGTH;
		}

}
  
