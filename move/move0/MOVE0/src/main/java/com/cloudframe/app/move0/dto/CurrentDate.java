package com.cloudframe.app.move0.dto;

/**
*  The class CurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentDate extends CurrentDateSerialized { 
   

						@Getter @Setter private char[] mm = Field.fillLowValue(2);


						@Getter @Setter private char[] dd = Field.fillLowValue(2);


						@Getter @Setter private char[] yyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for CurrentDate
	**/
    public CurrentDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    } 



}
  
