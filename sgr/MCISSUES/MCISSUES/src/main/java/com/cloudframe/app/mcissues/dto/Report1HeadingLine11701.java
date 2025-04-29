package com.cloudframe.app.mcissues.dto;

/**
*  The class Report1HeadingLine11701 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Report1HeadingLine11701 extends Report1HeadingLine11701Serialized { 
   


								@Getter @Setter private char[] sourceMessageNo701 = Field.fillLowValue(9);

	
	/**
	* Constructor for Report1HeadingLine11701
	**/
    public Report1HeadingLine11701() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Report1HeadingLine11701. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Report1HeadingLine11701(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("SOURCE MESSAGE #:   ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 29
             ,5
             );
    } 



}
  
