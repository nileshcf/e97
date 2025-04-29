package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardInstId860Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ForwardInstId860Redefined extends ForwardInstId860RedefinedSerialized { 
   

								@Getter @Setter private long forwardInstIdOnly860;
	
	/**
	* Constructor for ForwardInstId860Redefined
	**/
    public ForwardInstId860Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ForwardInstId860Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardInstId860Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
