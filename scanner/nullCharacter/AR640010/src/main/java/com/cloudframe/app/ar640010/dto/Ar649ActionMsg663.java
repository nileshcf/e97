package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649ActionMsg663 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar649ActionMsg663 extends Ar649ActionMsg663Serialized {
   


								@Getter @Setter private int ar649ActionCode663;
	
	/**
	* Constructor for Ar649ActionMsg663
	**/
    public Ar649ActionMsg663() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6032-AR649010 FTSS CONFIG UTILITY, ACTION-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,48
             );
								setAr649ActionCode663(0);
    }





}
  
