package com.cloudframe.app.ip809050.dto;

/**
*  The class ReadParserErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ReadParserErrMsgTxt600 extends ReadParserErrMsgTxt600Serialized {
   

						@Getter @Setter private char[] readParserMsgDtl600 = new char[47];


						@Getter @Setter private char[] readParserReturnCode600 = new char[4];
	
	/**
	* Constructor for ReadParserErrMsgTxt600
	**/
    public ReadParserErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setReadParserMsgDtl600(fillSpace(47));
       replaceValue( // serialize and save the value
             ("RETURN CODE:  ").toCharArray()
             , getStartOffset() + 47
             ,14
             );
								setReadParserReturnCode600(fillSpace(4));
    }





}
  
