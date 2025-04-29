package com.cloudframe.app.init1.dto;

/**
*  The class ChgDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgDtIsoRedefined extends ChgDtIsoRedefinedSerialized { 
   

								@Getter @Setter private int chgYy;

								@Getter @Setter private int chgMm;

								@Getter @Setter private int chgDd;
	
	/**
	* Constructor for ChgDtIsoRedefined
	**/
    public ChgDtIsoRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
