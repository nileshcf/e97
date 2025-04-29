package com.cloudframe.app.ar640010.dto;

/**
*  The class XtkDefaultMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class XtkDefaultMsg600 extends XtkDefaultMsg600Serialized { 
   


	
	/**
	* Constructor for XtkDefaultMsg600
	**/
    public XtkDefaultMsg600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XtkDefaultMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkDefaultMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("1700-XTK PROCESS:").toCharArray()
             , getStartOffset() + 0
             ,17
             );
       replaceValue( // serialize and save the value
             ("DEFAULT CONFIG VALUES BEING ASSIGNED    ").toCharArray()
             , getStartOffset() + 17
             ,40
             );
    } 



}
  
