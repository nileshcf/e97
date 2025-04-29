package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503ChkLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503ChkLogArea extends Sf503ChkLogAreaSerialized { 
   

	
	/**
	* Constructor for Sf503ChkLogArea
	**/
    public Sf503ChkLogArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503ChkLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503ChkLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
