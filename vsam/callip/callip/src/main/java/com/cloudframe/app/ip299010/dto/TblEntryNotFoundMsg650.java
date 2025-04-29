package com.cloudframe.app.ip299010.dto;

/**
*  The class TblEntryNotFoundMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TblEntryNotFoundMsg650 extends TblEntryNotFoundMsg650Serialized {
   


						@Getter @Setter private char[] tableId650 = new char[8];


						@Getter @Setter private char[] effDtTm650 = new char[10];

	
	/**
	* Constructor for TblEntryNotFoundMsg650
	**/
    public TblEntryNotFoundMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NO TABLE ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId650(fillSpace(8));
       replaceValue( // serialize and save the value
             (" RECORDS FOUND ON TABLE 5 FOR ").toCharArray()
             , getStartOffset() + 17
             ,30
             );
								setEffDtTm650(fillSpace(10));
       replaceValue( // serialize and save the value
             (" EFFECTIVE DATE AND TIME.").toCharArray()
             , getStartOffset() + 57
             ,25
             );
    }





}
  
