package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIca860Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcquirerIca860Redefined extends AcquirerIca860RedefinedSerialized { 
   

								private long acquirerIcaOnly860;
	
	/**
	* Constructor for AcquirerIca860Redefined
	**/
    public AcquirerIca860Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcquirerIca860Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIca860Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of acquirerIcaOnly860
	 *	@return acquirerIcaOnly860
	 */
	public long getAcquirerIcaOnly860() throws CFException {
       if (isAcquirerIcaOnly860Modified()) { 
           acquirerIcaOnly860 = refreshAcquirerIcaOnly860();
        }
   		return acquirerIcaOnly860;
	}
	

	
	   
	/**
	 * 	Update AcquirerIcaOnly860 with the passed value
	 *  Corresponding COBOL Variable is 860-ACQUIRER-ICA-ONLY
	 *	@param number
	 */
	public void setAcquirerIcaOnly860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    acquirerIcaOnly860 = checkAcquirerIcaOnly860MaxLimit(number); 
		serializeAcquirerIcaOnly860(acquirerIcaOnly860);
	}
	

	/**
	 * 	Update AcquirerIcaOnly860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAcquirerIcaOnly860(char[] value) throws CFException {
		 acquirerIcaOnly860 = serializeAcquirerIcaOnly860(value);
	}
	/**
	 * 	Update AcquirerIcaOnly860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAcquirerIcaOnly860String(char[] value) throws CFException {
		 setAcquirerIcaOnly860(value);
	}

	
	
	

		public static int getAcquirerIca860RedefinedFieldLength() {
			return ACQUIRER_ICA_860_REDEFINED_LENGTH;
		}

}
  
