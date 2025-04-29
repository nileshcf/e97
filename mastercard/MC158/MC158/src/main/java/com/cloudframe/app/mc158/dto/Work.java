package com.cloudframe.app.mc158.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] normalIpmMsg = new char[50];

								@Getter @Setter private short posS;

								@Getter @Setter private short posL;

						@Getter @Setter private char[] val1 = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNormalIpmMsg(("1644                ABCD                          ").toCharArray());
								setVal1(("1").toCharArray());
    }





}
  
