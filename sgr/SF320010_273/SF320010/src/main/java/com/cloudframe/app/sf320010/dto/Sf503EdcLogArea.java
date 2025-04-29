package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503EdcLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503EdcLogArea extends Sf503EdcLogAreaSerialized { 
   

	
	/**
	* Constructor for Sf503EdcLogArea
	**/
    public Sf503EdcLogArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503EdcLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503EdcLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
