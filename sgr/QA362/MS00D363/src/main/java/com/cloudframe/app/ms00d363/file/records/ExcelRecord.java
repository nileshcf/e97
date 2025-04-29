package com.cloudframe.app.ms00d363.file.records;

/**
*  The class ExcelRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExcelRecord extends ExcelRecordSerialized {
   

						@Getter @Setter private char[] excelRecordString = Field.fillLowValue(500);
	
	/**
	* Constructor for ExcelRecord
	**/
    public ExcelRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
