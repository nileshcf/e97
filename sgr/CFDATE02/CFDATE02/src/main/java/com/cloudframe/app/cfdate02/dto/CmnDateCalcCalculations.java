package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcCalculations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcCalculations extends CmnDateCalcCalculationsSerialized { 
   

						@Getter @Setter private char[] cmnDateCalcNewDateCalc = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateCalcNewDateCalcR = Field.fillLowValue(10);
	
	/**
	* Constructor for CmnDateCalcCalculations
	**/
    public CmnDateCalcCalculations() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcCalculations. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalculations(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
