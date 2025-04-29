package com.cloudframe.app.caller2.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parm extends ParmSerialized {
   

						@Getter @Setter private char[] lku00MthlyChgInd = Field.fillLowValue(1);

						@Getter @Setter private char[] lku00BlPerToDt = Field.fillLowValue(10);

						@Getter @Setter private char[] lku00BlPerFromDt = Field.fillLowValue(10);
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
