package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcEndYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcEndYyyy extends CmnDateCalcEndYyyySerialized { 
   

								@Getter @Setter private int cmnDateCalcEndCc;

								@Getter @Setter private int cmnDateCalcEndYy;
	
	/**
	* Constructor for CmnDateCalcEndYyyy
	**/
    public CmnDateCalcEndYyyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcEndYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
