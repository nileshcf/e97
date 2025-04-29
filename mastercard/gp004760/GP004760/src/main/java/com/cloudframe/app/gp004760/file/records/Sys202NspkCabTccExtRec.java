package com.cloudframe.app.gp004760.file.records;

/**
*  The class Sys202NspkCabTccExtRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys202NspkCabTccExtRec extends Sys202NspkCabTccExtRecSerialized {
   

						@Getter @Setter private char[] sys202NspkCabTccExtRecString = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys202NspkCabTccExtRec
	**/
    public Sys202NspkCabTccExtRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
