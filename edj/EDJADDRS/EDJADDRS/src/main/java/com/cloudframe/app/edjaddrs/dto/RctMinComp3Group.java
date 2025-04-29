package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RctMinComp3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RctMinComp3Group extends RctMinComp3GroupSerialized { 
   

								@Getter @Setter private long rctMinComp3;
	
	/**
	* Constructor for RctMinComp3Group
	**/
    public RctMinComp3Group() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RctMinComp3Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctMinComp3Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
