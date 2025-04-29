package com.cloudframe.app.ip989010.dto;

/**
*  The class NewElemData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class NewElemData800 extends NewElemData800Serialized { 
   

								@Getter @Setter private int newElemLen800;

						@Getter @Setter private char[] newElemValue800 = Field.fillLowValue(999);
	
	/**
	* Constructor for NewElemData800
	**/
    public NewElemData800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for NewElemData800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public NewElemData800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
