package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumericInputGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WvNumericInputGroup extends WvNumericInputGroupSerialized {
   

						@Getter @Setter private char[] wvNumericInput = Field.fillLowValue(18);
					@Getter @Setter private WvNumInpArray wvNumInpArray = new WvNumInpArray();
	
	/**
	* Constructor for WvNumericInputGroup
	**/
    public WvNumericInputGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWvNumInpArray().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
