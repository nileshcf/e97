package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogRecordGroup900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ZlogRecordGroup900 extends ZlogRecordGroup900Serialized {
   

						@Getter @Setter private char[] zlogRecord900 = Field.fillLowValue(8197);
	
	/**
	* Constructor for ZlogRecordGroup900
	**/
    public ZlogRecordGroup900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
