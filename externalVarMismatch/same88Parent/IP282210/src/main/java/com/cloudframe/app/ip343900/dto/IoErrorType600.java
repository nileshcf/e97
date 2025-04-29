package com.cloudframe.app.ip343900.dto;

/**
*  The class IoErrorType600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IoErrorType600 extends IoErrorType600Serialized {
   

						@Getter @Setter private char[] ioErrTxt600 = new char[40];


								@Getter @Setter private int sys001FileStat600;

						@Getter @Setter private char[] noOfRecords600 = new char[55];
	
	/**
	* Constructor for IoErrorType600
	**/
    public IoErrorType600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIoErrTxt600(fillSpace(40));
       replaceValue( // serialize and save the value
             ("FILE STATUS:").toCharArray()
             , getStartOffset() + 40
             ,12
             );
								setSys001FileStat600(0);
								setNoOfRecords600(("TOTAL NUMBER OF RECORDS INSERTED IN TIPAPIM TABLE =    ").toCharArray());
    }





}
  
