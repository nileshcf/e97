package com.cloudframe.app.addrchk.dto;

/**
*  The class Var3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Var3 extends Var3Serialized {
   

						@Getter @Setter private char[] data3 = Field.fillLowValue(10);
	
	/**
	* Constructor for Var3
	**/
    public Var3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
