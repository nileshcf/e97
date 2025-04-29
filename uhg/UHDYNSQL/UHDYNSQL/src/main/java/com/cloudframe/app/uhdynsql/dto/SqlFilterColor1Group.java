package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterColor1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqlFilterColor1Group extends SqlFilterColor1GroupSerialized { 
   

						@Getter @Setter private char[] sqlFilterColor1 = Field.fillLowValue(6);
	
	/**
	* Constructor for SqlFilterColor1Group
	**/
    public SqlFilterColor1Group() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SqlFilterColor1Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor1Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
