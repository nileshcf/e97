package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea15 extends Dfhcommarea15Serialized { 
   
				@Getter @Setter private CmnTimeCalcInputArea cmnTimeCalcInputArea = new CmnTimeCalcInputArea();
				@Getter @Setter private CmnTimeCalcOutputArea cmnTimeCalcOutputArea = new CmnTimeCalcOutputArea();

	
	/**
	* Constructor for Dfhcommarea15
	**/
    public Dfhcommarea15() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnTimeCalcInputArea().setParent(this,getStartOffset() + 0);
					getCmnTimeCalcOutputArea().setParent(this,getStartOffset() + 22);
    } 



}
  
