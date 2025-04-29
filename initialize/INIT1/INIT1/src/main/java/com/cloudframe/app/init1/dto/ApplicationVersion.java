package com.cloudframe.app.init1.dto;

/**
*  The class ApplicationVersion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ApplicationVersion extends ApplicationVersionSerialized { 
   

								@Getter @Setter private short applicationVersionLen;
	
	/**
	* Constructor for ApplicationVersion
	**/
    public ApplicationVersion() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ApplicationVersion. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationVersion(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationVersionLen((short)0);
    } 



}
  
