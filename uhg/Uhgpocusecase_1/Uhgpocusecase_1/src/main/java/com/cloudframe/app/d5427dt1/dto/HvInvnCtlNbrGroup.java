package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvInvnCtlNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvInvnCtlNbrGroup extends HvInvnCtlNbrGroupSerialized { 
   

						@Getter @Setter private char[] hvInvnCtlNbr = new char[10];
	
	/**
	* Constructor for HvInvnCtlNbrGroup
	**/
    public HvInvnCtlNbrGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvInvnCtlNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvInvnCtlNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvInvnCtlNbr(("0000000000").toCharArray());
    } 



}
  
