package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HvProvTinsuff1Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HvProvTinsuff1Redefined extends HvProvTinsuff1RedefinedSerialized { 
   

						@Getter @Setter private char[] hvProvTin1 = Field.fillLowValue(9);
	
	/**
	* Constructor for HvProvTinsuff1Redefined
	**/
    public HvProvTinsuff1Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HvProvTinsuff1Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvProvTinsuff1Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
