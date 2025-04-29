package com.cloudframe.app.d5427dt1.dto;

/**
*  The class TimeXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TimeXGroup extends TimeXGroupSerialized {
   

						@Getter @Setter private char[] timeX = Field.fillLowValue(6);

								@Getter @Setter private long time9;
	
	/**
	* Constructor for TimeXGroup
	**/
    public TimeXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
