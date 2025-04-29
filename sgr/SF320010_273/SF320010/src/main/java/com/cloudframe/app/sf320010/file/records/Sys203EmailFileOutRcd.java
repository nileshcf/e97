package com.cloudframe.app.sf320010.file.records;

/**
*  The class Sys203EmailFileOutRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys203EmailFileOutRcd extends Sys203EmailFileOutRcdSerialized {
   

						@Getter @Setter private char[] sys203EmailFileOutRcdString = Field.fillLowValue(145);
	
	/**
	* Constructor for Sys203EmailFileOutRcd
	**/
    public Sys203EmailFileOutRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
