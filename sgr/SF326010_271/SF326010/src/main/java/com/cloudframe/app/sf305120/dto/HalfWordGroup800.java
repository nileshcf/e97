package com.cloudframe.app.sf305120.dto;

/**
*  The class HalfWordGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HalfWordGroup800 extends HalfWordGroup800Serialized {
   

								@Getter @Setter private short halfWord800;
					@Getter @Setter private HalfWordX2800 halfWordX2800 = new HalfWordX2800();
	
	/**
	* Constructor for HalfWordGroup800
	**/
    public HalfWordGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHalfWordX2800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setHalfWord800((short)0);
    }





}
  
