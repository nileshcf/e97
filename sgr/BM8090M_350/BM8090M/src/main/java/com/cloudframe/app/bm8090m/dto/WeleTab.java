package com.cloudframe.app.bm8090m.dto;

/**
*  The class WeleTab is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WeleTab extends WeleTabSerialized { 
   

						@Getter @Setter private char[] welem = Field.fillLowValue(1);
	
	/**
	* Constructor for WeleTab
	**/
    public WeleTab() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WeleTab. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WeleTab(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
