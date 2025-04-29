package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcInputArea extends CmnDateCalcInputAreaSerialized { 
   
				@Getter @Setter private CmnDateCalcInputDateArea cmnDateCalcInputDateArea = new CmnDateCalcInputDateArea();
	
	/**
	* Constructor for CmnDateCalcInputArea
	**/
    public CmnDateCalcInputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcInputDateArea().setParent(this,getStartOffset() + 5);
    } 



}
  
