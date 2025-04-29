package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmTableEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SyntaxPgmTableEntry500 extends SyntaxPgmTableEntry500Serialized { 
   

						@Getter @Setter private char[] syntaxPgmPtr500 = Field.fillLowValue(8);
	
	/**
	* Constructor for SyntaxPgmTableEntry500
	**/
    public SyntaxPgmTableEntry500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SyntaxPgmTableEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmTableEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
