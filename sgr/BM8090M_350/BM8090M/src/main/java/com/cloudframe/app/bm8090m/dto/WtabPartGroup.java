package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtabPartGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WtabPartGroup extends WtabPartGroupSerialized {
   

						@Getter @Setter private char[] wtabPart = new char[100];
					@Getter @Setter private WtabPartx wtabPartx = new WtabPartx();
	
	/**
	* Constructor for WtabPartGroup
	**/
    public WtabPartGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWtabPartx().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWtabPart(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
