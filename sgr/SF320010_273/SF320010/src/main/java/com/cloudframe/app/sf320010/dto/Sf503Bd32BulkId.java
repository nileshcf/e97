package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503Bd32BulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503Bd32BulkId extends Sf503Bd32BulkIdSerialized { 
   

						@Getter @Setter private char[] sf503Bd32Type = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf503Bd32BulkId
	**/
    public Sf503Bd32BulkId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503Bd32BulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
