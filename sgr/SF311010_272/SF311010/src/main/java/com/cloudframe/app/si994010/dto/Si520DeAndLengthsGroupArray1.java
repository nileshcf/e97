package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsGroupArray1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Si520DeAndLengthsGroupArray1 extends Si520DeAndLengthsGroupArray1Serialized { 
   

						@Getter @Setter private char[] si520TblFomat = Field.fillLowValue(1);

								@Getter @Setter private short si520TblLength;
	
	/**
	* Constructor for Si520DeAndLengthsGroupArray1
	**/
    public Si520DeAndLengthsGroupArray1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Si520DeAndLengthsGroupArray1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsGroupArray1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
