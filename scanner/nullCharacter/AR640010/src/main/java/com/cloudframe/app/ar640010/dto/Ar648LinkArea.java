package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648LinkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar648LinkArea extends Ar648LinkAreaSerialized {
   

								@Getter @Setter private short ar648RequestCode;

								@Getter @Setter private short ar648ReturnCode;
	
	/**
	* Constructor for Ar648LinkArea
	**/
    public Ar648LinkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAr648RequestCode((short)0);
								setAr648ReturnCode((short)0);
    }





}
  
