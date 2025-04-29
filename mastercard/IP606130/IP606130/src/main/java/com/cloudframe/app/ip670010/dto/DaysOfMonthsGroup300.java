package com.cloudframe.app.ip670010.dto;

/**
*  The class DaysOfMonthsGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DaysOfMonthsGroup300 extends DaysOfMonthsGroup300Serialized {
   

						@Getter @Setter private char[] daysOfMonths300 = new char[24];
					@Getter @Setter private MaxDaysOfMonth300 maxDaysOfMonth300 = new MaxDaysOfMonth300();
	
	/**
	* Constructor for DaysOfMonthsGroup300
	**/
    public DaysOfMonthsGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMaxDaysOfMonth300().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setDaysOfMonths300(("312831303130313130313031").toCharArray());
    }





}
  
