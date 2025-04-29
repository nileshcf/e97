package com.cloudframe.app.crazy88.dto;

/**
*  The class WCharG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WCharG extends WCharGSerialized {
   

						@Getter @Setter private char[] wCharTestData = Field.fillLowValue(1);
	
	/**
	* Constructor for WCharG
	**/
    public WCharG() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
