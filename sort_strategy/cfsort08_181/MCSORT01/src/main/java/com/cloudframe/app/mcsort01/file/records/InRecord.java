package com.cloudframe.app.mcsort01.file.records;

/**
*  The class InRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InRecord extends InRecordSerialized {
   

						@Getter @Setter private char[] inRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for InRecord
	**/
    public InRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
