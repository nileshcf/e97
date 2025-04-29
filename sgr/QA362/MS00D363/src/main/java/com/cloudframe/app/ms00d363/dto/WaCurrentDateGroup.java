package com.cloudframe.app.ms00d363.dto;

/**
*  The class WaCurrentDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaCurrentDateGroup extends WaCurrentDateGroupSerialized {
   

						@Getter @Setter private char[] waCurrentDate = Field.fillLowValue(6);
					@Getter @Setter private WaCurrentDateRedefined waCurrentDateRedefined = new WaCurrentDateRedefined();
	
	/**
	* Constructor for WaCurrentDateGroup
	**/
    public WaCurrentDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWaCurrentDateRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
