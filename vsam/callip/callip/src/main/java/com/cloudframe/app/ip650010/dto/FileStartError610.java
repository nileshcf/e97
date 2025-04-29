package com.cloudframe.app.ip650010.dto;

/**
*  The class FileStartError610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileStartError610 extends FileStartError610Serialized {
   



						@Getter @Setter private char[] badStatusCode610 = new char[2];

	
	/**
	* Constructor for FileStartError610
	**/
    public FileStartError610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR POSITIONING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,42
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 42
             ,16
             );
								setBadStatusCode610(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 60
             ,2
             );
    }





}
  
