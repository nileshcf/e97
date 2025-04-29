package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class IsinTable extends IsinTableSerialized { 
   
			@Getter @Setter private List<IsinEntry> isinEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for IsinTable
	**/
    public IsinTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IsinTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
