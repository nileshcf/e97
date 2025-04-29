package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class MonthTableRedefined extends MonthTableRedefinedSerialized { 
   
			@Getter @Setter private List<MonthEntries> monthEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for MonthTableRedefined
	**/
    public MonthTableRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MonthTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonthTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
