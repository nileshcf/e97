package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxEditInfoEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SyntaxEditInfoEntry500 extends SyntaxEditInfoEntry500Serialized { 
   

						@Getter @Setter private char[] isFieldShouldPresent500 = Field.fillLowValue(1);

						@Getter @Setter private char[] additionalSyntaxChkInd500 = Field.fillLowValue(1);

								@Getter @Setter private int editModuleIndex500;
	
	/**
	* Constructor for SyntaxEditInfoEntry500
	**/
    public SyntaxEditInfoEntry500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SyntaxEditInfoEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxEditInfoEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
