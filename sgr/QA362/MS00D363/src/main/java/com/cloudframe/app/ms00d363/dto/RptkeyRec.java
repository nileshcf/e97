package com.cloudframe.app.ms00d363.dto;

/**
*  The class RptkeyRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RptkeyRec extends RptkeyRecSerialized {
   

						@Getter @Setter private char[] rptkeyId = Field.fillLowValue(3);

						@Getter @Setter private char[] rptkeyDesc = Field.fillLowValue(18);
	
	/**
	* Constructor for RptkeyRec
	**/
    public RptkeyRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
