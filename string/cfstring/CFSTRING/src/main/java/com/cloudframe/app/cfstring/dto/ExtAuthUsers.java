package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtAuthUsers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtAuthUsers extends ExtAuthUsersSerialized { 
   

						@Getter @Setter private char[] extAuthUsrLname = Field.fillLowValue(25);

						@Getter @Setter private char[] extAuthUsrFname = Field.fillLowValue(20);
	
	/**
	* Constructor for ExtAuthUsers
	**/
    public ExtAuthUsers() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtAuthUsers. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtAuthUsers(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
