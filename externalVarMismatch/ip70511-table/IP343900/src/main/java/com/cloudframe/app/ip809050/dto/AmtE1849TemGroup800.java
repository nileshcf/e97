package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1849TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1849TemGroup800 extends AmtE1849TemGroup800Serialized { 
   

								private long amtE1849Tem800;
	
	/**
	* Constructor for AmtE1849TemGroup800
	**/
    public AmtE1849TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1849Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1849Tem800
	 *	@return amtE1849Tem800
	 */
	public long getAmtE1849Tem800() throws CFException {
       if (isAmtE1849Tem800Modified()) { 
           amtE1849Tem800 = refreshAmtE1849Tem800();
        }
   		return amtE1849Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1849Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1849-TEM
	 *	@param number
	 */
	public void setAmtE1849Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1849Tem800 = checkAmtE1849Tem800MaxLimit(number); 
		serializeAmtE1849Tem800(amtE1849Tem800);
	}
	

	/**
	 * 	Update AmtE1849Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849Tem800(char[] value) throws CFException {
		 amtE1849Tem800 = serializeAmtE1849Tem800(value);
	}
	/**
	 * 	Update AmtE1849Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849Tem800String(char[] value) throws CFException {
		 setAmtE1849Tem800(value);
	}

	
	
	

		public static int getAmtE1849TemGroup800FieldLength() {
			return AMT_E_1849_TEM_GROUP_800_LENGTH;
		}

}
  
