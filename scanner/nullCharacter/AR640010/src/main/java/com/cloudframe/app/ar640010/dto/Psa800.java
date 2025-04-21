package com.cloudframe.app.ar640010.dto;

/**
*  The class Psa800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Psa800 extends Psa800Serialized { 
   

								private int psaAddr800;

								private int psaPtr800;
	
	/**
	* Constructor for Psa800
	**/
    public Psa800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Psa800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Psa800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPsaAddr800(0);
    } 

	/**
	 *	Returns the value of psaAddr800
	 *	@return psaAddr800
	 */
	public int getPsaAddr800() throws CFException {
        if (isPsaAddr800Modified()) { 
           psaAddr800 = refreshPsaAddr800();
        }
   		return psaAddr800;
	}
	
	/**
	 * 	Update PsaAddr800 with the passed value
	 *  Corresponding COBOL Variable is 800-PSA-ADDR
	 *	@param number
	 */
	public void setPsaAddr800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    psaAddr800 = checkPsaAddr800MaxLimit(number); 
		serializePsaAddr800(psaAddr800);
	}


	public void setPsaAddr800(long number) {
	    number = checkPsaAddr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPsaAddr800((int)number);
	}
	
	/**
	 *	Returns the value of psaPtr800
	 *	@return psaPtr800
	 */
	public int getPsaPtr800() throws CFException {
        if (isPsaPtr800Modified()) { 
           psaPtr800 = refreshPsaPtr800();
        }
   		return psaPtr800;
	}
	
	/**
	 * 	Update PsaPtr800 with the passed value
	 *  Corresponding COBOL Variable is 800-PSA-PTR
	 *	@param number
	 */
	public void setPsaPtr800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    psaPtr800 = checkPsaPtr800MaxLimit(number); 
		serializePsaPtr800(psaPtr800);
	}


	public void setPsaPtr800(long number) {
	    number = checkPsaPtr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPsaPtr800((int)number);
	}
	

	
	
	

		public static int getPsa800FieldLength() {
			return PSA_800_LENGTH;
		}

}
  
