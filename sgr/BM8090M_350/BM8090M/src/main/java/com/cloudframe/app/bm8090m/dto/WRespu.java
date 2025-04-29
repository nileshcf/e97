package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespu is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WRespu extends WRespuSerialized { 
   

						@Getter @Setter private char[] wResp1 = Field.fillLowValue(60);
	
	/**
	* Constructor for WRespu
	**/
    public WRespu() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WRespu. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespu(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
