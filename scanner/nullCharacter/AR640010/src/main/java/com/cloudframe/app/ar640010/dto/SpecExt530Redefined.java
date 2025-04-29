package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecExt530Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SpecExt530Redefined extends SpecExt530RedefinedSerialized { 
   

							@Getter @Setter private char[] specTable530ConditionGroup2 = new char[1];
						

	
	/**
	* Constructor for SpecExt530Redefined
	**/
    public SpecExt530Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SpecExt530Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecExt530Redefined(Field parent,int begin) {
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
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
    } 



}
  
