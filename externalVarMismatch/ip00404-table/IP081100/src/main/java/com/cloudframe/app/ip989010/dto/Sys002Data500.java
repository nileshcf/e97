package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys002Data500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys002Data500 extends Sys002Data500Serialized { 
   
				@Getter @Setter private RegistrationFileData500 registrationFileData500 = new RegistrationFileData500();
	
	/**
	* Constructor for Sys002Data500
	**/
    public Sys002Data500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys002Data500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys002Data500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRegistrationFileData500().setParent(this,getStartOffset() + 0);
    } 



}
  
