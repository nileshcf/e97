package com.cloudframe.app.ip343690.dto;

/**
*  The class DbSelectError8023006 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DbSelectError8023006 extends DbSelectError8023006Serialized {
   


	
	/**
	* Constructor for DbSelectError8023006
	**/
    public DbSelectError8023006() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("D ").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)3006,2)
             , getStartOffset() + 2
             ,2
             );
    }


 


	
	
	

		public static int getDbSelectError8023006FieldLength() {
			return DB_SELECT_ERROR_8023006_LENGTH;
		}

}
  
