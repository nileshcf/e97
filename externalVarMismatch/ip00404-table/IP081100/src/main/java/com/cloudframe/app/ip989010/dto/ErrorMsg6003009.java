package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003009 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg6003009 extends ErrorMsg6003009Serialized {
   


						@Getter @Setter private char[] tag6003009 = new char[1];

	
	/**
	* Constructor for ErrorMsg6003009
	**/
    public ErrorMsg6003009() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID TAG '").toCharArray()
             , getStartOffset() + 0
             ,13
             );
								setTag6003009(fillSpace(1));
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 14
             ,1
             );
    }





}
  
