package com.cloudframe.app.d529351u.dto;

/**
*  The class DsmFormattedSqlErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class DsmFormattedSqlErrMsg extends DsmFormattedSqlErrMsgSerialized { 
   
      private List<char[]> dsmFrmtdSqlErrMsg; 

	
	/**
	* Constructor for DsmFormattedSqlErrMsg
	**/
    public DsmFormattedSqlErrMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmFormattedSqlErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmFormattedSqlErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
