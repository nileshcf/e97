package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp218 extends ATGrp218Serialized {
   
				@Getter @Setter private AT218 aT218 = new AT218();
	
	/**
	* Constructor for ATGrp218
	**/
    public ATGrp218() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT218().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
