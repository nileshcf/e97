package com.cloudframe.app.ip343690.dto;

/**
*  The class DbConnectError8023005 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DbConnectError8023005 extends DbConnectError8023005Serialized {
   


	
	/**
	* Constructor for DbConnectError8023005
	**/
    public DbConnectError8023005() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("D ").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)3005,2)
             , getStartOffset() + 2
             ,2
             );
    }


 


	
	
	

		public static int getDbConnectError8023005FieldLength() {
			return DB_CONNECT_ERROR_8023005_LENGTH;
		}

}
  
