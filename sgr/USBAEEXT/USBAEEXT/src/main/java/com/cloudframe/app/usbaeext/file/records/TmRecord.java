package com.cloudframe.app.usbaeext.file.records;

/**
*  The class TmRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TmRecord extends TmRecordSerialized {
   

						@Getter @Setter private char[] tmRecordString = Field.fillLowValue(3996);
	
	/**
	* Constructor for TmRecord
	**/
    public TmRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
