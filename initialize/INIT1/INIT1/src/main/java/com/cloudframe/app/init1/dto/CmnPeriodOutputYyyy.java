package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPeriodOutputYyyy extends CmnPeriodOutputYyyySerialized { 
   

								@Getter @Setter private int cmnPeriodOutputYy1;

								@Getter @Setter private int cmnPeriodOutputYy2;
	
	/**
	* Constructor for CmnPeriodOutputYyyy
	**/
    public CmnPeriodOutputYyyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPeriodOutputYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
