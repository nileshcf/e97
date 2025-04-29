package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtipPer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WtipPer extends WtipPerSerialized { 
   

								@Getter @Setter private int wPer;
	
	/**
	* Constructor for WtipPer
	**/
    public WtipPer() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WtipPer. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtipPer(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
