package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgStartDtIsoRedefined extends ChgStartDtIsoRedefinedSerialized { 
   

								@Getter @Setter private int chgStartYy;

								@Getter @Setter private int chgStartMm;

								@Getter @Setter private int chgStartDd;
	
	/**
	* Constructor for ChgStartDtIsoRedefined
	**/
    public ChgStartDtIsoRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgStartDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
