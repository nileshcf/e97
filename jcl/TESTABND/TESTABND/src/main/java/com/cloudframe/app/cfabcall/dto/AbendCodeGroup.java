package com.cloudframe.app.cfabcall.dto;

/**
*  The class AbendCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AbendCodeGroup extends AbendCodeGroupSerialized {
   

								@Getter @Setter private int abendCode;

						@Getter @Setter private char[] abendX = Field.fillLowValue(4);
	
	/**
	* Constructor for AbendCodeGroup
	**/
    public AbendCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
