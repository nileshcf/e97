package com.cloudframe.app.search3.dto;

/**
*  The class Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Table extends TableSerialized { 
   
			@Getter @Setter private List<TableEntry> tableEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Table
	**/
    public Table() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
