package com.cloudframe.app.ms00d363.dto;

/**
*  The class ProductKeyEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ProductKeyEntry extends ProductKeyEntrySerialized { 
   

						@Getter @Setter private char[] tblKeyProd = Field.fillLowValue(3);

						@Getter @Setter private char[] tblKeyDesc = Field.fillLowValue(25);
	
	/**
	* Constructor for ProductKeyEntry
	**/
    public ProductKeyEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ProductKeyEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProductKeyEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
