package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys001RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001RecordCount600 extends Sys001RecordCount600Serialized {
   


								@Getter @Setter private char[] sys001Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys001RecordCount600
	**/
    public Sys001RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             "IP809050-SYS001: NUMBER OF OUTBOUND RECORDS READ           -".toCharArray()
             , getStartOffset() + 0
             ,60
             );
    }





}
  
