package com.cloudframe.app.comput3.dto;

/**
*  The class WcVolumeTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class WcVolumeTable extends WcVolumeTableSerialized { 
   
			@Getter @Setter private List<WcVolumeGroup> wcVolumeGroup = new ArrayList<>();
    	
	
	/**
	* Constructor for WcVolumeTable
	**/
    public WcVolumeTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcVolumeTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
