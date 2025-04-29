package com.cloudframe.app.cfif01.dto;

/**
*  The class Gp004300PinBlckFrmtCdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Gp004300PinBlckFrmtCdGroup extends Gp004300PinBlckFrmtCdGroupSerialized {
   

								@Getter @Setter private int gp004300PinBlckFrmtCd;

						@Getter @Setter private char[] gp004300PinBlckFrmt = Field.fillLowValue(2);
	
	/**
	* Constructor for Gp004300PinBlckFrmtCdGroup
	**/
    public Gp004300PinBlckFrmtCdGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
