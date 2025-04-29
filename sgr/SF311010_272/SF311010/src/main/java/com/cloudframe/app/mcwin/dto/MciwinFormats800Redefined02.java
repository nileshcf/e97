package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800Redefined02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciwinFormats800Redefined02 extends MciwinFormats800Redefined02Serialized { 
   

								@Getter @Setter private long mciwinYydddPacked800;

	
	/**
	* Constructor for MciwinFormats800Redefined02
	**/
    public MciwinFormats800Redefined02() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciwinFormats800Redefined02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
