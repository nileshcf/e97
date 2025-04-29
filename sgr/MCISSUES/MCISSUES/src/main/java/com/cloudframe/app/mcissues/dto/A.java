package com.cloudframe.app.mcissues.dto;

/**
*  The class A is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class A extends ASerialized {
   

						@Getter @Setter private char[] aVar1 = Field.fillLowValue(5);

						@Getter @Setter private char[] aVar2 = Field.fillLowValue(10);

						@Getter @Setter private char[] aVar4 = Field.fillLowValue(25);
	
	/**
	* Constructor for A
	**/
    public A() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
