package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ATGroup2 extends ATGroup2Serialized {
   
					@Getter @Setter private AT2 aT2 = new AT2();

						@Getter @Setter private char[] aTR2 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup2
	**/
    public ATGroup2() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT2().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
