package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp219 extends ATGrp219Serialized {
   
				@Getter @Setter private AT219 aT219 = new AT219();
	
	/**
	* Constructor for ATGrp219
	**/
    public ATGrp219() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT219().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
