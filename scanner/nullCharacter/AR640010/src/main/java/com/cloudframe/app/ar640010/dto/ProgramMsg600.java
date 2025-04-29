package com.cloudframe.app.ar640010.dto;

/**
*  The class ProgramMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ProgramMsg600 extends ProgramMsg600Serialized { 
   


						@Getter @Setter private char[] programVersion600 = new char[3];
	
	/**
	* Constructor for ProgramMsg600
	**/
    public ProgramMsg600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ProgramMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0000-START OF PROGRAM - VERSION: ").toCharArray()
             , getStartOffset() + 0
             ,33
             );
								setProgramVersion600(("018").toCharArray());
    } 



}
  
