package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360ASurchrgFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360ASurchrgFields extends X360ASurchrgFieldsSerialized { 
   

								@Getter @Setter private int x360ASurchrgFreeCnt;
	
	/**
	* Constructor for X360ASurchrgFields
	**/
    public X360ASurchrgFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360ASurchrgFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360ASurchrgFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
