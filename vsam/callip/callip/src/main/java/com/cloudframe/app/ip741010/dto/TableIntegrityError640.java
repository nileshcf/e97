package com.cloudframe.app.ip741010.dto;

/**
*  The class TableIntegrityError640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TableIntegrityError640 extends TableIntegrityError640Serialized {
   

						@Getter @Setter private char[] tableId640 = new char[8];


						@Getter @Setter private char[] timestamp640 = new char[10];

	
	/**
	* Constructor for TableIntegrityError640
	**/
    public TableIntegrityError640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId640(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 8
             ,2
             );
								setTimestamp640(fillSpace(10));
       replaceValue( // serialize and save the value
             (", DOES NOT HAVE AN INTEGRAL NUMBER OF ROWS.").toCharArray()
             , getStartOffset() + 20
             ,43
             );
    }





}
  
