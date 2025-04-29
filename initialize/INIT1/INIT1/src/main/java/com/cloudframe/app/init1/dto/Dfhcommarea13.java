package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea13 extends Dfhcommarea13Serialized { 
   
				@Getter @Setter private CmnDateConvInputArea cmnDateConvInputArea = new CmnDateConvInputArea();
				@Getter @Setter private CmnDateConvOutputArea cmnDateConvOutputArea = new CmnDateConvOutputArea();

	
	/**
	* Constructor for Dfhcommarea13
	**/
    public Dfhcommarea13() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateConvInputArea().setParent(this,getStartOffset() + 0);
					getCmnDateConvOutputArea().setParent(this,getStartOffset() + 18);
    } 



}
  
