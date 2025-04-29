package com.cloudframe.app.ip989010.dto;

/**
*  The class EvenValue800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EvenValue800 extends EvenValue800Serialized { 
   

								@Getter @Setter private int evenMsb800;

								@Getter @Setter private int evenLsb800;
	
	/**
	* Constructor for EvenValue800
	**/
    public EvenValue800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EvenValue800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EvenValue800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
