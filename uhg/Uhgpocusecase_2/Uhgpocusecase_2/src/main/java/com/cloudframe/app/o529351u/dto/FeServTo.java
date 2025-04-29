package com.cloudframe.app.o529351u.dto;

/**
*  The class FeServTo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FeServTo extends FeServToSerialized { 
   

						@Getter @Setter private char[] feSvc15To = new char[5];
	
	/**
	* Constructor for FeServTo
	**/
    public FeServTo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FeServTo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FeServTo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFeSvc15To(fillSpace(5));
    } 



}
  
