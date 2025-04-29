package com.cloudframe.app.abprog9.dto;

/**
*  The class EndFlagGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EndFlagGroup extends EndFlagGroupSerialized {
   

						@Getter @Setter private char[] endFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for EndFlagGroup
	**/
    public EndFlagGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
