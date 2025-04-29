package com.cloudframe.app.db2func.dto;

/**
*  The class Sdms01Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sdms01Parm extends Sdms01ParmSerialized {
   

								@Getter @Setter private short sdms01ParmLen;

						@Getter @Setter private char[] sdms01ParmData = Field.fillLowValue(7000);
	
	/**
	* Constructor for Sdms01Parm
	**/
    public Sdms01Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
