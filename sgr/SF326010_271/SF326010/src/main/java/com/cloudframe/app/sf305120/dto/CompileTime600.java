package com.cloudframe.app.sf305120.dto;

/**
*  The class CompileTime600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CompileTime600 extends CompileTime600Serialized { 
   

						@Getter @Setter private char[] compTimeHh600 = new char[2];


						@Getter @Setter private char[] compTimeMm600 = new char[2];


						@Getter @Setter private char[] compTimeSs600 = new char[2];
	
	/**
	* Constructor for CompileTime600
	**/
    public CompileTime600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CompileTime600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileTime600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCompTimeHh600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setCompTimeMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setCompTimeSs600(fillSpace(2));
    } 



}
  
