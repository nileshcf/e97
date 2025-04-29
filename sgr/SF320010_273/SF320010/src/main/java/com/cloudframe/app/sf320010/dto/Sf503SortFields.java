package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503SortFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503SortFields extends Sf503SortFieldsSerialized { 
   

						@Getter @Setter private char[] sf503SortMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503SortDate = Field.fillLowValue(6);

						@Getter @Setter private char[] sf503SortTime = Field.fillLowValue(6);
	
	/**
	* Constructor for Sf503SortFields
	**/
    public Sf503SortFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503SortFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503SortFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
