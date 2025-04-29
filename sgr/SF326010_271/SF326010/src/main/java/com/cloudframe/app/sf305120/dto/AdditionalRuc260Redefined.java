package com.cloudframe.app.sf305120.dto;

/**
*  The class AdditionalRuc260Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AdditionalRuc260Redefined extends AdditionalRuc260RedefinedSerialized { 
   

								private short rucEsDataLength260;

								private short rucX9aDataLength260;

								private short rucEitDataLength260;
	
	/**
	* Constructor for AdditionalRuc260Redefined
	**/
    public AdditionalRuc260Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AdditionalRuc260Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {
        if (isRucEsDataLength260Modified()) { 
           rucEsDataLength260 = refreshRucEsDataLength260();
        }
   		return rucEsDataLength260;
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *  Corresponding COBOL Variable is 260-RUC-ES-DATA-LENGTH
	 *	@param number
	 */
	public void setRucEsDataLength260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rucEsDataLength260 = checkRucEsDataLength260MaxLimit(number); 
		serializeRucEsDataLength260(rucEsDataLength260);
	}

	public void setRucEsDataLength260(int number) {
	    number = checkRucEsDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucEsDataLength260((short)number);
	}
	public void setRucEsDataLength260(long number) {
	    number = checkRucEsDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucEsDataLength260((short)number);
	}
	

	/**
	 *	Returns the value of rucX9aDataLength260
	 *	@return rucX9aDataLength260
	 */
	public short getRucX9aDataLength260() throws CFException {
        if (isRucX9aDataLength260Modified()) { 
           rucX9aDataLength260 = refreshRucX9aDataLength260();
        }
   		return rucX9aDataLength260;
	}
	
	/**
	 * 	Update RucX9aDataLength260 with the passed value
	 *  Corresponding COBOL Variable is 260-RUC-X9A-DATA-LENGTH
	 *	@param number
	 */
	public void setRucX9aDataLength260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rucX9aDataLength260 = checkRucX9aDataLength260MaxLimit(number); 
		serializeRucX9aDataLength260(rucX9aDataLength260);
	}

	public void setRucX9aDataLength260(int number) {
	    number = checkRucX9aDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucX9aDataLength260((short)number);
	}
	public void setRucX9aDataLength260(long number) {
	    number = checkRucX9aDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucX9aDataLength260((short)number);
	}
	

	/**
	 *	Returns the value of rucEitDataLength260
	 *	@return rucEitDataLength260
	 */
	public short getRucEitDataLength260() throws CFException {
        if (isRucEitDataLength260Modified()) { 
           rucEitDataLength260 = refreshRucEitDataLength260();
        }
   		return rucEitDataLength260;
	}
	
	/**
	 * 	Update RucEitDataLength260 with the passed value
	 *  Corresponding COBOL Variable is 260-RUC-EIT-DATA-LENGTH
	 *	@param number
	 */
	public void setRucEitDataLength260(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rucEitDataLength260 = checkRucEitDataLength260MaxLimit(number); 
		serializeRucEitDataLength260(rucEitDataLength260);
	}

	public void setRucEitDataLength260(int number) {
	    number = checkRucEitDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucEitDataLength260((short)number);
	}
	public void setRucEitDataLength260(long number) {
	    number = checkRucEitDataLength260MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRucEitDataLength260((short)number);
	}
	


	
	
	

		public static int getAdditionalRuc260RedefinedFieldLength() {
			return ADDITIONAL_RUC_260_REDEFINED_LENGTH;
		}

}
  
