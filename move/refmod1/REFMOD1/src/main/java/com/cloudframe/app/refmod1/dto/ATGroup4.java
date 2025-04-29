package com.cloudframe.app.refmod1.dto;

/**
*  The class ATGroup4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ATGroup4 extends ATGroup4Serialized {
   
					@Getter @Setter private AT4 aT4 = new AT4();

						@Getter @Setter private char[] aTR4 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGroup4
	**/
    public ATGroup4() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT4().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
