package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorPrefix690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ErrorPrefix690 extends ErrorPrefix690Serialized { 
   


								@Getter @Setter private int errorSeqNbr690;

	
	/**
	* Constructor for ErrorPrefix690
	**/
    public ErrorPrefix690() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrorPrefix690. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorPrefix690(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("9000-").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("9000-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
    } 



}
  
