package com.cloudframe.app.dispif.dto;

/**
*  The class ShortGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ShortGroup extends ShortGroupSerialized {
   

								@Getter @Setter private int shortWs;
					@Getter @Setter private ShortX shortX = new ShortX();
	
	/**
	* Constructor for ShortGroup
	**/
    public ShortGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getShortX().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
