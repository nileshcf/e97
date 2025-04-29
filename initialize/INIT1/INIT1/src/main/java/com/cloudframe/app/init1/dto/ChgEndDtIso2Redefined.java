package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIso2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgEndDtIso2Redefined extends ChgEndDtIso2RedefinedSerialized { 
   

								@Getter @Setter private int chgEndYy2;

								@Getter @Setter private int chgEndMm2;

								@Getter @Setter private int chgEndDd2;
	
	/**
	* Constructor for ChgEndDtIso2Redefined
	**/
    public ChgEndDtIso2Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgEndDtIso2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
