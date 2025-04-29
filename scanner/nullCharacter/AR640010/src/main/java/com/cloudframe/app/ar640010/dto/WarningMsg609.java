package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WarningMsg609 extends WarningMsg609Serialized {
   


						@Getter @Setter private char[] warningResponse609 = new char[4];

	
	/**
	* Constructor for WarningMsg609
	**/
    public WarningMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0091-WARNING MSG: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setWarningResponse609(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
    }





}
  
