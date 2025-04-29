package com.cloudframe.app.sf326010.file.records;

/**
*  The class Sys201ZLogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201ZLogRec extends Sys201ZLogRecSerialized {
   

						@Getter @Setter private char[] sys201ZLogRecString = Field.fillLowValue(75);
	
	/**
	* Constructor for Sys201ZLogRec
	**/
    public Sys201ZLogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
