package com.cloudframe.app.ip798030.file.records;

/**
*  The class Sys202PmaRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys202PmaRecord extends Sys202PmaRecordSerialized {
   

						@Getter @Setter private char[] sys202PmaRecordString = Field.fillLowValue(94);
	
	/**
	* Constructor for Sys202PmaRecord
	**/
    public Sys202PmaRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
