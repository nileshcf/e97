package com.cloudframe.app.ip809050.dto;

/**
*  The class OutputOtbndErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class OutputOtbndErrMsgTxt600 extends OutputOtbndErrMsgTxt600Serialized {
   

						@Getter @Setter private char[] outputOutboundMsgDtl600 = new char[40];


						@Getter @Setter private char[] outputOtbndFileStatus600 = new char[2];
	
	/**
	* Constructor for OutputOtbndErrMsgTxt600
	**/
    public OutputOtbndErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setOutputOutboundMsgDtl600(fillSpace(40));
       replaceValue( // serialize and save the value
             (" FILE STATUS :      ").toCharArray()
             , getStartOffset() + 40
             ,20
             );
								setOutputOtbndFileStatus600(fillSpace(2));
    }





}
  
