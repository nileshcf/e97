package com.cloudframe.app.iovb32k.dto;

/**
*  The class LsParmG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LsParmG extends LsParmGSerialized { 
   

						@Getter @Setter private char[] lsParmMode = Field.fillLowValue(1);


								@Getter @Setter private long lsParmDataLenMin;


								@Getter @Setter private long lsParmDataLenMax;
	
	/**
	* Constructor for LsParmG
	**/
    public LsParmG() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LsParmG. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsParmG(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
