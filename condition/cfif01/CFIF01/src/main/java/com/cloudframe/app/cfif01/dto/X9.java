package com.cloudframe.app.cfif01.dto;

/**
*  The class X9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class X9 extends X9Serialized {
   

								@Getter @Setter private int wS9;

								@Getter @Setter private int wS88;
	
	/**
	* Constructor for X9
	**/
    public X9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
