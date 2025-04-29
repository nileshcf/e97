package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConv800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BiaDataConv800Redefined extends BiaDataConv800RedefinedSerialized { 
   

								@Getter @Setter private int convData800;
	
	/**
	* Constructor for BiaDataConv800Redefined
	**/
    public BiaDataConv800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiaDataConv800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
