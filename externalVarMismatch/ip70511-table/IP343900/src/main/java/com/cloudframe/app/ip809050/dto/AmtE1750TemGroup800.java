package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1750TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1750TemGroup800 extends AmtE1750TemGroup800Serialized { 
   

								private long amtE1750Tem800;
	
	/**
	* Constructor for AmtE1750TemGroup800
	**/
    public AmtE1750TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1750Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1750Tem800
	 *	@return amtE1750Tem800
	 */
	public long getAmtE1750Tem800() throws CFException {
       if (isAmtE1750Tem800Modified()) { 
           amtE1750Tem800 = refreshAmtE1750Tem800();
        }
   		return amtE1750Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1750Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1750-TEM
	 *	@param number
	 */
	public void setAmtE1750Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1750Tem800 = checkAmtE1750Tem800MaxLimit(number); 
		serializeAmtE1750Tem800(amtE1750Tem800);
	}
	

	/**
	 * 	Update AmtE1750Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750Tem800(char[] value) throws CFException {
		 amtE1750Tem800 = serializeAmtE1750Tem800(value);
	}
	/**
	 * 	Update AmtE1750Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750Tem800String(char[] value) throws CFException {
		 setAmtE1750Tem800(value);
	}

	
	
	

		public static int getAmtE1750TemGroup800FieldLength() {
			return AMT_E_1750_TEM_GROUP_800_LENGTH;
		}

}
  
