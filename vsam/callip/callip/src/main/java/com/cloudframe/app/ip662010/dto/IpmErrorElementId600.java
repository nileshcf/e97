package com.cloudframe.app.ip662010.dto;

/**
*  The class IpmErrorElementId600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IpmErrorElementId600 extends IpmErrorElementId600Serialized { 
   

						@Getter @Setter private char[] ipmErrorElementType600 = Field.fillLowValue(1);

								@Getter @Setter private int ipmErrorElementNo600;
	
	/**
	* Constructor for IpmErrorElementId600
	**/
    public IpmErrorElementId600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IpmErrorElementId600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpmErrorElementId600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
