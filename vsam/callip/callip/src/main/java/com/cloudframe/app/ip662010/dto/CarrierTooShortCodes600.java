package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierTooShortCodes600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class CarrierTooShortCodes600 extends CarrierTooShortCodes600Serialized { 
   
			private List<CarrierShortRow600> carrierShortRow600 = new ArrayList<>();
    	
	
	/**
	* Constructor for CarrierTooShortCodes600
	**/
    public CarrierTooShortCodes600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CarrierTooShortCodes600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierTooShortCodes600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of carrierShortRow600
	 *  Corresponding COBOL Variable is 600-CARRIER-SHORT-ROW
	 *	@return carrierShortRow600
	 */
   public List<CarrierShortRow600> getCarrierShortRow600() {
       return carrierShortRow600;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return carrierShortRow600
	 */
	public CarrierShortRow600 getCarrierShortRow600(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCarrierShortRow600(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CARRIER_SHORT_ROW_600_SIZE) {
             	index = CARRIER_SHORT_ROW_600_SIZE -1; // can't exceed max array size
             	logger.trace("carrierShortRow600 - Array index exceeded max Size {}, resetting it to max allowed",CARRIER_SHORT_ROW_600_SIZE); 
	    }
		if (index >= carrierShortRow600.size()) {
       		for (int fillIndex =  carrierShortRow600.size() -1; fillIndex < index;fillIndex++) {
		       carrierShortRow600.add(null);
		    }
			carrierShortRow600.set(index,
			   	   	new CarrierShortRow600(this,beginCarrierShortRow600 + index * CarrierShortRow600.getCarrierShortRow600FieldLength()) 
				                        ); 	
		} 
   	   CarrierShortRow600 value = carrierShortRow600.get(index);
   	   if (value == null) {
   	      carrierShortRow600.set(index,
			   	   	new CarrierShortRow600(this,beginCarrierShortRow600 + index * CarrierShortRow600.getCarrierShortRow600FieldLength()) 
				                        ); 
		  value = carrierShortRow600.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CarrierShortRow600 at index with the passed value
	 *  Corresponding COBOL Variable is 600-CARRIER-SHORT-ROW
	 *  @param index
	 *	@param value
	 */
  public void setCarrierShortRow600(int index,char[] value) {
   	getCarrierShortRow600(index).setString(value);
   }
   
	

	
	
	

		public static int getCarrierTooShortCodes600FieldLength() {
			return CARRIER_TOO_SHORT_CODES_600_LENGTH;
		}

}
  
