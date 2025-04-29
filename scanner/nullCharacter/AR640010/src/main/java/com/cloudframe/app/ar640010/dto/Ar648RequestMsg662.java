package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648RequestMsg662 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Ar648RequestMsg662 extends Ar648RequestMsg662Serialized {
   


								@Getter @Setter private char[] ar648RequestCode662 = new char[5];
							

							@Getter @Setter private char[] ar648RequestMsg662ConditionGroup2 = new char[22];
						
	
	/**
	* Constructor for Ar648RequestMsg662
	**/
    public Ar648RequestMsg662() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6021-REQUEST CODE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr648RequestCode662(fillSpace(5));
       replaceValue( // serialize and save the value
             fillSpace(22)
             , getStartOffset() + 24
             ,22
             );
    }





}
  
