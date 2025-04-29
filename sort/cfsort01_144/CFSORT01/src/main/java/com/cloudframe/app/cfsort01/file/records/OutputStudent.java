package com.cloudframe.app.cfsort01.file.records;

/**
*  The class OutputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OutputStudent extends OutputStudentSerialized {
   

						@Getter @Setter private char[] studentNameO = Field.fillLowValue(25);
	
	/**
	* Constructor for OutputStudent
	**/
    public OutputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
