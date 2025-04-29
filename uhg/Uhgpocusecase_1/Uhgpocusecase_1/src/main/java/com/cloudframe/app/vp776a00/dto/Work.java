package com.cloudframe.app.vp776a00.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short pwaSortGap;

								@Getter @Setter private short pwaLimit;

								@Getter @Setter private short pwaSub1;

								@Getter @Setter private short pwaSub2;

						@Getter @Setter private char[] pwaSwapEntry = Field.fillLowValue(32767);

						@Getter @Setter private char[] pwaSortSwitch = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPwaSortGap((short)0);
								setPwaLimit((short)0);
								setPwaSub1((short)0);
								setPwaSub2((short)0);
								setPwaSortSwitch(("I").toCharArray());
    }





}
  
