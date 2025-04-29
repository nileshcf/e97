package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciwinFormats800Redefined extends MciwinFormats800RedefinedSerialized { 
   

								@Getter @Setter private int mciwin2DigitYearPd800;

	
	/**
	* Constructor for MciwinFormats800Redefined
	**/
    public MciwinFormats800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciwinFormats800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
