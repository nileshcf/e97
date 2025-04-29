package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys207OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys207OutputIpmOtbndRec extends Sys207OutputIpmOtbndRecSerialized {
   

						@Getter @Setter private char[] sys207OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys207OutputIpmOtbndRec
	**/
    public Sys207OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
