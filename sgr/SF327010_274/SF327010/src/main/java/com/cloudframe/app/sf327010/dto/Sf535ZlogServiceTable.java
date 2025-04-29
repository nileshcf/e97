package com.cloudframe.app.sf327010.dto;

/**
*  The class Sf535ZlogServiceTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Sf535ZlogServiceTable extends Sf535ZlogServiceTableSerialized { 
   
			@Getter @Setter private List<Sf535ZlogServiceEntry> sf535ZlogServiceEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Sf535ZlogServiceTable
	**/
    public Sf535ZlogServiceTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf535ZlogServiceTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
