package com.cloudframe.app.sf305120.dto;

/**
*  The class RhInt16810Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RhInt16810Redefined extends RhInt16810RedefinedSerialized { 
   

						@Getter @Setter private char[] rhInt8810 = Field.fillLowValue(1);
	
	/**
	* Constructor for RhInt16810Redefined
	**/
    public RhInt16810Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RhInt16810Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RhInt16810Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
