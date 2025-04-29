package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ASGrp25 extends ASGrp25Serialized {
   
				@Getter @Setter private AS25 aS25 = new AS25();
	
	/**
	* Constructor for ASGrp25
	**/
    public ASGrp25() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAS25().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
