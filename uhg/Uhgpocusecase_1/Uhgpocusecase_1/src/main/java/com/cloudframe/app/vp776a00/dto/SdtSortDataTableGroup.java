package com.cloudframe.app.vp776a00.dto;

/**
*  The class SdtSortDataTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SdtSortDataTableGroup extends SdtSortDataTableGroupSerialized {
   

						@Getter @Setter private char[] sdtSortDataTable = Field.fillLowValue(1);
	
	/**
	* Constructor for SdtSortDataTableGroup
	**/
    public SdtSortDataTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
