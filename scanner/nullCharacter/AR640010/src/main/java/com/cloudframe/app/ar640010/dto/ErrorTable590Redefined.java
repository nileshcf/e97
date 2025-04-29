package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorTable590Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class ErrorTable590Redefined extends ErrorTable590RedefinedSerialized { 
   
			@Getter @Setter private List<ErrorTableGroup590Array1> errorTableGroup590Array1 = new ArrayList<>();
    	
	
	/**
	* Constructor for ErrorTable590Redefined
	**/
    public ErrorTable590Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrorTable590Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorTable590Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
