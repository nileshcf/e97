package com.cloudframe.app.gdgpgm2.file.records;

/**
*  The class FsRecord1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FsRecord1 extends FsRecord1Serialized {
   

						@Getter @Setter private char[] fsRecord1String = Field.fillLowValue(80);
	
	/**
	* Constructor for FsRecord1
	**/
    public FsRecord1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
