package com.cloudframe.app.ip343690.dto;

/**
*  The class Sys001ErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys001ErrMsgTxt600 extends Sys001ErrMsgTxt600Serialized {
   

						@Getter @Setter private char[] pmmWorkFileMsgDetail600 = new char[28];


						@Getter @Setter private char[] sys001Status600 = new char[2];
	
	/**
	* Constructor for Sys001ErrMsgTxt600
	**/
    public Sys001ErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPmmWorkFileMsgDetail600(fillSpace(28));
       replaceValue( // serialize and save the value
             ("STATUS:  ").toCharArray()
             , getStartOffset() + 28
             ,9
             );
								setSys001Status600(fillSpace(2));
    }





}
  
