package com.cloudframe.app.ms00d363.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parm extends ParmSerialized {
   


						@Getter @Setter private char[] parmInType = Field.fillLowValue(7);


						@Getter @Setter private char[] parmErlyFlag = Field.fillLowValue(1);


						@Getter @Setter private char[] parmHeir = Field.fillLowValue(4);


						@Getter @Setter private char[] parmEsrvFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
