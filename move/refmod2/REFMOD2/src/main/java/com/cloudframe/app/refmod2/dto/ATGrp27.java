package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp27 extends ATGrp27Serialized {
   
				@Getter @Setter private AT27 aT27 = new AT27();
	
	/**
	* Constructor for ATGrp27
	**/
    public ATGrp27() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT27().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
