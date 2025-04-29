package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcTypeOpt56 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcTypeOpt56 extends CmnDateCalcTypeOpt56Serialized { 
   

						@Getter @Setter private char[] cmnDateCalcDowIndicator = Field.fillLowValue(1);
	
	/**
	* Constructor for CmnDateCalcTypeOpt56
	**/
    public CmnDateCalcTypeOpt56() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcTypeOpt56. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcTypeOpt56(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
