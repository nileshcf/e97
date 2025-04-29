package com.cloudframe.app.search2.dto;

/**
*  The class CodeCtrl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CodeCtrl extends CodeCtrlSerialized { 
   

								@Getter @Setter private long codeValue;

								@Getter @Setter private int codeToggle;

								@Getter @Setter private long codeMarker;
	
	/**
	* Constructor for CodeCtrl
	**/
    public CodeCtrl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CodeCtrl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CodeCtrl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
