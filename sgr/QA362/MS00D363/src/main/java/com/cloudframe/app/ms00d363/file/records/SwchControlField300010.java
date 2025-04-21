package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchControlField300010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SwchControlField300010 extends SwchControlField300010Serialized { 
   

								private long swchPaymentPartyId300010;
	
	/**
	* Constructor for SwchControlField300010
	**/
    public SwchControlField300010() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SwchControlField300010. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchControlField300010(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of swchPaymentPartyId300010
	 *	@return swchPaymentPartyId300010
	 */
	public long getSwchPaymentPartyId300010() throws CFException {
       if (isSwchPaymentPartyId300010Modified()) { 
           swchPaymentPartyId300010 = refreshSwchPaymentPartyId300010();
        }
   		return swchPaymentPartyId300010;
	}
	

	
	   
	/**
	 * 	Update SwchPaymentPartyId300010 with the passed value
	 *  Corresponding COBOL Variable is SWCH-PAYMENT-PARTY-ID-300010
	 *	@param number
	 */
	public void setSwchPaymentPartyId300010(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    swchPaymentPartyId300010 = checkSwchPaymentPartyId300010MaxLimit(number); 
		serializeSwchPaymentPartyId300010(swchPaymentPartyId300010);
	}
	

	/**
	 * 	Update SwchPaymentPartyId300010 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSwchPaymentPartyId300010(char[] value) throws CFException {
		 swchPaymentPartyId300010 = serializeSwchPaymentPartyId300010(value);
	}
	/**
	 * 	Update SwchPaymentPartyId300010 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSwchPaymentPartyId300010String(char[] value) throws CFException {
		 setSwchPaymentPartyId300010(value);
	}

	
	
	

		public static int getSwchControlField300010FieldLength() {
			return SWCH_CONTROL_FIELD_300010_LENGTH;
		}

}
  
