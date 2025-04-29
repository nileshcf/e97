package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorDescMsg690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorDescMsg690 extends ErrorDescMsg690Serialized {
   


						@Getter @Setter private char[] errorResponse690 = new char[4];

	
	/**
	* Constructor for ErrorDescMsg690
	**/
    public ErrorDescMsg690() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR DESC : ").toCharArray()
             , getStartOffset() + 0
             ,13
             );
								setErrorResponse690(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 17
             ,3
             );
    }





}
  
