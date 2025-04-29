package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642FunctionFailureCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ar642FunctionFailureCodes extends Ar642FunctionFailureCodesSerialized { 
   

								@Getter @Setter private int ar642FunctionReturnCd;

								@Getter @Setter private int ar642FunctionReasonCd;

								@Getter @Setter private int ar642FunctionAbendCd;
	
	/**
	* Constructor for Ar642FunctionFailureCodes
	**/
    public Ar642FunctionFailureCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ar642FunctionFailureCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar642FunctionFailureCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr642FunctionReturnCd(0);
								setAr642FunctionReasonCd(0);
								setAr642FunctionAbendCd(0);
    } 



}
  
