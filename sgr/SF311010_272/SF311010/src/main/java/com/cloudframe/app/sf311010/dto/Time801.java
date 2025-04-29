package com.cloudframe.app.sf311010.dto;

/**
*  The class Time801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Time801 extends Time801Serialized {
   

						@Getter @Setter private char[] timeHours801 = new char[2];


						@Getter @Setter private char[] timeMinutes801 = new char[2];


						@Getter @Setter private char[] timeSeconds801 = new char[2];
	
	/**
	* Constructor for Time801
	**/
    public Time801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimeHours801(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setTimeMinutes801(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setTimeSeconds801(fillSpace(2));
    }





}
  
