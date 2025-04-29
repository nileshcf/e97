package com.cloudframe.app.vsammon4.dto;

/**
*  The class KeyreadData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyreadData extends KeyreadDataSerialized { 
   

								@Getter @Setter private long kKey;
	
	/**
	* Constructor for KeyreadData
	**/
    public KeyreadData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyreadData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyreadData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
