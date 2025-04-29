package com.cloudframe.app.d5427dt1.dto;

/**
*  The class SqllenRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqllenRedefined extends SqllenRedefinedSerialized { 
   

						@Getter @Setter private char[] sqlscale = Field.fillLowValue(1);
	
	/**
	* Constructor for SqllenRedefined
	**/
    public SqllenRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SqllenRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqllenRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
