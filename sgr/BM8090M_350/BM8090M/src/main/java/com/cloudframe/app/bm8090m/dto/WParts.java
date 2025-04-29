package com.cloudframe.app.bm8090m.dto;

/**
*  The class WParts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WParts extends WPartsSerialized { 
   

						@Getter @Setter private char[] wPart2 = Field.fillLowValue(6);
	
	/**
	* Constructor for WParts
	**/
    public WParts() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WParts. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WParts(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
