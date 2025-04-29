package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcStartDateR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcStartDateR extends CmnDateCalcStartDateRSerialized { 
   

								@Getter @Setter private int cmnDateCalcStartMm;

						@Getter @Setter private char[] cmnDateCalcStartSep1 = Field.fillLowValue(1);

								@Getter @Setter private int cmnDateCalcStartDd;

						@Getter @Setter private char[] cmnDateCalcStartSep2 = Field.fillLowValue(1);
				@Getter @Setter private CmnDateCalcStartYyyy cmnDateCalcStartYyyy = new CmnDateCalcStartYyyy();
	
	/**
	* Constructor for CmnDateCalcStartDateR
	**/
    public CmnDateCalcStartDateR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcStartDateR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartDateR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcStartYyyy().setParent(this,getStartOffset() + 6);
    } 



}
  
