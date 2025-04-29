package com.cloudframe.app.sf327010.dto;

/**
*  The class Sf535ZlogServiceEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf535ZlogServiceEntry extends Sf535ZlogServiceEntrySerialized { 
   

						@Getter @Setter private char[] sf535ZlogService = Field.fillLowValue(4);

						@Getter @Setter private char[] sf535ZservDesc = Field.fillLowValue(55);
	
	/**
	* Constructor for Sf535ZlogServiceEntry
	**/
    public Sf535ZlogServiceEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf535ZlogServiceEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
