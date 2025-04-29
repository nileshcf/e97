package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CopybookEntry500 extends CopybookEntry500Serialized { 
   

						@Getter @Setter private char[] copybookDate500 = Field.fillLowValue(10);

						@Getter @Setter private char[] copybookMod500 = Field.fillLowValue(1);
	
	/**
	* Constructor for CopybookEntry500
	**/
    public CopybookEntry500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CopybookEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
