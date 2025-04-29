package com.cloudframe.app.callfd01.dto;

/**
*  The class ParmData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ParmData extends ParmDataSerialized {
   

						@Getter @Setter private char[] parmMarker = Field.fillLowValue(8);
	
	/**
	* Constructor for ParmData
	**/
    public ParmData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
