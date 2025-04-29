package com.cloudframe.app.ip809050.dto;

/**
*  The class RunControlErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RunControlErrMsgTxt600 extends RunControlErrMsgTxt600Serialized {
   

						@Getter @Setter private char[] runControlMsgDtl600 = new char[35];


						@Getter @Setter private char[] runCtrlFileStatus600 = new char[2];
	
	/**
	* Constructor for RunControlErrMsgTxt600
	**/
    public RunControlErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRunControlMsgDtl600(fillSpace(35));
       replaceValue( // serialize and save the value
             (" FILE STATUS :      ").toCharArray()
             , getStartOffset() + 35
             ,20
             );
								setRunCtrlFileStatus600(fillSpace(2));
    }





}
  
