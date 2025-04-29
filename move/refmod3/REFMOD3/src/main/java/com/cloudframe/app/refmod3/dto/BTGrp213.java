package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp213 extends BTGrp213Serialized {
   
				@Getter @Setter private BT213 bT213 = new BT213();
	
	/**
	* Constructor for BTGrp213
	**/
    public BTGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT213().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
