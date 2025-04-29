package com.cloudframe.app.db2func.dto;

/**
*  The class DateFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DateFields extends DateFieldsSerialized {
   

						@Getter @Setter private char[] currentDate = Field.fillLowValue(10);

						@Getter @Setter private char[] mthsAgoDate18 = Field.fillLowValue(10);

						@Getter @Setter private char[] lastDayDt = Field.fillLowValue(10);
	
	/**
	* Constructor for DateFields
	**/
    public DateFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
