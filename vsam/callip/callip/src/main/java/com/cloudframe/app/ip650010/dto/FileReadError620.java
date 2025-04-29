package com.cloudframe.app.ip650010.dto;

/**
*  The class FileReadError620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileReadError620 extends FileReadError620Serialized {
   



						@Getter @Setter private char[] badStatusCode620 = new char[2];

	
	/**
	* Constructor for FileReadError620
	**/
    public FileReadError620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR READING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 38
             ,16
             );
								setBadStatusCode620(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 56
             ,2
             );
    }





}
  
