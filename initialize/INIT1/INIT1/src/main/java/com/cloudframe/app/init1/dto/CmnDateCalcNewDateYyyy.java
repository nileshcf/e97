package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcNewDateYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcNewDateYyyy extends CmnDateCalcNewDateYyyySerialized { 
   

								@Getter @Setter private int cmnDateCalcNewDateCc;

								@Getter @Setter private int cmnDateCalcNewDateYy;
	
	/**
	* Constructor for CmnDateCalcNewDateYyyy
	**/
    public CmnDateCalcNewDateYyyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcNewDateYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
