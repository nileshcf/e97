package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookData500Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class CopybookData500Redefined extends CopybookData500RedefinedSerialized { 
   
			@Getter @Setter private List<CopybookEntry500> copybookEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for CopybookData500Redefined
	**/
    public CopybookData500Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CopybookData500Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookData500Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
