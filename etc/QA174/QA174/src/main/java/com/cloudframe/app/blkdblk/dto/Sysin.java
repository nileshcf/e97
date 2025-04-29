package com.cloudframe.app.blkdblk.dto;

/**
*  The class Sysin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sysin extends SysinSerialized {
   

						@Getter @Setter private char[] directionFlag = Field.fillLowValue(5);
	
	/**
	* Constructor for Sysin
	**/
    public Sysin() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
