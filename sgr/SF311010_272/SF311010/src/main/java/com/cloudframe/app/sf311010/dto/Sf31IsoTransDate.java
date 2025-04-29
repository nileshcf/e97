package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoTransDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoTransDate extends Sf31IsoTransDateSerialized { 
   

						@Getter @Setter private char[] sf31IsoTransMmdd = new char[4];
	
	/**
	* Constructor for Sf31IsoTransDate
	**/
    public Sf31IsoTransDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoTransDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoTransDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoTransMmdd(fillSpace(4));
    } 



}
  
