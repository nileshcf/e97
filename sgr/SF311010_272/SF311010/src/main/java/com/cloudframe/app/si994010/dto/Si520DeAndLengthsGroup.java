package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Si520DeAndLengthsGroup extends Si520DeAndLengthsGroupSerialized {
   
					@Getter @Setter private Si520DeAndLengths si520DeAndLengths = new Si520DeAndLengths();
					@Getter @Setter private Si520DeAndLengthsRedefined si520DeAndLengthsRedefined = new Si520DeAndLengthsRedefined();
	
	/**
	* Constructor for Si520DeAndLengthsGroup
	**/
    public Si520DeAndLengthsGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSi520DeAndLengths().setParent(this,getStartOffset() + 0);
					getSi520DeAndLengthsRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
