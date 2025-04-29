package com.cloudframe.app.ip798030.file.records;

/**
*  The class Sys001CutoffRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001CutoffRecord extends Sys001CutoffRecordSerialized {
   

						@Getter @Setter private char[] sys001CutoffRecordString = Field.fillLowValue(182);
	
	/**
	* Constructor for Sys001CutoffRecord
	**/
    public Sys001CutoffRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
