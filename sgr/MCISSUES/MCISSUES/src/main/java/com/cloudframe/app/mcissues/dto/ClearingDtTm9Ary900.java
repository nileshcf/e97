package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9Ary900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClearingDtTm9Ary900 extends ClearingDtTm9Ary900Serialized { 
   

								private long clearingDtTm9900;
	
	/**
	* Constructor for ClearingDtTm9Ary900
	**/
    public ClearingDtTm9Ary900() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ClearingDtTm9Ary900. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ClearingDtTm9Ary900(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public long getClearingDtTm9900() throws CFException {
       if (isClearingDtTm9900Modified()) { 
           clearingDtTm9900 = refreshClearingDtTm9900();
        }
   		return clearingDtTm9900;
	}
	

	
	   
	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *  Corresponding COBOL Variable is 900-CLEARING-DT-TM-9
	 *	@param number
	 */
	public void setClearingDtTm9900(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    clearingDtTm9900 = checkClearingDtTm9900MaxLimit(number); 
		serializeClearingDtTm9900(clearingDtTm9900);
	}
	

	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900(char[] value) throws CFException {
		 clearingDtTm9900 = serializeClearingDtTm9900(value);
	}
	/**
	 * 	Update ClearingDtTm9900 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900String(char[] value) throws CFException {
		 setClearingDtTm9900(value);
	}

	
	
	

		public static int getClearingDtTm9Ary900FieldLength() {
			return CLEARING_DT_TM_9_ARY_900_LENGTH;
		}

}
  
