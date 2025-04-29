package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Si520DeAndLengthsRedefined extends Si520DeAndLengthsRedefinedSerialized { 
   
			@Getter @Setter private List<Si520DeAndLengthsGroupArray1> si520DeAndLengthsGroupArray1 = new ArrayList<>();
    	
	
	/**
	* Constructor for Si520DeAndLengthsRedefined
	**/
    public Si520DeAndLengthsRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Si520DeAndLengthsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
