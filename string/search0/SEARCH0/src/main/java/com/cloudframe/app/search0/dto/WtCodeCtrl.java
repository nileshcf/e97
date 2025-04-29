package com.cloudframe.app.search0.dto;

/**
*  The class WtCodeCtrl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WtCodeCtrl extends WtCodeCtrlSerialized { 
   

						@Getter @Setter private char[] codeValue = Field.fillLowValue(3);

						@Getter @Setter private char[] codeDesc = Field.fillLowValue(3);
	
	/**
	* Constructor for WtCodeCtrl
	**/
    public WtCodeCtrl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WtCodeCtrl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtCodeCtrl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
