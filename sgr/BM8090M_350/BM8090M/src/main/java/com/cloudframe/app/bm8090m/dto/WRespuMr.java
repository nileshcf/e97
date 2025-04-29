package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuMr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WRespuMr extends WRespuMrSerialized { 
   

						@Getter @Setter private char[] wRespMr1 = Field.fillLowValue(24);
	
	/**
	* Constructor for WRespuMr
	**/
    public WRespuMr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WRespuMr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuMr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
