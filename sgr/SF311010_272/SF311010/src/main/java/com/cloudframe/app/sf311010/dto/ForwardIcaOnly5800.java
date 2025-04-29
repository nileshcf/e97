package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ForwardIcaOnly5800 extends ForwardIcaOnly5800Serialized { 
   

						@Getter @Setter private char[] forwardIcaOnly4800 = Field.fillLowValue(4);

						@Getter @Setter private char[] fwdFiller1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for ForwardIcaOnly5800
	**/
    public ForwardIcaOnly5800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ForwardIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
