package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds841ValuesGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Pds841ValuesGroup800 extends Pds841ValuesGroup800Serialized {
   

						@Getter @Setter private char[] pds841Values800 = new char[8];
					@Getter @Setter private Pds841800 pds841800 = new Pds841800();
	
	/**
	* Constructor for Pds841ValuesGroup800
	**/
    public Pds841ValuesGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPds841800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setPds841Values800(fillSpace(8));
    }





}
  
