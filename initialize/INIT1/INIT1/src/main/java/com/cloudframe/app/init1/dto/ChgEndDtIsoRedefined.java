package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgEndDtIsoRedefined extends ChgEndDtIsoRedefinedSerialized { 
   

								@Getter @Setter private int chgEndYy;

								@Getter @Setter private int chgEndMm;

								@Getter @Setter private int chgEndDd;
	
	/**
	* Constructor for ChgEndDtIsoRedefined
	**/
    public ChgEndDtIsoRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgEndDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
