package com.cloudframe.app.cfdate02.dto;

/**
*  The class TMtnStatTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TMtnStatTableInit extends TMtnStatTableInitSerialized {
   








	
	/**
	* Constructor for TMtnStatTableInit
	**/
    public TMtnStatTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 11
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 21
             ,2
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 23
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 33
             ,10
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 43,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 51,8);
    }


 


	
	
	

		public static int getTMtnStatTableInitFieldLength() {
			return T_MTN_STAT_TABLE_INIT_LENGTH;
		}

}
  
