package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgBulkid692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorConsMsgBulkid692 extends ErrorConsMsgBulkid692Serialized {
   


						@Getter @Setter private char[] errBulkid692 = new char[4];
	
	/**
	* Constructor for ErrorConsMsgBulkid692
	**/
    public ErrorConsMsgBulkid692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" BULKID: ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setErrBulkid692(fillSpace(4));
    }





}
  
