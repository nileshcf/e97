package com.cloudframe.app.cfdate02.dto;

/**
*  The class TSpoAlwTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TSpoAlwTableInit extends TSpoAlwTableInitSerialized {
   


















	
	/**
	* Constructor for TSpoAlwTableInit
	**/
    public TSpoAlwTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 4
             ,26
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 30
             ,26
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 56
             ,26
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 82
             ,26
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 108
             ,26
             );
       replaceValue( // serialize and save the value
             ("0001-01-01-00.00.00.000000").toCharArray()
             , getStartOffset() + 134
             ,26
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 160
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 170
             ,10
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 180
             ,8
             );
       replaceValue( // serialize and save the value
             ("99991231").toCharArray()
             , getStartOffset() + 188
             ,8
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 196
             ,8
             );
       replaceValue( // serialize and save the value
             ("99991231").toCharArray()
             , getStartOffset() + 204
             ,8
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 212
             ,8
             );
       replaceValue( // serialize and save the value
             ("99991231").toCharArray()
             , getStartOffset() + 220
             ,8
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 228
             ,8
             );
       replaceValue( // serialize and save the value
             ("99991231").toCharArray()
             , getStartOffset() + 236
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 244
             ,1
             );
    }


 


	
	
	

		public static int getTSpoAlwTableInitFieldLength() {
			return T_SPO_ALW_TABLE_INIT_LENGTH;
		}

}
  
