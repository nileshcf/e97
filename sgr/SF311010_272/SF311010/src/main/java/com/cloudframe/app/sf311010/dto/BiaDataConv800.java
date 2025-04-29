package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConv800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BiaDataConv800 extends BiaDataConv800Serialized { 
   


						@Getter @Setter private char[] biaByte800 = new char[1];
	
	/**
	* Constructor for BiaDataConv800
	**/
    public BiaDataConv800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiaDataConv800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillLowValue(1)
             , getStartOffset() + 0
             ,1
             );
								setBiaByte800(fillSpace(1));
    } 



}
  
