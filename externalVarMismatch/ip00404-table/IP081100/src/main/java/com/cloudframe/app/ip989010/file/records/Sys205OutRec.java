package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys205OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys205OutRec extends Sys205OutRecSerialized {
   

						@Getter @Setter private char[] sys205OutRecString = Field.fillLowValue(200);
	
	/**
	* Constructor for Sys205OutRec
	**/
    public Sys205OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
