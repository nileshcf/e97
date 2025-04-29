package com.cloudframe.app.sf305120.dto;

/**
*  The class RhDestination810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RhDestination810 extends RhDestination810Serialized {
   

						@Getter @Setter private char[] rhDestLnth810 = new char[1];

						@Getter @Setter private char[] rhDestData810 = new char[255];
	
	/**
	* Constructor for RhDestination810
	**/
    public RhDestination810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRhDestLnth810(getString(new byte[] {(byte)0x0F}).toCharArray());
								setRhDestData810(pad(255," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
