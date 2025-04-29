package com.cloudframe.app.ip739010.dto;

/**
*  The class TableOverflowError600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TableOverflowError600 extends TableOverflowError600Serialized {
   

						@Getter @Setter private char[] tableId600 = new char[8];


						@Getter @Setter private char[] timestamp600 = new char[10];

	
	/**
	* Constructor for TableOverflowError600
	**/
    public TableOverflowError600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId600(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 8
             ,2
             );
								setTimestamp600(fillSpace(10));
       replaceValue( // serialize and save the value
             (", TABLE OVERFLOW.").toCharArray()
             , getStartOffset() + 20
             ,17
             );
    }





}
  
