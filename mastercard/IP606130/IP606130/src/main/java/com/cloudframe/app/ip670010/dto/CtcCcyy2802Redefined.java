package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy2802Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CtcCcyy2802Redefined extends CtcCcyy2802RedefinedSerialized { 
   

								@Getter @Setter private int ctcCc2802;

						@Getter @Setter private char[] ctcCcx2802 = Field.fillLowValue(2);
	
	/**
	* Constructor for CtcCcyy2802Redefined
	**/
    public CtcCcyy2802Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CtcCcyy2802Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcCcyy2802Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
