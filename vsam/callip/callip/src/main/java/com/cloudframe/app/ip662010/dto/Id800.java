package com.cloudframe.app.ip662010.dto;

/**
*  The class Id800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Id800 extends Id800Serialized { 
   

								@Getter @Setter private short type800;

								@Getter @Setter private short no800;
	
	/**
	* Constructor for Id800
	**/
    public Id800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Id800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Id800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
