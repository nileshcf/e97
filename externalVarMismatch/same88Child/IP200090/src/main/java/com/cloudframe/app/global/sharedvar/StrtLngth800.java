package com.cloudframe.app.global.sharedvar;

/**
*  The class StrtLngth800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_strtLngth800")

public class StrtLngth800 extends StrtLngth800Serialized  implements InitializingBean {
   

								private short candidateStrt800;

								private short candidateLnth800;
	
	/**
	* Constructor for StrtLngth800
	**/
    public StrtLngth800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of candidateStrt800
	 *	@return candidateStrt800
	 */
	public short getCandidateStrt800() throws CFException {
        if (isCandidateStrt800Modified()) { 
           candidateStrt800 = refreshCandidateStrt800();
        }
   		return candidateStrt800;
	}
	
	/**
	 * 	Update CandidateStrt800 with the passed value
	 *  Corresponding COBOL Variable is 800-CANDIDATE-STRT
	 *	@param number
	 */
	public void setCandidateStrt800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    candidateStrt800 = checkCandidateStrt800MaxLimit(number); 
		serializeCandidateStrt800(candidateStrt800);
	}

	public void setCandidateStrt800(int number) {
	    number = checkCandidateStrt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateStrt800((short)number);
	}
	public void setCandidateStrt800(long number) {
	    number = checkCandidateStrt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateStrt800((short)number);
	}
	

	/**
	 *	Returns the value of candidateLnth800
	 *	@return candidateLnth800
	 */
	public short getCandidateLnth800() throws CFException {
        if (isCandidateLnth800Modified()) { 
           candidateLnth800 = refreshCandidateLnth800();
        }
   		return candidateLnth800;
	}
	
	/**
	 * 	Update CandidateLnth800 with the passed value
	 *  Corresponding COBOL Variable is 800-CANDIDATE-LNTH
	 *	@param number
	 */
	public void setCandidateLnth800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    candidateLnth800 = checkCandidateLnth800MaxLimit(number); 
		serializeCandidateLnth800(candidateLnth800);
	}

	public void setCandidateLnth800(int number) {
	    number = checkCandidateLnth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateLnth800((short)number);
	}
	public void setCandidateLnth800(long number) {
	    number = checkCandidateLnth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateLnth800((short)number);
	}
	


	
	
	
	/**
	 * 	initializes StrtLngth800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setCandidateStrt800((short)0);
         	setCandidateLnth800((short)0);
   }

		public static int getStrtLngth800FieldLength() {
			return STRT_LNGTH_800_LENGTH;
		}

}
  
