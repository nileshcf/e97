package com.cloudframe.app.ip809050.dto;

/**
*  The class De0311800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class De0311800 extends De0311800Serialized { 
   


						@Getter @Setter private char[] de031800 = new char[23];

	
	/**
	* Constructor for De0311800
	**/
    public De0311800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for De0311800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De0311800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 0
             ,1
             );
								setDe031800(fillSpace(23));
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 24
             ,1
             );
    } 



}
  
