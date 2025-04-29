package com.cloudframe.app.ip343900.file.records;

/**
*  The class Sys067EnvrmentRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys067EnvrmentRecord extends Sys067EnvrmentRecordSerialized {
   

						@Getter @Setter private char[] sys067EnvrmentRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for Sys067EnvrmentRecord
	**/
    public Sys067EnvrmentRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
