package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTagData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ComnTagData500 extends ComnTagData500Serialized { 
   

								@Getter @Setter private int comnTagLen500;

						@Getter @Setter private char[] comnTagValue500 = Field.fillLowValue(999);
	
	/**
	* Constructor for ComnTagData500
	**/
    public ComnTagData500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ComnTagData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
