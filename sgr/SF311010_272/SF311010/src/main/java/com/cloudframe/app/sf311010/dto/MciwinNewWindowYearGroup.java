package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinNewWindowYearGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciwinNewWindowYearGroup extends MciwinNewWindowYearGroupSerialized {
   

								@Getter @Setter private int mciwinNewWindowYear;
	
	/**
	* Constructor for MciwinNewWindowYearGroup
	**/
    public MciwinNewWindowYearGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinNewWindowYear(50);
    }





}
  
