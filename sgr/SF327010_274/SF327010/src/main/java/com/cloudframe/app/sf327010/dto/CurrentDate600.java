package com.cloudframe.app.sf327010.dto;

/**
*  The class CurrentDate600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentDate600 extends CurrentDate600Serialized { 
   

						@Getter @Setter private char[] currDateYyyy600 = new char[4];


						@Getter @Setter private char[] currDateMm600 = new char[2];


						@Getter @Setter private char[] currDateDd600 = new char[2];
	
	/**
	* Constructor for CurrentDate600
	**/
    public CurrentDate600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentDate600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrDateYyyy600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setCurrDateMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setCurrDateDd600(fillSpace(2));
    } 



}
  
