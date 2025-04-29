package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003002 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003002 extends ErrorMsg6003002Serialized {
   


						@Getter @Setter private char[] fileDd6003002 = new char[6];


						@Getter @Setter private char[] fileStat6003002 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003002
	**/
    public ErrorMsg6003002() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR OPENING INPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileDd6003002(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 31
             ,16
             );
								setFileStat6003002(fillSpace(2));
    }





}
  
