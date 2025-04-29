package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcOutputArea extends CmnDateCalcOutputAreaSerialized { 
   

								@Getter @Setter private int cmnDateCalcReturnCode;
				@Getter @Setter private CmnDateCalcCalculations cmnDateCalcCalculations = new CmnDateCalcCalculations();
	
	/**
	* Constructor for CmnDateCalcOutputArea
	**/
    public CmnDateCalcOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcCalculations().setParent(this,getStartOffset() + 2);
    } 



}
  
