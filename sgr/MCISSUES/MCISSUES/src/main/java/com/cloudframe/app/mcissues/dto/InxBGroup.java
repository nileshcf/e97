package com.cloudframe.app.mcissues.dto;

/**
*  The class InxBGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InxBGroup extends InxBGroupSerialized {
   

								@Getter @Setter private int inxB;

								@Getter @Setter private long inxBBin;

						@Getter @Setter private char[] inxBChr = Field.fillLowValue(4);
	
	/**
	* Constructor for InxBGroup
	**/
    public InxBGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
