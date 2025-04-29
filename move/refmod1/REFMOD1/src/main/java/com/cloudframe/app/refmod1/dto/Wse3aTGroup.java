package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse3aTGroup extends Wse3aTGroupSerialized {
   
					@Getter @Setter private Wse3aT wse3aT = new Wse3aT();

						@Getter @Setter private char[] wse3aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse3aTGroup
	**/
    public Wse3aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse3aT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
