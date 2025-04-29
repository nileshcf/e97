package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDateMdy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaDateMdy extends WaDateMdySerialized {
   

						@Getter @Setter private char[] waDateMn = Field.fillLowValue(2);

						@Getter @Setter private char[] waDateDy = Field.fillLowValue(2);

						@Getter @Setter private char[] waDateYr = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDateMdy
	**/
    public WaDateMdy() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
