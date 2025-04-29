package com.cloudframe.app.sf305120.dto;

/**
*  The class HalfWordX2800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HalfWordX2800 extends HalfWordX2800Serialized { 
   

						@Getter @Setter private char[] loByte800 = Field.fillLowValue(1);
	
	/**
	* Constructor for HalfWordX2800
	**/
    public HalfWordX2800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HalfWordX2800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HalfWordX2800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
