package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea11 extends Dfhcommarea11Serialized { 
   
				@Getter @Setter private CmnDateValidInputArea cmnDateValidInputArea = new CmnDateValidInputArea();
				@Getter @Setter private CmnDateValidOutputArea cmnDateValidOutputArea = new CmnDateValidOutputArea();

	
	/**
	* Constructor for Dfhcommarea11
	**/
    public Dfhcommarea11() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateValidInputArea().setParent(this,getStartOffset() + 0);
					getCmnDateValidOutputArea().setParent(this,getStartOffset() + 10);
    } 



}
  
