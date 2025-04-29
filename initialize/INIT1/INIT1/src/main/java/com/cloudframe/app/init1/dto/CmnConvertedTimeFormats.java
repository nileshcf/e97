package com.cloudframe.app.init1.dto;

/**
*  The class CmnConvertedTimeFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnConvertedTimeFormats extends CmnConvertedTimeFormatsSerialized { 
   

								@Getter @Setter private long cmnConvNumTime;

						@Getter @Setter private char[] cmnConvAmPmTime = Field.fillLowValue(7);

						@Getter @Setter private char[] cmnConvJisTime = Field.fillLowValue(8);

						@Getter @Setter private char[] cmnConvIsoTime = Field.fillLowValue(8);
	
	/**
	* Constructor for CmnConvertedTimeFormats
	**/
    public CmnConvertedTimeFormats() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnConvertedTimeFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnConvertedTimeFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
