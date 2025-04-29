package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtShsArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class ExtShsArea extends ExtShsAreaSerialized { 
   
			@Getter @Setter private List<ExtSpoTbl> extSpoTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for ExtShsArea
	**/
    public ExtShsArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtShsArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtShsArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
