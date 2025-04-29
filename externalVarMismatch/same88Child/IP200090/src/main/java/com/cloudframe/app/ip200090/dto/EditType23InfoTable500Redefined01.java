package com.cloudframe.app.ip200090.dto;

/**
*  The class EditType23InfoTable500Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class EditType23InfoTable500Redefined01 extends EditType23InfoTable500Redefined01Serialized { 
   
			@Getter @Setter private List<SyntaxEditInfoEntry500> syntaxEditInfoEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for EditType23InfoTable500Redefined01
	**/
    public EditType23InfoTable500Redefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EditType23InfoTable500Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditType23InfoTable500Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
