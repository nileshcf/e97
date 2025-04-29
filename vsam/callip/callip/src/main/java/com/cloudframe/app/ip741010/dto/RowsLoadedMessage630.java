package com.cloudframe.app.ip741010.dto;

/**
*  The class RowsLoadedMessage630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class RowsLoadedMessage630 extends RowsLoadedMessage630Serialized {
   


						@Getter @Setter private char[] tableId630 = new char[8];


						@Getter @Setter private char[] tableTimestamp630 = new char[10];


								@Getter @Setter private char[] rowsLoadedCnt630 = new char[4];
							

	
	/**
	* Constructor for RowsLoadedMessage630
	**/
    public RowsLoadedMessage630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP741010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId630(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 17
             ,2
             );
								setTableTimestamp630(fillSpace(10));
       replaceValue( // serialize and save the value
             (": ROWS LOADED = ").toCharArray()
             , getStartOffset() + 29
             ,16
             );
								setRowsLoadedCnt630(CFUtil.cobolNumberFormatter("ZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 49
             ,29
             );
    }





}
  
