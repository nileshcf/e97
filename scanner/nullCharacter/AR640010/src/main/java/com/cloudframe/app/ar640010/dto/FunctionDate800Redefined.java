package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionDate800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FunctionDate800Redefined extends FunctionDate800RedefinedSerialized { 
   

								@Getter @Setter private int functionYear800;

								@Getter @Setter private int functionMonth800;

								@Getter @Setter private int functionDay800;
	
	/**
	* Constructor for FunctionDate800Redefined
	**/
    public FunctionDate800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FunctionDate800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionDate800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
