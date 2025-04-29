package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinFormatsRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciwinFormatsRedefined01 extends MciwinFormatsRedefined01Serialized { 
   

								@Getter @Setter private long mciwinYymmddPacked;
	
	/**
	* Constructor for MciwinFormatsRedefined01
	**/
    public MciwinFormatsRedefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciwinFormatsRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
