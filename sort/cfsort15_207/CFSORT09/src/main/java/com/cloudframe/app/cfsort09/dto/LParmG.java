package com.cloudframe.app.cfsort09.dto;

/**
*  The class LParmG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LParmG extends LParmGSerialized {
   

								@Getter @Setter private short lParmLen;

						@Getter @Setter private char[] lParmSortKey = Field.fillLowValue(8);
	
	/**
	* Constructor for LParmG
	**/
    public LParmG() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
