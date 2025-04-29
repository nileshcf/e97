package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AidUserByteRedefined01 extends AidUserByteRedefined01Serialized { 
   

								@Getter @Setter private int aidApplicationNum;
	
	/**
	* Constructor for AidUserByteRedefined01
	**/
    public AidUserByteRedefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AidUserByteRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
