package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionEntry510 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FunctionEntry510 extends FunctionEntry510Serialized { 
   

						@Getter @Setter private char[] functionCode510 = Field.fillLowValue(1);

						@Getter @Setter private char[] functionDesc510 = Field.fillLowValue(47);
	
	/**
	* Constructor for FunctionEntry510
	**/
    public FunctionEntry510() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FunctionEntry510. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionEntry510(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
