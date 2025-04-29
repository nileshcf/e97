package com.cloudframe.app.o529351u.dto;

/**
*  The class CetCicsErrorTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CetCicsErrorTable extends CetCicsErrorTableSerialized { 
   

						@Getter @Setter private char[] cetEibrcd = Field.fillLowValue(6);
	
	/**
	* Constructor for CetCicsErrorTable
	**/
    public CetCicsErrorTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CetCicsErrorTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
