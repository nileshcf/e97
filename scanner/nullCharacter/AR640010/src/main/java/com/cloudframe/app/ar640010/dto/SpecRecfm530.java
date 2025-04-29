package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecRecfm530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SpecRecfm530 extends SpecRecfm530Serialized { 
   

							@Getter @Setter private char[] specTable530ConditionGroup4 = new char[1];
						

	
	/**
	* Constructor for SpecRecfm530
	**/
    public SpecRecfm530() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SpecRecfm530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecRecfm530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
    } 



}
  
