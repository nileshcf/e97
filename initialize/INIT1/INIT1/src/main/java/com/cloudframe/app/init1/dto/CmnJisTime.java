package com.cloudframe.app.init1.dto;

/**
*  The class CmnJisTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnJisTime extends CmnJisTimeSerialized { 
   

						@Getter @Setter private char[] cmnJisTimeHh = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnJisTimeSep1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnJisTimeMm = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnJisTimeSep101 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnJisTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnJisTime
	**/
    public CmnJisTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnJisTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnJisTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
