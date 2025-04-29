package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse20cTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse20cTGroup extends Wse20cTGroupSerialized {
   

						@Getter @Setter private char[] wse20cT = Field.fillLowValue(60);

						@Getter @Setter private char[] wse20cTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse20cTGroup
	**/
    public Wse20cTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
