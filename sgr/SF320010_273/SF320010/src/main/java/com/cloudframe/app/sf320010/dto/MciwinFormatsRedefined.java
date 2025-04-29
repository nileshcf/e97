package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinFormatsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciwinFormatsRedefined extends MciwinFormatsRedefinedSerialized { 
   

								@Getter @Setter private int mciwin2DigitYearPd;

	
	/**
	* Constructor for MciwinFormatsRedefined
	**/
    public MciwinFormatsRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciwinFormatsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
