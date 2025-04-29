package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FSurchrgFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360FSurchrgFields extends X360FSurchrgFieldsSerialized { 
   

								@Getter @Setter private int x360FSurchrgFreeCnt;
	
	/**
	* Constructor for X360FSurchrgFields
	**/
    public X360FSurchrgFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FSurchrgFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FSurchrgFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
