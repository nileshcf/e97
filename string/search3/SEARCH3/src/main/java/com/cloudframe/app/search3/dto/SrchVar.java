package com.cloudframe.app.search3.dto;

/**
*  The class SrchVar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SrchVar extends SrchVarSerialized {
   

						@Getter @Setter private char[] srchVar1 = Field.fillLowValue(2);

								@Getter @Setter private int srchVar2;
	
	/**
	* Constructor for SrchVar
	**/
    public SrchVar() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
