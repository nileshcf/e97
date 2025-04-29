package com.cloudframe.app.ip200090.dto;

/**
*  The class EditNumR800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EditNumR800 extends EditNumR800Serialized { 
   

								@Getter @Setter private int editValue800;
	
	/**
	* Constructor for EditNumR800
	**/
    public EditNumR800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EditNumR800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditNumR800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
