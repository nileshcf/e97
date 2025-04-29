package com.cloudframe.app.usbaeext.dto;

/**
*  The class TaMonthTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TaMonthTableRedefined extends TaMonthTableRedefinedSerialized { 
   

						@Getter @Setter private char[] taMonth = Field.fillLowValue(3);
	
	/**
	* Constructor for TaMonthTableRedefined
	**/
    public TaMonthTableRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaMonthTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaMonthTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
