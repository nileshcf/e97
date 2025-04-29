package com.cloudframe.app.ip343690.dto;

/**
*  The class Msg3001a600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Msg3001a600 extends Msg3001a600Serialized {
   


						@Getter @Setter private char[] msg3001aFileStatus600 = new char[2];
	
	/**
	* Constructor for Msg3001a600
	**/
    public Msg3001a600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR PROCESSING DB2CLONE FILE:                 ").toCharArray()
             , getStartOffset() + 0
             ,48
             );
								setMsg3001aFileStatus600(fillSpace(2));
    }





}
  
