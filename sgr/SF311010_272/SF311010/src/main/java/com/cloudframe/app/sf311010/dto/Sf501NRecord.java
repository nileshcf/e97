package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501NRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501NRecord extends Sf501NRecordSerialized { 
   

						@Getter @Setter private char[] sf501NData = Field.fillLowValue(7921);
	
	/**
	* Constructor for Sf501NRecord
	**/
    public Sf501NRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501NRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501NRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
