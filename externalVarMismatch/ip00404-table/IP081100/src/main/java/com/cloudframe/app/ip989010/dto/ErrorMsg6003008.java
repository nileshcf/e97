package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003008 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003008 extends ErrorMsg6003008Serialized {
   


						@Getter @Setter private char[] table6003008 = new char[21];


						@Getter @Setter private char[] maxSize6003008 = new char[8];
	
	/**
	* Constructor for ErrorMsg6003008
	**/
    public ErrorMsg6003008() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE ").toCharArray()
             , getStartOffset() + 0
             ,6
             );
								setTable6003008(fillSpace(21));
       replaceValue( // serialize and save the value
             (" EXCEEDED MAX SIZE OF ").toCharArray()
             , getStartOffset() + 27
             ,22
             );
								setMaxSize6003008(fillSpace(8));
    }





}
  
