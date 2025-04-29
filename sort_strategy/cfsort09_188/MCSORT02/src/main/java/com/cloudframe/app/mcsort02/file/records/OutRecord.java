package com.cloudframe.app.mcsort02.file.records;

/**
*  The class OutRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OutRecord extends OutRecordSerialized {
   

						@Getter @Setter private char[] outRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for OutRecord
	**/
    public OutRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
