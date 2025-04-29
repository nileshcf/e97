package com.cloudframe.app.ar640010.dto;

/**
*  The class DeleteIntervalGroup340 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DeleteIntervalGroup340 extends DeleteIntervalGroup340Serialized { 
   

								@Getter @Setter private long deleteInterval340;
	
	/**
	* Constructor for DeleteIntervalGroup340
	**/
    public DeleteIntervalGroup340() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DeleteIntervalGroup340. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteIntervalGroup340(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDeleteInterval340(200L);
    } 



}
  
