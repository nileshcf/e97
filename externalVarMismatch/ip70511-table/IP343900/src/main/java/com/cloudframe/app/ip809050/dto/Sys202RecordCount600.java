package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys202RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys202RecordCount600 extends Sys202RecordCount600Serialized {
   


								@Getter @Setter private char[] sys202Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys202RecordCount600
	**/
    public Sys202RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS202: EDIT #1849                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }





}
  
