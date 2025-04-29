package com.cloudframe.app.ar640010.dto;

/**
*  The class DatabaseMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DatabaseMsg600 extends DatabaseMsg600Serialized {
   


						@Getter @Setter private char[] databaseDbid600 = new char[8];


						@Getter @Setter private char[] databaseDbpkg600 = new char[18];
	
	/**
	* Constructor for DatabaseMsg600
	**/
    public DatabaseMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0012-DATABASE ID: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setDatabaseDbid600(fillSpace(8));
       replaceValue( // serialize and save the value
             (" PKG: ").toCharArray()
             , getStartOffset() + 26
             ,6
             );
								setDatabaseDbpkg600(fillSpace(18));
    }





}
  
