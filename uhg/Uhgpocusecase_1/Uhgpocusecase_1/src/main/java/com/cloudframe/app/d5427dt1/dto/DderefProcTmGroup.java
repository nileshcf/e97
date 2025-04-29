package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DderefProcTmGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DderefProcTmGroup extends DderefProcTmGroupSerialized { 
   

						@Getter @Setter private char[] dderefProcTm = Field.fillLowValue(8);
	
	/**
	* Constructor for DderefProcTmGroup
	**/
    public DderefProcTmGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DderefProcTmGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefProcTmGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
