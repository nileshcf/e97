package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AidUserByteRedefined extends AidUserByteRedefinedSerialized { 
   

						@Getter @Setter private char[] aidAlphaApplNum = Field.fillLowValue(1);
	
	/**
	* Constructor for AidUserByteRedefined
	**/
    public AidUserByteRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AidUserByteRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
