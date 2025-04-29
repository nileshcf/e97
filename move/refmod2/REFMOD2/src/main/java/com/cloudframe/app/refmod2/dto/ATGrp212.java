package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp212 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp212 extends ATGrp212Serialized {
   
				@Getter @Setter private AT212 aT212 = new AT212();
	
	/**
	* Constructor for ATGrp212
	**/
    public ATGrp212() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT212().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
