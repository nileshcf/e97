package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamAtype850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DynamAtype850 extends DynamAtype850Serialized { 
   


								@Getter @Setter private long dynamBlocks850;
	
	/**
	* Constructor for DynamAtype850
	**/
    public DynamAtype850() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DynamAtype850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAtype850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 0
             ,7
             );
    } 



}
  
