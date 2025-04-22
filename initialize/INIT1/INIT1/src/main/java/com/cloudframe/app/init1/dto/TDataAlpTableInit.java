package com.cloudframe.app.init1.dto;

/**
*  The class TDataAlpTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TDataAlpTableInit extends TDataAlpTableInitSerialized {
   











	
	/**
	* Constructor for TDataAlpTableInit
	**/
    public TDataAlpTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 4
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 6
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 10
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 12
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 15
             ,2
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 17
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 37,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 45,8);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 53
             ,2
             );
    }


 


	
	
	

		public static int getTDataAlpTableInitFieldLength() {
			return T_DATA_ALP_TABLE_INIT_LENGTH;
		}

}
  
