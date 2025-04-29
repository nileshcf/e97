package com.cloudframe.app.ip343690.dto;

/**
*  The class DbConnectError8023005 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
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





}
  
