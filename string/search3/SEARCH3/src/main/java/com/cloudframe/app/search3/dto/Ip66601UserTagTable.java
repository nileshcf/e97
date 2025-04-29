package com.cloudframe.app.search3.dto;

/**
*  The class Ip66601UserTagTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Ip66601UserTagTable extends Ip66601UserTagTableSerialized { 
   
			@Getter @Setter private List<Ip66601UserTag> ip66601UserTag = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip66601UserTagTable
	**/
    public Ip66601UserTagTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66601UserTagTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
