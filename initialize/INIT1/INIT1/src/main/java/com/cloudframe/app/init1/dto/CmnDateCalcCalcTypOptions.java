package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcCalcTypOptions is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcCalcTypOptions extends CmnDateCalcCalcTypOptionsSerialized { 
   

						@Getter @Setter private char[] cmnDateCalcTypeOpt1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnDateCalcTypeOpt123 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnDateCalcTypeOpt23 = Field.fillLowValue(1);
				@Getter @Setter private CmnDateCalcTypeOpt56 cmnDateCalcTypeOpt56 = new CmnDateCalcTypeOpt56();
	
	/**
	* Constructor for CmnDateCalcCalcTypOptions
	**/
    public CmnDateCalcCalcTypOptions() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcCalcTypOptions. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalcTypOptions(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcTypeOpt56().setParent(this,getStartOffset() + 3);
    } 



}
  
