package com.cloudframe.app.ip606130.dto;

/**
*  The class IoError600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IoError600 extends IoError600Serialized {
   


						@Getter @Setter private char[] fileName600 = new char[21];


						@Getter @Setter private char[] badIoStatusCode600 = new char[4];

	
	/**
	* Constructor for IoError600
	**/
    public IoError600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR IN FILE HANDLING   ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileName600(fillSpace(21));
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 46
             ,16
             );
								setBadIoStatusCode600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 66
             ,2
             );
    }





}
  
