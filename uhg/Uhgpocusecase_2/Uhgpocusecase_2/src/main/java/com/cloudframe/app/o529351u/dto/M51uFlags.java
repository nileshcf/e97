package com.cloudframe.app.o529351u.dto;

/**
*  The class M51uFlags is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class M51uFlags extends M51uFlagsSerialized { 
   

						@Getter @Setter private char[] m51uFunctionFlag = Field.fillLowValue(2);

						@Getter @Setter private char[] m51uIllogicalCondSw = Field.fillLowValue(1);
	
	/**
	* Constructor for M51uFlags
	**/
    public M51uFlags() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for M51uFlags. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uFlags(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
