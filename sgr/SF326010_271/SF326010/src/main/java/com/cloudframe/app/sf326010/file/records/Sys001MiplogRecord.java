package com.cloudframe.app.sf326010.file.records;

/**
*  The class Sys001MiplogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001MiplogRecord extends Sys001MiplogRecordSerialized {
   

						@Getter @Setter private char[] sys001MiplogRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for Sys001MiplogRecord
	**/
    public Sys001MiplogRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
