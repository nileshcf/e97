package com.cloudframe.app.sf328010.dto;

/**
*  The class LserviceDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LserviceDate800 extends LserviceDate800Serialized { 
   

						@Getter @Setter private char[] lserviceCc800 = new char[2];

						@Getter @Setter private char[] lserviceYy800 = new char[2];

						@Getter @Setter private char[] lserviceMm800 = new char[2];

						@Getter @Setter private char[] lserviceDd800 = new char[2];
	
	/**
	* Constructor for LserviceDate800
	**/
    public LserviceDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LserviceDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLserviceCc800(fillSpace(2));
								setLserviceYy800(fillSpace(2));
								setLserviceMm800(fillSpace(2));
								setLserviceDd800(fillSpace(2));
    } 



}
  
