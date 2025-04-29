package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys003InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys003InRec extends Sys003InRecSerialized {
   

						@Getter @Setter private char[] sys003Field = Field.fillLowValue(10);

						@Getter @Setter private char[] sys003FieldLen = Field.fillLowValue(3);

						@Getter @Setter private char[] sys003FieldVal = Field.fillLowValue(65);
	
	/**
	* Constructor for Sys003InRec
	**/
    public Sys003InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
