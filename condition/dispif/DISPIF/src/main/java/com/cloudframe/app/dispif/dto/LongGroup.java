package com.cloudframe.app.dispif.dto;

/**
*  The class LongGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class LongGroup extends LongGroupSerialized {
   

								@Getter @Setter private long longWs;
					@Getter @Setter private LongX longX = new LongX();
	
	/**
	* Constructor for LongGroup
	**/
    public LongGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getLongX().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
