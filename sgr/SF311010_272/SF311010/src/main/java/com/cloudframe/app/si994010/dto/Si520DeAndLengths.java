package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengths is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Si520DeAndLengths extends Si520DeAndLengthsSerialized { 
   
				@Getter @Setter private Si520De001 si520De001 = new Si520De001();
	
	/**
	* Constructor for Si520DeAndLengths
	**/
    public Si520DeAndLengths() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Si520DeAndLengths. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengths(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSi520De001().setParent(this,getStartOffset() + 0);
    } 



}
  
