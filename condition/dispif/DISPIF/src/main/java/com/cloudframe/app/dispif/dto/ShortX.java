package com.cloudframe.app.dispif.dto;

/**
*  The class ShortX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ShortX extends ShortXSerialized { 
   

						@Getter @Setter private char[] shortX2 = Field.fillLowValue(1);
	
	/**
	* Constructor for ShortX
	**/
    public ShortX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ShortX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ShortX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
