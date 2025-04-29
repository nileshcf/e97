package com.cloudframe.app.vsammon7.file.records;

/**
*  The class Reprec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Reprec extends ReprecSerialized {
   

						@Getter @Setter private char[] reprecString = Field.fillLowValue(300);
	
	/**
	* Constructor for Reprec
	**/
    public Reprec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
