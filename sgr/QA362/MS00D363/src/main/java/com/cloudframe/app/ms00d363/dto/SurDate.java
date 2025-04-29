package com.cloudframe.app.ms00d363.dto;

/**
*  The class SurDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SurDate extends SurDateSerialized {
   

						@Getter @Setter private char[] surDateCc = Field.fillLowValue(2);

						@Getter @Setter private char[] surDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] surDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] surDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for SurDate
	**/
    public SurDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
