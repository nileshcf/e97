package com.cloudframe.app.ip343690.dto;

/**
*  The class DbUpdateError8023010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DbUpdateError8023010 extends DbUpdateError8023010Serialized {
   


	
	/**
	* Constructor for DbUpdateError8023010
	**/
    public DbUpdateError8023010() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("D ").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)3010,2)
             , getStartOffset() + 2
             ,2
             );
    }


 


	
	
	

		public static int getDbUpdateError8023010FieldLength() {
			return DB_UPDATE_ERROR_8023010_LENGTH;
		}

}
  
