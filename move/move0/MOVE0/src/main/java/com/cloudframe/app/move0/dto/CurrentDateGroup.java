package com.cloudframe.app.move0.dto;

/**
*  The class CurrentDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentDateGroup extends CurrentDateGroupSerialized {
   
					@Getter @Setter private CurrentDate currentDate = new CurrentDate();

						@Getter @Setter private char[] runDate = Field.fillLowValue(10);
	
	/**
	* Constructor for CurrentDateGroup
	**/
    public CurrentDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCurrentDate().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
