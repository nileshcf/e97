package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTableData01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IsinTableData01 extends IsinTableData01Serialized { 
   

						@Getter @Setter private char[] isinDeleted = Field.fillLowValue(12);
	
	/**
	* Constructor for IsinTableData01
	**/
    public IsinTableData01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IsinTableData01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTableData01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
