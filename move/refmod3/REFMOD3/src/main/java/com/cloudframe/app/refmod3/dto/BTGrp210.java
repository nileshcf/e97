package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp210 extends BTGrp210Serialized {
   
				@Getter @Setter private BT210 bT210 = new BT210();
	
	/**
	* Constructor for BTGrp210
	**/
    public BTGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT210().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
