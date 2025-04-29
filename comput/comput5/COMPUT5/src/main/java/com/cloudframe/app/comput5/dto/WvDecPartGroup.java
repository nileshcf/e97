package com.cloudframe.app.comput5.dto;

/**
*  The class WvDecPartGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WvDecPartGroup extends WvDecPartGroupSerialized {
   

						@Getter @Setter private char[] wvDecPart = Field.fillLowValue(16);

								@Getter @Setter private long wvDecPartN;
	
	/**
	* Constructor for WvDecPartGroup
	**/
    public WvDecPartGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
