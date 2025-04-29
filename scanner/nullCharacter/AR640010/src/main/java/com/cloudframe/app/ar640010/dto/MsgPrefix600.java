package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgPrefix600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsgPrefix600 extends MsgPrefix600Serialized { 
   

						@Getter @Setter private char[] programId600 = new char[8];

	
	/**
	* Constructor for MsgPrefix600
	**/
    public MsgPrefix600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsgPrefix600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPrefix600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProgramId600(("AR640010").toCharArray());
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 



}
  
