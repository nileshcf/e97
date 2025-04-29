package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DderefDepnNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DderefDepnNbrGroup extends DderefDepnNbrGroupSerialized { 
   

						@Getter @Setter private char[] dderefDepnNbr = Field.fillLowValue(2);
	
	/**
	* Constructor for DderefDepnNbrGroup
	**/
    public DderefDepnNbrGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DderefDepnNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefDepnNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
