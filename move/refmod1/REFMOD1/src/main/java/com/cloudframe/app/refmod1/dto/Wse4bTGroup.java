package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse4bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse4bTGroup extends Wse4bTGroupSerialized {
   
					@Getter @Setter private Wse4bT wse4bT = new Wse4bT();

						@Getter @Setter private char[] wse4bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse4bTGroup
	**/
    public Wse4bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse4bT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
