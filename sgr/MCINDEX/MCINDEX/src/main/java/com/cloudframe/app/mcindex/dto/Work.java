package com.cloudframe.app.mcindex.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long ip00485MemberEntries;

								@Getter @Setter private long zeroVal300;

								@Getter @Setter private int minusoneVal300;

								@Getter @Setter private char[] valEdit400 = Field.fillLowValue(11);

								@Getter @Setter private int val400;

								@Getter @Setter private int val1400;

								@Getter @Setter private short val2400;

								@Getter @Setter private int val3400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setZeroVal300(0L);
								setMinusoneVal300(-1);
    }





}
  
