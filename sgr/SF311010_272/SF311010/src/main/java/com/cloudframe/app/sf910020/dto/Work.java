package com.cloudframe.app.sf910020.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] charX300 = new char[1];

						@Getter @Setter private char[] char1300 = new char[1];

								@Getter @Setter private short binary1300;

						@Getter @Setter private char[] byteTable800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCharX300(("X").toCharArray());
								setChar1300(("1").toCharArray());
								setBinary1300((short)1);
								setByteTable800(fillSpace(8));
    }





}
  
