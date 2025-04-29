package com.cloudframe.app.usbaeext.dto;

/**
*  The class WaCurrentDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaCurrentDateRedefined extends WaCurrentDateRedefinedSerialized { 
   

						@Getter @Setter private char[] waCdYyyy = Field.fillLowValue(4);

						@Getter @Setter private char[] waCdMm = Field.fillLowValue(2);

						@Getter @Setter private char[] waCdDd = Field.fillLowValue(2);
	
	/**
	* Constructor for WaCurrentDateRedefined
	**/
    public WaCurrentDateRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WaCurrentDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WaCurrentDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
