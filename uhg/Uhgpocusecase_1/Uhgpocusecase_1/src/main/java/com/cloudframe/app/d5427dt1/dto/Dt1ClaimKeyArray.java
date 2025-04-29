package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClaimKeyArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Dt1ClaimKeyArray extends Dt1ClaimKeyArraySerialized { 
   
			@Getter @Setter private List<Dt1ClaimKeyEntry> dt1ClaimKeyEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Dt1ClaimKeyArray
	**/
    public Dt1ClaimKeyArray() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClaimKeyArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClaimKeyArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
