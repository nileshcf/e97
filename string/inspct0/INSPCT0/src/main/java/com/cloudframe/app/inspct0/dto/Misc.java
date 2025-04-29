package com.cloudframe.app.inspct0.dto;

/**
*  The class Misc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Misc extends MiscSerialized {
   

								@Getter @Setter private int cnt;

						@Getter @Setter private char[] parm = Field.fillLowValue(30);

						@Getter @Setter private char[] nullWs = new char[5];

						@Getter @Setter private char[] x1 = new char[5];

						@Getter @Setter private char[] x2 = new char[5];
	
	/**
	* Constructor for Misc
	**/
    public Misc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNullWs(fillLowValue(5));
								setX1(fillSpace(5));
								setX2(fillSpace(5));
    }





}
  
