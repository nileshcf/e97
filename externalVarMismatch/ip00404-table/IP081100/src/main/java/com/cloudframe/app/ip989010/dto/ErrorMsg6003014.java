package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003014 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003014 extends ErrorMsg6003014Serialized {
   


						@Getter @Setter private char[] rtnCd6003014 = new char[8];
	
	/**
	* Constructor for ErrorMsg6003014
	**/
    public ErrorMsg6003014() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("BAD RETURN CODE FROM DATE CONVERSION. RC=").toCharArray()
             , getStartOffset() + 0
             ,41
             );
								setRtnCd6003014(fillSpace(8));
    }





}
  
