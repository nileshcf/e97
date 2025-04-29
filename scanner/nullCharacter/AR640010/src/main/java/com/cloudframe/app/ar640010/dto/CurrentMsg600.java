package com.cloudframe.app.ar640010.dto;

/**
*  The class CurrentMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentMsg600 extends CurrentMsg600Serialized { 
   


						@Getter @Setter private char[] currentDate600 = new char[10];


						@Getter @Setter private char[] currentTime600 = new char[8];
	
	/**
	* Constructor for CurrentMsg600
	**/
    public CurrentMsg600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0002-CURRENT DATE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setCurrentDate600(fillSpace(10));
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 29
             ,8
             );
								setCurrentTime600(fillSpace(8));
    } 



}
  
