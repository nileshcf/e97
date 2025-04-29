package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501HdrDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501HdrDate extends Sf501HdrDateSerialized { 
   

						@Getter @Setter private char[] sf501HdrMon = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501HdrDay = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501HdrYear = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf501HdrDate
	**/
    public Sf501HdrDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501HdrDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
