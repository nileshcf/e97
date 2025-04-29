package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConvGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BiaDataConvGroup800 extends BiaDataConvGroup800Serialized {
   
					@Getter @Setter private BiaDataConv800 biaDataConv800 = new BiaDataConv800();
					@Getter @Setter private BiaDataConv800Redefined biaDataConv800Redefined = new BiaDataConv800Redefined();
	
	/**
	* Constructor for BiaDataConvGroup800
	**/
    public BiaDataConvGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBiaDataConv800().setParent(this,getStartOffset() + 0);
					getBiaDataConv800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
