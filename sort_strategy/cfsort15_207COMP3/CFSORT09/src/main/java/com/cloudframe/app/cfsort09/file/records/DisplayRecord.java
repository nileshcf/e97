package com.cloudframe.app.cfsort09.file.records;

/**
*  The class DisplayRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DisplayRecord extends DisplayRecordSerialized {
   

						@Getter @Setter private char[] displayStr = Field.fillLowValue(133);
	
	/**
	* Constructor for DisplayRecord
	**/
    public DisplayRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
