package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DderefLnIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DderefLnIdGroup extends DderefLnIdGroupSerialized { 
   

								@Getter @Setter private short dderefLnId;
	
	/**
	* Constructor for DderefLnIdGroup
	**/
    public DderefLnIdGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DderefLnIdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefLnIdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
