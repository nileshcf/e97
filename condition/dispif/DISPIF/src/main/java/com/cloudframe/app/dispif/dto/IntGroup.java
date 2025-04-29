package com.cloudframe.app.dispif.dto;

/**
*  The class IntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IntGroup extends IntGroupSerialized {
   

								@Getter @Setter private long intWs;
					@Getter @Setter private IntX intX = new IntX();
	
	/**
	* Constructor for IntGroup
	**/
    public IntGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIntX().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
