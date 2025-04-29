package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningMsg604 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WarningMsg604 extends WarningMsg604Serialized {
   


						@Getter @Setter private char[] warningResponse604 = new char[4];

	
	/**
	* Constructor for WarningMsg604
	**/
    public WarningMsg604() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0040-WARNING MSG: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setWarningResponse604(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
    }





}
  
