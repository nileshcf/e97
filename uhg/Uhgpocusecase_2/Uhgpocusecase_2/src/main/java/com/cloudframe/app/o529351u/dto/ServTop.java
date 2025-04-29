package com.cloudframe.app.o529351u.dto;

/**
*  The class ServTop is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ServTop extends ServTopSerialized { 
   

						@Getter @Setter private char[] svc15 = new char[5];

						@Getter @Setter private char[] svc6 = Field.fillLowValue(1);
	
	/**
	* Constructor for ServTop
	**/
    public ServTop() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ServTop. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServTop(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSvc15(fillSpace(5));
    } 



}
  
