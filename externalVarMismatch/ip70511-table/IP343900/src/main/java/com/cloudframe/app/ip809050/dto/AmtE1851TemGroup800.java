package com.cloudframe.app.ip809050.dto;

/**
*  The class AmtE1851TemGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class AmtE1851TemGroup800 extends AmtE1851TemGroup800Serialized {
   

								private long amtE1851Tem800;
	
	/**
	* Constructor for AmtE1851TemGroup800
	**/
    public AmtE1851TemGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAmtE1851Tem800(0L);
    }


 

	/**
	 *	Returns the value of amtE1851Tem800
	 *	@return amtE1851Tem800
	 */
	public long getAmtE1851Tem800() throws CFException {
       if (isAmtE1851Tem800Modified()) { 
           amtE1851Tem800 = refreshAmtE1851Tem800();
        }
   		return amtE1851Tem800;
	}
	

	
	   
	/**
	 * 	Update AmtE1851Tem800 with the passed value
	 *  Corresponding COBOL Variable is 800-AMT-E1851-TEM
	 *	@param number
	 */
	public void setAmtE1851Tem800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtE1851Tem800 = checkAmtE1851Tem800MaxLimit(number); 
		serializeAmtE1851Tem800(amtE1851Tem800);
	}
	

	/**
	 * 	Update AmtE1851Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851Tem800(char[] value) throws CFException {
		 amtE1851Tem800 = serializeAmtE1851Tem800(value);
	}
	/**
	 * 	Update AmtE1851Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851Tem800String(char[] value) throws CFException {
		 setAmtE1851Tem800(value);
	}

	
	
	

		public static int getAmtE1851TemGroup800FieldLength() {
			return AMT_E_1851_TEM_GROUP_800_LENGTH;
		}

}
  
