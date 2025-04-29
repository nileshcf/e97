package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BTGrp214 extends BTGrp214Serialized {
   
				@Getter @Setter private BT214 bT214 = new BT214();
	
	/**
	* Constructor for BTGrp214
	**/
    public BTGrp214() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBT214().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
