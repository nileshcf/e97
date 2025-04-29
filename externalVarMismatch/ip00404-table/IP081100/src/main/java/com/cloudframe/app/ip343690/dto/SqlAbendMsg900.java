package com.cloudframe.app.ip343690.dto;

/**
*  The class SqlAbendMsg900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqlAbendMsg900 extends SqlAbendMsg900Serialized {
   


								@Getter @Setter private char[] abendSqlCode900 = Field.fillLowValue(10);


						@Getter @Setter private char[] abendSqlerrmc900 = new char[50];
	
	/**
	* Constructor for SqlAbendMsg900
	**/
    public SqlAbendMsg900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP343690-ABEND-SQL-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 35
             ,1
             );
								setAbendSqlerrmc900(fillSpace(50));
    }





}
  
