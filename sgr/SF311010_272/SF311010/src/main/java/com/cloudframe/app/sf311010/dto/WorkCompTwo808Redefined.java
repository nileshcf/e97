package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkCompTwo808Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkCompTwo808Redefined extends WorkCompTwo808RedefinedSerialized { 
   

						@Getter @Setter private char[] workCompOneByte808 = Field.fillLowValue(1);
	
	/**
	* Constructor for WorkCompTwo808Redefined
	**/
    public WorkCompTwo808Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WorkCompTwo808Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkCompTwo808Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
