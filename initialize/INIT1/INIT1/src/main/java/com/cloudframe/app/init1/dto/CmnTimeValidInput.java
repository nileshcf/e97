package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeValidInput extends CmnTimeValidInputSerialized { 
   

						@Getter @Setter private char[] cmnTimeValidHh = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnTimeValidSep1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnTimeValidMm = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnTimeValidSep2 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnTimeValidSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnTimeValidInput
	**/
    public CmnTimeValidInput() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeValidInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
