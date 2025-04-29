package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciwinFormats800 extends MciwinFormats800Serialized { 
   

								@Getter @Setter private int mciwin2DigitYearZd800;

	
	/**
	* Constructor for MciwinFormats800
	**/
    public MciwinFormats800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciwinFormats800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciwin2DigitYearZd800(0);
       replaceValue( // serialize and save the value
             fillHighValue(2)
             , getStartOffset() + 2
             ,2
             );
    } 



}
  
