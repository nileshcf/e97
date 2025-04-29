package com.cloudframe.app.casecb00.dto;

/**
*  The class InputRequest is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InputRequest extends InputRequestSerialized { 
   
				@Getter @Setter private Getinventory getinventory = new Getinventory();
	
	/**
	* Constructor for InputRequest
	**/
    public InputRequest() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for InputRequest. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputRequest(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getGetinventory().setParent(this,getStartOffset() + 0);
    } 



}
  
