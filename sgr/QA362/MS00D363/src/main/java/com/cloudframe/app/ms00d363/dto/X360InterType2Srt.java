package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360InterType2Srt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360InterType2Srt extends X360InterType2SrtSerialized { 
   

						@Getter @Setter private char[] x360SscServIdSrt2 = Field.fillLowValue(3);

						@Getter @Setter private char[] x360IsisAgreeNumSrt2 = Field.fillLowValue(4);

	
	/**
	* Constructor for X360InterType2Srt
	**/
    public X360InterType2Srt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360InterType2Srt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType2Srt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
