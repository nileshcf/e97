package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtabPartx is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class WtabPartx extends WtabPartxSerialized { 
   
			@Getter @Setter private List<WeleTab> weleTab = new ArrayList<>();
    	
	
	/**
	* Constructor for WtabPartx
	**/
    public WtabPartx() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WtabPartx. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtabPartx(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
