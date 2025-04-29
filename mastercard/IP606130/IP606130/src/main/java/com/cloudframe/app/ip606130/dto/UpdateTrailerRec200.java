package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRec200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class UpdateTrailerRec200 extends UpdateTrailerRec200Serialized { 
   

						@Getter @Setter private char[] updateRestOfData200 = Field.fillLowValue(50);
	
	/**
	* Constructor for UpdateTrailerRec200
	**/
    public UpdateTrailerRec200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for UpdateTrailerRec200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
