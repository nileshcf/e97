package com.cloudframe.app.sf305120.dto;

/**
*  The class AdditionalRuc260Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AdditionalRuc260Redefined extends AdditionalRuc260RedefinedSerialized { 
   

								@Getter @Setter private short rucEsDataLength260;

								@Getter @Setter private short rucX9aDataLength260;

								@Getter @Setter private short rucEitDataLength260;
	
	/**
	* Constructor for AdditionalRuc260Redefined
	**/
    public AdditionalRuc260Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AdditionalRuc260Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AdditionalRuc260Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
