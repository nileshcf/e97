package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmEntry520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RecfmEntry520 extends RecfmEntry520Serialized { 
   

						@Getter @Setter private char[] recfm2520 = Field.fillLowValue(2);

						@Getter @Setter private char[] recfm3520 = Field.fillLowValue(3);
	
	/**
	* Constructor for RecfmEntry520
	**/
    public RecfmEntry520() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RecfmEntry520. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmEntry520(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
