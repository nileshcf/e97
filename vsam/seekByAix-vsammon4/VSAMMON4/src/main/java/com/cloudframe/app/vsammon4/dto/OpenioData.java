package com.cloudframe.app.vsammon4.dto;

/**
*  The class OpenioData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OpenioData extends OpenioDataSerialized { 
   

						@Getter @Setter private char[] iOpenMode = Field.fillLowValue(15);
	
	/**
	* Constructor for OpenioData
	**/
    public OpenioData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for OpenioData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OpenioData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
