package com.cloudframe.app.sf311010.dto;

/**
*  The class FwdIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FwdIcaOnly5800 extends FwdIcaOnly5800Serialized { 
   

						@Getter @Setter private char[] fwdIcaOnly4800 = Field.fillLowValue(4);
	
	/**
	* Constructor for FwdIcaOnly5800
	**/
    public FwdIcaOnly5800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FwdIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FwdIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
