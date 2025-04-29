package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DderefPolNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DderefPolNbrGroup extends DderefPolNbrGroupSerialized { 
   

						@Getter @Setter private char[] dderefPolNbr = Field.fillLowValue(6);
	
	/**
	* Constructor for DderefPolNbrGroup
	**/
    public DderefPolNbrGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DderefPolNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefPolNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
