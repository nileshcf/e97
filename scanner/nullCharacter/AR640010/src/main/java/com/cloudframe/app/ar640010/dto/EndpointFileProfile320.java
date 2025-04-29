package com.cloudframe.app.ar640010.dto;

/**
*  The class EndpointFileProfile320 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EndpointFileProfile320 extends EndpointFileProfile320Serialized { 
   


						@Getter @Setter private char[] fileProfile320 = new char[13];
	
	/**
	* Constructor for EndpointFileProfile320
	**/
    public EndpointFileProfile320() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EndpointFileProfile320. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndpointFileProfile320(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("ENDPOINT ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setFileProfile320(("FILE PROFILE ").toCharArray());
    } 



}
  
