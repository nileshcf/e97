package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlatdDtl extends RlatdDtlSerialized { 
   

						@Getter @Setter private char[] rlatdFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for RlatdDtl
	**/
    public RlatdDtl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlatdDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
