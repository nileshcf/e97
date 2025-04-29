package com.cloudframe.app.mcissues.dto;

/**
*  The class PreEditVersion300Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PreEditVersion300Redefined extends PreEditVersion300RedefinedSerialized { 
   

						@Getter @Setter private char[] peVerYy300 = Field.fillLowValue(2);

						@Getter @Setter private char[] peRelease300 = Field.fillLowValue(1);

						@Getter @Setter private char[] peVerSequence300 = Field.fillLowValue(2);
	
	/**
	* Constructor for PreEditVersion300Redefined
	**/
    public PreEditVersion300Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PreEditVersion300Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PreEditVersion300Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
