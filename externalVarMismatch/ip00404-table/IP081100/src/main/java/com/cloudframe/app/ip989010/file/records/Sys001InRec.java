package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys001InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001InRec extends Sys001InRecSerialized {
   

						@Getter @Setter private char[] sys001InRecString = Field.fillLowValue(200);
	
	/**
	* Constructor for Sys001InRec
	**/
    public Sys001InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
