package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioDataGroup200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SeqioDataGroup200 extends SeqioDataGroup200Serialized { 
   

						@Getter @Setter private char[] seqioData200 = new char[32768];
	
	/**
	* Constructor for SeqioDataGroup200
	**/
    public SeqioDataGroup200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SeqioDataGroup200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioDataGroup200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSeqioData200(pad(32768," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
