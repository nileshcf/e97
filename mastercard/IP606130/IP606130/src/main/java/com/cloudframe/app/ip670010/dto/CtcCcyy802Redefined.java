package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy802Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CtcCcyy802Redefined extends CtcCcyy802RedefinedSerialized { 
   

								@Getter @Setter private int ctcCc802;

						@Getter @Setter private char[] ctcCcx802 = Field.fillLowValue(2);
	
	/**
	* Constructor for CtcCcyy802Redefined
	**/
    public CtcCcyy802Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CtcCcyy802Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcCcyy802Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
