package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIso2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgStartDtIso2Redefined extends ChgStartDtIso2RedefinedSerialized { 
   

								@Getter @Setter private int chgStartYy2;

								@Getter @Setter private int chgStartMm2;

								@Getter @Setter private int chgStartDd2;
	
	/**
	* Constructor for ChgStartDtIso2Redefined
	**/
    public ChgStartDtIso2Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgStartDtIso2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
