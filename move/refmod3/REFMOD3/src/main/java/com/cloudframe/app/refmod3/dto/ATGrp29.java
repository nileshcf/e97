package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp29 extends ATGrp29Serialized {
   
				@Getter @Setter private AT29 aT29 = new AT29();
	
	/**
	* Constructor for ATGrp29
	**/
    public ATGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT29().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
