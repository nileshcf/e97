package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds841800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Pds841800 extends Pds841800Serialized { 
   

						@Getter @Setter private char[] pds841S1800 = Field.fillLowValue(4);
	
	/**
	* Constructor for Pds841800
	**/
    public Pds841800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Pds841800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds841800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
