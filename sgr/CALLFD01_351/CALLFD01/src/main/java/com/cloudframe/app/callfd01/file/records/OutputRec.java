package com.cloudframe.app.callfd01.file.records;

/**
*  The class OutputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OutputRec extends OutputRecSerialized {
   

						@Getter @Setter private char[] outputData = Field.fillLowValue(1001);
	
	/**
	* Constructor for OutputRec
	**/
    public OutputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
