package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTableGroup580Array1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WarningTableGroup580Array1 extends WarningTableGroup580Array1Serialized { 
   

						@Getter @Setter private char[] warningId580 = Field.fillLowValue(4);

						@Getter @Setter private char[] warningText580 = Field.fillLowValue(50);
	
	/**
	* Constructor for WarningTableGroup580Array1
	**/
    public WarningTableGroup580Array1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WarningTableGroup580Array1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTableGroup580Array1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
