package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ASGrp29 extends ASGrp29Serialized {
   
				@Getter @Setter private AS29 aS29 = new AS29();
	
	/**
	* Constructor for ASGrp29
	**/
    public ASGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAS29().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
