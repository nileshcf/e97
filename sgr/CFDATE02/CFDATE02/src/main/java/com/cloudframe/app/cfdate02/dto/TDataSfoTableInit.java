package com.cloudframe.app.cfdate02.dto;

/**
*  The class TDataSfoTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TDataSfoTableInit extends TDataSfoTableInitSerialized {
   










	
	/**
	* Constructor for TDataSfoTableInit
	**/
    public TDataSfoTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 4
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 8
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 10
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 12
             ,2
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 14
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 24
             ,10
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 34,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 42,8);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 50
             ,4
             );
    }


 


	
	
	

		public static int getTDataSfoTableInitFieldLength() {
			return T_DATA_SFO_TABLE_INIT_LENGTH;
		}

}
  
