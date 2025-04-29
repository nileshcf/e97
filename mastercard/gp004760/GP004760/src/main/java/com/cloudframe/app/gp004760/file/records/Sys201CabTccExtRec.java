package com.cloudframe.app.gp004760.file.records;

/**
*  The class Sys201CabTccExtRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201CabTccExtRec extends Sys201CabTccExtRecSerialized {
   

						@Getter @Setter private char[] sys201CabTccExtRecString = Field.fillLowValue(256);
	
	/**
	* Constructor for Sys201CabTccExtRec
	**/
    public Sys201CabTccExtRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
