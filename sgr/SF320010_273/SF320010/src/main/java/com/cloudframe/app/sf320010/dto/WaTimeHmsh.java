package com.cloudframe.app.sf320010.dto;

/**
*  The class WaTimeHmsh is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaTimeHmsh extends WaTimeHmshSerialized {
   

						@Getter @Setter private char[] waTimeHh = Field.fillLowValue(2);

						@Getter @Setter private char[] waTimeMm = Field.fillLowValue(2);

						@Getter @Setter private char[] waTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for WaTimeHmsh
	**/
    public WaTimeHmsh() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
