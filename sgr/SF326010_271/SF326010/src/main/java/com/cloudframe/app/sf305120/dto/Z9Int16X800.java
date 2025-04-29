package com.cloudframe.app.sf305120.dto;

/**
*  The class Z9Int16X800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Z9Int16X800 extends Z9Int16X800Serialized { 
   

						@Getter @Setter private char[] z9Int16B1800 = Field.fillLowValue(1);

						@Getter @Setter private char[] z9Int16B2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Z9Int16X800
	**/
    public Z9Int16X800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Z9Int16X800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Z9Int16X800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
