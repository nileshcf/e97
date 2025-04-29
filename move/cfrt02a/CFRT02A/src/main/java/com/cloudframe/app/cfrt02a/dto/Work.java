package com.cloudframe.app.cfrt02a.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] theMessage = Field.fillLowValue(50);

						@Getter @Setter private char[] theDisplay = new char[605];

								@Getter @Setter private int theNumber;

						@Getter @Setter private char[] aSpace = Field.fillLowValue(1);

						@Getter @Setter private char[] stage = Field.fillLowValue(60);

								@Getter @Setter private short start;

								@Getter @Setter private short sub;

								@Getter @Setter private int inx;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTheDisplay(String.join("", java.util.Collections.nCopies(605, "-")).toCharArray());
								setStart((short)2);
								setInx(0);
    }





}
  
