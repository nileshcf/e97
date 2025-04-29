package com.cloudframe.app.ar640010.dto;

/**
*  The class SetupProblemMsg606 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SetupProblemMsg606 extends SetupProblemMsg606Serialized {
   


							@Getter @Setter private char[] setupProblemMsg606ConditionGroup2 = new char[40];
						
	
	/**
	* Constructor for SetupProblemMsg606
	**/
    public SetupProblemMsg606() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0060-ENDPOINT SETUP PROBLEM - ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 30
             ,40
             );
    }





}
  
