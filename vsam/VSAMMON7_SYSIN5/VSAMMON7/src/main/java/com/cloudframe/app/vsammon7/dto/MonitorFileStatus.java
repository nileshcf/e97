package com.cloudframe.app.vsammon7.dto;

/**
*  The class MonitorFileStatus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MonitorFileStatus extends MonitorFileStatusSerialized {
   

						@Getter @Setter private char[] staInStat1 = Field.fillLowValue(1);
	
	/**
	* Constructor for MonitorFileStatus
	**/
    public MonitorFileStatus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
