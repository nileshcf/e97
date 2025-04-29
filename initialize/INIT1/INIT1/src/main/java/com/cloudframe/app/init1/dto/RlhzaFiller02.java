package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaFiller02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlhzaFiller02 extends RlhzaFiller02Serialized { 
   

								@Getter @Setter private int rlhzaRcBlAsOfDay;
	
	/**
	* Constructor for RlhzaFiller02
	**/
    public RlhzaFiller02() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlhzaFiller02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaFiller02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
