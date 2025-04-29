package com.cloudframe.app.sf327010.dto;

/**
*  The class LserviceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LserviceTime800 extends LserviceTime800Serialized { 
   

						@Getter @Setter private char[] lserviceHh800 = new char[2];

						@Getter @Setter private char[] lserviceMins800 = new char[2];

						@Getter @Setter private char[] lserviceSec800 = new char[2];
	
	/**
	* Constructor for LserviceTime800
	**/
    public LserviceTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LserviceTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLserviceHh800(fillSpace(2));
								setLserviceMins800(fillSpace(2));
								setLserviceSec800(fillSpace(2));
    } 



}
  
