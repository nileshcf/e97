package com.cloudframe.app.usbaeext.dto;

/**
*  The class WaCurrentDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WaCurrentDateGroup extends WaCurrentDateGroupSerialized {
   

						@Getter @Setter private char[] waCurrentDate = new char[21];
					@Getter @Setter private WaCurrentDateRedefined waCurrentDateRedefined = new WaCurrentDateRedefined();
	
	/**
	* Constructor for WaCurrentDateGroup
	**/
    public WaCurrentDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWaCurrentDateRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWaCurrentDate(fillSpace(21));
    }





}
  
