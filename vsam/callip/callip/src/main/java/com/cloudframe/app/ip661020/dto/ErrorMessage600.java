package com.cloudframe.app.ip661020.dto;

/**
*  The class ErrorMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMessage600 extends ErrorMessage600Serialized {
   


						@Getter @Setter private char[] errorParagraph600 = new char[4];


						@Getter @Setter private char[] failingAction600 = new char[5];


						@Getter @Setter private char[] badStatusCode600 = new char[2];

	
	/**
	* Constructor for ErrorMessage600
	**/
    public ErrorMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP661020").toCharArray()
             , getStartOffset() + 0
             ,8
             );
								setErrorParagraph600(fillSpace(4));
       replaceValue( // serialize and save the value
             (": I/O ERROR DURING ").toCharArray()
             , getStartOffset() + 12
             ,19
             );
								setFailingAction600(fillSpace(5));
       replaceValue( // serialize and save the value
             (" ON IPM FILE.  STATUS CODE = \"").toCharArray()
             , getStartOffset() + 36
             ,30
             );
								setBadStatusCode600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 68
             ,2
             );
    }





}
  
