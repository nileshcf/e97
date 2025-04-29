package com.cloudframe.app.sf305120.dto;

/**
*  The class FuncCurrDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FuncCurrDate800 extends FuncCurrDate800Serialized { 
   

						@Getter @Setter private char[] currDateYyyy800 = new char[4];

						@Getter @Setter private char[] currDateMm800 = new char[2];

						@Getter @Setter private char[] currDateDd800 = new char[2];
	
	/**
	* Constructor for FuncCurrDate800
	**/
    public FuncCurrDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FuncCurrDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrDateYyyy800(fillSpace(4));
								setCurrDateMm800(fillSpace(2));
								setCurrDateDd800(fillSpace(2));
    } 



}
  
