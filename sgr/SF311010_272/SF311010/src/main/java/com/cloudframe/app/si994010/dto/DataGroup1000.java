package com.cloudframe.app.si994010.dto;

/**
*  The class DataGroup1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DataGroup1000 extends DataGroup1000Serialized {
   

						@Getter @Setter private char[] data1000 = Field.fillLowValue(32768);
	
	/**
	* Constructor for DataGroup1000
	**/
    public DataGroup1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
