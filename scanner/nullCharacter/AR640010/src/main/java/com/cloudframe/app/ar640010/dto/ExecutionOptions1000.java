package com.cloudframe.app.ar640010.dto;

/**
*  The class ExecutionOptions1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExecutionOptions1000 extends ExecutionOptions1000Serialized { 
   

						@Getter @Setter private char[] displayOption1000 = new char[1];

						@Getter @Setter private char[] doNothingOption1000 = new char[1];

						@Getter @Setter private char[] dsnLengthOption1000 = new char[1];

	
	/**
	* Constructor for ExecutionOptions1000
	**/
    public ExecutionOptions1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExecutionOptions1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExecutionOptions1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDisplayOption1000(("N").toCharArray());
								setDoNothingOption1000(fillSpace(1));
								setDsnLengthOption1000(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 3
             ,1
             );
    } 



}
  
