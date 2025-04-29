package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoBkntData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoBkntData extends Sf31IsoBkntDataSerialized { 
   
				@Getter @Setter private Sf31IsoBkntTraceData sf31IsoBkntTraceData = new Sf31IsoBkntTraceData();
	
	/**
	* Constructor for Sf31IsoBkntData
	**/
    public Sf31IsoBkntData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoBkntData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf31IsoBkntTraceData().setParent(this,getStartOffset() + 0);
    } 



}
  
