package com.cloudframe.app.db2func.dto;

/**
*  The class Parmlst is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parmlst extends ParmlstSerialized { 
   

								@Getter @Setter private short parmlen;

						@Getter @Setter private char[] parmtxt = Field.fillLowValue(254);
	
	/**
	* Constructor for Parmlst
	**/
    public Parmlst() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parmlst. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parmlst(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
