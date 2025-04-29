package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse3bTGroup extends Wse3bTGroupSerialized {
   
					@Getter @Setter private Wse3bT wse3bT = new Wse3bT();

						@Getter @Setter private char[] wse3bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse3bTGroup
	**/
    public Wse3bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse3bT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
