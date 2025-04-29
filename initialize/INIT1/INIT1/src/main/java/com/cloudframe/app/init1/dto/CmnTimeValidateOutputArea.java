package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidateOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeValidateOutputArea extends CmnTimeValidateOutputAreaSerialized { 
   

								@Getter @Setter private int cmnTimeValidReturnCode;

						@Getter @Setter private char[] cmnTimeValidIso = Field.fillLowValue(8);

								@Getter @Setter private long cmnTimeValidNumeric;
	
	/**
	* Constructor for CmnTimeValidateOutputArea
	**/
    public CmnTimeValidateOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeValidateOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidateOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
