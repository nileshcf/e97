package com.cloudframe.app.sf311010.dto;

/**
*  The class DateYymmdd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DateYymmdd800 extends DateYymmdd800Serialized {
   

						@Getter @Setter private char[] dateYy800 = Field.fillLowValue(2);

						@Getter @Setter private char[] dateMm800 = Field.fillLowValue(2);

						@Getter @Setter private char[] dateDd800 = Field.fillLowValue(2);
	
	/**
	* Constructor for DateYymmdd800
	**/
    public DateYymmdd800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
