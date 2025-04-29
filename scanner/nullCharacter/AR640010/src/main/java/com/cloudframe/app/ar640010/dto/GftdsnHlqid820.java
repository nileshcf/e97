package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnHlqid820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class GftdsnHlqid820 extends GftdsnHlqid820Serialized { 
   


							@Getter @Setter private char[] gftdsnWorkAreas820ConditionGroup2 = new char[1];
						
	
	/**
	* Constructor for GftdsnHlqid820
	**/
    public GftdsnHlqid820() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GftdsnHlqid820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnHlqid820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 3
             ,1
             );
    } 



}
  
