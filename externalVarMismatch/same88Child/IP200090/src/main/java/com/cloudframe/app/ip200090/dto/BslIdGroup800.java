package com.cloudframe.app.ip200090.dto;

/**
*  The class BslIdGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BslIdGroup800 extends BslIdGroup800Serialized {
   
					@Getter @Setter private BslId800 bslId800 = new BslId800();

						@Getter @Setter private char[] bslIdR800 = Field.fillLowValue(7);
	
	/**
	* Constructor for BslIdGroup800
	**/
    public BslIdGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBslId800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
