package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardInstId860Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ForwardInstId860Redefined extends ForwardInstId860RedefinedSerialized { 
   

								private long forwardInstIdOnly860;
	
	/**
	* Constructor for ForwardInstId860Redefined
	**/
    public ForwardInstId860Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ForwardInstId860Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardInstId860Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of forwardInstIdOnly860
	 *	@return forwardInstIdOnly860
	 */
	public long getForwardInstIdOnly860() throws CFException {
       if (isForwardInstIdOnly860Modified()) { 
           forwardInstIdOnly860 = refreshForwardInstIdOnly860();
        }
   		return forwardInstIdOnly860;
	}
	

	
	   
	/**
	 * 	Update ForwardInstIdOnly860 with the passed value
	 *  Corresponding COBOL Variable is 860-FORWARD-INST-ID-ONLY
	 *	@param number
	 */
	public void setForwardInstIdOnly860(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    forwardInstIdOnly860 = checkForwardInstIdOnly860MaxLimit(number); 
		serializeForwardInstIdOnly860(forwardInstIdOnly860);
	}
	

	/**
	 * 	Update ForwardInstIdOnly860 with the passed value
	 *	@param value (String or char[])
	 */
	public void setForwardInstIdOnly860(char[] value) throws CFException {
		 forwardInstIdOnly860 = serializeForwardInstIdOnly860(value);
	}
	/**
	 * 	Update ForwardInstIdOnly860 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setForwardInstIdOnly860String(char[] value) throws CFException {
		 setForwardInstIdOnly860(value);
	}

	
	
	

		public static int getForwardInstId860RedefinedFieldLength() {
			return FORWARD_INST_ID_860_REDEFINED_LENGTH;
		}

}
  
