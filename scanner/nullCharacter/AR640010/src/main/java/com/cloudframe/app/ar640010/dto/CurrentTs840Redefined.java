package com.cloudframe.app.ar640010.dto;

/**
*  The class CurrentTs840Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentTs840Redefined extends CurrentTs840RedefinedSerialized { 
   

						@Getter @Setter private char[] currentYear840 = Field.fillLowValue(4);

						@Getter @Setter private char[] currentMonth840 = Field.fillLowValue(2);

						@Getter @Setter private char[] currentDay840 = Field.fillLowValue(2);

						@Getter @Setter private char[] currentHour840 = Field.fillLowValue(2);

						@Getter @Setter private char[] currentMinute840 = Field.fillLowValue(2);

						@Getter @Setter private char[] currentSecond840 = Field.fillLowValue(2);
	
	/**
	* Constructor for CurrentTs840Redefined
	**/
    public CurrentTs840Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentTs840Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentTs840Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
