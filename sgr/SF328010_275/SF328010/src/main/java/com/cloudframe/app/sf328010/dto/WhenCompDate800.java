package com.cloudframe.app.sf328010.dto;

/**
*  The class WhenCompDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WhenCompDate800 extends WhenCompDate800Serialized { 
   

						@Getter @Setter private char[] whenDateYyyy800 = new char[4];

						@Getter @Setter private char[] whenDateMm800 = new char[2];

						@Getter @Setter private char[] whenDateDd800 = new char[2];
	
	/**
	* Constructor for WhenCompDate800
	**/
    public WhenCompDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WhenCompDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWhenDateYyyy800(fillSpace(4));
								setWhenDateMm800(fillSpace(2));
								setWhenDateDd800(fillSpace(2));
    } 



}
  
