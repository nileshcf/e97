package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf528ServiceDate extends Sf528ServiceDateSerialized { 
   

						@Getter @Setter private char[] sf528ServiceCc = Field.fillLowValue(2);

						@Getter @Setter private char[] sf528ServiceYy = Field.fillLowValue(2);

						@Getter @Setter private char[] sf528ServiceMm = Field.fillLowValue(2);

						@Getter @Setter private char[] sf528ServiceDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf528ServiceDate
	**/
    public Sf528ServiceDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf528ServiceDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
