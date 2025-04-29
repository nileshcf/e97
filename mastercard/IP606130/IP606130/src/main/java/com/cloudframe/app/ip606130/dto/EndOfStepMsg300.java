package com.cloudframe.app.ip606130.dto;

/**
*  The class EndOfStepMsg300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EndOfStepMsg300 extends EndOfStepMsg300Serialized {
   




								@Getter @Setter private int condCode300;
	
	/**
	* Constructor for EndOfStepMsg300
	**/
    public EndOfStepMsg300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP606130").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-9999-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("END OF STEP, CONDITION CODE  :").toCharArray()
             , getStartOffset() + 14
             ,30
             );
								setCondCode300(0);
    }





}
  
