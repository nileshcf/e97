package com.cloudframe.app.ip343900.dto;

/**
*  The class IoErrorSys067601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IoErrorSys067601 extends IoErrorSys067601Serialized {
   

						@Getter @Setter private char[] ioErrTxt601 = new char[40];


								@Getter @Setter private int sys067FileStat600;
	
	/**
	* Constructor for IoErrorSys067601
	**/
    public IoErrorSys067601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIoErrTxt601(fillSpace(40));
       replaceValue( // serialize and save the value
             ("FILE STATUS:").toCharArray()
             , getStartOffset() + 40
             ,12
             );
								setSys067FileStat600(0);
    }





}
  
