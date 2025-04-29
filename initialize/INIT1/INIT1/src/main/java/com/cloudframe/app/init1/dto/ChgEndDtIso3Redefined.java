package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIso3Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ChgEndDtIso3Redefined extends ChgEndDtIso3RedefinedSerialized { 
   

								@Getter @Setter private int chgEndYy3;

								@Getter @Setter private int chgEndMm3;

								@Getter @Setter private int chgEndDd3;
	
	/**
	* Constructor for ChgEndDtIso3Redefined
	**/
    public ChgEndDtIso3Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ChgEndDtIso3Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso3Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
