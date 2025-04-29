package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea16 extends Dfhcommarea16Serialized { 
   
				@Getter @Setter private CmnTimeConvInputArea cmnTimeConvInputArea = new CmnTimeConvInputArea();
				@Getter @Setter private CmnTimeConvOutputArea cmnTimeConvOutputArea = new CmnTimeConvOutputArea();

	
	/**
	* Constructor for Dfhcommarea16
	**/
    public Dfhcommarea16() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnTimeConvInputArea().setParent(this,getStartOffset() + 0);
					getCmnTimeConvOutputArea().setParent(this,getStartOffset() + 23);
    } 



}
  
