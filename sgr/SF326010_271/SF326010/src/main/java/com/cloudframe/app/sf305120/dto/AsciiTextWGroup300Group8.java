package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextWGroup300Group8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AsciiTextWGroup300Group8 extends AsciiTextWGroup300Group8Serialized { 
   


	
	/**
	* Constructor for AsciiTextWGroup300Group8
	**/
    public AsciiTextWGroup300Group8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AsciiTextWGroup300Group8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextWGroup300Group8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x61,(byte)0x62,(byte)0x63,(byte)0x64,(byte)0x65,(byte)0x66,(byte)0x67,(byte)0x68,(byte)0x69,(byte)0x6A,(byte)0x6B,(byte)0x6C,(byte)0x6D}).toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x6E,(byte)0x6F,(byte)0x70,(byte)0x71,(byte)0x72,(byte)0x73,(byte)0x74,(byte)0x75,(byte)0x76,(byte)0x77,(byte)0x78,(byte)0x79,(byte)0x7A}).toCharArray()
             , getStartOffset() + 13
             ,13
             );
    } 



}
  
