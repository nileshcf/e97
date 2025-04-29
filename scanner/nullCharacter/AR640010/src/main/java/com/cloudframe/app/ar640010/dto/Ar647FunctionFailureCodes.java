package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647FunctionFailureCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ar647FunctionFailureCodes extends Ar647FunctionFailureCodesSerialized { 
   

								@Getter @Setter private int ar647FunctionReturnCd;

								@Getter @Setter private int ar647FunctionReasonCd;

								@Getter @Setter private int ar647FunctionAbendCd;
	
	/**
	* Constructor for Ar647FunctionFailureCodes
	**/
    public Ar647FunctionFailureCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ar647FunctionFailureCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar647FunctionFailureCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr647FunctionReturnCd(0);
								setAr647FunctionReasonCd(0);
								setAr647FunctionAbendCd(0);
    } 



}
  
