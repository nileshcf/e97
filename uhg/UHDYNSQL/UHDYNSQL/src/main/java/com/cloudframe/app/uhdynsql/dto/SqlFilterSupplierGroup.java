package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilterSupplierGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqlFilterSupplierGroup extends SqlFilterSupplierGroupSerialized { 
   

						@Getter @Setter private char[] sqlFilterSupplier = Field.fillLowValue(8);
	
	/**
	* Constructor for SqlFilterSupplierGroup
	**/
    public SqlFilterSupplierGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SqlFilterSupplierGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterSupplierGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
