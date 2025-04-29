package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MonthEntries extends MonthEntriesSerialized { 
   

								@Getter @Setter private int monthNoDays;
	
	/**
	* Constructor for MonthEntries
	**/
    public MonthEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MonthEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonthEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
