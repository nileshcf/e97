package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgCycl692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorConsMsgCycl692 extends ErrorConsMsgCycl692Serialized {
   


						@Getter @Setter private char[] errCycl692 = new char[3];
	
	/**
	* Constructor for ErrorConsMsgCycl692
	**/
    public ErrorConsMsgCycl692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" CYCLE: ").toCharArray()
             , getStartOffset() + 0
             ,8
             );
								setErrCycl692(fillSpace(3));
    }





}
  
