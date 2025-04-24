package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647FunctionFailureCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar647FunctionFailureCodes extends Ar647FunctionFailureCodesSerialized { 
   

								private int ar647FunctionReturnCd;

								private int ar647FunctionReasonCd;

								private int ar647FunctionAbendCd;
	
	/**
	* Constructor for Ar647FunctionFailureCodes
	**/
    public Ar647FunctionFailureCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ar647FunctionFailureCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar647FunctionFailureCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr647FunctionReturnCd(0);
								setAr647FunctionReasonCd(0);
								setAr647FunctionAbendCd(0);
    } 

	/**
	 *	Returns the value of ar647FunctionReturnCd
	 *	@return ar647FunctionReturnCd
	 */
	public int getAr647FunctionReturnCd() throws CFException {
        if (isAr647FunctionReturnCdModified()) { 
           ar647FunctionReturnCd = refreshAr647FunctionReturnCd();
        }
   		return ar647FunctionReturnCd;
	}
	
	/**
	 * 	Update Ar647FunctionReturnCd with the passed value
	 *  Corresponding COBOL Variable is AR647-FUNCTION-RETURN-CD
	 *	@param number
	 */
	public void setAr647FunctionReturnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar647FunctionReturnCd = checkAr647FunctionReturnCdMaxLimit(number); 
		serializeAr647FunctionReturnCd(ar647FunctionReturnCd);
	}


	public void setAr647FunctionReturnCd(long number) {
	    number = checkAr647FunctionReturnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr647FunctionReturnCd((int)number);
	}
	
	/**
	 *	Returns the value of ar647FunctionReasonCd
	 *	@return ar647FunctionReasonCd
	 */
	public int getAr647FunctionReasonCd() throws CFException {
        if (isAr647FunctionReasonCdModified()) { 
           ar647FunctionReasonCd = refreshAr647FunctionReasonCd();
        }
   		return ar647FunctionReasonCd;
	}
	
	/**
	 * 	Update Ar647FunctionReasonCd with the passed value
	 *  Corresponding COBOL Variable is AR647-FUNCTION-REASON-CD
	 *	@param number
	 */
	public void setAr647FunctionReasonCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar647FunctionReasonCd = checkAr647FunctionReasonCdMaxLimit(number); 
		serializeAr647FunctionReasonCd(ar647FunctionReasonCd);
	}


	public void setAr647FunctionReasonCd(long number) {
	    number = checkAr647FunctionReasonCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr647FunctionReasonCd((int)number);
	}
	
	/**
	 *	Returns the value of ar647FunctionAbendCd
	 *	@return ar647FunctionAbendCd
	 */
	public int getAr647FunctionAbendCd() throws CFException {
        if (isAr647FunctionAbendCdModified()) { 
           ar647FunctionAbendCd = refreshAr647FunctionAbendCd();
        }
   		return ar647FunctionAbendCd;
	}
	
	/**
	 * 	Update Ar647FunctionAbendCd with the passed value
	 *  Corresponding COBOL Variable is AR647-FUNCTION-ABEND-CD
	 *	@param number
	 */
	public void setAr647FunctionAbendCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar647FunctionAbendCd = checkAr647FunctionAbendCdMaxLimit(number); 
		serializeAr647FunctionAbendCd(ar647FunctionAbendCd);
	}


	public void setAr647FunctionAbendCd(long number) {
	    number = checkAr647FunctionAbendCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr647FunctionAbendCd((int)number);
	}
	

	
	
	

		public static int getAr647FunctionFailureCodesFieldLength() {
			return AR_647_FUNCTION_FAILURE_CODES_LENGTH;
		}

}
  
