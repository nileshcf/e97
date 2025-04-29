package com.cloudframe.app.oldnew.file.records;

/**
*  The class FsRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FsRecord extends FsRecordSerialized {
   

						@Getter @Setter private char[] fsRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for FsRecord
	**/
    public FsRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
