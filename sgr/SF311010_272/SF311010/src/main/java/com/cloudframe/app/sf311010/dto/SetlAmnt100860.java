package com.cloudframe.app.sf311010.dto;

/**
*  The class SetlAmnt100860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class SetlAmnt100860 extends SetlAmnt100860Serialized { 
   

								@Getter @Setter private BigDecimal setlAmt100d860 = BigDecimal.ZERO;
	
	/**
	* Constructor for SetlAmnt100860
	**/
    public SetlAmnt100860() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SetlAmnt100860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SetlAmnt100860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
