package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse216aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse216aSGrp extends Wse216aSGrpSerialized {
   

						@Getter @Setter private char[] wse216aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse216aSGrp
	**/
    public Wse216aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
