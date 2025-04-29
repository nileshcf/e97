package com.cloudframe.app.mc081.file.records;

/**
*  The class FbRecordOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FbRecordOut extends FbRecordOutSerialized {
   

						@Getter @Setter private char[] fbRecordOutString = Field.fillLowValue(132);
	
	/**
	* Constructor for FbRecordOut
	**/
    public FbRecordOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
