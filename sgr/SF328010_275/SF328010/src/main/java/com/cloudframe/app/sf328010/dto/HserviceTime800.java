package com.cloudframe.app.sf328010.dto;

/**
*  The class HserviceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HserviceTime800 extends HserviceTime800Serialized { 
   

						@Getter @Setter private char[] hserviceHh800 = new char[2];

						@Getter @Setter private char[] hserviceMins800 = new char[2];

						@Getter @Setter private char[] hserviceSec800 = new char[2];
	
	/**
	* Constructor for HserviceTime800
	**/
    public HserviceTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HserviceTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHserviceHh800(fillSpace(2));
								setHserviceMins800(fillSpace(2));
								setHserviceSec800(fillSpace(2));
    } 



}
  
