package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvAuthNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvAuthNbrGroup extends HvAuthNbrGroupSerialized { 
   

						@Getter @Setter private char[] hvAuthNbr = new char[10];
	
	/**
	* Constructor for HvAuthNbrGroup
	**/
    public HvAuthNbrGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvAuthNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvAuthNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvAuthNbr(fillSpace(10));
    } 



}
  
