package com.cloudframe.app.sf328010.file.records;

/**
*  The class Sys201ServiceRptRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201ServiceRptRec extends Sys201ServiceRptRecSerialized {
   

						@Getter @Setter private char[] sys201ServiceRptRecString = Field.fillLowValue(132);
	
	/**
	* Constructor for Sys201ServiceRptRec
	**/
    public Sys201ServiceRptRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
