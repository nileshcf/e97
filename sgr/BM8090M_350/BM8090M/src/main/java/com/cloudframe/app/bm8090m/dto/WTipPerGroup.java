package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTipPerGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WTipPerGroup extends WTipPerGroupSerialized {
   

								@Getter @Setter private int wTipPer01;
					@Getter @Setter private WtipPer wtipPer = new WtipPer();
	
	/**
	* Constructor for WTipPerGroup
	**/
    public WTipPerGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWtipPer().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWTipPer01(0);
    }





}
  
