package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierTooShortValuesGroup600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CarrierTooShortValuesGroup600 extends CarrierTooShortValuesGroup600Serialized {
   
					@Getter @Setter private CarrierTooShortValues600 carrierTooShortValues600 = new CarrierTooShortValues600();
					@Getter @Setter private CarrierTooShortCodes600 carrierTooShortCodes600 = new CarrierTooShortCodes600();
	
	/**
	* Constructor for CarrierTooShortValuesGroup600
	**/
    public CarrierTooShortValuesGroup600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCarrierTooShortValues600().setParent(this,getStartOffset() + 0);
					getCarrierTooShortCodes600().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
