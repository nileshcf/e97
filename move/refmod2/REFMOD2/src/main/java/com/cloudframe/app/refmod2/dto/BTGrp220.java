package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp220 extends BTGrp220Serialized {
   
				@Getter @Setter private BT220 bT220 = new BT220();
	
	/**
	* Constructor for BTGrp220
	**/
    public BTGrp220() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT220().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
