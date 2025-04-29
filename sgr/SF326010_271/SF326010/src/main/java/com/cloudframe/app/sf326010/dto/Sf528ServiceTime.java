package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf528ServiceTime extends Sf528ServiceTimeSerialized { 
   

						@Getter @Setter private char[] sf528ServiceHr = Field.fillLowValue(2);

						@Getter @Setter private char[] sf528ServiceMn = Field.fillLowValue(2);

						@Getter @Setter private char[] sf528ServiceSc = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf528ServiceTime
	**/
    public Sf528ServiceTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf528ServiceTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
