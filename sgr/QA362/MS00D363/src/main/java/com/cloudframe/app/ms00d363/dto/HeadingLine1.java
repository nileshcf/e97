package com.cloudframe.app.ms00d363.dto;

/**
*  The class HeadingLine1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HeadingLine1 extends HeadingLine1Serialized { 
   

						@Getter @Setter private char[] hd11Cc = new char[1];

						@Getter @Setter private char[] hd11ProgName = new char[10];



	
	/**
	* Constructor for HeadingLine1
	**/
    public HeadingLine1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HeadingLine1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HeadingLine1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHd11Cc(("1").toCharArray());
								setHd11ProgName(("SWCHD363  ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 11
             ,46
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD DEBIT SWITCH").toCharArray()
             , getStartOffset() + 57
             ,23
             );
       replaceValue( // serialize and save the value
             fillSpace(53)
             , getStartOffset() + 80
             ,53
             );
    } 



}
  
