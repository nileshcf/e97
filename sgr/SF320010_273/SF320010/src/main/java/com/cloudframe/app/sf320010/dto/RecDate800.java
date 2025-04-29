package com.cloudframe.app.sf320010.dto;

/**
*  The class RecDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RecDate800 extends RecDate800Serialized { 
   

						@Getter @Setter private char[] recDateCc800 = new char[2];

						@Getter @Setter private char[] recDateYy800 = new char[2];


						@Getter @Setter private char[] recDateMm800 = new char[2];


						@Getter @Setter private char[] recDateDd800 = new char[2];
	
	/**
	* Constructor for RecDate800
	**/
    public RecDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RecDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setRecDateCc800(fillSpace(2));
								setRecDateYy800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setRecDateMm800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setRecDateDd800(fillSpace(2));
    } 



}
  
