package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionTableGroup510 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FunctionTableGroup510 extends FunctionTableGroup510Serialized {
   

						@Getter @Setter private char[] functionTable510 = new char[490];
					@Getter @Setter private FunctionTable510Redefined functionTable510Redefined = new FunctionTable510Redefined();
	
	/**
	* Constructor for FunctionTableGroup510
	**/
    public FunctionTableGroup510() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFunctionTable510Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setFunctionTable510("A=ADD APPLICATION FILE FOR SUBSEQUENT RETRIEVAL  B=BROADCAST FILE TO ALL ELLIGIBLE BULK ENDPOINTS C=COUNT INBOUND FILES FOR SPECIFIED BULK ID/TYPE I=INSTALL POST-APPLICATION EXIT FILE & ENDPOINTS L=BROADCAST FILE TO ELIGIBLE \"LISTED\" ENDPOINTS  R=RETRIEVE FILE FOR APPLICATION PROCESSING       F=FIFO RETRIEVE FILE FOR APPLICATION PROCESSING  S=SEND APPLICATION FILE TO SPECIFIC ENDPOINT     X=RESET APPLICATION FILE STATUS CODE             ?=FUNCTION REQUEST CODE UNKNOWN TO GFT API MNGR  ".toCharArray());
    }





}
  
