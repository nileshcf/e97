package com.cloudframe.app.cfdate02.dto;

/**
*  The class Dfhcommarea12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea12 extends Dfhcommarea12Serialized { 
   
				@Getter @Setter private CmnDateCalcInputArea cmnDateCalcInputArea = new CmnDateCalcInputArea();
				@Getter @Setter private CmnDateCalcOutputArea cmnDateCalcOutputArea = new CmnDateCalcOutputArea();
	
	/**
	* Constructor for Dfhcommarea12
	**/
    public Dfhcommarea12() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcInputArea().setParent(this,getStartOffset() + 0);
					getCmnDateCalcOutputArea().setParent(this,getStartOffset() + 32);
    } 



}
  
