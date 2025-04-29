package com.cloudframe.app.sf311010.dto;

/**
*  The class BkntData110860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BkntData110860 extends BkntData110860Serialized { 
   

						@Getter @Setter private char[] finNetwork110860 = Field.fillLowValue(3);
	
	/**
	* Constructor for BkntData110860
	**/
    public BkntData110860() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BkntData110860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData110860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
