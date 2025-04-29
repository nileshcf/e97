package com.cloudframe.app.ar640010.dto;

/**
*  The class Psa800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Psa800 extends Psa800Serialized { 
   

								@Getter @Setter private int psaAddr800;

								@Getter @Setter private int psaPtr800;
	
	/**
	* Constructor for Psa800
	**/
    public Psa800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Psa800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Psa800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPsaAddr800(0);
    } 



}
  
