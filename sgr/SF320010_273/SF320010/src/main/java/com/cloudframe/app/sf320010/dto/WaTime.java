package com.cloudframe.app.sf320010.dto;

/**
*  The class WaTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaTime extends WaTimeSerialized {
   

						@Getter @Setter private char[] waTimeHours = Field.fillLowValue(2);


						@Getter @Setter private char[] waTimeMinutes = Field.fillLowValue(2);


						@Getter @Setter private char[] waTimeSeconds = Field.fillLowValue(2);
	
	/**
	* Constructor for WaTime
	**/
    public WaTime() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    }





}
  
