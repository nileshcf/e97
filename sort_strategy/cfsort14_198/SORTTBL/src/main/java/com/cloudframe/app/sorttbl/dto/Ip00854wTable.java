package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Ip00854wTable extends Ip00854wTableSerialized { 
   
			@Getter @Setter private List<Ip00854wEntry> ip00854wEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00854wTable
	**/
    public Ip00854wTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00854wTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
