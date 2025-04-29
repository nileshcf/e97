package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642ErrorMsg660 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar642ErrorMsg660 extends Ar642ErrorMsg660Serialized {
   



								@Getter @Setter private int ar642ReturnCode660;

							@Getter @Setter private char[] ar642ErrorMsg660ConditionGroup3 = new char[40];
						
	
	/**
	* Constructor for Ar642ErrorMsg660
	**/
    public Ar642ErrorMsg660() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6000-ERROR ENCOUNTERED IN AR642010").toCharArray()
             , getStartOffset() + 0
             ,34
             );
       replaceValue( // serialize and save the value
             (", RETURN-CODE: ").toCharArray()
             , getStartOffset() + 34
             ,15
             );
								setAr642ReturnCode660(0);
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 53
             ,40
             );
    }





}
  
