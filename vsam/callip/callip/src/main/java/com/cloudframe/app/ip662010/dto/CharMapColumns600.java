package com.cloudframe.app.ip662010.dto;

/**
*  The class CharMapColumns600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CharMapColumns600 extends CharMapColumns600Serialized {
   

						@Getter @Setter private char[] ipmErrorColumns600 = new char[100];

	
	/**
	* Constructor for CharMapColumns600
	**/
    public CharMapColumns600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIpmErrorColumns600("----+----1----+----2----+----3----+----4----+----5----+----6----+----7----+----8----+----9----+----0".toCharArray());
       replaceValue( // serialize and save the value
             ("----+----1----+----2----+---").toCharArray()
             , getStartOffset() + 100
             ,28
             );
    }





}
  
