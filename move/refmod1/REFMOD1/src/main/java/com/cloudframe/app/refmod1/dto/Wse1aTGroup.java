package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse1aTGroup extends Wse1aTGroupSerialized {
   
					@Getter @Setter private Wse1aT wse1aT = new Wse1aT();

						@Getter @Setter private char[] wse1aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse1aTGroup
	**/
    public Wse1aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse1aT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
