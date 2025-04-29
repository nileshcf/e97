package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateIbmUsaStdIn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateIbmUsaStdIn extends CmnDateIbmUsaStdInSerialized { 
   

						@Getter @Setter private char[] cmnDateIbmUsaStdInMm = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnDateIbmUsaStdInSep1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnDateIbmUsaStdInDd = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnDateIbmUsaStdInSep101 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnDateIbmUsaStdInCcyy = Field.fillLowValue(4);
	
	/**
	* Constructor for CmnDateIbmUsaStdIn
	**/
    public CmnDateIbmUsaStdIn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateIbmUsaStdIn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateIbmUsaStdIn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
