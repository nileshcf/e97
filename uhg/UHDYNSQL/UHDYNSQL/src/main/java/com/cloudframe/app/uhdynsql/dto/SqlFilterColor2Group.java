package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterColor2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqlFilterColor2Group extends SqlFilterColor2GroupSerialized { 
   

						@Getter @Setter private char[] sqlFilterColor2 = Field.fillLowValue(6);
	
	/**
	* Constructor for SqlFilterColor2Group
	**/
    public SqlFilterColor2Group() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SqlFilterColor2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
