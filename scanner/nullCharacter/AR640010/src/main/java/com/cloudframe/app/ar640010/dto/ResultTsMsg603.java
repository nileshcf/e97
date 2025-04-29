package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultTsMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ResultTsMsg603 extends ResultTsMsg603Serialized {
   


						@Getter @Setter private char[] resultTs603 = new char[26];
	
	/**
	* Constructor for ResultTsMsg603
	**/
    public ResultTsMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setResultTs603(fillSpace(26));
    }





}
  
