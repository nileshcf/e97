package com.cloudframe.app.sf326010.dto;

/**
*  The class WhenCompTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WhenCompTime800 extends WhenCompTime800Serialized { 
   

						@Getter @Setter private char[] whenTimeHh800 = new char[2];

						@Getter @Setter private char[] whenTimeMm800 = new char[2];

						@Getter @Setter private char[] whenTimeSs800 = new char[2];
	
	/**
	* Constructor for WhenCompTime800
	**/
    public WhenCompTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WhenCompTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWhenTimeHh800(fillSpace(2));
								setWhenTimeMm800(fillSpace(2));
								setWhenTimeSs800(fillSpace(2));
    } 



}
  
