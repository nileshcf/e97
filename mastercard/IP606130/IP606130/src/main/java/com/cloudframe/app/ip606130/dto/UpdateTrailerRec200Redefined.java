package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRec200Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class UpdateTrailerRec200Redefined extends UpdateTrailerRec200RedefinedSerialized { 
   

						@Getter @Setter private char[] updateTrailerTable1200 = Field.fillLowValue(8);

								@Getter @Setter private long updateTrailerCount1200;
	
	/**
	* Constructor for UpdateTrailerRec200Redefined
	**/
    public UpdateTrailerRec200Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for UpdateTrailerRec200Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
