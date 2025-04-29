package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf5019Record is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf5019Record extends Sf5019RecordSerialized { 
   

						@Getter @Setter private char[] sf5019Data = Field.fillLowValue(7997);

						@Getter @Setter private char[] sf5019DataRedefined01 = Field.fillLowValue(7997);

						@Getter @Setter private char[] sf5019DataRedefined02 = Field.fillLowValue(7997);

						@Getter @Setter private char[] sf5019DataRedefined = Field.fillLowValue(7997);
	
	/**
	* Constructor for Sf5019Record
	**/
    public Sf5019Record() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf5019Record. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf5019Record(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
