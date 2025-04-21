package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9ShortAry900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClearingDtTm9ShortAry900 extends ClearingDtTm9ShortAry900Serialized { 
   

								private long clearingDtTm9Short900;
	
	/**
	* Constructor for ClearingDtTm9ShortAry900
	**/
    public ClearingDtTm9ShortAry900() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ClearingDtTm9ShortAry900. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ClearingDtTm9ShortAry900(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of clearingDtTm9Short900
	 *	@return clearingDtTm9Short900
	 */
	public long getClearingDtTm9Short900() throws CFException {
       if (isClearingDtTm9Short900Modified()) { 
           clearingDtTm9Short900 = refreshClearingDtTm9Short900();
        }
   		return clearingDtTm9Short900;
	}
	

	
	   
	/**
	 * 	Update ClearingDtTm9Short900 with the passed value
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9-SHORT
	 *	@param number
	 */
	public void setClearingDtTm9Short900(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    clearingDtTm9Short900 = checkClearingDtTm9Short900MaxLimit(number); 
		serializeClearingDtTm9Short900(clearingDtTm9Short900);
	}
	

	/**
	 * 	Update ClearingDtTm9Short900 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short900(char[] value) throws CFException {
		 clearingDtTm9Short900 = serializeClearingDtTm9Short900(value);
	}
	/**
	 * 	Update ClearingDtTm9Short900 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short900String(char[] value) throws CFException {
		 setClearingDtTm9Short900(value);
	}

	
	
	

		public static int getClearingDtTm9ShortAry900FieldLength() {
			return CLEARING_DT_TM_9_SHORT_ARY_900_LENGTH;
		}

}
  
