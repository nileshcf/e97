package com.cloudframe.app.cfsort05.file.records;

/**
*  The class InputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InputStudent extends InputStudentSerialized {
   

						@Getter @Setter private char[] studentNameI = Field.fillLowValue(25);
	
	/**
	* Constructor for InputStudent
	**/
    public InputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
