package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1852TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1852TemGroup800 extends AmtE1852TemGroup800Serialized {
   

								private long amtE1852Tem800;
	
	/**
	* Constructor for AmtE1852TemGroup800
	**/
    public AmtE1852TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1852Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1852Tem800
	 *	@return amtE1852Tem800
	 */
	public long getAmtE1852Tem800() throws CFException {
       if (isAmtE1852Tem800Modified()) { 
           amtE1852Tem800 = refreshAmtE1852Tem800();
        }
   		return amtE1852Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1852Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1852-TEM
	 *	@param number
	 */
	public void setAmtE1852Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1852Tem800 = checkAmtE1852Tem800MaxLimit(number); 
		serializeAmtE1852Tem800(amtE1852Tem800);
	}
	

	/**
	 * 	Update AmtE1852Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852Tem800(char[] value) throws CFException {
		 amtE1852Tem800 = serializeAmtE1852Tem800(value);
	}
	/**
	 * 	Update AmtE1852Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852Tem800String(char[] value) throws CFException {
		 setAmtE1852Tem800(value);
	}

	
	
	

		public static int getAmtE1852TemGroup800FieldLength() {
			return AMT_E_1852_TEM_GROUP_800_LENGTH;
		}

}
  
