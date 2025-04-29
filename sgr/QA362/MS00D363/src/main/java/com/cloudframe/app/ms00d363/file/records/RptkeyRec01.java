package com.cloudframe.app.ms00d363.file.records;

/**
*  The class RptkeyRec01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RptkeyRec01 extends RptkeyRec01Serialized {
   

						@Getter @Setter private char[] rptkeyRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for RptkeyRec01
	**/
    public RptkeyRec01() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
