package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTable580Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class WarningTable580Redefined extends WarningTable580RedefinedSerialized { 
   
			@Getter @Setter private List<WarningTableGroup580Array1> warningTableGroup580Array1 = new ArrayList<>();
    	
	
	/**
	* Constructor for WarningTable580Redefined
	**/
    public WarningTable580Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WarningTable580Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTable580Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
