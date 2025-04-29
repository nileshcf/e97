package com.cloudframe.app.cfabcall.dto;

/**
*  The class ErrorMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMessage extends ErrorMessageSerialized {
   

								@Getter @Setter private short errorLen;
	
	/**
	* Constructor for ErrorMessage
	**/
    public ErrorMessage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setErrorLen((short)720);
    }





}
  
