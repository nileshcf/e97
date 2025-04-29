package com.cloudframe.app.refmod1.dto;

/**
*  The class BTGroup3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BTGroup3 extends BTGroup3Serialized {
   
					@Getter @Setter private BT3 bT3 = new BT3();

						@Getter @Setter private char[] bTR3 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup3
	**/
    public BTGroup3() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT3().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
