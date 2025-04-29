package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcStartYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcStartYyyy extends CmnDateCalcStartYyyySerialized { 
   

								@Getter @Setter private int cmnDateCalcStartCc;

								@Getter @Setter private int cmnDateCalcStartYy;
	
	/**
	* Constructor for CmnDateCalcStartYyyy
	**/
    public CmnDateCalcStartYyyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcStartYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
