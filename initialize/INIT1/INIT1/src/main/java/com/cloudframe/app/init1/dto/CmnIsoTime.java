package com.cloudframe.app.init1.dto;

/**
*  The class CmnIsoTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnIsoTime extends CmnIsoTimeSerialized { 
   

						@Getter @Setter private char[] cmnIsoTimeHh = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnIsoTimeSep1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnIsoTimeMm = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnIsoTimeSep101 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnIsoTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnIsoTime
	**/
    public CmnIsoTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnIsoTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnIsoTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
