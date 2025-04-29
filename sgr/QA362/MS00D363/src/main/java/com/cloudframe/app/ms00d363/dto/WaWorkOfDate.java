package com.cloudframe.app.ms00d363.dto;

/**
*  The class WaWorkOfDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WaWorkOfDate extends WaWorkOfDateSerialized {
   

								@Getter @Setter private int waWodYy;

								@Getter @Setter private int waWodMm;

								@Getter @Setter private int waWodDd;
	
	/**
	* Constructor for WaWorkOfDate
	**/
    public WaWorkOfDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
