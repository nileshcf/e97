package com.cloudframe.app.search3.dto;

/**
*  The class TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TableEntry extends TableEntrySerialized { 
   

						@Getter @Setter private char[] var1 = Field.fillLowValue(2);

								@Getter @Setter private int var2;
	
	/**
	* Constructor for TableEntry
	**/
    public TableEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TableEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
