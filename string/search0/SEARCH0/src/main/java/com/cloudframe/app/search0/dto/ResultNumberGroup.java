package com.cloudframe.app.search0.dto;

/**
*  The class ResultNumberGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ResultNumberGroup extends ResultNumberGroupSerialized {
   

								@Getter @Setter private long resultNumber;
	
	/**
	* Constructor for ResultNumberGroup
	**/
    public ResultNumberGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
