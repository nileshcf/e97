package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDateYmd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaDateYmd extends WaDateYmdSerialized {
   

						@Getter @Setter private char[] waDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] waDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] waDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDateYmd
	**/
    public WaDateYmd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
