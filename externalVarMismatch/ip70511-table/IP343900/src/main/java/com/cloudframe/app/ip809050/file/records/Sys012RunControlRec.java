package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys012RunControlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys012RunControlRec extends Sys012RunControlRecSerialized {
   

						@Getter @Setter private char[] sys012RunControlRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for Sys012RunControlRec
	**/
    public Sys012RunControlRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
