package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003003 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003003 extends ErrorMsg6003003Serialized {
   


						@Getter @Setter private char[] fileDd6003003 = new char[6];


						@Getter @Setter private char[] fileStat6003003 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003003
	**/
    public ErrorMsg6003003() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR OPENING OUTPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,26
             );
								setFileDd6003003(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 32
             ,16
             );
								setFileStat6003003(fillSpace(2));
    }





}
  
