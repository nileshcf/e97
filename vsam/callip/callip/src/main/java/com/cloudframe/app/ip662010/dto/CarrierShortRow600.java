package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierShortRow600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CarrierShortRow600 extends CarrierShortRow600Serialized { 
   

								private short carrierTooShortDe600;

								private short carrierTooShortCode600;
	
	/**
	* Constructor for CarrierShortRow600
	**/
    public CarrierShortRow600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CarrierShortRow600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierShortRow600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of carrierTooShortDe600
	 *	@return carrierTooShortDe600
	 */
	public short getCarrierTooShortDe600() throws CFException {
        if (isCarrierTooShortDe600Modified()) { 
           carrierTooShortDe600 = refreshCarrierTooShortDe600();
        }
   		return carrierTooShortDe600;
	}
	
	/**
	 * 	Update CarrierTooShortDe600 with the passed value
	 *  Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT-DE
	 *	@param number
	 */
	public void setCarrierTooShortDe600(short number) {
	     // Truncate if the number is beyond +/- Max range
	    carrierTooShortDe600 = checkCarrierTooShortDe600MaxLimit(number); 
		serializeCarrierTooShortDe600(carrierTooShortDe600);
	}

	public void setCarrierTooShortDe600(int number) {
	    number = checkCarrierTooShortDe600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCarrierTooShortDe600((short)number);
	}
	public void setCarrierTooShortDe600(long number) {
	    number = checkCarrierTooShortDe600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCarrierTooShortDe600((short)number);
	}
	

	/**
	 *	Returns the value of carrierTooShortCode600
	 *	@return carrierTooShortCode600
	 */
	public short getCarrierTooShortCode600() throws CFException {
        if (isCarrierTooShortCode600Modified()) { 
           carrierTooShortCode600 = refreshCarrierTooShortCode600();
        }
   		return carrierTooShortCode600;
	}
	
	/**
	 * 	Update CarrierTooShortCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT-CODE
	 *	@param number
	 */
	public void setCarrierTooShortCode600(short number) {
	     // Truncate if the number is beyond +/- Max range
	    carrierTooShortCode600 = checkCarrierTooShortCode600MaxLimit(number); 
		serializeCarrierTooShortCode600(carrierTooShortCode600);
	}

	public void setCarrierTooShortCode600(int number) {
	    number = checkCarrierTooShortCode600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCarrierTooShortCode600((short)number);
	}
	public void setCarrierTooShortCode600(long number) {
	    number = checkCarrierTooShortCode600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCarrierTooShortCode600((short)number);
	}
	


	
	
	

		public static int getCarrierShortRow600FieldLength() {
			return CARRIER_SHORT_ROW_600_LENGTH;
		}

}
  
