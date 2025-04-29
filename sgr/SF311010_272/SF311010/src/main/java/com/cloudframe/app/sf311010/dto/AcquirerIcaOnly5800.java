package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AcquirerIcaOnly5800 extends AcquirerIcaOnly5800Serialized { 
   

						@Getter @Setter private char[] acquirerIcaOnly4800 = Field.fillLowValue(4);

						@Getter @Setter private char[] acqFiller1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for AcquirerIcaOnly5800
	**/
    public AcquirerIcaOnly5800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcquirerIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
