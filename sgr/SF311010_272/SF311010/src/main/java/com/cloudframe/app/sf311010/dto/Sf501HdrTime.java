package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501HdrTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501HdrTime extends Sf501HdrTimeSerialized { 
   

						@Getter @Setter private char[] sf501HdrHour = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501HdrMin = Field.fillLowValue(1);

						@Getter @Setter private char[] sf501HdrSec = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf501HdrTime
	**/
    public Sf501HdrTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501HdrTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
