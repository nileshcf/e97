package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647ErrorMsg661 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar647ErrorMsg661 extends Ar647ErrorMsg661Serialized {
   



								@Getter @Setter private int ar647ReturnCode661;
	
	/**
	* Constructor for Ar647ErrorMsg661
	**/
    public Ar647ErrorMsg661() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6010-ERROR ENCOUNTERED IN AR647010 RENAME SUB-PGM").toCharArray()
             , getStartOffset() + 0
             ,49
             );
       replaceValue( // serialize and save the value
             (", RETURN-CODE: ").toCharArray()
             , getStartOffset() + 49
             ,15
             );
								setAr647ReturnCode661(0);
    }





}
  
