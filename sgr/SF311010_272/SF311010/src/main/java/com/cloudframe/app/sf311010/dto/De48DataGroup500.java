package com.cloudframe.app.sf311010.dto;

/**
*  The class De48DataGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class De48DataGroup500 extends De48DataGroup500Serialized {
   

						@Getter @Setter private char[] de48Data500 = new char[999];
	
	/**
	* Constructor for De48DataGroup500
	**/
    public De48DataGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDe48Data500(pad(999," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
