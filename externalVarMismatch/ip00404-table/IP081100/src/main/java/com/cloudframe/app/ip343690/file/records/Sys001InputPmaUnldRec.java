package com.cloudframe.app.ip343690.file.records;

/**
*  The class Sys001InputPmaUnldRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001InputPmaUnldRec extends Sys001InputPmaUnldRecSerialized {
   

						@Getter @Setter private char[] sys001InputPmaUnldRecString = Field.fillLowValue(116);
	
	/**
	* Constructor for Sys001InputPmaUnldRec
	**/
    public Sys001InputPmaUnldRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
