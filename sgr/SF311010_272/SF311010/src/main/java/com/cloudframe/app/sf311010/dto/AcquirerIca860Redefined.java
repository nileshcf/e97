package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIca860Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AcquirerIca860Redefined extends AcquirerIca860RedefinedSerialized { 
   

								@Getter @Setter private long acquirerIcaOnly860;
	
	/**
	* Constructor for AcquirerIca860Redefined
	**/
    public AcquirerIca860Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcquirerIca860Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIca860Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
