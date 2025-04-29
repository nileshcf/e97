package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse4aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse4aTGroup extends Wse4aTGroupSerialized {
   
					@Getter @Setter private Wse4aT wse4aT = new Wse4aT();

						@Getter @Setter private char[] wse4aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse4aTGroup
	**/
    public Wse4aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse4aT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
