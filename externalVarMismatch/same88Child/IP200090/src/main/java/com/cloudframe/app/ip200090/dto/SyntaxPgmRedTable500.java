package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmRedTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class SyntaxPgmRedTable500 extends SyntaxPgmRedTable500Serialized { 
   
			@Getter @Setter private List<SyntaxPgmTableEntry500> syntaxPgmTableEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for SyntaxPgmRedTable500
	**/
    public SyntaxPgmRedTable500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SyntaxPgmRedTable500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmRedTable500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
