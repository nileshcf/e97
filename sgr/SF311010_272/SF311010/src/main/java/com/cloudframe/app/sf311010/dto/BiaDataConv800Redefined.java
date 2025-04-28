package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConv800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiaDataConv800Redefined extends BiaDataConv800RedefinedSerialized { 
   

								private int convData800;
	
	/**
	* Constructor for BiaDataConv800Redefined
	**/
    public BiaDataConv800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BiaDataConv800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of convData800
	 *	@return convData800
	 */
	public int getConvData800() throws CFException {
        if (isConvData800Modified()) { 
           convData800 = refreshConvData800();
        }
   		return convData800;
	}
	
	/**
	 * 	Update ConvData800 with the passed value
	 *  Corresponding COBOL Variable is 800-CONV-DATA
	 *	@param number
	 */
	public void setConvData800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    convData800 = checkConvData800MaxLimit(number); 
		serializeConvData800(convData800);
	}


	public void setConvData800(long number) {
	    number = checkConvData800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setConvData800((int)number);
	}
	

	
	
	

		public static int getBiaDataConv800RedefinedFieldLength() {
			return BIA_DATA_CONV_800_REDEFINED_LENGTH;
		}

}
  
