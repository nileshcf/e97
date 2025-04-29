package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateConvertedFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateConvertedFormats extends CmnDateConvertedFormatsSerialized { 
   

								@Getter @Setter private long cmnDateConvJulian;

						@Getter @Setter private char[] cmnDateConvIbmUsaStd = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateConvLitShort = Field.fillLowValue(12);

						@Getter @Setter private char[] cmnDateConvLitLong = Field.fillLowValue(18);
	
	/**
	* Constructor for CmnDateConvertedFormats
	**/
    public CmnDateConvertedFormats() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateConvertedFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvertedFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
