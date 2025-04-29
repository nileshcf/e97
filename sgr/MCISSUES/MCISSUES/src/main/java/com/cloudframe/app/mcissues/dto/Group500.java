package com.cloudframe.app.mcissues.dto;

/**
*  The class Group500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Group500 extends Group500Serialized { 
   

						@Getter @Setter private char[] data500 = Field.fillLowValue(4);
	
	/**
	* Constructor for Group500
	**/
    public Group500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Group500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Group500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
