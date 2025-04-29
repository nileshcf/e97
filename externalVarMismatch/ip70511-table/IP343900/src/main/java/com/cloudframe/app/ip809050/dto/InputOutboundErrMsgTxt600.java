package com.cloudframe.app.ip809050.dto;

/**
*  The class InputOutboundErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InputOutboundErrMsgTxt600 extends InputOutboundErrMsgTxt600Serialized {
   

						@Getter @Setter private char[] inputOutboundMsgDtl600 = new char[40];


						@Getter @Setter private char[] inputOtbndFileStatus600 = new char[2];
	
	/**
	* Constructor for InputOutboundErrMsgTxt600
	**/
    public InputOutboundErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInputOutboundMsgDtl600(fillSpace(40));
       replaceValue( // serialize and save the value
             (" FILE STATUS : ").toCharArray()
             , getStartOffset() + 40
             ,15
             );
								setInputOtbndFileStatus600(fillSpace(2));
    }





}
  
