package com.cloudframe.app.ip343690.dto;

/**
*  The class SleepTimeGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SleepTimeGroup800 extends SleepTimeGroup800Serialized { 
   

								@Getter @Setter private long sleepTime800;
	
	/**
	* Constructor for SleepTimeGroup800
	**/
    public SleepTimeGroup800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SleepTimeGroup800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SleepTimeGroup800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSleepTime800(1000L);
    } 



}
  
