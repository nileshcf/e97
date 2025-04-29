package com.cloudframe.app.proga.dto;

/**
*  The class RetCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RetCodeGroup extends RetCodeGroupSerialized {
   

								@Getter @Setter private int retCode;
	
	/**
	* Constructor for RetCodeGroup
	**/
    public RetCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
