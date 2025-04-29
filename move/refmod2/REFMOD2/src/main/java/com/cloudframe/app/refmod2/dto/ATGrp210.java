package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp210 extends ATGrp210Serialized {
   
				@Getter @Setter private AT210 aT210 = new AT210();
	
	/**
	* Constructor for ATGrp210
	**/
    public ATGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT210().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
