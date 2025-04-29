package com.cloudframe.app.sf311010.dto;

/**
*  The class BkntData860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BkntData860 extends BkntData860Serialized { 
   

						@Getter @Setter private char[] finNetworkCode860 = Field.fillLowValue(3);
	
	/**
	* Constructor for BkntData860
	**/
    public BkntData860() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BkntData860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
