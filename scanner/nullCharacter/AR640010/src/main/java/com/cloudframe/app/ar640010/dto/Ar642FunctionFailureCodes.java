package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642FunctionFailureCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar642FunctionFailureCodes extends Ar642FunctionFailureCodesSerialized { 
   

								private int ar642FunctionReturnCd;

								private int ar642FunctionReasonCd;

								private int ar642FunctionAbendCd;
	
	/**
	* Constructor for Ar642FunctionFailureCodes
	**/
    public Ar642FunctionFailureCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ar642FunctionFailureCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar642FunctionFailureCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr642FunctionReturnCd(0);
								setAr642FunctionReasonCd(0);
								setAr642FunctionAbendCd(0);
    } 

	/**
	 *	Returns the value of ar642FunctionReturnCd
	 *	@return ar642FunctionReturnCd
	 */
	public int getAr642FunctionReturnCd() throws CFException {
        if (isAr642FunctionReturnCdModified()) { 
           ar642FunctionReturnCd = refreshAr642FunctionReturnCd();
        }
   		return ar642FunctionReturnCd;
	}
	
	/**
	 * 	Update Ar642FunctionReturnCd with the passed value
	 *  Corresponding COBOL Variable is AR642-FUNCTION-RETURN-CD
	 *	@param number
	 */
	public void setAr642FunctionReturnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642FunctionReturnCd = checkAr642FunctionReturnCdMaxLimit(number); 
		serializeAr642FunctionReturnCd(ar642FunctionReturnCd);
	}


	public void setAr642FunctionReturnCd(long number) {
	    number = checkAr642FunctionReturnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr642FunctionReturnCd((int)number);
	}
	
	/**
	 *	Returns the value of ar642FunctionReasonCd
	 *	@return ar642FunctionReasonCd
	 */
	public int getAr642FunctionReasonCd() throws CFException {
        if (isAr642FunctionReasonCdModified()) { 
           ar642FunctionReasonCd = refreshAr642FunctionReasonCd();
        }
   		return ar642FunctionReasonCd;
	}
	
	/**
	 * 	Update Ar642FunctionReasonCd with the passed value
	 *  Corresponding COBOL Variable is AR642-FUNCTION-REASON-CD
	 *	@param number
	 */
	public void setAr642FunctionReasonCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642FunctionReasonCd = checkAr642FunctionReasonCdMaxLimit(number); 
		serializeAr642FunctionReasonCd(ar642FunctionReasonCd);
	}


	public void setAr642FunctionReasonCd(long number) {
	    number = checkAr642FunctionReasonCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr642FunctionReasonCd((int)number);
	}
	
	/**
	 *	Returns the value of ar642FunctionAbendCd
	 *	@return ar642FunctionAbendCd
	 */
	public int getAr642FunctionAbendCd() throws CFException {
        if (isAr642FunctionAbendCdModified()) { 
           ar642FunctionAbendCd = refreshAr642FunctionAbendCd();
        }
   		return ar642FunctionAbendCd;
	}
	
	/**
	 * 	Update Ar642FunctionAbendCd with the passed value
	 *  Corresponding COBOL Variable is AR642-FUNCTION-ABEND-CD
	 *	@param number
	 */
	public void setAr642FunctionAbendCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642FunctionAbendCd = checkAr642FunctionAbendCdMaxLimit(number); 
		serializeAr642FunctionAbendCd(ar642FunctionAbendCd);
	}


	public void setAr642FunctionAbendCd(long number) {
	    number = checkAr642FunctionAbendCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr642FunctionAbendCd((int)number);
	}
	

	
	
	

		public static int getAr642FunctionFailureCodesFieldLength() {
			return AR_642_FUNCTION_FAILURE_CODES_LENGTH;
		}

}
  
