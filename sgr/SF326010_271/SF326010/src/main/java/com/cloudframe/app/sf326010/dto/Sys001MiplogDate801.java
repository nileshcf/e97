package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogDate801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001MiplogDate801 extends Sys001MiplogDate801Serialized { 
   

						@Getter @Setter private char[] sys001MiplogDateMm801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogDateDd801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogDateYy801 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001MiplogDate801
	**/
    public Sys001MiplogDate801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys001MiplogDate801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogDate801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
