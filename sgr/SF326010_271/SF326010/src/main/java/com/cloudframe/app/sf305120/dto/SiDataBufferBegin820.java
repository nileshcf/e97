package com.cloudframe.app.sf305120.dto;

/**
*  The class SiDataBufferBegin820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SiDataBufferBegin820 extends SiDataBufferBegin820Serialized { 
   

						@Getter @Setter private char[] siDataBuffer820 = new char[8157];
	
	/**
	* Constructor for SiDataBufferBegin820
	**/
    public SiDataBufferBegin820() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SiDataBufferBegin820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiDataBufferBegin820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSiDataBuffer820(pad(8157," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
