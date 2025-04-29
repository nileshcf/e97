package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003005 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003005 extends ErrorMsg6003005Serialized {
   


						@Getter @Setter private char[] fileDd6003005 = new char[6];

	
	/**
	* Constructor for ErrorMsg6003005
	**/
    public ErrorMsg6003005() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("FILE ").toCharArray()
             , getStartOffset() + 0
             ,5
             );
								setFileDd6003005(fillSpace(6));
       replaceValue( // serialize and save the value
             (" IS EMPTY").toCharArray()
             , getStartOffset() + 11
             ,9
             );
    }





}
  
