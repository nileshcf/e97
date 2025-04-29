package com.cloudframe.app.sf305120.dto;

/**
*  The class RhSource810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RhSource810 extends RhSource810Serialized {
   

						@Getter @Setter private char[] rhSourceLnth810 = new char[1];

						@Getter @Setter private char[] rhSourceData810 = new char[255];
	
	/**
	* Constructor for RhSource810
	**/
    public RhSource810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRhSourceLnth810(getString(new byte[] {(byte)0x0F}).toCharArray());
								setRhSourceData810(pad(255," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
