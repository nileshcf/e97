package com.cloudframe.app.ip343690.dto;

/**
*  The class SleepMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SleepMessage600 extends SleepMessage600Serialized {
   


								@Getter @Setter private long sleepTime600;


						@Getter @Setter private char[] currTime600 = new char[8];
	
	/**
	* Constructor for SleepMessage600
	**/
    public SleepMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP343690-SLEEPING (SHORT) FOR : HHMMSSMS : ").toCharArray()
             , getStartOffset() + 0
             ,43
             );
								setSleepTime600(0L);
       replaceValue( // serialize and save the value
             (" AT CURRENT TIME : ").toCharArray()
             , getStartOffset() + 51
             ,19
             );
								setCurrTime600(fillSpace(8));
    }





}
  
