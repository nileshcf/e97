package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501JIsoDataRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501JIsoDataRedefined extends Sf501JIsoDataRedefinedSerialized { 
   

						@Getter @Setter private char[] sf501J3Data = Field.fillLowValue(7912);
	
	/**
	* Constructor for Sf501JIsoDataRedefined
	**/
    public Sf501JIsoDataRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf501JIsoDataRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501JIsoDataRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
