package com.cloudframe.app.ip650010.dto;

/**
*  The class RecordsReadMessage640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class RecordsReadMessage640 extends RecordsReadMessage640Serialized {
   


						@Getter @Setter private char[] tableId640 = new char[8];


						@Getter @Setter private char[] effDate640 = new char[10];


								@Getter @Setter private char[] recReadCnt640 = new char[5];
							

	
	/**
	* Constructor for RecordsReadMessage640
	**/
    public RecordsReadMessage640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP650010-TABLE ").toCharArray()
             , getStartOffset() + 0
             ,15
             );
								setTableId640(fillSpace(8));
       replaceValue( // serialize and save the value
             (" FOR EFFECTIVE DATE ").toCharArray()
             , getStartOffset() + 23
             ,20
             );
								setEffDate640(fillSpace(10));
       replaceValue( // serialize and save the value
             (", RECORDS READ = ").toCharArray()
             , getStartOffset() + 53
             ,17
             );
								setRecReadCnt640(CFUtil.cobolNumberFormatter("ZZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 75
             ,1
             );
    }





}
  
