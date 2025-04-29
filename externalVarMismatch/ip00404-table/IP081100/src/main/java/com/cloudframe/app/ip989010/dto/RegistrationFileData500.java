package com.cloudframe.app.ip989010.dto;

/**
*  The class RegistrationFileData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RegistrationFileData500 extends RegistrationFileData500Serialized { 
   

						@Getter @Setter private char[] panAlias500 = Field.fillLowValue(36);
	
	/**
	* Constructor for RegistrationFileData500
	**/
    public RegistrationFileData500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RegistrationFileData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RegistrationFileData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
