package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp28 extends ATGrp28Serialized {
   
				@Getter @Setter private AT28 aT28 = new AT28();
	
	/**
	* Constructor for ATGrp28
	**/
    public ATGrp28() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT28().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
