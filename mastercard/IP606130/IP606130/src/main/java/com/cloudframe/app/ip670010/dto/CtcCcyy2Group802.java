package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcCcyy2Group802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CtcCcyy2Group802 extends CtcCcyy2Group802Serialized {
   

								@Getter @Setter private int ctcCcyy2802;
					@Getter @Setter private CtcCcyy2802Redefined ctcCcyy2802Redefined = new CtcCcyy2802Redefined();
	
	/**
	* Constructor for CtcCcyy2Group802
	**/
    public CtcCcyy2Group802() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCtcCcyy2802Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
