package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ATGrp211 extends ATGrp211Serialized {
   
				@Getter @Setter private AT211 aT211 = new AT211();
	
	/**
	* Constructor for ATGrp211
	**/
    public ATGrp211() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAT211().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
