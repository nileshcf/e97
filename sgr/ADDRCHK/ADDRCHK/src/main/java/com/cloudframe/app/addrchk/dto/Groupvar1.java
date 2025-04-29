package com.cloudframe.app.addrchk.dto;

/**
*  The class Groupvar1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Groupvar1 extends Groupvar1Serialized {
   

						@Getter @Setter private char[] data1 = new char[10];
	
	/**
	* Constructor for Groupvar1
	**/
    public Groupvar1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setData1(("1234567890").toCharArray());
    }





}
  
