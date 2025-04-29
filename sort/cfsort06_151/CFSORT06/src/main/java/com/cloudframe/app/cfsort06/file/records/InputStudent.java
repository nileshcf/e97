package com.cloudframe.app.cfsort06.file.records;

/**
*  The class InputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InputStudent extends InputStudentSerialized {
   

								@Getter @Setter private long studentIdI;

						@Getter @Setter private char[] studentNameI = Field.fillLowValue(25);
				@Getter @Setter private StudentNameIRedefined studentNameIRedefined = new StudentNameIRedefined();
	
	/**
	* Constructor for InputStudent
	**/
    public InputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getStudentNameIRedefined().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
