package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea17 extends Dfhcommarea17Serialized { 
   
				@Getter @Setter private CmnPeriodInputArea cmnPeriodInputArea = new CmnPeriodInputArea();
				@Getter @Setter private CmnPeriodOutputArea cmnPeriodOutputArea = new CmnPeriodOutputArea();

	
	/**
	* Constructor for Dfhcommarea17
	**/
    public Dfhcommarea17() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnPeriodInputArea().setParent(this,getStartOffset() + 0);
					getCmnPeriodOutputArea().setParent(this,getStartOffset() + 4);
    } 



}
  
