package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys203RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys203RecordCount600 extends Sys203RecordCount600Serialized {
   


								@Getter @Setter private char[] sys203Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys203RecordCount600
	**/
    public Sys203RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS203: EDIT #1850                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }





}
  
