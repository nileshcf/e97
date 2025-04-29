package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp218 extends BTGrp218Serialized {
   
				@Getter @Setter private BT218 bT218 = new BT218();
	
	/**
	* Constructor for BTGrp218
	**/
    public BTGrp218() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT218().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
