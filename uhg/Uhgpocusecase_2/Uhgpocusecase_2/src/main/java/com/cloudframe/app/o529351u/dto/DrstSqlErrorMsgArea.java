package com.cloudframe.app.o529351u.dto;

/**
*  The class DrstSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DrstSqlErrorMsgArea extends DrstSqlErrorMsgAreaSerialized { 
   

						@Getter @Setter private char[] drstErrTxt = Field.fillLowValue(30);
	
	/**
	* Constructor for DrstSqlErrorMsgArea
	**/
    public DrstSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DrstSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
