package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648ReturnMsg662 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Ar648ReturnMsg662 extends Ar648ReturnMsg662Serialized {
   


								@Getter @Setter private char[] ar648ReturnCode662 = new char[5];
							

							@Getter @Setter private char[] ar648ReturnMsg662ConditionGroup2 = new char[47];
						
	
	/**
	* Constructor for Ar648ReturnMsg662
	**/
    public Ar648ReturnMsg662() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6022-RETURN-CODE:  ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr648ReturnCode662(fillSpace(5));
       replaceValue( // serialize and save the value
             fillSpace(47)
             , getStartOffset() + 24
             ,47
             );
    }





}
  
