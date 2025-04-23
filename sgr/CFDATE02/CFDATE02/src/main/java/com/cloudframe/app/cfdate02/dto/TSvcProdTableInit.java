package com.cloudframe.app.cfdate02.dto;

/**
*  The class TSvcProdTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TSvcProdTableInit extends TSvcProdTableInitSerialized {
   












	
	/**
	* Constructor for TSvcProdTableInit
	**/
    public TSvcProdTableInit() {
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
             getBinaryString((int)0,4)
             , getStartOffset() + 8
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 12
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 16
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 18
             ,2
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 20
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 30
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 40
             ,10
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 50,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 58,8);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 66
             ,2
             );
    }


 


	
	
	

		public static int getTSvcProdTableInitFieldLength() {
			return T_SVC_PROD_TABLE_INIT_LENGTH;
		}

}
  
