package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIso3Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgStartDtIso3Redefined extends ChgStartDtIso3RedefinedSerialized { 
   

								@Getter @Setter private int chgStartYy3;

								@Getter @Setter private int chgStartMm3;

								@Getter @Setter private int chgStartDd3;
	
	/**
	* Constructor for ChgStartDtIso3Redefined
	**/
    public ChgStartDtIso3Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgStartDtIso3Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso3Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
