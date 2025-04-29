package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaMrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WRespuestaMrGroup extends WRespuestaMrGroupSerialized {
   

						@Getter @Setter private char[] wRespuestaMr = new char[25];
					@Getter @Setter private WRespuMr wRespuMr = new WRespuMr();
	
	/**
	* Constructor for WRespuestaMrGroup
	**/
    public WRespuestaMrGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWRespuMr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuestaMr(fillSpace(25));
    }





}
  
