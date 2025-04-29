package com.cloudframe.app.sf305120.dto;

/**
*  The class X86Int16X800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X86Int16X800 extends X86Int16X800Serialized { 
   

						@Getter @Setter private char[] x86Int16B2800 = Field.fillLowValue(1);

						@Getter @Setter private char[] x86Int16B1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for X86Int16X800
	**/
    public X86Int16X800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X86Int16X800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X86Int16X800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
