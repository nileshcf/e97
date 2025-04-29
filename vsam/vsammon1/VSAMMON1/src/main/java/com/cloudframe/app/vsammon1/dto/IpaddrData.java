package com.cloudframe.app.vsammon1.dto;

/**
*  The class IpaddrData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IpaddrData extends IpaddrDataSerialized { 
   

						@Getter @Setter private char[] iIpaddr = Field.fillLowValue(15);
	
	/**
	* Constructor for IpaddrData
	**/
    public IpaddrData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IpaddrData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpaddrData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
