package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmTable520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class RecfmTable520 extends RecfmTable520Serialized { 
   
			@Getter @Setter private List<RecfmEntry520> recfmEntry520 = new ArrayList<>();
    	
	
	/**
	* Constructor for RecfmTable520
	**/
    public RecfmTable520() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RecfmTable520. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmTable520(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
