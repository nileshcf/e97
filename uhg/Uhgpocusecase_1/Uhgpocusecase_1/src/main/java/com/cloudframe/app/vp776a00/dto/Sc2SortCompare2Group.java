package com.cloudframe.app.vp776a00.dto;

/**
*  The class Sc2SortCompare2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sc2SortCompare2Group extends Sc2SortCompare2GroupSerialized {
   

						@Getter @Setter private char[] sc2SortCompare2 = Field.fillLowValue(32767);
	
	/**
	* Constructor for Sc2SortCompare2Group
	**/
    public Sc2SortCompare2Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
