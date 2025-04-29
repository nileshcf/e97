package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp220 extends ATGrp220Serialized {
   
				@Getter @Setter private AT220 aT220 = new AT220();
	
	/**
	* Constructor for ATGrp220
	**/
    public ATGrp220() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT220().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
