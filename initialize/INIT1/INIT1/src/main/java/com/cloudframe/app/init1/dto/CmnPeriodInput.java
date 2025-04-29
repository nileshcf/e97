package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPeriodInput extends CmnPeriodInputSerialized { 
   

								@Getter @Setter private int cmnPeriodInputMm;

								@Getter @Setter private int cmnPeriodInputYy;
	
	/**
	* Constructor for CmnPeriodInput
	**/
    public CmnPeriodInput() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPeriodInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
