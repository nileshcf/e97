package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003006 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003006 extends ErrorMsg6003006Serialized {
   


						@Getter @Setter private char[] fileDd6003006 = new char[6];


								@Getter @Setter private long recNum6003006;
	
	/**
	* Constructor for ErrorMsg6003006
	**/
    public ErrorMsg6003006() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID FIELD READ IN ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
								setFileDd6003006(fillSpace(6));
       replaceValue( // serialize and save the value
             (" RECORD # ").toCharArray()
             , getStartOffset() + 28
             ,10
             );
								setRecNum6003006(0L);
    }





}
  
