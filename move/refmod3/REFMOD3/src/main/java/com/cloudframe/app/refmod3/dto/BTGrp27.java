package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp27 extends BTGrp27Serialized {
   
				@Getter @Setter private BT27 bT27 = new BT27();
	
	/**
	* Constructor for BTGrp27
	**/
    public BTGrp27() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT27().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
