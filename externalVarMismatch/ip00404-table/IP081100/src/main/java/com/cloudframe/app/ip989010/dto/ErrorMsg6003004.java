package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003004 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003004 extends ErrorMsg6003004Serialized {
   


						@Getter @Setter private char[] fileDd6003004 = new char[6];


						@Getter @Setter private char[] fileStat6003004 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003004
	**/
    public ErrorMsg6003004() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR WRITTING TO OUTPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
								setFileDd6003004(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 36
             ,16
             );
								setFileStat6003004(fillSpace(2));
    }





}
  
