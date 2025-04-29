package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse2bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse2bTGroup extends Wse2bTGroupSerialized {
   
					@Getter @Setter private Wse2bT wse2bT = new Wse2bT();

						@Getter @Setter private char[] wse2bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse2bTGroup
	**/
    public Wse2bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse2bT().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
