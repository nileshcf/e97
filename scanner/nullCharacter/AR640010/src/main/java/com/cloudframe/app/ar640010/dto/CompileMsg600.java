package com.cloudframe.app.ar640010.dto;

/**
*  The class CompileMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CompileMsg600 extends CompileMsg600Serialized { 
   


						@Getter @Setter private char[] compileYear600 = new char[4];


						@Getter @Setter private char[] compileMonth600 = new char[2];


						@Getter @Setter private char[] compileDay600 = new char[2];


						@Getter @Setter private char[] compileHour600 = new char[2];


						@Getter @Setter private char[] compileMinute600 = new char[2];


						@Getter @Setter private char[] compileSecond600 = new char[2];
	
	/**
	* Constructor for CompileMsg600
	**/
    public CompileMsg600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CompileMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0001-COMPILE DATE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setCompileYear600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 23
             ,1
             );
								setCompileMonth600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 26
             ,1
             );
								setCompileDay600(fillSpace(2));
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 29
             ,8
             );
								setCompileHour600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 39
             ,1
             );
								setCompileMinute600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setCompileSecond600(fillSpace(2));
    } 



}
  
