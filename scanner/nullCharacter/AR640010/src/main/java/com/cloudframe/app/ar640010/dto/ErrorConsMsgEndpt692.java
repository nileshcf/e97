package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgEndpt692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorConsMsgEndpt692 extends ErrorConsMsgEndpt692Serialized {
   


						@Getter @Setter private char[] errEndpoint692 = new char[7];
	
	/**
	* Constructor for ErrorConsMsgEndpt692
	**/
    public ErrorConsMsgEndpt692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ENDPOINT: ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setErrEndpoint692(fillSpace(7));
    }





}
  
