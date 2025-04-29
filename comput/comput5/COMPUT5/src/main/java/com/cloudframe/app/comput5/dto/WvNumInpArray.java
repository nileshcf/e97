package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumInpArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class WvNumInpArray extends WvNumInpArraySerialized { 
   
			@Getter @Setter private List<WvNumInpItem> wvNumInpItem = new ArrayList<>();
    	
	
	/**
	* Constructor for WvNumInpArray
	**/
    public WvNumInpArray() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvNumInpArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
