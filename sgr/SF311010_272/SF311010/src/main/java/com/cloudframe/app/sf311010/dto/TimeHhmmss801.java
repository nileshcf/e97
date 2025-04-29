package com.cloudframe.app.sf311010.dto;

/**
*  The class TimeHhmmss801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TimeHhmmss801 extends TimeHhmmss801Serialized {
   

						@Getter @Setter private char[] timeHh801 = new char[2];

						@Getter @Setter private char[] timeMm801 = new char[2];

						@Getter @Setter private char[] timeSs801 = new char[2];

	
	/**
	* Constructor for TimeHhmmss801
	**/
    public TimeHhmmss801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimeHh801(("00").toCharArray());
								setTimeMm801(("00").toCharArray());
								setTimeSs801(("00").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 6
             ,2
             );
    }





}
  
