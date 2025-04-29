package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultFill800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ResultFill800 extends ResultFill800Serialized { 
   

								@Getter @Setter private int resultFillStart800;

								@Getter @Setter private int resultFillCount800;
	
	/**
	* Constructor for ResultFill800
	**/
    public ResultFill800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ResultFill800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultFill800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setResultFillStart800(0);
								setResultFillCount800(0);
    } 



}
  
