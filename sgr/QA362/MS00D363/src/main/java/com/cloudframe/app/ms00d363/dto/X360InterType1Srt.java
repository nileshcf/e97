package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360InterType1Srt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360InterType1Srt extends X360InterType1SrtSerialized { 
   

						@Getter @Setter private char[] x360InstIdSrt1 = Field.fillLowValue(10);
	
	/**
	* Constructor for X360InterType1Srt
	**/
    public X360InterType1Srt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360InterType1Srt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType1Srt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
