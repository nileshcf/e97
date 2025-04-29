package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultStatusMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ResultStatusMsg603 extends ResultStatusMsg603Serialized {
   


							@Getter @Setter private char[] resultStatusMsg603ConditionGroup2 = new char[14];
						


						@Getter @Setter private char[] resultEndptId603 = new char[7];


						@Getter @Setter private char[] resultStatus603 = new char[6];
	
	/**
	* Constructor for ResultStatusMsg603
	**/
    public ResultStatusMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0021-").toCharArray()
             , getStartOffset() + 0
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 5
             ,14
             );
       replaceValue( // serialize and save the value
             (" ENDPOINT ").toCharArray()
             , getStartOffset() + 19
             ,10
             );
								setResultEndptId603(fillSpace(7));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 36
             ,1
             );
								setResultStatus603(fillSpace(6));
    }





}
  
