package com.cloudframe.app.ip809050.dto;

/**
*  The class CbhRefNum1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CbhRefNum1800 extends CbhRefNum1800Serialized { 
   


						@Getter @Setter private char[] cbhRefNum800 = new char[10];

	
	/**
	* Constructor for CbhRefNum1800
	**/
    public CbhRefNum1800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CbhRefNum1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CbhRefNum1800(Field parent,int begin) {
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
								setCbhRefNum800("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 11
             ,1
             );
    } 



}
  
