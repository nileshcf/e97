package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcCalculations is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcCalculations extends CmnDateCalcCalculationsSerialized { 
   

						@Getter @Setter private char[] cmnDateCalcNewDateCalc = Field.fillLowValue(10);
				@Getter @Setter private CmnDateCalcNewDateCalcR cmnDateCalcNewDateCalcR = new CmnDateCalcNewDateCalcR();

								@Getter @Setter private int cmnDateCalcNumOfDaysCalc;

						@Getter @Setter private char[] cmnDateCalcDayOfWeekLit = Field.fillLowValue(3);

								@Getter @Setter private int cmnDateCalcDayOfWeekNum;
	
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
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcNewDateCalcR().setParent(this,getStartOffset() + 0);
    } 



}
  
