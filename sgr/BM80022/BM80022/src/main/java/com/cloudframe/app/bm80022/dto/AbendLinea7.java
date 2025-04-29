package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AbendLinea7 extends AbendLinea7Serialized {
   

						@Getter @Setter private char[] filler602 = new char[1];

						@Getter @Setter private char[] filler18 = new char[11];

						@Getter @Setter private char[] abendProg = new char[8];

						@Getter @Setter private char[] filler19 = new char[4];

						@Getter @Setter private char[] filler20 = new char[10];

						@Getter @Setter private char[] abendParraf = new char[10];

						@Getter @Setter private char[] filler21 = new char[2];

						@Getter @Setter private char[] filler22 = new char[12];

						@Getter @Setter private char[] abendSenten = new char[21];

						@Getter @Setter private char[] filler802 = new char[1];
	
	/**
	* Constructor for AbendLinea7
	**/
    public AbendLinea7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller602(("*").toCharArray());
								setFiller18(("PROGRAMA : ").toCharArray());
								setAbendProg(fillSpace(8));
								setFiller19(fillSpace(4));
								setFiller20(("PARRAFO : ").toCharArray());
								setAbendParraf(fillSpace(10));
								setFiller21(fillSpace(2));
								setFiller22(("SENTENCIA : ").toCharArray());
								setAbendSenten(fillSpace(21));
								setFiller802(("*").toCharArray());
    }





}
  
