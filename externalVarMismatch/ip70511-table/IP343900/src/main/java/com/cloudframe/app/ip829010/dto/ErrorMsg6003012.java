package com.cloudframe.app.ip829010.dto;

/**
*  The class ErrorMsg6003012 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003012 extends ErrorMsg6003012Serialized {
   


						@Getter @Setter private char[] fileDd6003012 = new char[8];


						@Getter @Setter private char[] fileStat6003012 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003012
	**/
    public ErrorMsg6003012() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR CLOSING FILE ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setFileDd6003012(fillSpace(8));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 27
             ,16
             );
								setFileStat6003012(fillSpace(2));
    }





}
  
