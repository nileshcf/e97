package com.cloudframe.app.mcissues.dto;

/**
*  The class Date2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Date2 extends Date2Serialized {
   

						@Getter @Setter private char[] date21 = Field.fillLowValue(8);

						@Getter @Setter private char[] date22 = Field.fillLowValue(2);
	
	/**
	* Constructor for Date2
	**/
    public Date2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
