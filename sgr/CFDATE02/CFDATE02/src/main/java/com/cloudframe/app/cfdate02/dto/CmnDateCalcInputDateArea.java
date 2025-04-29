package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcInputDateArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcInputDateArea extends CmnDateCalcInputDateAreaSerialized { 
   

						@Getter @Setter private char[] cmnDateCalcStartDate = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateCalcStartDateR = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateCalcEndDate = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateCalcEndDateR = Field.fillLowValue(10);
	
	/**
	* Constructor for CmnDateCalcInputDateArea
	**/
    public CmnDateCalcInputDateArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcInputDateArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputDateArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
