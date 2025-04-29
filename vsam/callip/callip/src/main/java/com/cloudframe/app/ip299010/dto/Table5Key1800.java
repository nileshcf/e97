package com.cloudframe.app.ip299010.dto;

/**
*  The class Table5Key1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Table5Key1800 extends Table5Key1800Serialized {
   

						@Getter @Setter private char[] tableId800 = new char[8];

	
	/**
	* Constructor for Table5Key1800
	**/
    public Table5Key1800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId800(fillSpace(8));
       replaceValue( // serialize and save the value
             getBinaryString((long)0L,4)
             , getStartOffset() + 8
             ,4
             );
    }





}
  
