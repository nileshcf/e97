package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcEndDateR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcEndDateR extends CmnDateCalcEndDateRSerialized { 
   

								@Getter @Setter private int cmnDateCalcEndMm;

						@Getter @Setter private char[] cmnDateCalcEndSep1 = Field.fillLowValue(1);

								@Getter @Setter private int cmnDateCalcEndDd;

						@Getter @Setter private char[] cmnDateCalcEndSep2 = Field.fillLowValue(1);
				@Getter @Setter private CmnDateCalcEndYyyy cmnDateCalcEndYyyy = new CmnDateCalcEndYyyy();
	
	/**
	* Constructor for CmnDateCalcEndDateR
	**/
    public CmnDateCalcEndDateR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcEndDateR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndDateR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcEndYyyy().setParent(this,getStartOffset() + 6);
    } 



}
  
