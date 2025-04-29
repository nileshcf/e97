package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierTooShortCodes600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class CarrierTooShortCodes600 extends CarrierTooShortCodes600Serialized { 
   
			@Getter @Setter private List<CarrierShortRow600> carrierShortRow600 = new ArrayList<>();
    	
	
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
    



}
  
