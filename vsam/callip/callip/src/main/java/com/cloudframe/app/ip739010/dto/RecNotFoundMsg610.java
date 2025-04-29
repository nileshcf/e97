package com.cloudframe.app.ip739010.dto;

/**
*  The class RecNotFoundMsg610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RecNotFoundMsg610 extends RecNotFoundMsg610Serialized {
   


						@Getter @Setter private char[] tableId610 = new char[8];

	
	/**
	* Constructor for RecNotFoundMsg610
	**/
    public RecNotFoundMsg610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NO TABLE ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId610(fillSpace(8));
       replaceValue( // serialize and save the value
             (" RECORDS FOUND IN OPTIMIZED PARAMETER FILE").toCharArray()
             , getStartOffset() + 17
             ,42
             );
    }





}
  
