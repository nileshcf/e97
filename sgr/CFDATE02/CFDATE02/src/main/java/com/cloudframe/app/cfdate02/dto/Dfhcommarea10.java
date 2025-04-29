package com.cloudframe.app.cfdate02.dto;

/**
*  The class Dfhcommarea10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dfhcommarea10 extends Dfhcommarea10Serialized { 
   
				@Getter @Setter private CmnDateTimeOutputArea cmnDateTimeOutputArea = new CmnDateTimeOutputArea();
	
	/**
	* Constructor for Dfhcommarea10
	**/
    public Dfhcommarea10() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dfhcommarea10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateTimeOutputArea().setParent(this,getStartOffset() + 0);
    } 



}
  
