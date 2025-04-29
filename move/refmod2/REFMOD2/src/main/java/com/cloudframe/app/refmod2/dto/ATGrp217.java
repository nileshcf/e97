package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp217 extends ATGrp217Serialized {
   
				@Getter @Setter private AT217 aT217 = new AT217();
	
	/**
	* Constructor for ATGrp217
	**/
    public ATGrp217() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT217().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
