package com.cloudframe.app.ip200090.dto;

/**
*  The class ErrorMessage610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMessage610 extends ErrorMessage610Serialized {
   


								@Getter @Setter private long editNumber610;
	
	/**
	* Constructor for ErrorMessage610
	**/
    public ErrorMessage610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             "SYNTAX DRIVER IS CALLED FOR INVALID REQUIREMENT EDIT NUMBER : ".toCharArray()
             , getStartOffset() + 0
             ,62
             );
    }





}
  
