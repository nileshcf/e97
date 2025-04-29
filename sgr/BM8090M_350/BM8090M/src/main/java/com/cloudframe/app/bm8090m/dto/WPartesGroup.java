package com.cloudframe.app.bm8090m.dto;

/**
*  The class WPartesGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WPartesGroup extends WPartesGroupSerialized {
   

						@Getter @Setter private char[] wPartes = new char[22];
					@Getter @Setter private WParts wParts = new WParts();
	
	/**
	* Constructor for WPartesGroup
	**/
    public WPartesGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWParts().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWPartes(fillSpace(22));
    }





}
  
