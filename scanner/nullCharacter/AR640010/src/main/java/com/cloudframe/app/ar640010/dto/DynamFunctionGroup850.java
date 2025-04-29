package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamFunctionGroup850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DynamFunctionGroup850 extends DynamFunctionGroup850Serialized { 
   

						@Getter @Setter private char[] dynamFunction850 = new char[8];
	
	/**
	* Constructor for DynamFunctionGroup850
	**/
    public DynamFunctionGroup850() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DynamFunctionGroup850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamFunctionGroup850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDynamFunction850(fillSpace(8));
    } 



}
  
