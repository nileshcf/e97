package com.cloudframe.app.mcissues.dto;

/**
*  The class Sys295EffDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys295EffDateGroup extends Sys295EffDateGroupSerialized {
   

								@Getter @Setter private long sys295EffDate;
	
	/**
	* Constructor for Sys295EffDateGroup
	**/
    public Sys295EffDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
