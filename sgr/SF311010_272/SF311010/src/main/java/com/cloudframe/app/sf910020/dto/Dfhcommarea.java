package com.cloudframe.app.sf910020.dto;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dfhcommarea extends DfhcommareaSerialized {
   

						@Getter @Setter private char[] bytePassed2000 = new char[1];

						@Getter @Setter private char[] bitValue02000 = new char[1];

						@Getter @Setter private char[] bitValue12000 = new char[1];

						@Getter @Setter private char[] bitValue22000 = new char[1];

						@Getter @Setter private char[] bitValue32000 = new char[1];

						@Getter @Setter private char[] bitValue42000 = new char[1];

						@Getter @Setter private char[] bitValue52000 = new char[1];

						@Getter @Setter private char[] bitValue62000 = new char[1];

						@Getter @Setter private char[] bitValue72000 = new char[1];
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBytePassed2000(fillSpace(1));
								setBitValue02000(("0").toCharArray());
								setBitValue12000(("0").toCharArray());
								setBitValue22000(("0").toCharArray());
								setBitValue32000(("0").toCharArray());
								setBitValue42000(("0").toCharArray());
								setBitValue52000(("0").toCharArray());
								setBitValue62000(("0").toCharArray());
								setBitValue72000(("0").toCharArray());
    }





}
  
