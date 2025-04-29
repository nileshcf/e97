package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvFlnSrlNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvFlnSrlNbrGroup extends HvFlnSrlNbrGroupSerialized { 
   

						@Getter @Setter private char[] hvFlnSrlNbr = new char[5];
	
	/**
	* Constructor for HvFlnSrlNbrGroup
	**/
    public HvFlnSrlNbrGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvFlnSrlNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFlnSrlNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvFlnSrlNbr(("00000").toCharArray());
    } 



}
  
