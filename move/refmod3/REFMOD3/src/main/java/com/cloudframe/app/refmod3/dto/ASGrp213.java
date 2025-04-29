package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ASGrp213 extends ASGrp213Serialized {
   
				@Getter @Setter private AS213 aS213 = new AS213();
	
	/**
	* Constructor for ASGrp213
	**/
    public ASGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAS213().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
