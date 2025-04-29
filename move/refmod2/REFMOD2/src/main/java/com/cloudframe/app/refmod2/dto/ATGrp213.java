package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp213 extends ATGrp213Serialized {
   
				@Getter @Setter private AT213 aT213 = new AT213();
	
	/**
	* Constructor for ATGrp213
	**/
    public ATGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT213().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
