package com.cloudframe.app.iovb32k.dto;

/**
*  The class DataValues is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DataValues extends DataValuesSerialized {
   





	
	/**
	* Constructor for DataValues
	**/
    public DataValues() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ABCDEFGHIJKLM").toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             ("NOPQRSTUVWXYZ").toCharArray()
             , getStartOffset() + 13
             ,13
             );
       replaceValue( // serialize and save the value
             ("0123456789").toCharArray()
             , getStartOffset() + 26
             ,10
             );
       replaceValue( // serialize and save the value
             ("!@#$%&*()-+=|").toCharArray()
             , getStartOffset() + 36
             ,13
             );
       replaceValue( // serialize and save the value
             ("\\/.,<>?").toCharArray()
             , getStartOffset() + 49
             ,7
             );
    }


 


	
	
	

		public static int getDataValuesFieldLength() {
			return DATA_VALUES_LENGTH;
		}

}
  
