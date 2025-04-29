package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DderefEeIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DderefEeIdGroup extends DderefEeIdGroupSerialized { 
   

						@Getter @Setter private char[] dderefEeId = Field.fillLowValue(10);
	
	/**
	* Constructor for DderefEeIdGroup
	**/
    public DderefEeIdGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DderefEeIdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefEeIdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
