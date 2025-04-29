package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1FirstName is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Vchar1FirstName extends Vchar1FirstNameSerialized { 
   

								@Getter @Setter private short vchar1FirstNameLen;

						@Getter @Setter private char[] vchar1FirstNameData = Field.fillLowValue(15);
	
	/**
	* Constructor for Vchar1FirstName
	**/
    public Vchar1FirstName() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Vchar1FirstName. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1FirstName(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
