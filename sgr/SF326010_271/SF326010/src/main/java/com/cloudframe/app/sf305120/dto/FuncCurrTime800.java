package com.cloudframe.app.sf305120.dto;

/**
*  The class FuncCurrTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FuncCurrTime800 extends FuncCurrTime800Serialized { 
   

						@Getter @Setter private char[] currTimeHh800 = new char[2];

						@Getter @Setter private char[] currTimeMm800 = new char[2];

						@Getter @Setter private char[] currTimeSs800 = new char[2];
	
	/**
	* Constructor for FuncCurrTime800
	**/
    public FuncCurrTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FuncCurrTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrTimeHh800(fillSpace(2));
								setCurrTimeMm800(fillSpace(2));
								setCurrTimeSs800(fillSpace(2));
    } 



}
  
